package com.company;

public class Human {
    String firstname;
    String fathername;
    String surname;
    int age;

    public Human(){};

    public Human(String firstname, String fathername, String surname, int age) {
        this.firstname = firstname;
        this.fathername = fathername;
        this.surname = surname;
        setAge(age);
    }


    public int doubleAge(){
        return (age*2);
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setFathername(String lastname) {
        this.fathername = lastname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if(age > 0 && age <= 150)
            this.age = age;
        else System.out.println("Wrong Age");
    }

    public String getFirstname() {
        return firstname;
    }

    public String getFathername() {
        return fathername;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void ShowInfo() {
        System.out.println("Human " + firstname + ' ' + fathername + ' ' + surname
                + " age:" + age );
    }

    public void ShowInfoUpperCase() {
        System.out.println("Human " + firstname.toUpperCase() + ' ' + fathername.toUpperCase().charAt(0) + ' ' + surname.toUpperCase().charAt(0)
                + " AGE:" + age );
    }

}
