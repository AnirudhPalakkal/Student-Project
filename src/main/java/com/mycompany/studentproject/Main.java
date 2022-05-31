package com.mycompany.studentproject;
/*
Build an algorithm within a main method that will take
in a word, storing each character in the word in an
Array. Your code should take in the word, store the
word in an array and then iterate backwards over the
array to print the word in reverse.
*/

/**
 *
 * @author Anirudh
 */
public class Main {
    public static void main(String [] args) {
        Student[] studentArr = new Student[5];
        studentArr[0] = new Student("Liam");
        studentArr[1] = new Student("Achilles");
        studentArr[2] = new Student("Georgia");
        studentArr[3] = new Student("Lucy");
        studentArr[4] = new Student("Nate");
        
        for(Student each : studentArr) {
            System.out.println(each.getName());
        }
    }
}
