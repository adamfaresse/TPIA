import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String pathname = "/amuhome/f18010428/Bureau/S4/TPIA/instances/td.buck";
        Algo algo  = new Algo(new OuvertPile() , pathname);
        System.out.println(algo.algoGeneral());
        // Probleme à regler avec le resultat qui est tjrs égale à null ne trouve pas de solution
    }
}
