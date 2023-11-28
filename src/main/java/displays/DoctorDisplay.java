package displays;
import medicalInvestigation.MRIScan
import medicalInvestigation.BPMeasurement;
import patients.Patient;
import java.net.URL;

public class DoctorDisplay extends Displays {
    public DoctorDisplay(Patient patient,BPMeasurement bp) {
        super(patient, bp, mri);
    }
    public String getDisplayText() {
        return "Name: "patient.getName()+"<br>"+"Age: "+"<br>"+"Blood pressure "+bp.getSystolicPressure()+" over "+bp.getDiastolicPressure()+"<br>";
    }
}
