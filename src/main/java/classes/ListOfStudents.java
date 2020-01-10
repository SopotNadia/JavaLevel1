package classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class ListOfStudents {
    //1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
    //Создать массив объектов. Вывести: a) список студентов заданного факультета;
    //b) списки студентов для каждого факультета и курса;  c) список студентов, родившихся после заданного года;
    //d) список учебной группы.

    private static ArrayList<Student> arrayListOfStudents = new ArrayList<>();

    public static void addNewStudentIntoArray(Student student) {
        arrayListOfStudents.add(student);
    }

    public static void filterByFaculty() {
        ArrayList<Student> arrayFilterByFaculty = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any faculty " + Faculty.getFacultyList());

        String enteredFaculty = scanner.nextLine();
        if (Faculty.getFacultyList().contains(enteredFaculty)) {
            for (Student student : arrayListOfStudents) {
                if (enteredFaculty.equals(student.getFaculty().getFacultyName())) {
                    arrayFilterByFaculty.add(student);
                } else continue;
            }
        } else {
            System.out.println("You didn't select existed faculty\n");
            return;
        }
        System.out.println("Students list of selected faculty: ");
        ListOfStudents.print(arrayFilterByFaculty);
    }

    public static void filterByFacultyAndCourse() {
        ArrayList<Student> arrayFilterByFaculty = new ArrayList<>();
        for (Faculty anyFaculty : Faculty.values()) {
            for (Student student : arrayListOfStudents) {
                if (student.getFaculty().equals(anyFaculty)) {
                    arrayFilterByFaculty.add(student);
                }
            }
            System.out.println("All students of " + anyFaculty + ": ");
            ListOfStudents.print(arrayFilterByFaculty);
            arrayFilterByFaculty.clear();
        }
        ArrayList<Student> arrayFilterByCourse = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            for (Student student : arrayListOfStudents) {
                if (student.getCourse() == i) {
                    arrayFilterByCourse.add(student);
                }
            }
            System.out.println("All students of " + i + " course: ");
            ListOfStudents.print(arrayFilterByCourse);
            arrayFilterByCourse.clear();
        }
    }

    public static void filterByBirthday() {
        System.out.println("Enter any year: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int enteredYear = scanner.nextInt();
            ArrayList<Student> arrayFilterByBirthday = new ArrayList<>();
            for (Student student : arrayListOfStudents) {
                if (student.getBirthDay().get(Calendar.YEAR) > enteredYear) {
                    arrayFilterByBirthday.add(student);
                }
            }
            ListOfStudents.print(arrayFilterByBirthday);
        } else System.out.println("Your input is wrong");
    }

    public static void filterByGroup() {
        System.out.println("Enter any group: ");
        Scanner scanner = new Scanner(System.in);
        String numberGroup = scanner.nextLine();
        ArrayList<Student> arrayFilterByGroup = new ArrayList<>();
        for (Student student : arrayListOfStudents) {
            if (student.getGroup().equals(numberGroup)) {
                arrayFilterByGroup.add(student);
            }
        }
        if (arrayFilterByGroup.size() > 0) {
            ListOfStudents.print(arrayFilterByGroup);
        } else System.out.println("There isn't entered group number at University.");

    }

    private static void print(ArrayList<Student> array) {
        for (Student student : array) {
            System.out.println(student);
        }
    }
}
