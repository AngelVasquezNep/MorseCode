import java.util.Scanner;

public class MorseCode {
  public static String[] cMorse = { "   ", ".", "-", ".-", "---", "..", "-.", "...", "....", ".-.", "-..", ".-..", "..-", "-.-.",
  "--", "..-.", ".--", "--.", ".--.", "-.--", "-...", "...-", "-.-", ".---", "--.-", "-..-", "--..", ".----",
  "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "/" };
  
  // String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890";
  public static String englishLetters = " ETAOINSHRDLUCMFWGPYBVKJQXZ1234567890 ";
  
  public static int position = 0;
  public static String result = "";
  public static String option;
  public static String palabra = "";
  public static Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    MorseCode.showMenu();
  }

  public static void showMenu () {
    System.out.println("Hola, Bienvenidos!");
    
    do {
      
      System.out.println("Elija una opción del menú: ");
      System.out.println(" 1) Traducir texto a código morse.");
      System.out.println(" 2) Traducir código morse a texto.");
      System.out.println(" 3) Salir.");
      System.out.print(" Su opción: ");
      option = entrada.nextLine();
      
      switch (option) {
        case "1":

          textToMorse();

        break;

        case "2":

          morseToText();

        break;

        case "3":
          entrada.close();
          System.out.println("Gracias por visitarnos");
          System.exit(1);
        break;

        default:
          System.out.println();
          System.out.println("Por favor selecciona una opción valida :D");
        break;
      }
      
      System.out.println();
      System.out.println("-----------------");
      System.out.println();

    } while ( !option.equals("3") );
  }

  public static void textToMorse () {
    System.out.println("La ñ no forma parte del código así que no podrá escribir mensajes que la incluyan.");
    System.out.print("Introduzca su mensaje: ");
    
    palabra = entrada.nextLine();
    
    for (int i = 0; i < palabra.length(); i++) {
      position = englishLetters.indexOf(palabra.toUpperCase().charAt(i));
      if( position == -1) {
        result += "letra-error" + " ";
      }else{
        // position = englishLetters.indexOf(palabra.toUpperCase().charAt(i));
        result += cMorse[position] + " ";
      }
    }
    System.out.println();
    System.out.println("Su mensaje en morse: " + result);
  }

  public static void morseToText () {
    System.out.println("Recuerde separar cada letra con un espacio y cada palabra con el siguiente carácter: / ");
    System.out.print("Introduzca su mensaje: ");
    
    palabra = entrada.nextLine();
    
    String[] arrayItem = {};
    arrayItem = palabra.split(" ");
    
    System.out.print("Su mensaje en texto normal: ");
    
    byte cMorseSize = (byte) cMorse.length;
    
    for (String o : arrayItem) {
      for (int i = 0; i < cMorseSize; i++) {
        if (o.equals(cMorse[i])) {
          System.out.print(englishLetters.charAt(i));
          break;
        }
        if(i == (cMorseSize - 1)) {
          System.out.print( " code-error " );
        }
      }
    }
  }

}