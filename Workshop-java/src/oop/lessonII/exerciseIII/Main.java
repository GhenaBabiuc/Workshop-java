package oop.lessonII.exerciseIII;

public class Main {
    public static void main(String[] args) {
        StringMethods stringMethods=new StringMethods();

        System.out.println(stringMethods.countVowels("Jora"));
        System.out.println(stringMethods.countWords("TEST test TEST"));
        System.out.println(stringMethods.reverseString("String"));
    }
}
