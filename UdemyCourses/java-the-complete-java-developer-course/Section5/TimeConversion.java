public class TimeConversion {

    public static String getDurationString(int seconds){
        if(seconds >= 0) {
            int m = seconds / 60;
            int s = seconds % 60;
            return getDurationString(m, s);
        } else {
            return String.format("Invalid time\n");
        }
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int h = minutes / 60;
            int m = minutes % 60;
            return String.format("%dh %dm %ds\n", h, m, seconds);
        } else {
            return String.format("Invalid time\n");
        }
    }


    public static void main(String args[]) {
        System.out.println(TimeConversion.getDurationString(145));
        System.out.println(TimeConversion.getDurationString(Integer.parseInt(args[0])));
    }
}