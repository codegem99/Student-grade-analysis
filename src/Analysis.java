import java.util.Scanner;

/*
A college offers a course that prepares students for the state licensing exam for real-estate
brokers. Last year, ten of the students who completed this course took the exam. The college wants to know how well its students did on the exam. You’ve been asked to write a
program to summarize the results. You’ve been given a list of these 10 students. Next to
each name is written a 1 if the student passed the exam or a 2 if the student failed.
**/
//The schoolCounter can also be named as the StudentCounter
//


public class Analysis {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int passes = 0;
    int failures= 0;
    int schoolCounter =1;
        while (schoolCounter <= 10) {
        System.out.println("Enter results (1=pass 2 = fail):");
        int result = input.nextInt();
        if (result == 1)
            passes = passes + 1;
        else
            failures = failures + 1;
        schoolCounter = schoolCounter + 1;
    }
        System.out.printf("passed:%d%n  failed:%d%n" ,passes, failures);
    if (passes>8){
        System.out.println("Kudos to the lecturer");
    }
}
    }
