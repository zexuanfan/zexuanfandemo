/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student;
import java.util.Scanner;

public class Student {

        int id;
        String name;
        
    public static void main(String[] args) {
        
        Student s=new Student();
        Student[] list=new Student[5];
//        list[0].id=10;
      list[0].name="Megha";
        Scanner in=new Scanner(System.in);
        
        for(int i=0;i<=list.length-1;i++)
        {
             list[i]=new Student();
              System.out.print("Enter student id: ");
            list[i].id=in.nextInt();
             System.out.print("Enter student name: ");
            list[i].name=in.next();
        
        }
        
         for(int i=0;i<=list.length-1;i++)
        {
              System.out.print("student id: "+list[i].id+"student name:"+list[i].name+"\n");
                     
        }
        
    }
    
}
