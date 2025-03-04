public class RightAngleTriangle{
public static void main(String[] args) {

    for (int i = 0; i <5; i++) {
        // This is the outer loop which will loop for the rows.
        for (int j = 0; j <=i; j++) {
        // This is the inner loop which loops for the columns
       // no. of columns = row number for each line here.
            System.out.print("* ");
        }
        // As soon as stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        System.out.println();
    }
}
}