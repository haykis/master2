package Paket2;

import jdk.swing.interop.SwingInterOpUtils;

public class metod1 {

    metod1(int... a) {

        for (Integer i : a) {
            int carpim = 1;
//            while (i > 1) {
//                carpim = carpim * i;
//                i--;
//            }
//            System.out.println(carpim);
            for(int x=1;x<=i;x++){
                carpim=carpim*x;
            }
            System.out.println(carpim);

        }
        System.out.println("***************************");
    }

}
