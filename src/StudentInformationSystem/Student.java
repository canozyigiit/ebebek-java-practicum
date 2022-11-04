package StudentInformationSystem;


public class Student {
    private Course math;
    private Course phy;
    private Course ch;
    private String name;
    private String student_no;
    private String subjects;
    private double average;
    private boolean isPass;

    public Student(final String name, final String student_no, final String subjects, final Course math, final Course phy, final Course kimya){
        this.name = name;
        this.student_no = student_no;
        this.subjects = subjects;
        this.math = math;
        this.phy = phy;
        this.ch = kimya;
        this.average = 0.0;
        boolean isPass = false;
    }

    public void AddBulkExamNote(int mathen, int phyen, int chen, double mathpn, double phypn, double chpn){
        this.math.average(mathpn, mathen);
        this.phy.average(phypn, phyen);
        this.ch.average(chpn, chen);
    }

    void print_note(){
        System.out.println("___________________________");
        System.out.println("Öğrenci Adı:  " + name);
        System.out.println("Öğrenci No:  " + student_no);
        System.out.println("Ders: " + math.getName() + ", Not: " + math.getNote());
        System.out.println("Ders: " + phy.getName() + ", Not: " + phy.getNote());
        System.out.println("Ders: " + ch.getName() + ", Not: " + ch.getNote());
        System.out.println("Ortalamanız: " + average);
    }

    public void IsPass(){
        isPass = IsCheckPass();
        print_note();
        average = (math.getNote() + phy.getNote() + ch.getNote()) / 3.0;

        if (isPass){
            System.out.println(name + " Sınıfı Geçtin!");
        }else{
            System.out.println(name + "Sınıfta Kaldın!");
        }

    }

    void CalcAverage(){
        average = (math.getNote() + phy.getNote() + ch.getNote()) / 3.0;
    }

    boolean IsCheckPass(){
        CalcAverage();
        return average > 55;
    }
}