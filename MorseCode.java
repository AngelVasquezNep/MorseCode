import java.util.Scanner; 

public class MorseCode {
  public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in); 
    String palabra=""; 

    String[] cMorse = {
      "   ",
      "." , "-" , ".-" , "---" , ".." , "-." , "..." ,
      "....", ".-.", "-..", ".-..", "..-", "-.-.", "--",
      "..-.", ".--", "--.", ".--.", "-.--", "-...", "...-",
      "-.-", ".---", "--.-", "-..-", "--..",
      ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"
    }; 
    
    // String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890";
    String englishLetters = " ETAOINSHRDLUCMFWGPYBVKJQXZ1234567890";
    
    int position = 0; 
    String result = ""; 

    String cadena = "Codigo c Fuente en Java";
    int index = cadena.indexOf("C"); 
    System.out.println(index);

    do {
      
    } while (false);

    System.out.println("Hi, welcome!"); 
    System.out.print("Write your message or +e for exit: "); 
    palabra = entrada.nextLine(); 

    if( palabra.equals("+e") ) {
      System.out.println("Exit");
      System.exit(1);
    }

    for (int f = 0; f < palabra.length(); f++) { 
      position = englishLetters.indexOf(palabra.toUpperCase().charAt(f)); 
      result += cMorse[position] + " ";
    }
    System.out.println( "Morse code: " + result );

    entrada.close();
  }
}