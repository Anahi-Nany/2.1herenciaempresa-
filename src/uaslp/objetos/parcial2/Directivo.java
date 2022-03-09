package uaslp.objetos.parcial2;

import java.lang.invoke.MethodHandles;

public class Directivo {

  private String nombre;
  private int edad;

  public void mostrar(){
      System.out.println(nombre + edad);
  }
  public String getNombre() {
      return nombre;

  }
  public void setNombre(String nombre){
      this.nombre = nombre;
  }

  public int getEdad() {
      return edad;
  }

  public void setEdad(int edad){
      this.edad = edad;
    }
}
