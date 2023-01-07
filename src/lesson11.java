
public class lesson11 {
    public static void main(String[] args) {
        String day = "Friday";
        switch (day) {
            case "Sunday":
                System.out.println("it is Sunday!");
                break;
            case "Tuesday":
                System.out.println("it is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("it is Wednesday!");
                break;
            case "Thursday":
                System.out.println("it is Thursday!");
                break;
            case "Friday":
                System.out.println("it is Friday!");
                break;
            case "Saturday":
                System.out.println("it is Saturday!");
                break;
            default:
                System.out.println(day + " that is not a day!");

                break;
        }
    }
}
