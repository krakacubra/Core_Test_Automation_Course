package test.java.allTests;

import main.java.pen.stationery.Stationery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StationaryTests {
    private Stationery stationery;
    private Stationery sameStationery;
    private Stationery differentStationery;
    private Stationery emptyStationery;
    private Stationery stationeryWithoutBrand;
    private Stationery stationeryWithoutPrice;
    private String iAmStationary;
    @Before
    public void setUp(){
        stationery = new Stationery("Parker", 3.6F);
        differentStationery = new Stationery("Eric", 3.6F);
        sameStationery = new Stationery("Parker", 3.6F);
        emptyStationery = new Stationery();
        stationeryWithoutBrand = new Stationery(34F);
        stationeryWithoutPrice = new Stationery("Parker");
    }
    @Test
    public void sameItemHasSameHashCode(){
        assertEquals(stationery.hashCode(), sameStationery.hashCode());
    }
    @Test
    public void stationaryMustReturnNecessaryInformation(){
        assertEquals(0, emptyStationery.hashCode());
        int expected = (int)(12 * stationery.getPrice()) + stationery.getBrand().hashCode();
        assertEquals(expected, stationery.hashCode());
        expected = (int)(12 * stationeryWithoutBrand.getPrice());
        assertEquals(expected, stationeryWithoutBrand.hashCode());
        expected = stationeryWithoutPrice.getBrand().hashCode();
        assertEquals(expected, stationeryWithoutPrice.hashCode());
        assertNotEquals(stationeryWithoutBrand.hashCode(), stationeryWithoutPrice.hashCode());
    }
    @Test
    public void stationeryToStringMustReturnNecessaryString(){
        assertEquals("main.java.pen.stationery.Stationery@ price: 3.6, brand: Parker", stationery.toString());
        assertEquals("main.java.pen.stationery.Stationery@ price: 0.0, brand: null", emptyStationery.toString());
        assertEquals("main.java.pen.stationery.Stationery@ price: 34.0, brand: null",
                                stationeryWithoutBrand.toString());
        assertEquals("main.java.pen.stationery.Stationery@ price: 0.0, brand: Parker",
                                stationeryWithoutPrice.toString());
    }
    @Test
    public void stationeryEqualsMustReturnTrueForOneStationary(){
        assertTrue(stationery.equals(stationery));
    }
    @Test
    public void stationeryEqualsMustReturnTrueForSameStationeries(){
        assertTrue(stationery.equals(sameStationery));
    }
    @Test
    public void stationeryEqualsMustReturnFalseIfNull(){
        assertFalse(stationery.equals(null));
    }
    @Test
    public void stationeryEqualsMustReturnFalseIfClassesAreNotTheSame(){
        assertFalse(stationery.equals(iAmStationary));
    }
    @Test
    public void stationeryEqualsMustReturnFalseIfPricesAreNotTheSame(){
        assertFalse(stationery.equals(stationeryWithoutBrand));
    }
    @Test
    public void stationeryEqualsMustReturnFalseIfPricesAreTheSameButBrandsDiffer(){
        assertFalse(stationery.equals(differentStationery));
    }
    
}
