public class MainString {
    public static void main(String[] args) {
        String a = "Ayush";
        String b = "Ayush";
        String c = new String("Ayush");
        String d = new String("Ayush");

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(c == d);
        System.out.println(a == d);
        System.out.println();

        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(c.equals(d));
        System.out.println(d.equals(a));

    }
}
