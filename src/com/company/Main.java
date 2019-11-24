package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{
	// write your code
        Human human = new Human("Yurii", "Ruslanovich", "Huley", 19);

        Student student = new Student("Roman", "Romanovich", "Sklepovyy", 19, 2);
        Teacher teacher = new Teacher("Michael", "Michaelovich", "Shpitko", 19, 90);


        System.out.println( human.doubleAge());

        Teacher teacher2 = (Teacher) teacher.clone();
        teacher2.setAge(22);
        System.out.println(teacher2);


        System.out.println("Compare to for teacher");
        if(teacher.compareTo(teacher2) < 0 ){
            System.out.println(teacher + " is better");
        } else if(teacher.compareTo(teacher2) > 0){
            System.out.println(teacher2 + " is better");
        } else System.out.println("They are similar");

        System.out.println("Hash code for teacher" + teacher.hashCode());

        if(teacher.equals(teacher2)){
            System.out.println("teachers are equuals");
        }else System.out.println("teachers aren`t equuals");

        System.out.println("Double age for teacher" + teacher.doubleAge());

        System.out.println("Double age for student" + student.doubleAge());


    }
}
