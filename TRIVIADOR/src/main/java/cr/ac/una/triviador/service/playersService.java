package cr.ac.una.triviador.service;

import cr.ac.una.triviador.model.Players;
import cr.ac.una.triviador.model.TrivPlayersDto;
import cr.ac.una.triviador.util.EntityManagerHelper;
import cr.ac.una.triviador.util.Respuesta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.logging.Level;
import java.util.logging.Logger;

public class playersService {

    private EntityManager em = EntityManagerHelper.getInstance().getManager();
    private EntityTransaction et;
    
//    public Respuesta loadPlayers(){
//        
//    }

    public Respuesta savePlayer(TrivPlayersDto playerDto) {
        try {
            et = em.getTransaction();
            et.begin();
            Players player;
            if (playerDto.getId() != null && playerDto.getId() > 0) {
                player=em.find(Players.class, playerDto.getId());
                if(player==null){
                    return new Respuesta(false, "No se encontro ningun jugador a guardar", "guardarJugador NoResultException");
                }
                player.update(playerDto);
                player=em.merge(player);
            }
            else{
                player=new Players(playerDto);
                em.persist(player);
            }
            et.commit();
            return new Respuesta(true, " ", " ", "Jugador", new TrivPlayersDto(player));
        }
        catch (Exception ex) {
            et.rollback(); // lo de vuelve como estaba antes del begin si no he hecho commit
            Logger.getLogger(playersService.class.getName()).log(Level.SEVERE, "Error al guardar el jugador", ex);
            return new Respuesta(false, "Error guardando al jugador.", "Jugador " + ex.getMessage());
        }
    }
}