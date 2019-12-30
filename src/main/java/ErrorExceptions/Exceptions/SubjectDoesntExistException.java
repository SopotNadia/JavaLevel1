package ErrorExceptions.Exceptions;

public class SubjectDoesntExistException extends Exception {
    public SubjectDoesntExistException(String nameSubject){
        super(nameSubject +  " doesn't exist");
    }
}
