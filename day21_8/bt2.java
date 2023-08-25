package day21_8;

public class bt2 {
    public static void main(String[] args) {
        // Draw the picture as required for the assignment
        System.out.println("Picture 1:");
        drawPicture1();
        System.out.println("Picture 2:");
        drawPicture2();
        System.out.println("Picture 3:");
        drawPicture3();
    }
    // draw top of the picture
    public static void Top() {
        System.out.println("   *****     ");
        System.out.println("  *********  ");
        System.out.println("*************");
    }
    // draw line of the picture
    public static void Line() {
        System.out.println("* | | | | | *");
    }
    // draw 5 stars line
    public static void FiveStar() {
        System.out.println("   *****     ");
    }
    // draw picture 1
    public static void drawPicture1() {
        Top();
    }
    // draw picture 2
    public static void drawPicture2() {
        Top();
        Line();
        System.out.println("*************");
        Top();
    }
    // draw picture 3
    public static void drawPicture3() {
        Top();
        FiveStar();
        Line();
        Line();
        FiveStar();
    }
}
