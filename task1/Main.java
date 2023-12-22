package ru.mirea.lab30p2.task1;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.createBinarySearchTree();

        System.out.println("Содержимое дерева до удаления:");
        tree.printInOrder(tree.getRoot());

        int nodeToDelete = 6;
        tree.deleteNode(nodeToDelete);

        System.out.println("\nСодержимое дерева после удаления узла " + nodeToDelete + ":");
        tree.printInOrder(tree.getRoot());

        tree.setRoot(null);
        System.out.println("\nДерево полностью удалено.");
    }
}
