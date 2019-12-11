package Classes;

import java.util.GregorianCalendar;

public class Student {
    private String firstName;
    private String secondName;
    private String patronymic;
    private int id;
    private GregorianCalendar birthDay;
    private String address;
    private String phoneNumber;
    private Faculty faculty;
    private int course;
    private String group;

    public Student(String firstName, String secondName, String patronymic, int id, GregorianCalendar birthDay, String address,
                   String phoneNumber, Faculty faculty, int course, String group){
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.id = id;
        this.birthDay = birthDay;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(String firstName, String secondName, GregorianCalendar birthDay, Faculty faculty, int course, String group){
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDay = birthDay;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public int getCourse(){
        return course;
    }

    public GregorianCalendar getBirthDay() {
        return birthDay;
    }

    public String getGroup() {
        return group;
    }

    public String toString(){
        return secondName + " " + firstName;

    }

}
