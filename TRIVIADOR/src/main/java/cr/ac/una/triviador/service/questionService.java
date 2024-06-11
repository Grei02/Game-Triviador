package cr.ac.una.triviador.service;

import cr.ac.una.triviador.model.Questions;
import cr.ac.una.triviador.model.TrivQuestionsDto;
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

public class questionService {

    private EntityManager em = EntityManagerHelper.getInstance().getManager();
    private EntityTransaction et;

    public Respuesta loadAllQuestion() {
        try {
            Query queryQuestion = em.createNamedQuery("Questions.findAll", Questions.class);
            List<Questions> questionList = queryQuestion.getResultList();
            List<TrivQuestionsDto> questionDtoList = new ArrayList<>();
            for (Questions question : questionList) {
                questionDtoList.add(new TrivQuestionsDto(question));
            }
            return new Respuesta(true, " ", " ", "ListaPreguntas", questionDtoList);
        } catch (NoResultException ex) {
            return new Respuesta(false, "No existe preguntas con las credenciales ingresadas.", "NoResultException/loadAllPlayer");
        } catch (Exception ex) {
            Logger.getLogger(questionService.class.getName()).log(Level.SEVERE, "Error obteniendo las preguntas", ex);
            return new Respuesta(false, "Error obtener preguntas.", "loadAllQuestion" + ex.getMessage());
        }
    }

    public Respuesta getQuestionText(String questionsText) {
        try {
            Query queryQuestion = em.createNamedQuery("Questions.findByQueQuestions", Questions.class);
            queryQuestion.setParameter("questions", "%" + questionsText + "%");
            List<TrivQuestionsDto> questionDtoList = new ArrayList<>();
            List<Questions> questionList = queryQuestion.getResultList();
            for (Questions question : questionList) {
                questionDtoList.add(new TrivQuestionsDto(question));
            }
            //qryUsuario.getResultList()-> este para mas de un registro, y el que puse es para solo un unico registro
            return new Respuesta(true, " ", " ", "PreguntasPorTexto", questionDtoList);
         } catch (NoResultException ex) {
            return new Respuesta(false, "No existe preguntas con las credenciales ingresadas.", "NoResultException/loadAllPlayer");
        } catch (Exception ex) {
            Logger.getLogger(questionService.class.getName()).log(Level.SEVERE, "Error obteniendo las preguntas", ex);
            return new Respuesta(false, "Error obtener preguntas.", "getQuestionText" + ex.getMessage());
        }
    }
    
    public Respuesta getQuestionActive(String number){
        try {
            Query queryQuestion = em.createNamedQuery("Questions.findByQueIsEnabled", Questions.class);
            queryQuestion.setParameter("isEnabled", number);
            List<TrivQuestionsDto> questionDtoList = new ArrayList<>();
            List<Questions> questionList = queryQuestion.getResultList();
            for (Questions question : questionList) {
                questionDtoList.add(new TrivQuestionsDto(question));
            }
            return new Respuesta(true, " ", " ", "ListaPreguntasActivas/Inactivas", questionDtoList);
        } catch (NoResultException ex) {
            return new Respuesta(false, "No existe preguntas con las credenciales ingresadas.", "NoResultException/loadAllPlayer");
        } catch (Exception ex) {
            Logger.getLogger(questionService.class.getName()).log(Level.SEVERE, "Error obteniendo las preguntas", ex);
            return new Respuesta(false, "Error obtener preguntas.", "getQuestionActive" + ex.getMessage());
        }
    }
    
    public Respuesta getQuestionCategory(String category){
        try {
            Query queryQuestion = em.createNamedQuery("Questions.findByCategoryName", Questions.class);
            queryQuestion.setParameter("name", category);
            List<TrivQuestionsDto> questionDtoList = new ArrayList<>();
            List<Questions> questionList = queryQuestion.getResultList();
            for (Questions question : questionList) {
                questionDtoList.add(new TrivQuestionsDto(question));
            }
            return new Respuesta(true, " ", " ", "ListaPreguntasCategorias", questionDtoList);
        } catch (NoResultException ex) {
            return new Respuesta(false, "No existe preguntas con las credenciales ingresadas.", "NoResultException/loadAllPlayer");
        } catch (Exception ex) {
            Logger.getLogger(questionService.class.getName()).log(Level.SEVERE, "Error obteniendo las preguntas", ex);
            return new Respuesta(false, "Error obtener preguntas.", "getQuestionCategory" + ex.getMessage());
        }
    }

}

