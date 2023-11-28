package displays;
import medicalInvestigation.BPMeasurement;
import medicalInvestigation.MRIScan;
import patients.Patient;
public abstract class Displays {
    protected Patient patient;
    protected BPMeasurement bp;
    protected MRIScan mri;
    public Displays(Patient patient,BPMeasurement bp) {
        this.patient = patient;
        this.bp = bp;
        this.mri = mri;
    }
    public abstract String getDisplayText();
}
