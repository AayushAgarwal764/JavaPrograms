public class MainTryCatch {
    public static void divide() {

        System.out.println(100 / 0);

    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}