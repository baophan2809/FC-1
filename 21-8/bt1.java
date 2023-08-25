package bai1;

public class bt1 {
    public static void main(String[] args) {
        // Draw the picture as required for the assignment
        System.out.println("Picture 1:");
        drawPicture1();

        System.out.println("Picture 2:");
        drawPicture2();

        System.out.println("Picture 3:");
        drawPicture3();

        System.out.println("Picture 4:");
        drawPicture4();
    }
    // draw top of the picture
    public static void Top() {
        System.out.println("  _______  ");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    // draw line of the picture
    public static void Line() {
        System.out.println("+---------+");
    }
    // draw under of the picture
    public static void Under() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    // draw picture 1
    public static void drawPicture1() {
        Top();
        Under();
    }
    // draw picture 2
    public static void drawPicture2() {
        Under();
        Line();
    }
    // draw picture 3
    public static void drawPicture3() {
        Top();
        System.out.println("|   STOP  |");
        Under();
    }
    // draw picture 4
    public static void drawPicture4() {
        Top();
        Line();
    }
}
