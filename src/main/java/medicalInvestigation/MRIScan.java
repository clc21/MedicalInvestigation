package medicalInvestigation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;
public class MRIScan extends MedicalInvestigation {
    private URL urlImage;
    private int mfsTesla;
    public MRIScan(URL urlImage, int mfsTesla, LocalDate date) {
        super(date);
        this.urlImage = urlImage;
        this.mfsTesla = mfsTesla;
    }
    public int getMfsTesla() {
        return mfsTesla;
    }
    public URL getUrlImage() {
        return urlImage;
    }
    public LocalDate getDate() {
        return date;
    }

}
