/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wrappertypes;

/**
 *
 * @author Umman
 */
public class WrapperTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer i = 5;  // Integer i = new Integer (5); 111 ilk defe obyekt 
        // yaradilir sonra yaradilanlar bunu istifade edir Integer i1 = 5; ve s
        Integer i1 = 5; // Integer i1 = new Integer (5); 111

        Integer i2 = new Integer(5); // 222   yeni obyekt yaradilir yer ayrilir 
        Integer i3 = new Integer(5); // 333   yeni obyekt yaradilir yer ayrilir

        System.out.println(i == i1); // 111 reference = 111 reference  true
        System.out.println(i == 5); // 111 reference deyeri = 5  true
        System.out.println(i2 == i3); // 222 reference = 333 reference  false
        System.out.println(i2 == 5); // 222 reference deyeri = 5 true
        System.out.println(i2 == i); // 222 reference  = 111 reference false

//        Integer ii = 127;
//        Integer ii2 = 127;
        Integer ii = 128; // 128 e kimi true, 128de daxil olmaqla yuxari false
        Integer ii2 = 128; // 128 e kimi true, 128de daxil olmaqla yuxari false
        System.out.println(ii == ii2);

    }

}
