package ErrorExceptions.University;

import ErrorExceptions.Exceptions.SubjectDoesntExistException;

import java.util.ArrayList;

public class Subject {
    private String nameSubject;
    private int mark;
    private static ArrayList<Subject> subjectsList = new ArrayList<>();

    public Subject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void addSubjectIntoList(Subject subject){
        subjectsList.add(subject);
    }

    public ArrayList<Subject> getSubjectsList() {
        return subjectsList;
    }

    public static Subject getSubject(String nameSubject) throws SubjectDoesntExistException{
        Subject returnedSubject = null;
        for(Subject subject: subjectsList){
            if(subject.getNameSubject().toLowerCase().equals(nameSubject.toLowerCase())){
                returnedSubject = subject;
            }
        }
        if(returnedSubject == null){
            throw new SubjectDoesntExistException(nameSubject);
        }
        else return returnedSubject;
    }

    @Override
    public String toString() {
        return nameSubject ;
    }
}
