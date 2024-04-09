 import java.util.*;
 class Calculate
 {
   Float percentage(int total,int n)
   {
    return (float)total/n;
   }
 }
 class Grade
 {
    String grade(float per)
    {
        if(per>=90 && per<=100)
        {
            return "You got grade:A+";
        }
        else if(per>=80 && per<90)
        {
            return "You got grade:A";
        } 
        else if(per>=70 && per<80)
        {
            return "You got grade:B+";
        }
        else if(per>=60 && per<70)
        {
            return "You got grade:B";
        }
        else if(per>=50 && per<60)
        {
            return "You got grade:C";
        }
        else 
        {
            return "You are failed!";
        }
    }
}
 class Task2
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of subjects");
        int n=sc.nextInt();
        int total=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Marks of subject"+i);
            int sub=sc.nextInt();
            if(sub<0 || sub>100)
            {
                System.out.println("Invalid marks");
                break;
            }
            else
            {
                total=total+sub;
            }
        }
        Calculate c=new Calculate();
        float per=  c.percentage(total,n);
        Grade g=new Grade();
        String res=g.grade(per);
        System.out.println("Your total marks is:"+total+"\nYour percentage is:"+per+"\n"+res);

     
    }
 }
    
