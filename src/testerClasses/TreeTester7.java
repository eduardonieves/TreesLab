package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;

public class TreeTester7 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree(); 
		
		// display content as a tree
		Utils.displayTree("The original binary tree is: ", t); 
		
		LinkedBinaryTree<Integer> t1 = t.clone();
		// display the tree clone
		Utils.displayTree("The clone binary tree is: ", t1); 
	}

}
