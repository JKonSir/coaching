package com.tsc.controllers;

import com.tsc.entities.Student;
import com.tsc.logics.MarshallService;
import com.tsc.logics.ReadFile;
import com.tsc.logics.WriteFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;

@RestController
public class HelloController
{
    @Autowired
    private WriteFile writeFile;
    @Autowired
    private ReadFile readFile;
    @Autowired
    private MarshallService marshallService;

    @RequestMapping("/write")
    public String index() throws IOException
    {
        Student student = new Student("Vasya", 20, new Date());

        String fileName = "test.txt";
        writeFile.writeInFile(fileName, student);

        return "Student save in file " + fileName;
    }

    @RequestMapping("/read")
    public String getStudent() throws ClassNotFoundException, IOException
    {
        String fileName = "test.txt";
        Student student = readFile.readFromFile(fileName);

        return student.toString();
    }

    @RequestMapping("/marshall")
    public void marshall()
    {
        Student student = new Student("Vasya", 20, new Date());
        marshallService.marshallExample(student);
    }

    @RequestMapping("/unmarshall")
    public String unmarshall()
    {
        Student student = marshallService.unmarshallExample();

        return student.toString();
    }

}