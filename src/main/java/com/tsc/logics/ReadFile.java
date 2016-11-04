package com.tsc.logics;

import com.tsc.entities.Student;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ReadFile
{
    public Student readFromFile(String fileName) throws IOException, ClassNotFoundException
    {
        File file = new File("C:\\workspace\\ideaProjects\\javaProjects\\tsc\\" + fileName);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        Student student = (Student) inputStream.readObject();
        inputStream.close();

        return student;
    }

}
