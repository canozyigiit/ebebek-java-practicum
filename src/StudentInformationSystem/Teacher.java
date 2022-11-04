package StudentInformationSystem;

public class Teacher {
    private String name;
    private String mobile_no;
    private String branch;

    public Teacher(String name, String mobno, String branch){
        this.name = name;
        this.mobile_no = mobno;
        this.branch = branch;
    }

    public void print(){
        System.out.println("=======================");
        System.out.println("Adı:  " + name);
        System.out.println("Telefonu:  "+ mobile_no);
        System.out.println("Bölümü:  " + branch);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
