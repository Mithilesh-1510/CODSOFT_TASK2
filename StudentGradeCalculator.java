import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String args[])
    {

    int n;
    int sub[] = new int[10];
    int r = 0;
         System.out.println("Enter the Total numbers of subjects and marks");
         Scanner x = new Scanner(System.in);
         n = x.nextInt();
         for(int i=0; i<n; i++)
         {
            sub[i] = x.nextInt();
         }
         x.close();
         for(int i=0; i<n; i++)
         {
             if(sub[i]>100){
             System.out.println("Marks out of Bound");
             return;
             }
             r = r + sub[i];
        }
         System.out.println("The total marks obtained by the student is "+r);
         System.out.println("The percentage of the student is " +r/n + "%");
         if(r/n <100 && r/n >90)
         System.out.println("The grade of the student is A+");
         else if(r/n < 90 && r/n > 80)
         System.out.println("The grade of the student is A");
         else if(r/n < 80 && r/n > 70)
         System.out.println("The grade of the student is B");
         else if(r/n < 70 && r/n > 60)
         System.out.println("The grade of the student is C");
         else if(r/n < 60 && r/n > 50)
         System.out.println("The grade of the student is D");
         else if(r/n < 50 && r/n > 35)
         System.out.println("The grade of the student is E");
         else
         System.out.println("The student failed");
     }
    }
    