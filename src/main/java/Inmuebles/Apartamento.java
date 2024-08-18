
package Inmuebles;

/**
 * @author Juan Chamorro
 * @author Alejandro Bernal
 */

public class Apartamento extends InmuebleVivienda{
    
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion,numeroHabitaciones, numeroBaños);
    }

    void imprimir() {
        super.imprimir();
    }
}
