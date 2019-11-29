package Tests;

import Recursive.RecursivePrinting;
import Recursive.TowerOfHanoi;
import Uses.DoubleLinkedList;
import Uses.DoubleNode;
import Uses.LinkedList;

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
 *
 * </p>
 */
public class TestPrints {

    public static void main(String[] args) {

        RecursivePrinting prints = new RecursivePrinting();

        LinkedList listS = new LinkedList();

        listS.add(1);
        listS.add(2);
        listS.add(3);
        listS.add(4);
        listS.add(5);

        System.out.println("\n\tExerc1:");
        prints.printLinkedList(listS.getHead());

        System.out.println(prints.LinkedListToString(listS.getHead()));

        DoubleLinkedList<Integer> listD = new DoubleLinkedList<>();

        listD.add(1);
        listD.add(2);
        listD.add(3);
        listD.add(4);
        listD.add(5);

        System.out.println("\n\tExerc2-Head:");
        prints.printDoubleLinkedListFromHead(listD.firstNode());
        
        System.out.println("\n\tExerc2-Head2:");
        System.out.println(prints.DoubleLinkedListToStringFromHead(listD.firstNode()));

        System.out.println("\n\tExerc2-Rear:");
        prints.printDoubleLinkedListFromRear(listD.LastNode());
        
        System.out.println("\n\tExerc2-Rear2:");
        System.out.println(prints.DoubleLinkedListToStringFromRear(listD.firstNode()) + "\n");

        TowerOfHanoi TH = new TowerOfHanoi();
        TH.PrintTowerOfHanoi(3, 'A', 'C', 'B');
        System.out.println(TH.TowerOfHanoi(3, 'A', 'C', 'B'));
        System.out.println(TH.TowerOfHanoi2(3, 'A', 'C', 'B'));
        
        System.out.println(listD.toString());
        System.out.println("\n\t\tParte 2\n\tExerc 3");
        Object[] arr = listD.invertedContent( listD.LastNode() );
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i] );
        }

    }

}
