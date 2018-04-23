package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		Position<Integer> v = t.addRoot(4);
		Position<Integer> x = t.addChild(v, 9);
		Position<Integer> y = t.addChild(v, 20);
		
		//child of x
		t.addChild(x, 7);
		t.addChild(x, 10);
		
		//child of y
		Position<Integer> z = t.addChild(y, 15);
		Position<Integer> w = t.addChild(y, 21);
		
		//child of z
		t.addChild(z, 12);
		Position<Integer> g = t.addChild(z, 17);
		
		//child of g
		t.addChild(g, 19);
		
		//child of w
		Position<Integer> m = t.addChild(w, 40);
		
		//child of m
		t.addChild(m, 30);
		t.addChild(m, 45); 
		
		
		return t;
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		Position<Integer> v = t.addRoot(4);
		Position<Integer> x = t.addLeft(v, 9);
		Position<Integer> y = t.addRight(v, 20);
		
		//child of x
		t.addLeft(x, 7);
		t.addRight(x, 10);
		
		//child of y
		Position<Integer> z = t.addLeft(y, 15);
		Position<Integer> w = t.addRight(y, 21);
		
		//child of z
		t.addLeft(z, 12);
		Position<Integer> g = t.addRight(z, 17);
		
		//child of g
		t.addLeft(g, 19);
		
		//child of w
		Position<Integer> m = t.addRight(w, 40);
		
		//child of m
		t.addLeft(m, 30);
		t.addRight(m, 45);
		
		return t; 
	}


}
