package medicalInvestigation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public abstract class MedicalInvestigation {
    protected LocalDate date;
    public MedicalInvestigation(LocalDate date) {
        this.date = date;
    }

}
