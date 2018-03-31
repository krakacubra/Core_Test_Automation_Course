package test.java.logger;

import main.java.logger.CrazyLogger;
import main.java.logger.exception.NoSuchInformation;
import org.junit.Before;
import org.junit.Test;

import javax.management.MXBean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;
import java.util.List;
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
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter.format("%tF : %tR", calendar, calendar);
        expected.append(formatter).append(" - ").append("aaa").append("\n");
        assertEquals(expected.toString(), loggerFormat.getLogger().toString());
    }
    @Test
    public void findInfoMustReturnNecessaryInformation()throws NoSuchInformation{
        List<String> expected = new ArrayList<>();
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter.format("%tF : %tR", calendar, calendar);
        expected.add(formatter + " - aaa");
        expected.add(formatter + " - aba");
        assertEquals(expected, loggerFind.findInfo("a"));
    }

    @Test(expected = NoSuchInformation.class)
    public void findInfoMustThrowException() throws NoSuchInformation{
        loggerFind.findInfo("v");
    }
}
