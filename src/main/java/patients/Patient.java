package patients;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.net.URL;
import medicalInvestigation.MedicalInvestigation;
import medicalInvestigation.BPMeasurement;
import medicalInvestigation.MRIScan;
public class Patient {
    private String name;
    private int age;
    private LocalDate scanDate;
    private LocalDate measurementDate;
    private URL urlPicture;
    private ArrayList<MedicalInvestigation> examinations = new ArrayList<MedicalInvestigation>();

    public Patient(String name, int age, LocalDate scanDate, LocalDate measurementDate, URL urlPicture) {
        this.name = name;
        this.age = age;
        this.scanDate = scanDate;
        this.measurementDate = measurementDate;
        this.urlPicture = urlPicture;
    }
    public String getName() {
        return name;
    }
    public void addExamination(MedicalInvestigation examination) {
        examinations.add(examination);
    }

}
