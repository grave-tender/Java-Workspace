public class Tableaux {
    public static void main(String[] args) {
        int nb[] = {15,20,10,5,35,14};
        int max = 0;
        int posMax = 0;

        for (int i = 0; i < nb.length; i++){
            if(max < nb[i]){
                max = nb[i];
                posMax = i;
            }
        }

        System.out.println("La valeur maximale sur le tableaux est a l'indice " + posMax + " et est a la valeur de " + nb[posMax]);
    }
}
