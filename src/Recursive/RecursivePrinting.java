package Recursive;

import Uses.DoubleNode;
import Uses.LinearNode;

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
public class RecursivePrinting {

    /**
     *
     * @param node Node to start printing
     */
    public void printLinkedList(LinearNode node) {
        if (node != null) {
            System.out.println(node.getElement());
            printLinkedList(node.getNext());
        }
    }

    /**
     *
     * @param head first Node of the list
     */
    public void printDoubleLinkedListFromHead(DoubleNode head) {
        if (head != null) {
            System.out.println(head.getElement());
            printDoubleLinkedListFromHead(head.getNext());
        }
    }

    /**
     * Mudar errado!!
     *
     * @param rear last Node of the list
     */
    public void printDoubleLinkedListFromRear(DoubleNode rear) {
        if (rear != null) {
            System.out.println(rear.getElement());
            printDoubleLinkedListFromRear(rear.getPrevious());
        }
    }

    /**
     *
     * @param node Node to start printing
     * @return The String with information to be print
     */
    public String LinkedListToString(LinearNode node) {
        if (node != null) {
            return ("\n" + node.getElement() + LinkedListToString(node.getNext()));
        }
        return "";
    }

    /**
     * Mais compacto e eficiente
     *
     * @param node Node to start printing
     * @return The String with information to be print
     */
    public String LinkedListToString2(LinearNode node) {
        return (node != null)
                ? ("\n" + node.getElement() + LinkedListToString(node.getNext()))
                : "";
    }

    /**
     *
     * @param node
     * @return
     */
    public String DoubleLinkedListToStringFromHead(DoubleNode node) {
        return (node != null)
                ? ("\n" + node.getElement() + DoubleLinkedListToStringFromHead(node.getNext()))
                : "";
    }

    /**
     *
     * @param node
     * @return
     */
    public String DoubleLinkedListToStringFromRear(DoubleNode node) {
        return (node != null)
                ? ( DoubleLinkedListToStringFromRear(node.getNext()) + "\n" + node.getElement())
                : "";
    }
}
