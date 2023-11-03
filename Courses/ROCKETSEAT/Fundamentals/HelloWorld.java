/* package = São pacotes ou caminhos para ter acesso ás classes, sejam publicas ou privadas */
package Courses.ROCKETSEAT.Fundamentals;

/* 
 * public = Tipo de acesso á classe(public or private), neste caso seria público
 * class = Tipo de classe em java
 * HelloWord = Nome dado á classe
*/
public class HelloWorld {
    public static void main(String[] args) {
      int tipoDeDadoInteiro = 77; // Tipo de Dado com números inteiros
      double tipoDeDadoDouble = 15.4565; // Tipo de Dado com números decimais
      float tipoDeDadoFloat = 3.14f; // Tipo de Dado com números decimais
      long tipoDeDadoLong = 123456789L; // Tipo de Dado com números inteiros
      String tipoDeDadoString = "Eu sou uma string"; // String é um array de caracteres com aspas duplas
      char tipoDeDadoChar = 'j'; // Tipo de dado com apenas uma letra ou dado com aspas simples
      boolean tipoDeDadoBoolean = true; // Tipo de Dado sendo verdadeiro ou falso

      System.out.println(tipoDeDadoChar + "" + tipoDeDadoBoolean);
    }
}