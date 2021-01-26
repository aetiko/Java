package com.company.AyoolaEtiko;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BST binSearchTree = new BST(5);
        binSearchTree.left = new BST(2);
        binSearchTree.right = new BST(7);

        System.out.println("Node: "+ binSearchTree.value);
        System.out.println("NodeLeft: "+ binSearchTree.left.value);
        System.out.println("NodeRight: "+ binSearchTree.right.value);

        binSearchTree.insert(6);
        binSearchTree.insert(4);

        binSearchTree.contains(90);
        binSearchTree.remove(7);

    }
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
        // Average: O(log(n) time | O(log(n) space))
        // Worst: O(n) time | O(n) space)
        public BST insert(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            if(this.value < value){
                if(right == null){
                    right = new BST(value);
                    System.out.println("right value added: "+ right.value);
                }else{
                    right.insert(value);
                }
            }else{
                if(left == null){
                    left = new BST(value);
                    System.out.println("left value added: "+ left.value);
                }else{
                    left.insert(value);
                }
            }
            return this;
        }
        // Average: O(log(n) time | O(log(n) space))
        // Worst: O(n) time | O(n) space)
        public boolean contains(int value) {
            // Write your code here.
            boolean doesContain = false;
            if(this.value > value){
                if (left == null){
                    System.out.println("!contain");
                    doesContain = false;
                }else {
                    left.contains(value);
                }
            }else if(this.value < value){
                if (right == null){
                    System.out.println("!contain");
                    doesContain = false;
                }else{
                    right.contains(value);
                }
            }else {
                System.out.println("Contains");
                doesContain = true;
            }

            return doesContain;
        }
        // Average: O(log(n) time | O(log(1) space))
        // Worst: O(n) time | O(1) space)
        public BST remove(int value){
            remove(value, null);
            return this;
        }
        public void remove(int value, BST parent) {
            // Write your code here.
            // Do not edit the return statement of this method.
            if (value < this.value){
                if (left != null){
                    left.remove(value, this);
                }
            }else if (value > this.value){
                if (right != null){
                    right.remove(value, this);
                }
            } else {
                if (left != null && right != null) {
                    this.value = right.minVal();
                    right.remove(this.value, this);
                } else if (parent == null) {
                    if (left != null) {
                        right = left.right;
                        left = left.left;
                    } else if (right != null) {
                        this.value = right.value;
                        left = right.left;
                        right = right.right;
                    } else {

                    }
                }else if (parent.left == this){
                    parent.left = left != null ? left:right;
                }else if (parent.right == this){
                    parent.right = left != null ? left:right;
                }
            }
        }
        public int minVal(){
            int minVal = this.value;
            while (left != null){
                minVal = left.value;
            }
            return minVal;
        }
    }
}
