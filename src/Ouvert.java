import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Ouvert {
    private LinkedList<LinkedList<Integer>> list;
    public Ouvert(){
        this.list = new LinkedList<LinkedList<Integer>>();
    }
    public LinkedList<LinkedList<Integer>> getList(){
        return this.list;
    }

    public abstract void remove(LinkedList<Integer> e);

    public abstract LinkedList<Integer> tete();

    public abstract void add(LinkedList<Integer> voisin);


}
