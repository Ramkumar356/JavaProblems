package school;

public class SchoolAndClasses {
    public static void main(String[] args){
        School school = new School();
        Class firstStandard = new Class();
        Class secondStandard = new Class();
        school.name = "MMHSS";
        Students student1 = new Students("Gobi");
        Students student2 = new Students("Gokul");
        Students student3 = new Students("Dhaksith");
        firstStandard.studentLists.add(student1);
        firstStandard.studentLists.add(student2);
        firstStandard.studentLists.add(student3);
        Students student4 = new Students("Gobi");
        Students student5 = new Students("Gokul");
        Students student6 = new Students("Dhaksith");
        secondStandard.studentLists.add(student4);
        secondStandard.studentLists.add(student5);
        secondStandard.studentLists.add(student6);
        school.classRooms.add(firstStandard);
        school.classRooms.add(secondStandard);
        for (int i = 0; i < secondStandard.studentLists.size(); i++){
            School classRooms = (School) school.classRooms.get(i);
            Class studentNames = (Class) classRooms.classRooms.get(i);
            System.out.println(studentNames.studentLists.get(i));
        }
    }
}
