import java.util.ArrayList;
import java.util.LinkedList;

public class OuvertListTriee extends Ouvert{
    public OuvertListTriee(){
    }

    @Override
    public void remove(LinkedList<Integer> e) {
        getList().remove(e);
    }

    @Override
    public LinkedList<Integer> tete() {
        return null;
    }

    @Override
    public void add(LinkedList<Integer> voisin) {

    }
}
