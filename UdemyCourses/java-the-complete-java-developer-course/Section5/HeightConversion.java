public class HeightConversion {

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((feet * 12)+inches);
    } 

    public static void main(String... args) {
        System.out.printf("68in is %.2fcm\n", HeightConversion.convertToCentimeters(68));
        System.out.printf("6ft, 0in is %.2fcm\n", HeightConversion.convertToCentimeters(6, 0));
    }
}

