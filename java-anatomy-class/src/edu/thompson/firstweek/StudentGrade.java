package edu.thompson.firstweek;
public class StudentGrade {
  
  public static void main(String [] args) {
    int finalAverage = 7;
    if (finalAverage < 6) {
      System.out.println("REPROVE");
    }
    else if (finalAverage == 6) {
      System.out.println("PROVA DE MINERVA");
    }
    else {
      System.out.println("APROVE");
    }
  }
}
