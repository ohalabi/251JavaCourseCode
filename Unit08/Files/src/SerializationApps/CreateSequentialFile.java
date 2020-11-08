package SerializationApps;// Fig. 15.11: CreateSequentialFile.java
// Writing objects to a file with JAXB and BufferedWriter.

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class CreateSequentialFile {
    public static void main(String[] args) {
        // open clients.json, write objects to it then close file
        try (BufferedWriter output =
                     Files.newBufferedWriter(Paths.get("clients.json"))) {

            Scanner input = new Scanner(System.in);

            // stores the Accounts before JSON serialization
            Accounts accounts = new Accounts();
            Gson gson = new Gson(); // create instance of Gson

            System.out.printf("%s%n%s%n? ",
                    "Enter account number, first name, last name and balance.",
                    "Enter end-of-file indicator to end input.");

            while (input.hasNext()) { // loop until end-of-file indicator
                try {
                    // create new record
                    Account record = new Account(input.nextInt(),
                            input.next(), input.next(), input.nextDouble());

                    // add to AccountList
                    accounts.getAccounts().add(record);

//                    String accountJSON = gson.toJson(record); //pass list of account
//                    output.write(accountJSON);

                } catch (NoSuchElementException elementException) {
                    System.err.println("Invalid input. Please try again.");
                    input.nextLine(); // discard input so user can try again
                }
                System.out.print("? ");
            }

            // write AccountList's XML to output
//         JAXB.marshal(accounts, output);

            // write accounts to Json
            String accountJSON = gson.toJson(accounts); //pass list of account
            output.write(accountJSON);

//         Files.writeString(Paths.get(output), accountJSON);
        } catch (IOException ioException) {
            System.err.println("Error opening file. Terminating.");
        }
    }
}

/*************************************************************************
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