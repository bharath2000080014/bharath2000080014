package com.Kluniversity;

public class Strings {
    public static void main(String[]args){
        //Strings
        //concatenate
        String name="Bharath";
        String name1="Reddy";
        String name3=name+" "+name1;
        System.out.println(name3);
        //charAt
        System.out.println(name.charAt(1));
        //length
        System.out.println(name.length());
        //replace
        System.out.println(name.replace('B','R'));
        //Substring
        System.out.println(name.substring(5,7));
    }
}
