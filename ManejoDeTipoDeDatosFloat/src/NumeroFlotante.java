public class NumeroFlotante {
    public static void main(String[] args) throws Exception {
      float num = 3.1400001f;
    
      // Obtener la parte entera del float usando Math.floor()
      int parteEntera = (int) Math.floor(num);
      
      // Obtener la parte decimal del float restando la parte entera al float original
      float parteDecimal = num - parteEntera;
      
      // Mostrar los resultados en la consola usando System.out.println()
      System.out.println("La parte entera del float es " + parteEntera);
      System.out.println("La parte decimal del float es " + parteDecimal);
    }
}
