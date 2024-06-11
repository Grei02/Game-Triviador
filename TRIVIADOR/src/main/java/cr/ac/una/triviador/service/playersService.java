package cr.ac.una.triviador.service;

import cr.ac.una.triviador.model.Players;
import cr.ac.una.triviador.model.TrivPlayersDto;
import cr.ac.una.triviador.util.EntityManagerHelper;
import cr.ac.una.triviador.util.Respuesta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class playersService {

    private EntityManager em = EntityManagerHelper.getInstance().getManager();
    private EntityTransaction et;
    
    public Respuesta loadAllPlayer() {
        try {
            Query queryPlayers = em.createNamedQuery("Players.findAll",Players.class);
            List<Players> playersList = queryPlayers.getResultList();
            List<TrivPlayersDto> playersDtoList = new ArrayList<>();
            for (Players players: playersList){
                playersDtoList.add(new TrivPlayersDto(players));
            }
            return new Respuesta(true, " ", " ", "ListaJugadores", playersDtoList);
        }
        catch (NoResultException ex) {
            return new Respuesta(false, "No existe jugadores con las credenciales ingresadas.", "NoResultException/loadAllPlayer");
        }catch (Exception ex) {
            Logger.getLogger(playersService.class.getName()).log(Level.SEVERE, "Error obteniendo los jugadores", ex);
            return new Respuesta(false, "Error obtener jugadores.", "loadAllPlayer" + ex.getMessage());
        }
    }

    public Respuesta savePlayer(TrivPlayersDto playerDto) {
        try {
            et = em.getTransaction();
            et.begin();
            Players player;
            if (playerDto.getId() != null && playerDto.getId() > 0) {
                player = em.find(Players.class, playerDto.getId());
                if (player == null) {
                    return new Respuesta(false, "No se encontro ningun jugador a guardar", "guardarJugador NoResultException");
                }
                player.update(playerDto);
                player = em.merge(player);
            } else {
                player = new Players(playerDto);
                em.persist(player);
            }
            et.commit();
            return new Respuesta(true, " ", " ", "Jugador", new TrivPlayersDto(player));
        } 
        catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();// lo de vuelve como estaba antes del begin si no he hecho commit
            }
//            et.rollback(); 
            Logger.getLogger(playersService.class.getName()).log(Level.SEVERE, "Error al guardar el jugador", ex);
            return new Respuesta(false, "Error guardando al jugador.", "Jugador " + ex.getMessage());
        }    
    }
    
    public Respuesta deletePlayer(TrivPlayersDto playerDto) {
        try {
            et = em.getTransaction();
            et.begin();
            Players player;
            if (playerDto.getId() != null && playerDto.getId() > 0) {
                player = em.find(Players.class, playerDto.getId());
                if (player == null) {
                    return new Respuesta(false, "No se encontro ningun jugador a eliminar", "deletePlayer NoResultException");
                }
                em.remove(player);
            } else {
                return new Respuesta(false, "No se encontró el jugador a eliminar", "deletePlayer NoResultException");
            }
            et.commit();
            return new Respuesta(true, " ", " ", "Jugador", new TrivPlayersDto(player));
        } catch (Exception ex) {
            et.rollback(); // lo de vuelve como estaba antes del begin si no he hecho commit
            Logger.getLogger(playersService.class.getName()).log(Level.SEVERE, "Error al eliminar el jugador", ex);
            return new Respuesta(false, "Error al eliminar el jugador.", "Jugador " + ex.getMessage());
        }
    }
}
