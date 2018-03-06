package test.java.allTests;

import main.java.pen.stationery.WritingInstruments;
import main.java.pen.stationery.WritingInstrumentsE;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WritingInstrumentsTests {
    WritingInstruments pen;
    WritingInstruments samePen;
    WritingInstruments penWithAllInformation;
    WritingInstruments samePenWithAllInformation;
    WritingInstruments penWithAllInformationAndDifferentPrice;
    WritingInstruments penWithAllInformationAndDifferentBrand;
    WritingInstruments penWithAllInformationAndDifferentRedPart;
    WritingInstruments penWithAllInformationAndDifferentGreenPart;
    WritingInstruments penWithAllInformationAndDifferentBluePart;
    WritingInstruments instrumentWithAllInformationAndDifferentItem;

    @Before
    public void setUp(){
        pen = new WritingInstruments(WritingInstrumentsE.PEN, 265,365, 299);
        samePen = new WritingInstruments(WritingInstrumentsE.PEN, 265,365, 299);
        penWithAllInformation =
                new WritingInstruments(WritingInstrumentsE.PEN, 23,23,23,190.32F, "lol");
        samePenWithAllInformation =
                new WritingInstruments(WritingInstrumentsE.PEN, 23,23,23,190.32F, "lol");
        penWithAllInformationAndDifferentPrice =
                new WritingInstruments(WritingInstrumentsE.PEN, 23,23,23,191.32F, "lol");
        penWithAllInformationAndDifferentBrand =
                new WritingInstruments(WritingInstrumentsE.PEN, 23,23,23,190.32F, "not lol");
        penWithAllInformationAndDifferentRedPart =
                new WritingInstruments(WritingInstrumentsE.PEN, 2,23,23,190.32F, "lol");
        penWithAllInformationAndDifferentGreenPart =
                new WritingInstruments(WritingInstrumentsE.PEN, 23,2,23,190.32F, "lol");
        penWithAllInformationAndDifferentBluePart =
                new WritingInstruments(WritingInstrumentsE.PEN, 23,23,2,190.32F, "lol");
        instrumentWithAllInformationAndDifferentItem =
                new WritingInstruments(WritingInstrumentsE.MARKER, 23,23,23,190.32F, "lol");

    }
    @Test
    public void constructorMustCheckIfColorValueIsValidAndSetNecessaryIfInvalid(){
        assertEquals(255, pen.getRed());
        assertEquals(255, pen.getGreen());
        assertEquals(255, pen.getBlue());
    }
    @Test
    public void writingInstrumentToStringMustWriteRightInformation(){
        assertEquals("main.java.pen.stationery.WritingInstruments@ price: 190.32, brand: lol," +
                        " item: PEN, color: 23, 23, 23",
                penWithAllInformation.toString());
        assertEquals("main.java.pen.stationery.WritingInstruments@ price: 0.0, brand: null," +
                        " item: PEN, color: 255, 255, 255",
                pen.toString());
    }
    @Test
    public void writingInstrumentHashCodeMustReturnRightHashCode(){
        int penHashCode = pen.getItem().hashCode() + 13 * (pen.getRed() + pen.getGreen() + pen.getBlue());
        int penWithAllInformationHashCode = (int)(12 * penWithAllInformation.getPrice()) +
                penWithAllInformation.getBrand().hashCode() +
                penWithAllInformation.getItem().hashCode() +
                13 * (penWithAllInformation.getRed() + penWithAllInformation.getGreen() + penWithAllInformation.getBlue());
        assertEquals(penHashCode, pen.hashCode());
        assertEquals(penWithAllInformationHashCode, penWithAllInformation.hashCode());
    }
    @Test
    public void writingInstrumentHashCodeMustBeEqualForTheSameWritingInstrument(){
        assertEquals(pen.hashCode(), samePen.hashCode());
    }
    @Test
    public void writingInstrumentsEqualsMustReturnTrueIfItIsTheSameObject(){
        assertTrue(pen.equals(pen));
        assertTrue(penWithAllInformation.equals(penWithAllInformation));
    }
    @Test
    public void writingInstrumentsEqualsMustReturnTrueIfObjectsAreTheSame(){
        assertTrue(pen.equals(samePen));
        assertTrue(penWithAllInformation.equals(samePenWithAllInformation));
    }
    @Test
    public void writingInstrumentsEqualsMustReturnFalseWhenCompareWithNull(){
        assertFalse(pen.equals(null));
    }
    @Test
    public void writingInstrumentsEqualsMustReturnFalseWhenTypesAreDiffer(){
        String imPen = "haha i'm pen";
        assertFalse(pen.equals(imPen));
    }
    @Test
    public void writingInstrumentsEqualsMustReturnFalseWhenPricesAreDiffer(){
        assertFalse(penWithAllInformation.equals(penWithAllInformationAndDifferentPrice));
    }
    @Test
    public void writingInstrumentsEqualsMustReturnFalseWhenBrandsAreDiffer(){
        assertFalse(penWithAllInformation.equals(penWithAllInformationAndDifferentBrand));
    }
    @Test
    public void writingInstrumentsEqualsMustReturnFalseWhenColorsAreDiffer(){
        assertFalse(penWithAllInformation.equals(penWithAllInformationAndDifferentRedPart));
        assertFalse(penWithAllInformation.equals(penWithAllInformationAndDifferentGreenPart));
        assertFalse(penWithAllInformation.equals(penWithAllInformationAndDifferentBluePart));
    }
    @Test
    public void writingInstrumentsEqualsMustReturnFalseWhenItemsAreDiffer(){
        assertFalse(penWithAllInformation.equals(instrumentWithAllInformationAndDifferentItem));
    }
    @Test
    public void setPriceMustChangePrice(){
        pen.setPrice(12F);
        assertEquals(12F, pen.getPrice(), 0);
    }
}
