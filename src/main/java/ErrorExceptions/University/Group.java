package ErrorExceptions.University;

import ErrorExceptions.Exceptions.LackOfStudentsException;
import java.util.ArrayList;
import java.util.UUID;

public class Group extends Entity {
    private UUID facultyId;
    private ArrayList<Student> studentsList = new ArrayList<>();

    public Group(String groupNumber) {
        super(groupNumber);
    }

    public void setFacultyId(UUID facultyId) {
        this.facultyId = facultyId;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void addStudentIntoList(Student student){
        studentsList.add(student);
        student.setGroupId(this.getId());
    }

    //Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
    //Отсутствие студентов в группе
    //Отсутствие групп на факультете

    public double getAverageMarkOfSubjectInParticularGroup(Subject subject) throws LackOfStudentsException, IllegalArgumentException{
        double averageMark;
        int counter = 0;
        double sum = 0;
        if(studentsList.isEmpty()){
            throw new LackOfStudentsException(this.getName(), "should have students");
        }
        for(Student student: studentsList){
            if(student.getMarks().containsKey(subject.getNameSubject())){
                sum = sum + student.getMarks().get(subject.getNameSubject());
                counter++;
            }
        }
        if(counter == 0){
            throw new IllegalArgumentException("Students don't study " + subject.getNameSubject() + " in this group");
        }
        averageMark = sum / counter;
        return averageMark;
    }


}
