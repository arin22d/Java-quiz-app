package com.sjprogramming.quizapp;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz q=new Quiz();
        q.logic();

    }
}

class Quiz{
    Scanner sc=new Scanner(System.in);
    int correctAnsCount=0;
    int wrongAnsCount=0;
    public void logic(){
        Questions q1 = new Questions(" What country has the highest life expectancy?", "A. Japan ", "B. South Korea ", "C. Hong Kong ", "D. Denmark");
        Questions q2 = new Questions(" What disease commonly spread on pirate ships?", " A. Scurvy", "B. Dysentery", "C. Diphtheria", "D. Pneumonia ");
        Questions q3 = new Questions(" What artist has the most streams on Spotify? ", "A. Ed Sheeran", "B. Drake", "C. Eminem", "D. Taylor Swift");
        Questions q4 = new Questions(" Queen guitarist Brian May is also an expert in what scientific field?", "A. Cosmology", "B. Astrobiology", "C. Astrostatistics", "D. Astrophysics");
        Questions q5 = new Questions(" Which Indian telecom company has rolled out world's first satellite-based narrowband-IoT network?", "A. Jio Networks", "B. Vi", "C. BSNL", "D. Airtel");
        Questions q6 = new Questions(" In which country a new species of fish named 'Schizothorax sikusirumensisa' has been discovered?", "A. India ", "B. Australia ", "C. Russia ", "D. Brazil");
       
        Map<Questions,Character> hmap=new HashMap<>();
        hmap.put(q1,'C');
        hmap.put(q2,'A');
        hmap.put(q3,'B');
        hmap.put(q4,'D');
        hmap.put(q5,'C');
        hmap.put(q6,'A');

        for(Map.Entry<Questions,Character> map:hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter Your Answer: ");
            Character ans=sc.next().charAt(0);

            int cans=Character.compare(ans,map.getValue());
            if(cans==0){
                System.out.println("Correct");
                correctAnsCount++;
            }
            else{
                System.out.println("Wrong");
                wrongAnsCount++;
            }

        }

        System.out.println();
        System.out.println("--------Result---------");
        System.out.println("Total Questions: "+hmap.size());
        System.out.println("Correct Answered Questions : "+correctAnsCount);
        System.out.println("Wrong Answered Questions : "+wrongAnsCount);
        int percentage=(100*correctAnsCount)/hmap.size();
        System.out.println("Percentage : "+percentage);
        if(percentage>95){
            System.out.println("Performance : Very Good");
        }
        else if(percentage<35){
            System.out.println("Performance : Very Low");
        }
        else{
            System.out.println("Performance : Medium");
        }


    }
}

