package ErrorExceptions.University;

import ErrorExceptions.Exceptions.FacultyDoesntExistException;
import ErrorExceptions.Exceptions.LackOfFacultiesException;
import java.util.ArrayList;

public class University extends Entity {
    private ArrayList<Faculty> facultiesList = new ArrayList<>();
    public University(String name) {
        super(name);
    }

    public void addFacultyIntoList(Faculty faculty){
        facultiesList.add(faculty);
    }

    public Student getStudent(String studentName) throws NullPointerException{
        Student returnedStudent = null;
        for(Faculty faculty: facultiesList) {
            for (Group group : faculty.getGroupsList()) {
                for (Student student : group.getStudentsList()) {
                    if(studentName.toLowerCase().equals(student.getName().toLowerCase())){
                        returnedStudent = student;
                    }
                }
            }
        }
        if(returnedStudent == null){
            throw new NullPointerException(studentName + " - this student doesn't study at University");
        } else return returnedStudent;
    }

    public Group getGroup(String groupName) throws NullPointerException{
        Group returnedGroup = null;
        for (Faculty faculty : facultiesList) {
            for (Group group : faculty.getGroupsList()) {
                if (groupName.toLowerCase().equals(group.getName())) {
                    returnedGroup = group;
                }
            }
        }
        if (returnedGroup == null) {
            throw new NullPointerException(groupName + " - this group doesn't exist at University");
        } else return returnedGroup;
    }

    public Faculty getFaculty(String facultyName) throws FacultyDoesntExistException{
        Faculty returnedFaculty = null;
        for (Faculty faculty : facultiesList) {
            if (facultyName.toLowerCase().equals(faculty.getName().toLowerCase())) {
                returnedFaculty = faculty;
            }
        }
        if (returnedFaculty == null) {
            throw new FacultyDoesntExistException(facultyName);
        } else  return returnedFaculty;
    }

    //Посчитать средний балл по предмету для всего университета
    //Отсутствие факультетов в университете

    public double getAverageMarkOfSubjectForUniversity(Subject subject) throws LackOfFacultiesException {
        double averageMark = 0;
        int counter = 0;
        double sum = 0;
        double sumForGroup;
        double sumForFaculty;
        if(facultiesList.isEmpty()){
            throw new LackOfFacultiesException(this.getName() + " should have faculties");
        }
        for(Faculty faculty: facultiesList){
            sumForFaculty = 0;
            for(Group group: faculty.getGroupsList()){
                sumForGroup = 0;
                for(Student student: group.getStudentsList()){
                    if (student.getMarks().containsKey(subject.getNameSubject())) {
                    sumForGroup = sumForGroup + student.getMarks().get(subject.getNameSubject());
                    counter++;
                    }
                }
                sumForFaculty = sumForFaculty + sumForGroup;
            }
            sum = sum + sumForFaculty;
        }
        averageMark = sum / counter;
        return averageMark;
    }

}


