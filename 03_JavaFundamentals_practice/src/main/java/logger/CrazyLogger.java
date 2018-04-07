package main.java.logger;

import main.java.logger.exception.NoSuchInformation;

import java.text.SimpleDateFormat;
import java.util.*;

public class CrazyLogger {
    private StringBuilder logger;

    public StringBuilder getLogger(){
        return logger;
    }

    public CrazyLogger(){
        logger = new StringBuilder();
    }

    public void addLog(String message){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-YYYY : hh-mm");
        logger.append(dateFormat.format(new Date())).append(" - ").append(message).append(";\n");
    }

    public List<String> findInfo(String toFind) throws NoSuchInformation {
        int index = logger.indexOf(toFind);
        if (index == -1){
            throw new NoSuchInformation();
        }
        List<String> foundInLog = new ArrayList<>();

        index = logger.indexOf(";", index);
        foundInLog.add(logger.substring(0,index+1));

        while (index < logger.length()){

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
