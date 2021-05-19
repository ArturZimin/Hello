package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int j=1;
        int sum=1;
        for(;j<10;j++){
            sum= sum*j;
        }
        System.out.println(sum);



        System.out.println("Здарова");
        isSeven(237);
        int i =1;
    }
    //isSeven(7);
    public static boolean isSeven(int number){

      boolean a=true;
      boolean b =false;
      if(number % 10 ==7){
          System.out.println(a);
          return a;
      } else {
          System.out.println(b);
          return b;
      }




    }



}


