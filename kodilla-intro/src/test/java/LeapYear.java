public class LeapYear {
    public static void main(String[] args) {
        int year = 365;
        if (year % 4 >= 0) {
            System.out.println("przestępny");
        }else if(year % 100 >= 0) {
            System.out.println("przestępny");
        } else if (year % 400 >= 0) {
            System.out.println("przestępny");
        } else {
            System.out.println("niePrzestępny");
        }
    }
}
