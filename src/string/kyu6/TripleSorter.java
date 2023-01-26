package string.kyu6;

//STREAMS STRINGS ALGORITHMS ARRAYS SORTING

import java.util.*;
import java.util.stream.Collectors;


/**
    DESCRIPTION:
            Tale University is a bit messy, and can't maintain an ordered list of their student. Tale's dean wants to print a sortet list of his students by the gpa,
            last name and age and post it on the walls so everybody can be impressed of his great students.

            Given a list of students, sort them by (from most important to least important):

            GPA (descending)
            First letter of last name (ascending)
            Age (ascending)

            And the class Student:

    class Student {
        ...
        int getGpa()
        int getAge();
        String getFullName();
    }
        Return the sorted result as full names string, comma separated.

            For Example, given the list (name, age, gpa):

            David Goodman, 23, 88
            Mark Rose, 25, 82
            Jane Doe, 22, 90
            Jane Dane, 25, 90

            sort(students) should return "Jane Doe,Jane Dane,David Goodman,Mark Rose"
**/

public class TripleSorter {

    public static String sort(List<Student> list) {
        Collections.sort(list, Comparator.comparing((Student::getAge)));


        // Tenho que criar aqui uma forma de ordenar pelo nome sem criar nada novo no Student!!

//        Collections.sort(list, Comparator.comparing(s -> s.getFullName().split(" ")));
        Collections.sort(list, Comparator.comparing(Student::getLastName));

        Collections.sort(list, Comparator.comparing(Student::getGpa));
        Collections.reverse(list);

        return list.stream().map(c->c.fullName).collect(Collectors.joining(","));
    }
}

class Student {

    protected int gpa;
    protected int age;
    protected String fullName;

    Student(int age, int gpa,  String fullName) {
        this.age = age;
        this.gpa = gpa;
        this.fullName = fullName;
    }

    public int getGpa() {
        return gpa;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLastName() {
        var fullName = this.fullName.split(" ");
        return fullName[1];
    }
}