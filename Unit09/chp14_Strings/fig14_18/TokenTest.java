// Fig. 14.18: TokenTest.java
// Tokenizing with String method split
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTest {
   public static void main(String[] args) {
      // get sentence
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Enter a sentence and press Enter");
//      String sentence = scanner.nextLine();

      // process user sentence
//      String[] tokens = sentence.split(" "); // return array of tokens
//      System.out.printf("Number of elements: %d\nThe tokens are:\n",
//         tokens.length);
//
//      for (String token : tokens) {
//         System.out.println(token);
//      }

      //test with token
      String line = new String("c += 1 + 2 + 3 - 4");
      String delimArg = "+=";
      StringTokenizer tok = new StringTokenizer(line, delimArg);
      System.out.println("The number of tokens are: " + tok.countTokens());

      //print the tokens
      while (tok.hasMoreTokens()) {
         System.out.println("Remaining are: " + tok.countTokens());
         System.out.println(tok.nextToken());
      }

   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
