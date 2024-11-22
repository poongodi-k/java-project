public class Students extends Attendance {
    String name,standard;
    char section;
    public Students(String name,String std,char sec){
        this.name = name;
        this.standard = std;
        this.section = sec;
    }
    public void printStudentDetails(){
        System.out.println("Student name:" + this.name +"\nStandard:" + this.standard + "\nSection:" + this.section + "\nAttendance count:" + getAttendance() + "\nAbsent Days:" + markAbsent() + "\nAttendance Percentage:" + getAverageAttendance() + "%");
    }
    
}
