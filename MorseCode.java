import java.util.Scanner;

public class MorseCode {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String palabra = "";

    String[] cMorse = { "   ", ".", "-", ".-", "---", "..", "-.", "...", "....", ".-.", "-..", ".-..", "..-", "-.-.",
        "--", "..-.", ".--", "--.", ".--.", "-.--", "-...", "...-", "-.-", ".---", "--.-", "-..-", "--..", ".----",
        "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "/" };

    // String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890";
    String englishLetters = " ETAOINSHRDLUCMFWGPYBVKJQXZ1234567890   ";

    int position = 0;
    String result = "";

    // String cadena = "Codigo c Fuente en Java";
    // int index = cadena.indexOf("C");
    // System.out.println(index);

    do {
      // Ingresar menú para salir
    } while (false);

    System.out.println("Hi, welcome!");
    System.out.print("Write your message or +e for exit: ");
    palabra = entrada.nextLine();

    // Exit
    if (palabra.equalsIgnoreCase("+e")) {
      System.out.println("Exit");
      System.exit(1);
    }

    // Morse code to text

    String[] arrayItem = {};

    arrayItem = palabra.split(" ");

    for (String o : arrayItem) {
      for (int i = 0; i < cMorse.length; i++) {
        if (o.equals(cMorse[i])) {
          // System.out.print( o + " = " + englishLetters.charAt(i) );
          System.out.print(englishLetters.charAt(i));
          break;
        }
      }
      System.out.println();
    }
    for (int f = 0; f < palabra.length(); f++) {
    }

    // // Text to morse code

    // for (int f = 0; f < palabra.length(); f++) {
    // position = englishLetters.indexOf(palabra.toUpperCase().charAt(f));
    // result += cMorse[position] + " ";
    // }
    // System.out.println( "Morse code: " + result );

    entrada.close();
  }
}