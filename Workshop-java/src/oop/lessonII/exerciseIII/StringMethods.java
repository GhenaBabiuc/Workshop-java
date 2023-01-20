package oop.lessonII.exerciseIII;

public class StringMethods {
    public int countVowels(String n) {
        return n.length();
    }

    public int countWords(String n) {
        String[] words = n.trim().split("\\s+");
        return words.length;
    }

    public String reverseString(String n) {
        return new StringBuffer(n).reverse().toString();
    }
}
