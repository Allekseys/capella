package com.dima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List <Student> students = new ArrayList<>();
    students.add(new Student("Max", 21, new City("Ukraine", "Charkow")));
    students.add(new Student("Alex", 23, new City("Ukraine", "Odessa")));
    students.add(new Student("Katia", 22, new City("Ukraine", "Lviv")));
    students.add(new Student("Jana", 19, new City("Ukraine", "Kyiv")));

    System.out.println(students);

    System.out.println("******************************************************************************\n");
    Collections.sort(students);

    System.out.println(students);
  }
}
