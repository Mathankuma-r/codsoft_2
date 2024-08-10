import java.util.*;
public class StudentGradeCalculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of subjects:");
        int n=sc.nextInt();
        int[] marks=new int[n];
        int total_marks=0;
        String grade;
        System.out.println("Enter marks for "+n+" subjects out of 100");
        for(int i=0;i<n;i++){
            System.out.print("Enter the marks of Subject "+(i+1)+":");
            marks[i]=sc.nextInt();
        }
        for(int mark:marks)
            total_marks+=mark;
        double avg=(double)total_marks/n;
        if(avg>=90) grade="A";
        else if(avg>=80) grade="B";
        else if(avg>=70) grade="C";
        else if(avg>=60) grade="D";
        else grade="E";
        System.out.println("Results");
        System.out.println("Total marks out of "+(n*100)+" is "+total_marks);
        System.out.format("Average marks : %.2f",avg);
        System.out.println("\nGrade : "+grade);
        sc.close();
    }
}
