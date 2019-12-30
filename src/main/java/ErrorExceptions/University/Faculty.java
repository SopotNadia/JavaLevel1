package ErrorExceptions.University;

import ErrorExceptions.Exceptions.LackOfGroupsException;
import java.util.ArrayList;
import java.util.UUID;

public class Faculty extends Entity {
    private UUID universityId;
    private ArrayList<Group> groupsList = new ArrayList<>();

    public Faculty(String facultyName) {
        super(facultyName);
    }

    public ArrayList<Group> getGroupsList() {
        return groupsList;
    }

    public void addGroupIntoList(Group group){
        groupsList.add(group);
        group.setFacultyId(this.getId());
    }

    //Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
    //Отсутствие студентов в группе
    //Отсутствие групп на факультете

    public double getAverageMarkOfSubjectForParticularFaculty(Subject subject) throws LackOfGroupsException, IllegalArgumentException {
        double averageMark;
        int counter = 0;
        double sum = 0;
        double sumForGroup;
        if(groupsList.isEmpty()){
            throw new LackOfGroupsException(this.getName());
        }
        for(Group group: groupsList) {
            sumForGroup = 0;
            for (Student student : group.getStudentsList()) {
                if (student.getMarks().containsKey(subject.getNameSubject())) {
                    sumForGroup = sumForGroup + student.getMarks().get(subject.getNameSubject());
                    counter++;
                }
            }
            sum = sum + sumForGroup;
        }
        if(counter == 0){
            throw new IllegalArgumentException("Students don't study " + subject.getNameSubject() + " in this faculty");
        }
        averageMark = sum / counter;
        return averageMark;
    }

}
