public class Attendance{
    static int totalDays = 6;
    int count = 0;
    public void putAttendance(){
        count++;
    }
    public int getAttendance(){
        return count;
    }
    public int markAbsent(){
        int absentDays = totalDays - count;
        return absentDays;
    }
    public double getAverageAttendance(){
        return (double)count/totalDays*100;
    }
}