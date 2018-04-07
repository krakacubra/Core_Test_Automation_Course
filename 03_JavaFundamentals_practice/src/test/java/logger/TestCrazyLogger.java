package test.java.logger;

import main.java.logger.CrazyLogger;
import main.java.logger.exception.NoSuchInformation;
import org.junit.Before;
import org.junit.Test;

import javax.management.MXBean;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ForkJoinPool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestCrazyLogger {
    CrazyLogger loggerFormat = new CrazyLogger();
    CrazyLogger loggerFind = new CrazyLogger();
    @Before
    public void setUp(){
        loggerFormat.addLog("aaa");
        loggerFind.addLog("aaa");
        loggerFind.addLog("bbb");
        loggerFind.addLog("aba");
    }
    @Test
    public void addLogShouldBeInCertainFormat(){
        StringBuilder expected = new StringBuilder();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-YYYY : hh-mm");
        expected.append(dateFormat.format(new Date())).append(" - ").append("aaa").append(";\n");
        assertEquals(expected.toString(), loggerFormat.getLogger().toString());
    }
    @Test
    public void findInfoMustReturnNecessaryInformation()throws NoSuchInformation{
        List<String> expected = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-YYYY : hh-mm");
        String date = dateFormat.format(new Date());
        expected.add(date + " - aaa;");
        expected.add(date + " - aba;");
        assertEquals(expected, loggerFind.findInfo("a"));
    }

    @Test(expected = NoSuchInformation.class)
    public void findInfoMustThrowException() throws NoSuchInformation{
        loggerFind.findInfo("v");
    }
}
