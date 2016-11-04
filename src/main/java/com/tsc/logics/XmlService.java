package com.tsc.logics;

import com.tsc.entities.Student;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class XmlService implements MarshallService
{
    @Override
    public void marshallExample(Student student)
    {
        File file = new File("testXml.xml");
        try (FileOutputStream outputStream
                     = new FileOutputStream(file))
        {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(student, outputStream);

        } catch (JAXBException | IOException ex)
        {
            System.out.print(ex);
        }

    }

    @Override
    public Student unmarshallExample()
    {
        Student student = null;
        File file = new File("testXml.xml");
        try (FileInputStream inputStream = new FileInputStream(file))
        {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            student = (Student) unmarshaller.unmarshal(inputStream);

        } catch (JAXBException | IOException ex)
        {
            System.out.print(ex);
        }

        return student;
    }

}
