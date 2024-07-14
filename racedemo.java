import java.util.*;

class racedemo {
    public static void main(String[] args) {
        float s1, s2, s3, s4, s5, average;
        Scanner s = new Scanner(System.in);
        System.out.println("enter speed of first racer: ");
        s1 = s.nextFloat();
        System.out.println("enter speed of second racer: ");
        s2 = s.nextFloat();
        System.out.println("enter speed of third racer: ");
        s3 = s.nextFloat();
        System.out.println("enter speed of fourth racer: ");
        s4 = s.nextFloat();
        System.out.println("enter speed of fifth racer: ");
        s5 = s.nextFloat();
        average = (s1 + s2 + s3 + s4 + s5) / 5;
        if (s1 > average)
            System.out.println("The first racer is qualifed.");
        else if (s2 > average)
            System.out.println("The second racer is qualifed.");
        else if (s3 > average)
            System.out.println("The third racer is qualifed.");
        else if (s4 > average)
            System.out.println("the fourth racer is qualifed.");
        else if (s5 > average)
            System.out.println("the fifth racer is qualifed.");
    }

}
