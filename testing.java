import java.util.Scanner;

class E12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 4 digit roll number of the student: ");
        int rollNumber = sc.nextInt();

        if(rollNumber>9999)
        {
            System.out.println("Invalid length for the Student Roll Number");
            System.out.print("Enter the 4 digit roll number of the student: ");
            rollNumber = sc.nextInt();
        }

        String demo=sc.nextLine();

        System.out.print("Enter Name of the Student (up to 10 characters): ");
        String studentName = sc.nextLine();

        if(studentName.length()>10)
        {
             System.out.println("Invalid length for the Student Name");

             System.out.print("Enter Name of the Student (up to 10 characters): ");
             studentName = sc.nextLine();
        }

       

        System.out.print("Enter Subject-1 marks (out of 100): ");
        int subject1Marks = sc.nextInt();

        if(subject1Marks>100 || subject1Marks<0)
        {
            System.out.println("Please enter valid Marks");
            System.out.print("Enter Subject-1 marks (out of 100): ");
            subject1Marks = sc.nextInt();
        }

        System.out.print("Enter Subject-2 marks (out of 100): ");
        int subject2Marks = sc.nextInt();

        if(subject2Marks>100 || subject2Marks<0)
        {
            System.out.println("Please enter valid marks");
            System.out.print("Enter Subject-2 marks (out of 100): ");
            subject2Marks = sc.nextInt();
        }

        System.out.print("Enter Subject-3 marks (out of 100): ");
        int subject3Marks = sc.nextInt();

        if(subject3Marks>100 || subject3Marks<0)
        {
            System.out.println("Please enter valid marks");
            System.out.print("Enter Subject-3 marks (out of 100): ");
            subject3Marks = sc.nextInt();
        }

        int totalMarks = subject1Marks + subject2Marks + subject3Marks;
        double percentage = (totalMarks / 3);

        String gradeStatus;

        if (percentage < 45) {
            gradeStatus = "FF";
        } else if (percentage < 60) {
            gradeStatus = "Second Class";
        } else if (percentage < 75) {
            gradeStatus = "First Class";
        } else if (percentage < 90) {
            gradeStatus = "Distinction";
        } else {
            gradeStatus = "Merit";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade Status: " + gradeStatus);
    }
}