//package exercises;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class HashedMap {
//    public static void main(String[] args) {
//
//        HashMap<String, Double> students= new HashMap<>();
//        Scanner in = new Scanner(System.in);
//        int [] newStudentID;
//
//        System.out.println("Enter your student's ID (or ENTER to finish):");
//
//        // Get student ID's and names
//        do {
//
//            System.out.print("ID's: ");
//            newStudentID = in.nextLine();
//
//            if (!newStudentID.equals("")) {
//                System.out.print("Name: ");
//                Double newName = in.nextDouble();
//                studentsID.put(newStudentID, newName);
//
//                // Read in the newline before looping back
//                in.nextLine();
//            }
//in
//        } while(!newStudentID.equals(""));
//
//        // Print class roster
//        System.out.println("\nClass roster:");
//        double sum = 0.0;
//
//        for (Map.Entry<int, Double> studentID : studentsID.entrySet()) {
//            System.out.println(studentID.getKey() + " (" + studentID.getValue() + ")");
//            sum += studentID.getValue();
//        }
//
//        //double avg = sum / students.size();
//        //System.out.println("Average grade: " + avg);
//    }
//
//}
