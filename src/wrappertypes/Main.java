/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrappertypes;

/**
 *
 * @author Umman
 */
public class Main {

    public static void main(String[] args) {
//        int i = Integer.parseInt("4");
//        System.out.println(i); // stringi integere cevirir
//
//        long a = Math.round(3.5); // asagi yuvarlaq
//        double b = Math.floor(3.5); // asagi yuvarlaq
//        double c = Math.ceil(3.4); // yuxari yuvarlaq
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        StringBuilder s = new StringBuilder();
        s.append("Salam"); //5 char
        s.append("Necesen?"); // +8=13 char
        
        String result = s.toString();
        
        StringBuffer s1 = new StringBuffer(); // thread safe tehlukesiz thread 
        s.append("Salam"); //5 char
        s.append("Necesen?"); // +8=13 char
        
        String result1 = s1.toString();
    }
}
