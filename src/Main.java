import Model.Autobus;
import Model.Automovil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Automovil auto1 = new Automovil("Ford","Fiesta 1.6",175,"Gris Plata",4,5);
        auto1.llevarPasajeros(auto1.getCantOcupantes());
        System.out.println(auto1.toString());

        Autobus bus1 = new Autobus("Marco Polo","l200",90,"semi cama",12);
        System.out.println(bus1.toString());
    }
}
