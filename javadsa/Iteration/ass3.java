public class ass3 {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("jaa na lvde");
            return;
        }

        String name = args[0];
        int PHY = Integer.parseInt(args[1]);
        int chem = Integer.parseInt(args[2]);
        int math = Integer.parseInt(args[3]);

        int total = PHY + chem + math;
        double percentage = total / 3.0;
        char grade = calculateGrade(percentage);

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }

    private static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
