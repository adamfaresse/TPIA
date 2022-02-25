import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Algo {
    private Ouvert ouvert ;
    private Ferme ferme ;
    static private LinkedList<Integer> but;
    static public LinkedList<Integer> contenance_max;
    static private LinkedList<Integer> etat_initial;


    public Algo(Ouvert ouvert , String pathname) throws FileNotFoundException {
        this.ouvert = ouvert;
        this.ferme = new Ferme();
        Scanner scanner = new Scanner(new File(pathname));
        int n = scanner.nextInt();
        etat_initial = new LinkedList<>();
        for (int i = 0; i <n ; i++) {
            etat_initial.add(0);
        }
        this.ouvert.add(etat_initial);
        scanner.nextLine();
        String deuxiemeLigne = scanner.nextLine();
        contenance_max = new LinkedList<>();
        String[] chaineDeuxiemeLigne = deuxiemeLigne.split(" ");
        for(String string : chaineDeuxiemeLigne){
            contenance_max.add(Integer.valueOf(string));
        }
        String troisiemeLigne = scanner.nextLine();
         but = new LinkedList<>();
        String[] chaineTroisiemeLigne = troisiemeLigne.split(" ");
        for(String string : chaineTroisiemeLigne){
            but.add(Integer.valueOf(string));
        }

    }

    public Ouvert getOuvert() {
        return ouvert;
    }

    public Ferme getFerme() {
        return ferme;
    }

    public LinkedList<Integer> algoGeneral(){
        while(!getOuvert().getList().isEmpty() && getOuvert().tete() != but){

            LinkedList<Integer> e = getOuvert().tete();

            getOuvert().remove(e);
            getFerme().getListFerme().add(e);

            Voisins voisin = new Voisins(e);

            LinkedList<LinkedList<Integer>> listVoisin = voisin.getListVoisins();
            for (LinkedList<Integer> list : listVoisin){

                if((!getOuvert().getList().contains(list))&& (!getFerme().getListFerme().contains(list))){
                    getOuvert().add(list);
                }

            }

        }

        if (getOuvert().getList().isEmpty() ){
            return null;
        }else{
            return getOuvert().tete();
        }
    }
}
