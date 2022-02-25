import java.util.ArrayList;
import java.util.LinkedList;

public class OuvertPile extends Ouvert{
    public OuvertPile() {

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
        getList().addLast(voisin);
    }
}
