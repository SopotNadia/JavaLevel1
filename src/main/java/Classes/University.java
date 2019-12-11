package Classes;

import java.util.GregorianCalendar;

public class University {
    public static void main(String[] args){
        ListOfStudents.addNewStudentIntoArray(new Student( "Nadia", "Sopot", "Gennadievna",
                324, new GregorianCalendar(1991,9,22), "ul. Odoevskogo", "+375333528043",
                Faculty.FACULTY_OF_ENGINEERING_AND_ECONOMICS, 5, "871502"));
        ListOfStudents.addNewStudentIntoArray(new Student( "Valera", "Krotov", new GregorianCalendar(1997,10,22),
               Faculty.FACULTY_OF_ENGINEERING_AND_ECONOMICS, 2, "871302"));
        ListOfStudents.addNewStudentIntoArray(new Student( "Fedor", "Bubkin", new GregorianCalendar(1996,11,22),
                Faculty.FACULTY_OF_COMPUTER_SYSTEMS_AND_NETWORKS, 3, "871401"));
        ListOfStudents.addNewStudentIntoArray(new Student( "Aleksandr", "Sushko", new GregorianCalendar(1998,10,22),
                Faculty.FACULTY_OF_INFORMATION_TECHNOLOGIES_AND_CONTROL, 1, "871402"));
        ListOfStudents.addNewStudentIntoArray(new Student( "Olga", "Mihnuk",  new GregorianCalendar(1997,10,22),
                Faculty.FACULTY_OF_ENGINEERING_AND_ECONOMICS, 4, "871502"));
        ListOfStudents.addNewStudentIntoArray(new Student( "Viktor", "Buluhin",  new GregorianCalendar(1995,9,22),
                Faculty.FACULTY_OF_COMPUTER_SYSTEMS_AND_NETWORKS, 1, "871502"));

        ListOfStudents.filterByFaculty();
        ListOfStudents.filterByFacultyAndCourse();
        ListOfStudents.filterByBirthday();
        ListOfStudents.filterByGroup();
    }
}
