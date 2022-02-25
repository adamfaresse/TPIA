import java.util.LinkedList;
import java.util.Objects;

public class Voisins {
    private LinkedList<LinkedList<Integer>> listVoisins;

    public Voisins (LinkedList<Integer> e){
        listVoisins = generateVoisins(e);
    }

    public LinkedList<LinkedList<Integer>> getListVoisins() {
        return listVoisins;
    }

    public LinkedList<LinkedList<Integer>> generateVoisins(LinkedList<Integer> e){

        LinkedList<LinkedList<Integer>> listVoisins = new LinkedList<>();

        for (int i = 0; i <e.size() ; i++) {

            if(remplir(i, e) != null){

                listVoisins.add(remplir(i, e));
            }
            if(vider(i,e)!= null){

                listVoisins.add(vider(i,e));
            }
            for (int j = 0; j <e.size() ; j++) {

                if(transvaser(i,j,e) != null){
                    listVoisins.add(transvaser(i,j,e));
                }
            }
        }
        return listVoisins;
    }

    public LinkedList<Integer> remplir(int index , LinkedList<Integer> e){
        if (e.get(index) < Algo.contenance_max.get(index)){
            LinkedList<Integer> clone_e = new LinkedList<>(e);

            while(!Objects.equals(clone_e.get(index), Algo.contenance_max.get(index))){
                clone_e.set(index,clone_e.get(index)+1);

            }
            return clone_e;

        }else{
            return null;
        }
    }
    public LinkedList<Integer> vider(int index , LinkedList<Integer> e){
        if(e.get(index)>0){
            LinkedList<Integer> clone_e = new LinkedList<>(e);
            while(clone_e.get(index)!=0){
                clone_e.set(index , clone_e.get(index)-1);
            }
            return clone_e;
        }else{
            return null;
        }
    }

    public LinkedList<Integer> transvaser(int index1, int index2 , LinkedList<Integer> e){
        if(index1 != index2){
            if( (e.get(index1)>0)  && ( e.get(index2)<Algo.contenance_max.get(index2) )  ){
                LinkedList<Integer> clone_e = new LinkedList<>(e);
                while(clone_e.get(index1)!=0 && clone_e.get(index2)!= Algo.contenance_max.get(index2)){
                    clone_e.set(index1, clone_e.get(index1) - 1);
                    clone_e.set(index2, clone_e.get(index2) +1);
                }
                return clone_e;
            }else{
                return null;
            }
        }else{
            return null;
        }

    }
}
