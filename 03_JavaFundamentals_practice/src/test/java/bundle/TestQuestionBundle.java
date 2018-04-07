package test.java.bundle;

import main.java.bunlde.QuestionsBundle;
import main.java.bunlde.exception.NoSuchQuestionException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestQuestionBundle {
    QuestionsBundle testEn;
    QuestionsBundle testRu;
    QuestionsBundle testDefault;
    @Before
    public void setUp(){
        testEn = new QuestionsBundle("en");
        testRu = new QuestionsBundle("ru");
        testDefault = new QuestionsBundle("eeee");
    }

    @Test
    public void makeChoiceLanguageTest(){
        assertEquals("Выберите номер вопроса", testRu.makeChoice());
        assertEquals("Choose number of question", testEn.makeChoice());
        assertEquals("Choose number of question", testDefault.makeChoice());
    }
    @Test
    public void getAnswerShouldReturnRightQuestion() throws NoSuchQuestionException{
        assertEquals("ответ: шесть", testRu.getAnswer(3));
        assertEquals("answer: six", testEn.getAnswer(3));
        assertEquals("answer: six", testDefault.getAnswer(3));
    }
    @Test(expected = NoSuchQuestionException.class)
    public void getAnswerShouldThrowsExceptionIfNubberOfQuestionIsIncorrect() throws NoSuchQuestionException{
        testRu.getAnswer(10);
        testEn.getAnswer(10);
        testDefault.getAnswer(10);
    }


}
