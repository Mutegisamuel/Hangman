package com.psl.main;

public class Hangman {

  static public void guess(String word, int life){

    char[] filler = new char [word.length()];
    int i=0;
    while(i<word.length()){
        filler[i]='-';
        if(word.charAt(i)== ' '){
          filler[i]=' ';
        }
        i++;
    }
    System.out.print(filler);
    System.out.println("    Life remaining=" + life); 
  }




  public static void main(String[] args) {

    String word ="welcome to Hangman"; //word to be guwssed
    int life = 5;             //life or number of chances
    guess(word,life);
  }
}
