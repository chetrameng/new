package Class;

public class Appointment{
    private Doctor doctor;
    private String patientName;
    private String dateTime;
    private String time;
    private String illness;
    public Appointment(Doctor doctor, String patientName, String dateTime, String illness) {
        this.doctor = doctor;
        this.patientName = patientName;
        this.dateTime = dateTime;
        this.illness = illness;

    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return "\t\tDoctor Name : " + doctor.getDoc_name() + "\t\tPatient Name: " + patientName + "\t\tDate : " + dateTime +"\t\tTime :"+time+ "\t\tType of Illness : " + illness;
    }
}
