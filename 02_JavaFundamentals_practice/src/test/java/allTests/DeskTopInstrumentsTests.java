package test.java.allTests;

import main.java.pen.stationery.DeskTopInstruments;
import main.java.pen.stationery.enums.DeskTopInstrumentsE;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DeskTopInstrumentsTests {
    DeskTopInstruments rubber;
    DeskTopInstruments emptyDeskTopInstrument;
    DeskTopInstruments sameRubber;
    DeskTopInstruments holePunch;

    @Before
    public void setUp() {
        rubber = new DeskTopInstruments(DeskTopInstrumentsE.RUBBER, 12F, "brand");
        emptyDeskTopInstrument = new DeskTopInstruments();
        sameRubber = new DeskTopInstruments(DeskTopInstrumentsE.RUBBER, 12F, "brand");
        holePunch =  new DeskTopInstruments(DeskTopInstrumentsE.HOLE_PUNCH, 43F, "anotherBrand");


    }

    @Test
    public void deskTopInstrumentsToStringMustWriteRightInformation() {
        assertEquals("main.java.pen.stationery.DeskTopInstruments@ price: 12.0, brand: brand," +
                        " item: RUBBER",
                rubber.toString());
        assertEquals("main.java.pen.stationery.DeskTopInstruments@ price: 0.0, brand: null," +
                        " item: null",
                emptyDeskTopInstrument.toString());
    }
    @Test
    public void deskTopInstrumentsHashCodeMustReturnRightHashCode(){
        int rubberHashCode = rubber.getItem().hashCode() + (int)(12 * rubber.getPrice()) +
                rubber.getBrand().hashCode();
        int emptyDeskTopInstrumentHashCode = 0;
        assertEquals(rubberHashCode, rubber.hashCode());
        assertEquals(emptyDeskTopInstrumentHashCode, emptyDeskTopInstrument.hashCode());
    }
    @Test
    public void deskTopInstrumentsHashCodeMustBeEqualForTheSameWritingInstrument(){
        assertEquals(rubber.hashCode(), sameRubber.hashCode());
    }
    @Test
    public void deskTopInstrumentsEqualsMustReturnTrueIfItIsTheSameObject(){
        assertTrue(rubber.equals(rubber));
        assertTrue(emptyDeskTopInstrument.equals(emptyDeskTopInstrument));
    }
    @Test
    public void writingInstrumentsEqualsMustReturnTrueIfObjectsAreTheSame(){
        assertTrue(rubber.equals(sameRubber));
    }
    @Test
    public void deskTopInstrumentsEqualsMustReturnFalseWhenCompareWithNull(){
        assertFalse(rubber.equals(null));
    }
    @Test
    public void deskTopInstrumentsEqualsMustReturnFalseWhenTypesAreDiffer(){
        String imRubber = "haha i'm rubber";
        assertFalse(rubber.equals(imRubber));
    }
    @Test
    public void deskTopInstrumentsEqualsMustReturnFalseWhenPricesAreDiffer(){
        assertFalse(rubber.equals(holePunch));
    }
}