//Task 1:  Calculate percentage of 5 courses.
package com.CC.example;
import java.util.Scanner;
public class Helloworld {

public static void main(String[] args) {
 // TODO Auto-generated method stub
 System.out.println("enter course 1 marks: ");
 Scanner input= new Scanner(System.in);
 int c1= input.nextInt();
 
 System.out.println("enter course 2 marks: ");
 
 int c2= input.nextInt();

 System.out.println("enter course 3 marks: ");

 int c3= input.nextInt();
 
 System.out.println("enter course 4 marks: ");

 int c4= input.nextInt();
 
 System.out.println("enter course 5 marks: ");

 int c5= input.nextInt();
 
    float p = c1+c2+c3+c4+c5/50*100;
 System.out.println("percentage "+ p);
}

}


//task 2 : Change Celsius to Fahrenheit and vice versa.

package com.CC.example;

import java.util.Scanner;

public class task2 {

public static void main(String[] args) {
 float c=0,f=0;
 // TODO Auto-generated method stub
 System.out.println("enter C: ");
 Scanner input= new Scanner(System.in);
 int c1= input.nextInt();
 
 System.out.println("enter F: ");
 
 int c2= input.nextInt();
 if(c1==0)
 {
   c = (c2-32)*(5/9);
 }
 if(c2==0)
 {
     f = (c1*9/5)+32;
 }
 
 System.out.println("C: "+c);
 System.out.println("F: "+f);
}

}

//task3 : Make a rock paper scissor game.

package com.CC.example;

import java.util.Scanner;

public class task3 {

public static void main(String[] args) {
 System.out.println("enter scissor (0), rock (1), paper (2): ");
 Scanner input= new Scanner(System.in);
 int user= input.nextInt();
 
 int comp = (int)(Math.random() * 3);
 System.out.println("comp: "+comp);
 
 if(user==comp){ System.out.println("DRAW"); }
 if(user==0 && comp==1){ System.out.println("comp wins"); }  
 if(user==0 && comp==2){ System.out.println("user wins"); }
 if(user==1 && comp==0){ System.out.println("user wins"); } 
 if(user==1 && comp==2){ System.out.println("comp wins"); } 
 if(user==2 && comp==0){ System.out.println("comp wins"); } 
 if(user==2 && comp==1){ System.out.println("user wins"); } 

}

}

//task 4: make a number pattern. 
package com.CC.example;

import java.util.Scanner;

public class task4 {

public static void main(String[] args) {
 int c=6;

 for(int i=1;i<6;i++)
 {
  
  for(int j=1;j<c;j++)
  {
   System.out.print(j);    
  }
  c--;
  System.out.print("\n");
 }

}

}

 
//task 5 : make number pattern in reverse order.


package com.CC.example;

public class task5 {

public static void main(String[] args) {
 int c=1;
//  System.out.println("enter C: ");
// Scanner input= new Scanner(System.in);
//  int c1= input.nextInt();
 
//  System.out.println("enter F: ");
 for(int i=1;i<6;i++)
 {
  for(int j=1;j<c;j++)
  {
   System.out.print(j);    
  }
  c++;
  System.out.print("\n");
 }
}

}

 
