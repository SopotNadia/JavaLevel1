package Classes;

import java.util.ArrayList;

enum Faculty {
    FACULTY_OF_INFORMATION_TECHNOLOGIES_AND_CONTROL("FITU"),
    FACULTY_OF_COMPUTER_SYSTEMS_AND_NETWORKS("KSIS"),
    FACULTY_OF_ENGINEERING_AND_ECONOMICS("IEF");

    private String facultyName;

    Faculty (String faculty){
        facultyName = faculty;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public static ArrayList<String> getFacultyList(){
        ArrayList<String> facultyList = new ArrayList<>();
        for (Faculty value : values()) {
            facultyList.add(value.getFacultyName());
        }

        return facultyList;
    }
}
