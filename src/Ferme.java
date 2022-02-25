import java.util.ArrayList;
import java.util.LinkedList;

public class Ferme {
    private ArrayList<LinkedList<Integer>> listFerme;
    public Ferme(){
         this.listFerme = new ArrayList<>();
    }
    public ArrayList<LinkedList<Integer>> getListFerme(){
        return listFerme;
    }
}
