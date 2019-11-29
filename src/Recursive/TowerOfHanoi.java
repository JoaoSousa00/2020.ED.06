package Recursive;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto<br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Author: </strong><br>
 * Joao Sousa<br>
 * <strong>Description: </strong><br>
 * Class that represents
 * </p>
 */
public class TowerOfHanoi {

    /**
     *
     * @param NDisks
     * @param From
     * @param To
     * @param Aux
     */
    public void PrintTowerOfHanoi(int NDisks, char From, char To, char Aux) {
        if (NDisks == 1) {
            System.out.println("Move Disk from " + From + " to " + To);
        } else {
            PrintTowerOfHanoi(NDisks - 1, From, Aux, To);
            System.out.println("Move Disk from " + From + " to " + To);
            PrintTowerOfHanoi(NDisks - 1, Aux, To, From);
        }
    }

    public String TowerOfHanoi(int NDisks, char From, char To, char Aux) {
        String res = "";
        if (NDisks == 1) {
            return ("\nMove Disk from " + From + " to " + To);
        } else {
            res += TowerOfHanoi(NDisks - 1, From, Aux, To);
            res += TowerOfHanoi(1, From, To, Aux);
            res += TowerOfHanoi(NDisks - 1, Aux, To, From);
        }
        return res;
    }

    public String TowerOfHanoi2(int NDisks, char From, char To, char Aux) {

        return (NDisks == 1)
                ? ("\nMove Disk from " + From + " to " + To)
                : (TowerOfHanoi2(NDisks - 1, From, Aux, To) + TowerOfHanoi2(1, From, To, Aux) + TowerOfHanoi2(NDisks - 1, Aux, To, From));

    }
}
