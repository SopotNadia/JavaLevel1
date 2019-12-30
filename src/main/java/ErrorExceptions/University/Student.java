package ErrorExceptions.University;

import ErrorExceptions.Exceptions.LackOfSubjectException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Student extends Entity {
    private UUID groupId;
    private Map<String, Integer> marks = new HashMap<>();

    public Student(String name) {
        super(name);
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setGroupId(UUID groupId) {
        this.groupId = groupId;
    }

    //Посчитать средний балл по всем предметам студента
    //Оценка ниже 0 или выше 10
    //Отсутсвие предметов у студента (должен быть хотя бы один)

    public void tryToAddMarkAndSubject(Subject subject, Integer mark){
        try {
            addMarksAndSubjects(subject, mark);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void addMarksAndSubjects(Subject subject, Integer mark) throws IllegalArgumentException{
        if(mark < 0 || mark > 10){
            throw new IllegalArgumentException("For " + this.getName() + ": " + mark + " is out of allowed values(0-10)");
        } else marks.put(subject.getNameSubject(), mark);
    }

    public Double tryToGetAverageMarkOfAllSubjectsForStudent (){
        try{
            return getAverageMarkOfAllSubjectsForStudent();
        }catch (LackOfSubjectException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public double getAverageMarkOfAllSubjectsForStudent () throws LackOfSubjectException{
        double averageMark;
        double sum = 0;
        if(!marks.isEmpty()){
            for (Integer mark: marks.values()){
                sum += mark;
            }
            averageMark = sum / marks.values().size();
        }else throw new LackOfSubjectException(this.getName() + " has to have at least one subject");
        return averageMark;
    }


}
