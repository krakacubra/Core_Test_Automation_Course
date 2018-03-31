package main.java.logger;

import main.java.logger.exception.NoSuchInformation;

import java.util.*;

public class CrazyLogger {
    private StringBuilder logger;

    public CrazyLogger(){
        logger = new StringBuilder();
    }

    public StringBuilder getLogger() {
        return logger;
    }

    public void addLog(String message){
        Formatter formatter = new Formatter();
        Date data = new Date();
        Calendar calendar = Calendar.getInstance();
        formatter.format("%tF : %tR", calendar, calendar);
        logger.append(formatter).append(" - ").append(message).append("\n");
    }

    public List<String> findInfo(String toFind) throws NoSuchInformation {
        int index = logger.indexOf(toFind);
        if (index == -1){
            throw new NoSuchInformation();
        }
        List<String> foundInLog = new ArrayList<>();

        index = logger.indexOf("\n", index);
        foundInLog.add(logger.substring(0,index));

        while (index < logger.length()){
            int begin = index + 1;

            index = logger.indexOf(toFind, index);
            if (index == -1){
                break;
            }
            int i = index;
            while(logger.charAt(i) != '\n'){
                i--;
            }
            index = logger.indexOf("\n", index);
            foundInLog.add(logger.substring(i + 1, index));
        }
        return foundInLog;
    }
}
