package com.tsc.entities;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Date;

@XmlType(propOrder = {"name", "age", "birthday"}, name = "student")
@XmlRootElement
public class Student implements Serializable
{
    private String name;
    private Integer age;
    private Date birthday;

    public Student()
    {
    }

    public Student(String name, Integer age, Date birthday)
    {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

}
