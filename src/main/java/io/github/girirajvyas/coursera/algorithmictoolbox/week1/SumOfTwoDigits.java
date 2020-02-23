package io.github.girirajvyas.coursera.algorithmictoolbox.week1;

import java.util.Scanner;

/**
 * 
 * In this very first programming challenge, your goal is to implement a program that reads two
 * digits from the standard input and prints their sum to the standard output. We start from this
 * simple problem to show you the pipeline of submitting a solution to the grading system
 * 
 * @author giri
 *
 */
public class SumOfTwoDigits {


  public static void main(String[] args) {
    // System.out.println("Please input 2 digits");
    Scanner sc = new Scanner(System.in);
    Integer firstDigit = sc.nextInt();
    Integer secondDigit = sc.nextInt();
    
    System.out.println(sum(firstDigit, secondDigit));
    sc.close();
  }

  public static Integer sum (Integer firstDigit, Integer secondDigit) {
    return firstDigit + secondDigit;
  }
}
