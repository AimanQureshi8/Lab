package com.university;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {

  public static void main(String[] args) {
   
   File file = new File("sample text txt");
   
BufferedReader br = new BufferedReader(new FileReader(file));
   String st;
   
   Integer sumofTextNumbers = 0;
   try {
   while ((st = br.readLine())!= null){
   
 sumofTextNumbers += Integer.parseInt(st);
 }
 System.out.println(st);
 
 System.out.println ("the sum of all numbers in text File ;"+sumofTextNumbers);
     }catch (IOException e){
     // T000 auto genrated catch block
       e.printStackTrace();
     }
 
  }
  }
  
