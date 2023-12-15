package Cau2;

public class Patient {
    private int id;
    private String firstName;
    private String lastName;
    private String medicalHistory;
    private float hospitalFee;

    public Patient(int _id, String _firstName, String _lastName, String _medicalHistory, float _hospitalFee) {
        this.id = _id;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.medicalHistory = _medicalHistory;
        this.hospitalFee = (float) _hospitalFee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public float getHospitalFee() {
        return hospitalFee;
    }

    public void setHospitalFee(float hospitalFee) {
        this.hospitalFee = hospitalFee;
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", medicalHistory="
                + medicalHistory + ", hospitalFee=" + hospitalFee
                + "]";
    }
}
