abstract class Vehiculo {
 public abstract void mover();
}

class Coche extends Vehiculo {
 @Override
 public void mover() {
     System.out.println("El coche se está desplazando por la carretera.");
 }
}

class Bicicleta extends Vehiculo {
 @Override
 public void mover() {
     System.out.println("La bicicleta se está pedaleando en el carril.");
 }
}

public class Main {
  public static void main(String[] args) {
      Vehiculo miVehiculo = new Coche();
      miVehiculo.mover(); // Llama al método de Coche

      miVehiculo = new Bicicleta();
      miVehiculo.mover(); // Llama al método de Bicicleta
  }
}
