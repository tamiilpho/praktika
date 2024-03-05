package Task03;

import java.io.Serializable;

/**
 * Клас, що представляє фізичне тіло
 */
public class Main implements Serializable, Displayable{
    private double current;
    private double voltage1;
    private double voltage2;
    private double voltage3; 
    
    /**
     * Конструктор, який приймає значення струму, та напругу кожного провідника
     * @param current постійний струм
     * @param voltage1 напруга першого провідника
     * @param voltage2 напруга другого провідника
     * @param voltage3 напруга третього провідника
     */ 
    public Main(double current, double voltage1, double voltage2, double voltage3){
        this.current = current;
        this.voltage1 = voltage1;
        this.voltage2 = voltage2;
        this.voltage3 = voltage3;    
}
    /**
     * Метод для отримання значення постійного струму
     * @return постійний струм
     */
    public double getCurrent(){
        return current;
    }

    /**
     * Метод для отримання значення напруги 1-го провідника
     * @return напруга 1-го провідника
     */
    public double getVoltage1(){
        return voltage1;   
    }
    
    /**
     * Метод для отримання значення напруги 2-го провідника
     * @return напруга 2-го провідника
     */
    public double getVoltage2(){
        return voltage2;
    }

    /**
     * Метод для отримання значення напруги 2-го провідника
     * @return напруга 2-го провідника
     */
    public double getVoltage3(){
        return voltage3;
    }
        
    @Override
    public String toString() {
        return "Current: " + getCurrent() + "\n" +
               "Voltage1: " + getVoltage1() + "\n" +
               "Voltage2: " + getVoltage2() + "\n" +
               "Voltage3: " + getVoltage3();
    }
    
    @Override
    public void displayResults() {
        System.out.println(toString());
    }

    public class CustomBody extends Main {
        public CustomBody(double current, double voltage1, double voltage2, double voltage3) {
            super(current, voltage1, voltage2, voltage3);        }
    }
    
}
