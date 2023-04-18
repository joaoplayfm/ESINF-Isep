
package PL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Stack;

/*
 * @author DEI-ESINF
 * @param <E>
 */

public class TREE<E extends Comparable<E>> extends BST<E> {

    /*
     * @param element A valid element within the tree
     * @return true if the element exists in tree false otherwise
     */

    public boolean contains(E element) {

        if (element == null) {
            return false;
        }
        return find(root(), element) != null;
    }

    public boolean isLeaf(E element) {
        if (element == null) {
            return false;
        }
        Node<E> node = find(root(), element);
        return (node == null ? false: (node.getLeft() == null && node.getRight()== null));
    }

    /*
     * build a list with all elements of the tree. The elements in the
     * left subtree in ascending order and the elements in the right subtree
     * in descending order.
     *
     * @return    returns a list with the elements of the left subtree
     * in ascending order and the elements in the right subtree is descending order.
     */
    public Iterable<E> ascdes() {
        ArrayList<E> list = new ArrayList<>();
        if(root()== null){
            ascSubtree(root().getLeft(), list);
            list.add(root().getElement());
            desSubtree(root().getRight(), list);
        }
        return list;
    }

    private void ascSubtree(Node<E> node, List<E> list){
        if(node != null){
            ascSubtree(node.getLeft(),list);
            list.add(node.getElement());
            ascSubtree(node.getRight(),list);
        }
    }
    private void desSubtree(Node<E> node, List<E> list){
        if(node != null){
            desSubtree(node.getRight(),list);
            list.add(node.getElement());
            desSubtree(node.getLeft(),list);
        }
    }



    /**
     * Returns the tree without leaves.
     *
     * @return tree without leaves
     */
    public BST<E> autumnTree() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Node<E> copyRec(Node<E> node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the the number of nodes by level.
     */
    public int[] numNodesByLevel() {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void numNodesByLevel(Node<E> node, int[] result, int level) {

        throw new UnsupportedOperationException("Not supported yet.");

    }

    public boolean perfectBalanced() {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    private boolean perfectBalanced(Node<E> node) {

        throw new UnsupportedOperationException("Not supported yet.");
    }


    public E lowestCommonAncestor(E elem1, E elem2) {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Node<E> lowestCommonAncestor(Node<E> node, E elem1, E elem2) {

        throw new UnsupportedOperationException("Not supported yet.");
    }


    public BST<E> minCompletSubtree(E elem1, E elem2) {

        throw new UnsupportedOperationException("Not supported yet.");
    }


    public BST<E> construcTreeposOrder(ArrayList<E> posOrder) {

        throw new UnsupportedOperationException("Not supported yet.");
    }
}
