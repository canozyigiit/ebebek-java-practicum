package StudentInformationSystem;

public class Course {
    private Teacher teacher;
    private String name;
    private String code;
    private String prefix;
    private double note;
    private double exam_note;
    private double presentation_note;

    public Course(final String name, final String code, final String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0.0;
    }


    public void average(final double presentation_note, final double exam_note){
        if (presentation_note >= 0 && presentation_note <= 100 && exam_note >= 0 && exam_note <= 100){
            note = presentation_note * 0.20 + exam_note * 0.60;
        }

    }

    public void addTeacher(final Teacher teacher){
        if (teacher.getBranch().equals(this.prefix)){
            this.teacher = teacher;
            System.out.println(teacher.getName() + " Adlı Öğretmen " + getClass() + " Dersine Eklendi! ");
        }else{
            System.out.println(name + " Dersi ile Öğretmen uyuşmuyor!");
        }
    }

    public void printTeacher(){
        if (teacher != null) {
            teacher.print();
        } else {
            System.out.println("İşlem Gerçekleşmedi!");
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public double getExam_note() {
        return exam_note;
    }

    public void setExam_note(double exam_note) {
        this.exam_note = exam_note;
    }

    public double getPresentation_note() {
        return presentation_note;
    }

    public void setPresentation_note(double presentation_note) {
        this.presentation_note = presentation_note;
    }
}
