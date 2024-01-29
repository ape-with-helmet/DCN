import java.util.*;
public class crc {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n;
        System.out.println("Enter the size of data: ");
        n = s.nextInt();
        int data[] = new int [n];
        System.out.println("Enter the data bit by bit: ");
        for (int i = 0; i < n; i++) {
            data[i]=s.nextInt();
        }
        System.out.println("Enter the size of division: ");
        n = s.nextInt();
        int divisor[] = new int [n];
        System.out.println("Enter divisor bit by bit: ");
        for (int i = 0; i < n; i++) {
            divisor[i]=s.nextInt();
        }
        int remainder[]=divide(data.divisor);
        System.out.println("\nThe crc code generated is: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        for (int i = 0; i < remainder.length-1; i++) {
            System.out.println(remainder[i]);
        }
        int sent_Data[]=new int [data.length+remainder.length-1];
        System.out.println("\nEnter data to send: ");
        for (int i = 0; i < sent_Data.length; i++) {
            sent_Data[i]=s.nextInt()
        }
        recieve(sent_Data,divisor);
    }
}