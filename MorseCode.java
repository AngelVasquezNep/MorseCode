import java.util.Scanner;

public class MorseCode {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    String[] cMorse = { "   ", ".", "-", ".-", "---", "..", "-.", "...", "....", ".-.", "-..", ".-..", "..-", "-.-.",
    "--", "..-.", ".--", "--.", ".--.", "-.--", "-...", "...-", "-.-", ".---", "--.-", "-..-", "--..", ".----",
    "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "/" };
    
    // String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890";
    String englishLetters = " ETAOINSHRDLUCMFWGPYBVKJQXZ1234567890 ";
    
    int position = 0;
    String result = "";

    System.out.println("Hola, Bienvenidos!");
    
    String option;
    
    String palabra = "";

    do {
      
      System.out.println("Elija una opción del menú: ");
      System.out.println(" 1) Traducir texto a código morse.");
      System.out.println(" 2) Traducir código morse a texto.");
      System.out.println(" 3) Salir.");
      System.out.print(" Su opción: ");
      option = entrada.nextLine();
      
      switch (option) {
        case "1":
          System.out.println("La ñ no forma parte del código así que no podrá escribir mensajes que la incluyan.");
          System.out.print("Introduzca su mensaje: ");
          
          palabra = entrada.nextLine();
          
          for (int f = 0; f < palabra.length(); f++) {
            position = englishLetters.indexOf(palabra.toUpperCase().charAt(f));
            result += cMorse[position] + " ";
          }
          System.out.println("Su mensaje en morse: " + result);
          
          break;
          
          case "2":
          System.out.println("Recuerde separar cada letra con un espacio y cada palabra con el siguiente carácter: / ");
          System.out.print("Introduzca su mensaje: ");

          palabra = entrada.nextLine();
          
          String[] arrayItem = {};
          arrayItem = palabra.split(" ");
          
          System.out.print("Su mensaje en texto normal: ");
          for (String o : arrayItem) {
            for (int i = 0; i < cMorse.length; i++) {
              if (o.equals(cMorse[i])) {
                // System.out.print( o + " = " + englishLetters.charAt(i) );
                System.out.print(englishLetters.charAt(i));
                break;
              }
              if(i == (cMorse.length - 1)) {
                System.out.print( " code-error " );
              }
            }
          }

          break;
        case "3":
          System.out.println("Gracias por visitarnos");
          System.exit(1);
          break;
        default:
          System.out.println("Por favor selecciona una opción valida :D");
          break;
      }
      
      System.out.println();
      System.out.println("-----------------");
      System.out.println();

    } while ( !option.equals("3") );


    // // Morse code to text

    // String[] arrayItem = {};

    // arrayItem = palabra.split(" ");

    // for (String o : arrayItem) {
    //   for (int i = 0; i < cMorse.length; i++) {
    //     if (o.equals(cMorse[i])) {
    //       // System.out.print( o + " = " + englishLetters.charAt(i) );
    //       System.out.print(englishLetters.charAt(i));
    //       break;
    //     }
    //     if(i == (cMorse.length - 1)) {
    //       System.out.print( " code-error " );
    //     }
    //   }
    // }


    // // Text to morse code

    // for (int f = 0; f < palabra.length(); f++) {
    // position = englishLetters.indexOf(palabra.toUpperCase().charAt(f));
    // result += cMorse[position] + " ";
    // }
    // System.out.println( "Morse code: " + result );

    entrada.close();
  }

}