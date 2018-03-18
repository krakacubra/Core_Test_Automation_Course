package test.java.subclasses;

import main.java.subclasses.NuclearSubmarine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaunchSubmarineTest {
    private NuclearSubmarine nuclearSubmarine;
    @Before
    public void setUp(){
        nuclearSubmarine = new NuclearSubmarine();
    }
    @Test
    public void startEngineTest(){
        nuclearSubmarine.startEngine();
        assertEquals("READY",nuclearSubmarine.toString());
    }
    @Test
    public void launchSubmarineTest(){
        nuclearSubmarine.launchSubmarine();
        assertEquals("GO",nuclearSubmarine.toString());
    }
}
