package Task05;

import java.io.IOException;

public interface View {
    void viewShow();
    void viewInit();
    void viewSave() throws IOException;
    void viewRestore() throws Exception;
    double getTotalResistance();
    void setTotalResistance(double totalResistance);
}
