package com.company;

public class Student extends Human{
    int course;

    public Student() {}

    public Student(String firstname, String fathername, String surname, int age, int course) {
        this.firstname = firstname;
        this.fathername = fathername;
        this.surname = surname;
        setAge(age);
        this.course = course;
    }


    public void setAge(int age) {
        if(age >= 17 && age <= 70)
            this.age = age;
        else System.out.println("Wrong Age");
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }


}
