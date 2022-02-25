import java.util.ArrayList;
import java.util.LinkedList;

public class OuvertFile extends Ouvert{
    public OuvertFile(){
    }

    @Override
    public void remove(LinkedList<Integer> e) {
        getList().remove(e);
    }

    @Override
    public LinkedList<Integer> tete() {
        return getList().getFirst();
    }

    @Override
    public void add(LinkedList<Integer> voisin) {
        getList().addFirst(voisin);
    }
}
