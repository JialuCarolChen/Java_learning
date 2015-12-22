package ADT5Trees;

import ADT4HashTables.Set;

/**
 * Created by carolchen on 12/11/2015.
 */
public class BSTSet<T> implements Set<T> {
    int elements = 0;
    BSTree tree;

    class BSTree {
        BSTree left, right;
        T element;
        boolean add(T element) {
            if (this.element == null) {
                this.element = element;
                return true;
            } else if(this.element.equals(element)) {
               return false;
            } else if (this.element.hashCode() > element.hashCode()) {
                if(left == null) {
                    left = new BSTree();}
                return left.add(element);
            } else {
                if(right == null) {
                    right = new BSTree();
                }
                return right.add(element);
            }
        }

        void add(BSTree tree) {
            if(tree != null ) {
                if(this.element != null) {
                    add(tree.element);
                }
                add(tree.left);
                add(tree.right);
            }
        }

        BSTree find(T element) {
            if(this.element == null || element == null) {
                return null;
            }else if(this.element == element) {
                return this;
            }else if(this.element.hashCode() > element.hashCode()) {
                if(left == null) {return null;}
                return left.find(element);
            }else {
                if(right == null) {return null;}
                return right.find(element);
            }
        }

        public String toString() {
            if(element == null) {
                return "";
            } else {
                return ((left == null || left.element == null) ? "" : (left + ", ")) + element + ((right == null || right.element == null) ? "" : (", " + right));
            }

        }






    }

    @Override
    public void add(T element) {
        if (tree == null) {
            tree = new BSTree();
        }
        if(tree.add(element)) {
            elements++;
        }
    }

    @Override
    public void remove(T element) {
        BSTree root  = tree.find(element);
        if (root != null) {
            root.element = null;
            BSTree l = root.left;
            root.left = null;
            BSTree r = root.right;
            root.right = null;
            tree.add(l);
            tree.add(r);
            elements--;
        }

    }

    @Override
    public boolean contains(T element) {
        if(tree == null) {
            return false;
        }else return tree.find(element) !=null;

    }


    @Override
    public int size() {
        return elements;
    }

    @Override
    public String toString() {
        if(tree == null) {
            return "";
        } else
            return tree.toString();
    }

}
