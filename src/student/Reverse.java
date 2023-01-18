/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author ashan
 */
public class Reverse {
    public static void main ( String[] args ){
        char[] myArray = new char [7];
        myArray [0] = 's'; 
        myArray [0] = 't'; 
        myArray [0] = 'u'; 
        myArray [0] = 'd'; 
        myArray [0] = 'e'; 
        myArray [0] = 'n'; 
        myArray [0] = 't'; 
        
        for (int i = 0 ; i < myArray.length ; i ++){
            System.out.println (myArray [i]); 
        }
        
        Scanner new scan = new Scanner (System.in);
        System.out.println("enter a word");
        String word = scan.nextLine(); 
        char [] myLetters = new char [word.length()]; 
        
        
        for (int i = 0 ; i < myLetters.length; i ++){
            myLetters [i] = word.charAt(i)  ;
            System.out.println(myLetters[i]);
            }
        System.out.println();
        
        for (int i = myLetters.length-1 ; i >= 0 ; i --){
            System.out.println(myLetters[i]);
        }
    }
    //blah//
    //name = ashanti// 
}
