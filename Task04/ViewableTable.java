package Task04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

interface View {
    void viewHeader();

    void viewBody();

    void viewFooter();

    void viewShow();

    void viewInit();

    void viewSave() throws IOException;

    void viewRestore() throws IOException, ClassNotFoundException;
}

interface Viewable {
    View getView();
}

class ViewableResult implements Viewable {
    public View getView() {
        return new ViewResult();
    }
}

public class ViewableTable extends ViewableResult implements View, Viewable {
    private static final String FNAME = "resistances.bin";
    private static final int DEFAULT_NUM = 3;

    private double resistance1;
    private double resistance2;
    private double resistance3;

    public ViewableTable() {
        this(1.0, 1.0, 1.0);
    }

    public ViewableTable(double resistance1, double resistance2, double resistance3) {
        this.resistance1 = resistance1;
        this.resistance2 = resistance2;
        this.resistance3 = resistance3;
    }

    public void setResistance1(double resistance1) {
        this.resistance1 = resistance1;
    }

    public void setResistance2(double resistance2) {
        this.resistance2 = resistance2;
    }

    public void setResistance3(double resistance3) {
        this.resistance3 = resistance3;
    }

    @Override
    public void viewSave() throws IOException {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME))) {
            os.writeDouble(resistance1);
            os.writeDouble(resistance2);
            os.writeDouble(resistance3);
        }
    }

    @Override
    public void viewRestore() throws IOException, ClassNotFoundException {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME))) {
            resistance1 = is.readDouble();
            resistance2 = is.readDouble();
            resistance3 = is.readDouble();
        }
    }

    @Override
    public void viewHeader() {
        System.out.println("Electric Resistance Calculation:");
    }

    @Override
    public void viewBody() {
        System.out.println("Resistance of Conductor 1: " + resistance1);
        System.out.println("Resistance of Conductor 2: " + resistance2);
        System.out.println("Resistance of Conductor 3: " + resistance3);
        double totalResistance8 = resistance1 + resistance2 + resistance3;
        double totalResistance16 = 1 / ((1 / resistance1) + (1 / resistance2) + (1 / resistance3));
        System.out.println("Total Resistance (8-year representation): " + totalResistance8);
        System.out.println("Total Resistance (16-year representation): " + totalResistance16);
    }

    @Override
    public void viewFooter() {
        System.out.println("End.");
    }

    @Override
    public void viewShow() {
        viewHeader();
        viewBody();
        viewFooter();
    }

    @Override
    public void viewInit() {
        // Add any initialization logic here if needed
    }

    @Override
    public View getView() {
        return new ViewTable();
    }

    public static void main(String[] args) {
        ViewableTable calculator = new ViewableTable(2.0, 3.0, 4.0);
        try {
            calculator.viewSave();
            calculator.viewRestore();
            calculator.viewShow();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class ViewResult implements View {
    private static final String FNAME = "resistances.bin";

    private double resistance1;
    private double resistance2;
    private double resistance3;

    public ViewResult() {
        this(1.0, 1.0, 1.0);
    }

    public ViewResult(double resistance1, double resistance2, double resistance3) {
        this.resistance1 = resistance1;
        this.resistance2 = resistance2;
        this.resistance3 = resistance3;
    }

    public void setResistance1(double resistance1) {
        this.resistance1 = resistance1;
    }

    public void setResistance2(double resistance2) {
        this.resistance2 = resistance2;
    }

    public void setResistance3(double resistance3) {
        this.resistance3 = resistance3;
    }

    @Override
    public void viewSave() throws IOException {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME))) {
            os.writeDouble(resistance1);
            os.writeDouble(resistance2);
            os.writeDouble(resistance3);
        }
    }

    @Override
    public void viewRestore() throws IOException, ClassNotFoundException {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME))) {
            resistance1 = is.readDouble();
            resistance2 = is.readDouble();
            resistance3 = is.readDouble();
        }
    }

    @Override
    public void viewHeader() {
        System.out.println("Electric Resistance Calculation:");
    }

    @Override
    public void viewBody() {
        System.out.println("Resistance of Conductor 1: " + resistance1);
        System.out.println("Resistance of Conductor 2: " + resistance2);
        System.out.println("Resistance of Conductor 3: " + resistance3);
        double totalResistance8 = resistance1 + resistance2 + resistance3;
        double totalResistance16 = 1 / ((1 / resistance1) + (1 / resistance2) + (1 / resistance3));
        System.out.println("Total Resistance (8-year representation): " + totalResistance8);
        System.out.println("Total Resistance (16-year representation): " + totalResistance16);
    }

    @Override
    public void viewFooter() {
        System.out.println("End.");
    }

    @Override
    public void viewShow() {
        viewHeader();
        viewBody();
        viewFooter();
    }

    @Override
    public void viewInit() {
        // Add any initialization logic here if needed
    }
}

class ViewTable implements View {
    @Override
    public void viewHeader() {
        // Implement as needed
    }

    @Override
    public void viewBody() {
        // Implement as needed
    }

    @Override
    public void viewFooter() {
        // Implement as needed
    }

    @Override
    public void viewShow() {
        // Implement as needed
    }

    @Override
    public void viewInit() {
        // Implement as needed
    }

    @Override
    public void viewSave() throws IOException {
        // Implement as needed
    }

    @Override
    public void viewRestore() throws IOException, ClassNotFoundException {
        // Implement as needed
    }
}
