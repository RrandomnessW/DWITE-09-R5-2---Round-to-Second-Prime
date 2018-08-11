/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round.to.second.prime;

import java.util.Scanner;

/**
 *
 * @author ryanj
 */
public class RoundToSecondPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        int a[] = new int[5];
        int[] ap = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 25; i++) {
                if (a[j] == prime[i]) {
                    if ((a[j] - prime[i - 2]) >= (prime[i + 2] - a[j])) {
                        ap[j] = prime[i + 2];
                    } else {
                        ap[j] = prime[i - 2];
                    }
                }
                if ((a[j] > prime[i]) && (a[j] < prime[i + 1])) {
                    if ((a[j] - prime[i - 1]) >= (prime[i + 2] - a[j])) {
                        ap[j] = prime[i + 2];

                    } else {
                        ap[j] = prime[i - 1];
                    }
                }
            }
        }
        System.out.println("Output is : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(ap[i]);
        }
    }

}
