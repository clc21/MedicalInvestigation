import displays.DoctorDisplay;
import patients.Patient;

import java.time.LocalDate;
import java.net.URL;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main {
    public static void main(String[] args) {
        LocalDate ld1Scan = LocalDate.of(2023,9,14);
        LocalDate ld1Measurement = LocalDate.of(2023,9,15);
        URL url1 = new URL("https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        Patient pat1 = new Patient("Daphne Von Oram",62, ld1Scan, ld1Measurement, url1);

        LocalDate ld2Scan = LocalDate.of(2023,11,23);
        LocalDate ld2Measurement = LocalDate.of(2023,11, 20);
        URL url2 = new URL("https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");
        Patient pat2 = new Patient("Sebastian Compton",31, ld2Scan, ld2Measurement, url2);

        //display window
        JFrame frame = new JFrame("patients.Patient Data");
        frame.setSize(400,400);
        JPanel examinationDetails = new JPanel();
        JPanel patientDetails = new JPanel();

        //labels for each display
        JLabel docDisplay = new JLabel(docDisplay.getDisplayText()) //add display
        JLabel adminDisplay = new JLabel(adminDisplay.getDisplayText()) //add display


        frame.setContentPane(examinationDetails);
        frame.setContentPane(patientDetails);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}