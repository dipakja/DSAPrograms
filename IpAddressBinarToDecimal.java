
// this problem takes an ip address in binary format

// ip address format is   8bits.8bits.8bit.8bits
// eg: 10001010.10100010.10000101.10101010
//it will convet into decimal format
// understand this is simple convert binary to decimal


import java.util.ArrayList;
import java.util.Scanner;

public class IpAddressBinarToDecimal {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the " + (i + 1) + "quadrant");
//
            list.add(sc.nextLong());
        }


        for (int i = 0; i < 4; i++) {
            int sum = 0;

            long n = list.get(i);
            if(n<0)
            {
                System.out.println("Negative number is not accepted!");
                break;
            }
            int count=0;

            int base = 1;
            while (n != 0) {
                long rem = n % 10;
                sum += base * rem;
                count++;
                n /= 10;
                base *= 2;
            }

//            }
            if(count>8)
            {
                System.out.println("Address for the each quadrant must be 8 bits , you are excedding it!");
                break;
            }
//            System.out.println(count);
            System.out.print(sum +" ");

//        System.out.println(sum);


        }


    }





}
