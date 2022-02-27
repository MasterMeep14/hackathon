public class mystery{
   public static void main(String[] args) {
   whileMystery(5, 100);
   
   }



public static void whileMystery(int x, int y) {
    int n = 1;
    while (n < x) {
        System.out.print(y + ", ");
        y = y / x;
        n = n * 2;
        x++;
    }
    System.out.println(y);
}

public static void ifElseMystery(int a, int b) {
    if (a > b) {
        a--;
        b++;
    } else if (a == b) {
        a = a + b - 4;
    }

    if (a < b) {
        a = a + 3;
    } else {
        b = b + 5 - a;
    }
    System.out.println(a + " " + b);
}





}