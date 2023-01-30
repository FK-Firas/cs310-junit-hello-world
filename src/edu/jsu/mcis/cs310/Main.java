package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        System.out.println(m.reverse1(message)); 
        System.out.println(m.reverse2(message)); 
        System.out.println(m.reverse3(message));
        System.out.println(m.reverse4(message));
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String First) {
        String m="Hello, World!"; 
        StringBuilder x = new StringBuilder(m);
        x = x.reverse();
        String z = x.toString();
        return z;
    }
     public String reverse1(String Second) {
        String m="I'm a Little Teapot"; 
        StringBuilder x = new StringBuilder(m);
        x = x.reverse();
        String z = x.toString();
        return z;
     }
     public String reverse2(String Third) {
        String m="Hey Diddle Diddle"; 
        StringBuilder x = new StringBuilder(m);
        x = x.reverse();
        String z = x.toString();
        return z;
    }
     public String reverse3(String Fourth) {
        String m="Hickory Dickory Dock"; 
        StringBuilder x = new StringBuilder(m);
        x = x.reverse();
        String z = x.toString();
        return z;
    }
     public String reverse4(String Fifth) {
        String m="CS 310 Assignment"; 
        StringBuilder x = new StringBuilder(m);
        x = x.reverse();
        String z = x.toString();
        return z;
    }
}