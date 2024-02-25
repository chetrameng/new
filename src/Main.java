import java.util.ArrayList;
import java.util.Scanner;
import Class.Patient;
import Class.Doctor;
import Class.Appointment;
import Class.Factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");
        System.out.print("\t\t\t\t\t\t-----------------------------------Mini Clinic-----------------------------------");
        System.out.println("\n");
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();

        
        Factory f = new Factory();
        f.info_doc(doctors);

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {

            System.out.println("\n\n\t\t\t\t\t\t 1. Enter patient ");
            System.out.println("\t\t\t\t\t\t 2. Show patient");
            System.out.println("\t\t\t\t\t\t 3. Search patient");
            System.out.println("\t\t\t\t\t\t 4. Delete patient");
            System.out.println("\t\t\t\t\t\t 5. Show Schedule_Doctor");
            System.out.println("\t\t\t\t\t\t 6. Make an Appointment");
            System.out.println("\t\t\t\t\t\t 7.  Exit");
            System.out.print("\t\t\t\t\t\tChose Option : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    f.inputPatient(patients, scanner);
                    break;
                case 2:
                    f.showPatients(patients);
                    break;
                case 3:
                    f.searchPatient(patients, scanner);
                    break;
                case 4:
                    f.deletePatient(patients, scanner);
                    break;
                case 5:
                    f.check_Doc(doctors,appointments);
                    break;
                case 6:
                    f.makeAppointment(doctors, patients, scanner,appointments);
                    break;
            }
        } while (choice != 7);
    }
}
