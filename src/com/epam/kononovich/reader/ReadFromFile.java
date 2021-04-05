package com.epam.kononovich.reader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import com.epam.kononovich.validator.StringValidator;
import com.epam.kononovich.exception.ArrayException;


public class ReadFromFile {
public String ReadFile(String filename) throws ArrayException{
    if(filename==null){
        throw new ArrayException("No file path");
    }
    File file =new File(filename);
    if(!file.exists()||!file.canRead()||file.length()==0){
        throw new ArrayException("There is no file");
    }
    String fromfile;
    try (Stream<String> stream=Files.lines(Paths.get(filename))){
        fromfile=stream.filter(i -> StringValidator.ValidatorChecking(i)).findFirst().orElse(null);    }
        catch(IOException e){
            throw new ArrayException("Incorrect data", e);
        }
        if (fromfile==null){
            throw new ArrayException("Incorrect path");
        }
        return fromfile;
}
    
}
