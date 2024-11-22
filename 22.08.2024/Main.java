public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Sumi","10th std",'A');
        Students s2 = new Students("Puni","11th std",'B');
        Students s3 = new Students("Kavi","12th std",'C');
        s1.putAttendance();
        s1.putAttendance();
        s1.putAttendance();
        s1.putAttendance();
        s1.putAttendance();
        s2.putAttendance();
        s2.putAttendance();
        s3.putAttendance();
        s3.putAttendance();
        s3.putAttendance();
        s1.printStudentDetails();
        System.out.println("---------------------------------------");
        s2.printStudentDetails();
        System.out.println("---------------------------------------");
        s3.printStudentDetails();


    }
    
}
