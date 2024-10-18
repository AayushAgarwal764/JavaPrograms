public class MainStringJoin {
    public static void main(String[] args) {
        String a = "Ayush";
        String b = "Ayush";
        String c = "Ayush";

        System.out.println(String.join(", ", a, b, c));
        System.out.println(a.substring(1, 4));
        System.out.println(a.subSequence(1, 4));
    }
}
