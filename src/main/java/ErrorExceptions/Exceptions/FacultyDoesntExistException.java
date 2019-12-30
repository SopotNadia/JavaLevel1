package ErrorExceptions.Exceptions;

public class FacultyDoesntExistException extends Exception {
    public FacultyDoesntExistException(String facultyName){
        super(facultyName + " - this faculty doesn't exist at University");
    }
}
