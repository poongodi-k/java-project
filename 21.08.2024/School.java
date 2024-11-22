public class School{
    String schoolName;
    String schoolArea;
    int pincode;
    String landmark;
    boolean cbseBased;
    public School(String schoolName,String schoolArea,int pincode,String landmark,boolean cbsebased){
        this.schoolName = schoolName;
        this.schoolArea = schoolArea;
        this.pincode = pincode;
        this.landmark = landmark;
        this.cbseBased = cbsebased;
    }
    public void printSchoolDetails(){
        System.out.println("School Name :" + this.schoolName +"\nSchool Area:" + this.schoolArea +"\nPincode:" + this.pincode +"\nLandmark:" + this.landmark +"\ncbse based:"+ this.cbseBased);
    }
}
class Student extends School{
    String name;
    int age;
    String address;
    String bloodGroup;
    float cgpa;
    public Student(String schoolName,String schoolArea,int pincode,String landmark,boolean cbsebased,String name,int age,String address,String bloodGroup,float cgpa){
        super(schoolName,schoolArea,pincode,landmark,cbsebased);
        this.name = name;
        this.age = age;
        this.address = address;
        this.bloodGroup = bloodGroup;
        this.cgpa = cgpa;
    }
    public void printStudentDetails(){
        System.out.println("Student Name :" + this.name +"\nAge:" + this.age +"\nAddress:" + this.address +"\nBlood Group:" + this.bloodGroup +"\nCGPA:"+ this.cgpa);
}


public static void main(String args[]){
    Student s1 = new Student("Ocean academy","Venkata nagar",605008,"near bank",true,"Sumithra",20,"Puducherry","B+ve",8.5f);
    s1.printSchoolDetails();
    s1.printStudentDetails();
}
}