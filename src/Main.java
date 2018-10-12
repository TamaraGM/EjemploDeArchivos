import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	    File entrada = new File("entrada.txt");
        Scanner escaner = new Scanner(entrada);
        double total = 0;
        while(escaner.hasNext()) {
            total= total + escaner.nextDouble();
        }
        System.out.println(total);
    }
}
