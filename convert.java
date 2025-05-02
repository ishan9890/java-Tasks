public class convert {
    public static void convertor(int totalDays){
        int years = totalDays/365;
        int remainingdays = totalDays % 365;
        int months = remainingdays/30;
        int days = remainingdays%30;
        System.out.println(totalDays + " days = " + years + " years, " + months + " months, and " + days + " days.");

    }
    public static void main(String[] args) {
        int days = 800;
        convertor(days);
    }
}
