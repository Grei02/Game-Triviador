package cr.ac.una.triviador.service;

import cr.ac.una.triviador.model.Game;
import cr.ac.una.triviador.model.Players;
import cr.ac.una.triviador.model.TrivGameDto;
import cr.ac.una.triviador.model.TrivPlayersDto;
import cr.ac.una.triviador.util.EntityManagerHelper;
import cr.ac.una.triviador.util.Respuesta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.logging.Level;
import java.util.logging.Logger;

public class gameService {

    private EntityManager em = EntityManagerHelper.getInstance().getManager();
    private EntityTransaction et;

    public Respuesta saveGame(TrivGameDto gameDto) {
        try {
            et = em.getTransaction();
            et.begin();
            Game game;
            if (gameDto.getId() != null && gameDto.getId() > 0) {
                game = em.find(Game.class, gameDto.getId());
                if (game == null) {
                    return new Respuesta(false, "No se encontro ninguna partida a guardar", "saveGame NoResultException");
                }
                game.update(gameDto);
                game = em.merge(game);
            } else {
                game = new Game(gameDto);
                em.persist(game);
            }
            et.commit();
            return new Respuesta(true, " ", " ", "Partida", new TrivGameDto(game));
        } catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();// lo de vuelve como estaba antes del begin si no he hecho commit
            }
//            et.rollback(); 
            Logger.getLogger(playersService.class.getName()).log(Level.SEVERE, "Error al guardar la Partida", ex);
            return new Respuesta(false, "Error guardando la Partida.", "Partida " + ex.getMessage());
        }
    }
}
