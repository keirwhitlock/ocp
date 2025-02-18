public class BuildingStrings {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        sb.append("appendage");
        System.out.println(sb);

        StringBuilder same = sb.append("s"); 
        
        System.out.println(sb);
        System.out.println(same);

        System.out.println(sb.equals(same));
        System.out.println(sb == same);

        same.deleteCharAt(sb.length() - 1);
        System.out.println(sb.reverse());
    }
}