public class Main{
    public static void main(String[] args){
    //Радіус основи конуса
    double r = 3.5;
    //Висота конуса
    double h = 7.2;

    //Площа бічної поверхні S = 2*PI*l
    double l = Math.sqrt(r * r + h * h); //твірна конуса
    double Sb = Math.PI*r*l;

    //Додаємо площу основи конуса до площі бічної поверхні
    double S = Sb + Math.PI*r*r;

    System.out.println("Площа конуса: " + S);
     }
 }