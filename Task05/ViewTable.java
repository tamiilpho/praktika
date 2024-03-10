package Task05;

import java.util.Formatter;

public class ViewTable {

    private static final int DEFAULT_WIDTH = 20;
    private int width;
    private double[] resistances8Bit;
    private double[] resistances16Bit;

    public ViewTable() {
        width = DEFAULT_WIDTH;
    }

    public ViewTable(int width) {
        this.width = width;
    }

    public ViewTable(int width, double[] resistances8Bit, double[] resistances16Bit) {
        this.width = width;
        this.resistances8Bit = resistances8Bit;
        this.resistances16Bit = resistances16Bit;
    }

    public int setWidth(int width) {
        return this.width = width;
    }

    public int getWidth() {
        return width;
    }

    private void outLine() {
        for(int i = width; i > 0; i--) {
            System.out.print('-');
        }
    }

    private void outLineLn() {
        outLine();
        System.out.println();
    }

    private void outHeader() {
        Formatter fmt = new Formatter();
        fmt.format("%s%d%s%2$d%s", "%", (width-3)/2, "s | %", "s\n");
        System.out.printf(fmt.toString(), "Resistance (8-bit)", "Resistance (16-bit)");
    }

    private void outBody() {
        Formatter fmt = new Formatter();
        fmt.format("%s%d%s%2$d%s", "%", (width-3)/2, ".2f | %", ".2f\n");
        for (int i = 0; i < resistances8Bit.length; i++) {
            System.out.printf(fmt.toString(), resistances8Bit[i], resistances16Bit[i]);
        }
    }

    public final void init(int width) {
        this.width = width;
        viewInit();
    }

    public final void init(int width, int stepX) {
        this.width = (int) width;
        init(stepX);
    }

    public void viewInit() {
        // Ініціалізація масивів опору, припустимо, що вони ініціалізовані десь інде
    }

    public void viewHeader() {
        outHeader();
        outLineLn();
    }

    public void viewBody() {
        outBody();
    }

    public void viewFooter() {
        outLineLn();
    }
}
