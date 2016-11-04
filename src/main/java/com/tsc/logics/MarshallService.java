package com.tsc.logics;

import com.tsc.entities.Student;
import org.springframework.stereotype.Service;

public interface MarshallService
{
    void marshallExample(Student student);

    Student unmarshallExample();

}
