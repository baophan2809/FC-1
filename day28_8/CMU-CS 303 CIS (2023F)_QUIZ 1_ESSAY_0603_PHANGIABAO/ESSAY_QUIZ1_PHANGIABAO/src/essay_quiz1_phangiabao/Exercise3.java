package essay_quiz1_phangiabao;

public class Exercise3 {
    public static void main(String[] args) {
        answer();
    }

    public static void answer() {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        int temp;
        for (int i = 0; i < 8; i++) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(" " + temp);
        }
    }
}
