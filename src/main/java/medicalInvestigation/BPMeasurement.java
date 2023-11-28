package medicalInvestigation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class BPMeasurement extends MedicalInvestigation {
    private int systolicPressure;
    private int diastolicPressure;
    private String BPMeasurement; // takes in VST or ST
    public BPMeasurement(int systolicPressure, int diastolicPressure, String BPMeasurement, LocalDate date) {
        super(date);
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.BPMeasurement = BPMeasurement;
    }
    //display method
    public String getBPMeasurement() {
        return BPMeasurement;
    }
    public int getSystolicPressure() {
        return systolicPressure;
    }
    public int getDiastolicPressure() {
        return systolicPressure;
    }
    public LocalDate getDate() {
        return date;
    }

}
