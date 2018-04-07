package main.java.bunlde;

import com.sun.istack.internal.NotNull;
import main.java.bunlde.exception.NoSuchQuestionException;

import java.util.Locale;
import java.util.ResourceBundle;

public class QuestionsBundle {
    private ResourceBundle questionBundle;
    private ResourceBundle answerBundle;
    private ResourceBundle interactionBundle;

    public QuestionsBundle(@NotNull String locale){
        switch (locale.toLowerCase()){
            case "en":{
                questionBundle = ResourceBundle.getBundle("main/resources/Questions",
                        new Locale("en", "US"));
                answerBundle = ResourceBundle.getBundle("main/resources/Answer",
                        new Locale("en", "US"));
                interactionBundle = ResourceBundle.getBundle("main/resources/Interaction",
                        new Locale("en", "US"));
                break;
            }
            case "ru":{
                questionBundle = ResourceBundle.getBundle("main/resources/Questions",
                        new Locale("ru", "RU"));
                answerBundle = ResourceBundle.getBundle("main/resources/Answer",
                        new Locale("ru", "RU"));
                interactionBundle = ResourceBundle.getBundle("main/resources/Interaction",
                        new Locale("ru", "RU"));
                break;
            }
            default:{
                questionBundle = ResourceBundle.getBundle("main/resources/Questions",
                        new Locale("en", "US"));
                answerBundle = ResourceBundle.getBundle("main/resources/Answer",
                        new Locale("en", "US"));
                interactionBundle = ResourceBundle.getBundle("main/resources/Interaction",
                        new Locale("en", "US"));
                break;
            }
        }
    }

    public String printQuestions(){
        StringBuilder questions = new StringBuilder();
        for(Integer i = 1; questionBundle.containsKey(i.toString()); i++){
            questions.append(String.format("%d) %s", i, questionBundle.getString(i.toString()))).append("\n");
        }
        questions.append("\n").append(interactionBundle.getString("0")).append("\n");
        return questions.toString();
    }

    public String getAnswer(Integer i) throws NoSuchQuestionException {
        if(!questionBundle.containsKey(i.toString())){
            throw new NoSuchQuestionException();
        }
        return interactionBundle.getString("answer" ) + answerBundle.getString(i.toString());
    }

    public String makeChoice(){
        return interactionBundle.getString("choice");
    }

    public String continueChoice(){
        return interactionBundle.getString("continue");
    }


}
