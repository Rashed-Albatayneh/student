
package student1.tuesday;

import java.util.Scanner;


public class Student1Tuesday {

    
    public static void main(String[] args) {
//   Student s1 = new Student(sID:"s1",name:"Ronak";);
      
//      Scanner input = new Scanner(System.in);
      
      Student[] studentList= new Student[3];
      studentList[0]=new Student("s2","xyz");
      studentList[1] =new Student("s2","abc");
      studentList[2] = new Student("s3","abc");
      
      for(int i = 0;i<studentList.length;i++){
        System.out.println(studentList[i].getSname());
      }
      //hello this is a comment
      
      
      
    }
    
}
