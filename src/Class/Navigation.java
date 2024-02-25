package Class;

import java.util.ArrayList;
import java.util.Scanner;

public interface Navigation {
    public void makeAppointment(ArrayList<Doctor> doctors, ArrayList<Patient> patients, Scanner scanner, ArrayList<Appointment> appointments);
    public void check_Doc(ArrayList<Doctor> doctors, ArrayList<Appointment> appointments);
    public void info_doc(ArrayList<Doctor> doctors);
    public void deletePatient(ArrayList<Patient> patients, Scanner scanner);
    public void searchPatient(ArrayList<Patient> patients, Scanner scanner);
    public void showPatients(ArrayList<Patient> patients);
    public void inputPatient(ArrayList<Patient> patients, Scanner scanner);
}
