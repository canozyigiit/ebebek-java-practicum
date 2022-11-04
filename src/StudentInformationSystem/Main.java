package StudentInformationSystem;

public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Teacher1","test","Math");
        Teacher t2 = new Teacher("Teacher2", "test", "Chemical");
        Teacher t3 = new Teacher("Teacher3", "test","Physics");

        Course math = new Course("Matematik","101","Mat");
        math.addTeacher(t1);

        Course ch = new Course("Kimya", "102","Ch");
        ch.addTeacher(t2);

        Course phy = new Course("Fizik", "103", "Phy");
        phy.addTeacher(t3);

        Student s1 = new Student("Can", "2019141082","3", math, ch, phy);
        s1.AddBulkExamNote(90,98,70, 76,72,25);
        s1.IsPass();


    }
}