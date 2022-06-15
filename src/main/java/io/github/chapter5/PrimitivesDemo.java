package io.github.chapter5;


public class PrimitivesDemo {

    public static void main(String[] args){
        grade(120);
    }

    static void grade(int score){
        if(score > 70 && score <= 100) {
            System.out.println("grade is A");
        } else if (score >= 60) {
            System.out.println("grade is B");
        } else if (score >= 50) {
            System.out.println("grade is C");
        } else if ( score >= 45) {
            System.out.println("grade is D");
        } else if (score < 44) {
            System.out.println("Failed");
        } else {
            System.out.println("input a valid number");
        }
    }

}
