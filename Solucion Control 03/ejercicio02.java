public class ejercicio02 {
  public static void main(String[] args) {
    long numero1, numero2;
    
    System.out.print("Por favor, introduzca el primer número entero positivo: ");
    numero1 = Long.parseLong (System.console().readLine());
    System.out.print("Por favor, introduzca el segundo número entero positivo: ");
    numero2 = Long.parseLong (System.console().readLine());
    
    long auxiliar1 = numero1;
    long auxiliar2 = numero2;
    
    int contadorDigitos = 0;
    
    while (auxiliar1 > 0) {
      int digitoNumero1 = unidades (auxiliar1);
      
      auxiliar2 = numero2;
      boolean sonIguales = false;
      while ((auxiliar2 >0) && (sonIguales == false)) {
        int digitoNumero2 = unidades (auxiliar2);
        if (digitoNumero2 == digitoNumero1) {
          contadorDigitos++;
          sonIguales=true;
        }
        auxiliar2 = quitaUnidades(auxiliar2);
      }
      
      auxiliar1 = quitaUnidades(auxiliar1);
    }
    System.out.println("En el número "+numero1+" hay "+contadorDigitos+" dígitos que están en el número "+numero2);
  }
  
  public static int unidades (long x) {
    return ((int)(x % 10));
  }
  
  public static long quitaUnidades (long x) {
    return (x / 10);
  }
}
