package schoolDetails;

import school.Class;

public class MainSchool {
    public static void main(String[] args){
        School school = new School();
        ClassRooms classRooms3 = new ClassRooms();
        ClassRooms classRooms1 = new ClassRooms();
        ClassRooms classRooms2 = new ClassRooms();
        school.schoolName = "MMHSS";
        classRooms3.studentLists.add(new StudentNames("Gobi"));
        classRooms3.studentLists.add(new StudentNames("Gokul"));
        classRooms3.studentLists.add(new StudentNames("Dhaksith"));
        classRooms3.studentLists.add(new StudentNames("Kamalesh"));
        classRooms3.studentLists.add(new StudentNames("Mukesh"));
        classRooms1.studentLists.add(new StudentNames("Gobi"));
        classRooms1.studentLists.add(new StudentNames("Gokul"));
        classRooms1.studentLists.add(new StudentNames("Dhaksith"));
        classRooms1.studentLists.add(new StudentNames("Kamalesh"));
        classRooms1.studentLists.add(new StudentNames("Mukesh"));
        classRooms2.studentLists.add(new StudentNames("Gobi"));
        classRooms2.studentLists.add(new StudentNames("Gokul"));
        classRooms2.studentLists.add(new StudentNames("Dhaksith"));
        classRooms2.studentLists.add(new StudentNames("Kamalesh"));
        classRooms2.studentLists.add(new StudentNames("Mukesh"));
        school.classRooms.add(classRooms1);
        school.classRooms.add(classRooms2);
        school.classRooms.add(classRooms3);
        ClassRooms classRooms = (ClassRooms) school.classRooms.get(0);
        ClassRooms studentLists = (ClassRooms) classRooms.studentLists.get(0);

    }
}
