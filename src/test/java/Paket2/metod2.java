package Paket2;

public class metod2 {
    static void metod(String a) {
        System.out.println(a.length());
        System.out.println(a.contains("A"));
        System.out.println(a.substring((a.indexOf(" ")), a.lastIndexOf(" ")));
        System.out.println(a.replaceAll("\\S", "*"));
        System.out.println(a.replaceAll("\\d", "%"));
    }

}
