package displays;
import medicalInvestigation.MRIScan
import medicalInvestigation.BPMeasurement;
import patients.Patient;
import java.net.URL;

public class AdministratorDisplay extends Displays {
    public AdministratorDisplay(Patient patient,BPMeasurement bp, MRIScan mri) {
        super(patient, bp, mri);
    }
    public String getDisplayText() {
        return "Patient: "+patient.getName()+": MRI: "+mri.getMfsTesla()+" Tesla, "+mri.getDate()+": BP: "+bp.getBPMeasurement()+", "+mri.getDate()+"<br>";
    }
}
