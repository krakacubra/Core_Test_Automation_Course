package test.java.allTests;

import main.java.pen.stationery.Paper;
import main.java.pen.stationery.enums.PaperE;
import org.junit.Before;
import org.junit.Test;

import java.util.Queue;

import static org.junit.Assert.*;

public class PaperTests {
    Paper paper;
    Paper samePaper;
    Paper differentPaper;
    Paper paperWithDifferentPrice;
    Paper paperWithDifeferentBrand;
    Paper paperWithDifferentItems;
    Paper paperWithDifferentnPages;
    Paper paperJust;
    Queue<Integer> q;

    @Before
    public void setUp() {
        paper = new Paper(PaperE.NOTEBOOK, 30, 45F, "qwerty");
        samePaper = new Paper(PaperE.NOTEBOOK, 30, 45F, "qwerty");
        differentPaper = new Paper(PaperE.PAPER, 12, 2F, "lol");
        paperWithDifferentPrice = new Paper(PaperE.NOTEBOOK, 30, 4F, "qwerty");
        paperWithDifeferentBrand = new Paper(PaperE.NOTEBOOK, 30, 45F, "qwe");
        paperWithDifferentItems = new Paper(PaperE.ALBBUM, 30, 45F, "qwerty");
        paperWithDifferentnPages = new Paper(PaperE.NOTEBOOK, 12, 45F, "qwerty");
        paperJust = new Paper();
    }
    @Test
    public void paperToStringMustReturnNecessaryString(){
        assertEquals("main.java.pen.stationery.Paper@ item: NOTEBOOK, brand: qwerty, " +
                        "price: 45.0, number of pages: 30",
                paper.toString());
    }
    @Test
    public void paperHashCodeMustRerunSameHashCodeForSameObjects(){
        assertEquals(samePaper.hashCode(), paper.hashCode());
    }
    @Test
    public void paperHashCodeMustRerunDifferentHashCodeForDifferentObjects(){
        assertNotEquals(paper.hashCode(), differentPaper.hashCode());
    }
    @Test
    public void paperHashCodeMustReturnRightHashCode(){
        int paperHashCode = (int)(12 * paper.getPrice()) + paper.getBrand().hashCode() + paper.getItem().hashCode() +
                23 * paper.getNumberPages();
        assertEquals(paperHashCode, paper.hashCode());
    }
    @Test
    public void paperEqualsMustReturnTrueForTheSameObjects(){
        assertTrue(paper.equals(samePaper));
    }
    @Test
    public void paperEqualsMustReturnTrueForOneObject(){
        assertTrue(paper.equals(paper));
    }

    @Test
    public void paperEqualsMustReturnFalseIfObjectIsNull(){
        assertFalse(paper.equals(null));
    }

    @Test
    public void paperEqualsMustReturnFalseForTheObjectWithDifferentType(){
        String paperS = "I'm a paper with 30 sheets, are you believe me?";
        assertFalse(paper.equals(paperS));
    }
    @Test
    public void paperEqualsMustReturnFalseIfPriceDiffer(){
        assertFalse(paper.equals(paperWithDifferentPrice));
    }
    @Test
    public void paperEqualsMustReturnFalseIfBrandDiffer(){
        assertFalse(paper.equals(paperWithDifeferentBrand));
    }
    @Test
    public void paperEqualsMustReturnFalseIfItemDiffer(){
        assertFalse(paper.equals(paperWithDifferentItems));
    }
    @Test
    public void paperEqualsMustReturnFalseIfnPagesDiffer(){
        assertFalse(paper.equals(paperWithDifferentnPages));
    }
}