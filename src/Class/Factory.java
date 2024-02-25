package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Factory implements Navigation {

    @Override
    public void makeAppointment(ArrayList<Doctor> doctors, ArrayList<Patient> patients, Scanner scanner, ArrayList<Appointment> appointments) {
        System.out.print("\nEnter Doctor's name for the appointment: ");
        String doctorName = scanner.next();

        // Check if the doctor exists
        Doctor selectedDoctor = null;
        for (Doctor doctor : doctors) {
            if (doctor.getDoc_name().equalsIgnoreCase(doctorName)) {
                selectedDoctor = doctor;
                break;
            }
        }

        if (selectedDoctor == null) {
            System.out.println("Doctor with name " + doctorName + " not found.");
            return;
        }
        // Input appointment details
        System.out.print("Enter patient's name: ");
        String patientName = scanner.next();
        System.out.print("Enter date and time for the appointment: ");
        String dateTime = scanner.next();
        System.out.print("Enter Time :");
        String time = scanner.next();
        System.out.print("Enter type of illness: ");
        String illness = scanner.next();
        // Create appointment object
        Appointment appointment1 = new Appointment(selectedDoctor,patientName,dateTime,illness);
        appointment1.setTime(time);
        appointments.add(appointment1);
        System.out.println("Appointment made successfully: " + appointment1);
    }

    @Override
    public void check_Doc(ArrayList<Doctor> doctors, ArrayList<Appointment> appointments) {
        System.out.println("\n\t--------Doctor Schedule--------");
        System.out.println("\nAvailable Doctors:");
        System.out.println("\tMon / Tue / Wed = " + " \tkayess , poulse , kokoy ");
        System.out.print("\n");
        System.out.println("\tThurs / Fri / Sat = " + " \tkrimton , kermory , koyrer ");
        System.out.print("\n");
        System.out.print("\t Sun / Mon,Tue & Fri(Morning only) =  kelra ");
        System.out.print("\n");
        System.out.println();
        for (Doctor doctor : doctors) {
            System.out.println("\t\t\tDoctor ID: " + doctor.getDoc_id());
            System.out.println("\t\t\tDoctor Name: " + doctor.getDoc_name());
            System.out.println("\t\t\tDoctor Sex: " + doctor.getDoc_sex());
            System.out.println();
        }
        System.out.println("\n\t--------Appointment Schedule--------");
        for (Appointment appointment : appointments) {
            System.out.println("\t\t\t" +
                    "Doctor Name : " +
                    appointment.getDoctor().getDoc_name() +
                    "\t\tPatient Name: " +
                    appointment.getPatientName() +
                    "\t\tDate : " +
                    appointment.getDateTime() +
                    "\t\tTime :" +
                    appointment.getTime() +
                    "\t\tTpye of Illness : " +
                    appointment.getIllness());
            System.out.println();
        }
    }

    @Override
    public void info_doc(ArrayList<Doctor> doctors) {
        Doctor doctor1 = new Doctor();
        doctor1.setDoc_id(12);
        doctor1.setDoc_name("kelra");
        doctor1.setDoc_sex('M');

        Doctor doctor2 = new Doctor();
        doctor2.setDoc_id(14);
        doctor2.setDoc_name("koyrer");
        doctor2.setDoc_sex('M');

        Doctor doctor3 = new Doctor();
        doctor3.setDoc_id(12);
        doctor3.setDoc_name("kermory");
        doctor3.setDoc_sex('F');

        Doctor doctor4 = new Doctor();
        doctor4.setDoc_id(19);
        doctor4.setDoc_name("Krimton");
        doctor4.setDoc_sex('M');

        Doctor doctor5 = new Doctor();
        doctor5.setDoc_id(16);
        doctor5.setDoc_name("kokoy");
        doctor5.setDoc_sex('M');

        Doctor doctor6 = new Doctor();
        doctor6.setDoc_id(11);
        doctor6.setDoc_name("Poulse");
        doctor6.setDoc_sex('F');

        Doctor doctor7 = new Doctor();
        doctor7.setDoc_id(20);
        doctor7.setDoc_name("Kayess");
        doctor7.setDoc_sex('F');

        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        doctors.add(doctor6);
        doctors.add(doctor7);
    }

    @Override
    public void deletePatient(ArrayList<Patient> patients, Scanner scanner) {
        if (patients.isEmpty()) {
            System.out.println("No patients in the list.");
            return;
        }

        System.out.print("Enter patient ID to delete: ");
        int deleteId = scanner.nextInt();
        boolean found = false;

        for (Patient patient : patients) {
            if (patient.getId() == deleteId) {
                patients.remove(patient);
                System.out.println("Patient with ID " + deleteId + " deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Patient with ID " + deleteId + " not found.");
        }
    }

    @Override
    public void searchPatient(ArrayList<Patient> patients, Scanner scanner) {
        if (patients.isEmpty()) {
            System.out.println("No patients in the list.");
            return;
        }

        System.out.print("Enter patient ID to search: ");
        int searchId = scanner.nextInt();
        boolean found = false;

        for (Patient patient : patients) {
            if (patient.getId() == searchId) {
                System.out.println("Patient Found:");
                System.out.println(patient);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Patient with ID " + searchId + " not found.");

        }
    }

    @Override
    public void showPatients(ArrayList<Patient> patients) {
        if (patients.isEmpty()) {
            System.out.println("No patients in the list.");
        } else {
            System.out.println("List of Patients:");
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }

    @Override
    public void inputPatient(ArrayList<Patient> patients, Scanner scanner) {
        Patient patient = new Patient();
        System.out.print("\n\t\tEnter ID : ");
        patient.setId(scanner.nextInt());
        System.out.print("\t\tEnter Name : "); scanner.next();
        patient.setName(scanner.nextLine());
        System.out.print("\t\tEnter Age : ");
        patient.setAge(scanner.nextInt());
        System.out.print("\t\tEnter Telephone : ");
        patient.setTel_number(scanner.nextInt());
        System.out.print("\t\tEnter Illness : ");
        patient.setIllness(scanner.next());
        patients.add(patient);
    }
}
