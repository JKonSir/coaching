package com.tsc.logics;

import com.tsc.entities.Student;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class WriteFile
{
    public void writeInFile(String fileName, Student student) throws IOException
    {
        File file = new File(fileName);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        outputStream.writeObject(student);
        outputStream.close();
    }

}
