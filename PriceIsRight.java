import java.util.*;

public class PriceIsRight {
    public static void main(String[] args) {
        int[] a1 = {234, 528, 235, 253, 400};
        int[] a2 = {98, 70, 72};
        int[] a3 = {900, 885, 989, 1};
        int[] a4 = {200};
        int[] a5 = {500, 300, 241, 99, 501};

        System.out.println(priceIsRight(a1, 300));
        System.out.println(priceIsRight(a2, 72));
        System.out.println(priceIsRight(a3, 880));
        System.out.println(priceIsRight(a4, 120));
        System.out.println(priceIsRight(a5, 50));
    }

    // TODO: write your code here

    public static int priceIsRight(int[] bids, int price){
        int closest =  bids[0]; //=   price - bids[0] ;
        int num = -1;// bids[0];
        for(int i=0; i< bids.length; i++ ){
            int newDiff =  price - bids[i] ;
            //System.out.println("price" + price + " bids " + bids[i] + " diff " + newDiff);
            if( newDiff < closest && newDiff >= 0 ){
                closest = newDiff;
                num = bids[i];
            }
        }
        return num;
    }
}