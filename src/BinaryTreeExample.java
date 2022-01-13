import java.util.LinkedList;
import java.util.Queue;

// Java program for different tree traversals 
	  
	/* Class containing left and right child of current 
	   node and key value*/
	class Node 
	{ 
	    int key; 
	    Node left, right; 
	  
	    public Node(int item) 
	    { 
	        key = item; 
	        left = right = null; 
	    } 
	} 
	  
	class BinaryTreeExample 
	{ 
	    // Root of Binary Tree 
	    Node root; 
	  
	    BinaryTreeExample() 
	    { 
	        root = null; 
	    } 
	  
	    /* Given a binary tree, print its nodes according to the 
	      "bottom-up" postorder traversal. */
	    void printPostorder(Node node) 
	    { 
	        if (node == null) 
	            return; 
	  
	        // first recur on left subtree 
	        printPostorder(node.left); 
	  
	        // then recur on right subtree 
	        printPostorder(node.right); 
	  
	        // now deal with the node 
	        System.out.print(node.key + " "); 
	    } 
	  
	    /* Given a binary tree, print its nodes in inorder*/
	    void printInorder(Node node) 
	    { 
	        if (node == null) 
	            return; 
	  
	        /* first recur on left child */
	        printInorder(node.left); 
	  
	        /* then print the data of node */
	        System.out.print(node.key + " "); 
	  
	        /* now recur on right child */
	        printInorder(node.right); 
	    } 
	  
	    /* Given a binary tree, print its nodes in preorder*/
	    void printPreorder(Node node) 
	    { 
	        if (node == null) 
	            return; 
	        
	        /* first print data of node */
	        System.out.print(node.key + " "); 
	  
	        /* then recur on left sutree */
	        printPreorder(node.left); 
	  
	        /* now recur on right subtree */
	        printPreorder(node.right); 
	    } 
	    
	    /* Compute the "maxDepth" of a tree -- the number of  
	       nodes along the longest path from the root node  
	       down to the farthest leaf node.*/
	    int maxDepth(Node node)  
	    { 
	        if (node == null) 
	            return 0; 
	        else 
	        { 
	            /* compute the depth of each subtree */
	            int lDepth = maxDepth(node.left); 
	            int rDepth = maxDepth(node.right); 
	   
	            /* use the larger one */
	            if (lDepth > rDepth) 
	                return (lDepth + 1); 
	             else 
	                return (rDepth + 1); 
	        } 
	    } 
	    
	    int depthBinaryTree(Node node) {
	    	if (node == null) {
	    		return 0;
	    	}else {
	    		int lheight = depthBinaryTree(node.left);
	    		int rheight = depthBinaryTree(node.right);
	    	
	    		return (lheight > rheight? (lheight +1):(rheight+1));
	    	}
	    }	
	    
	    int findHeightTree(Node node) {
	    	int height = 0;
	    	if(node == null)
	    		return -1;
		    Queue<Node> queue = new LinkedList<Node>();
		    
		    queue.offer(root);
		    queue.offer(null);
		    while(!queue.isEmpty()) {
		    	Node nodeQ = queue.poll();
		    	if(nodeQ == null) {
		    		if(!queue.isEmpty()) {
		    			queue.offer(null);
		    		}
		    		height++;
		    	}else {
		    		if(nodeQ.left != null) {
		    			queue.offer(nodeQ.left);
		    		}
		    		if(nodeQ.right != null) {
		    			queue.offer(nodeQ.right);
		    		}
		    	}
		    }
	    	return height;
	    }
	  
	    // Wrappers over above recursive functions 
	    void printPostorder()  {     printPostorder(root);  } 
	    void printInorder()    {     printInorder(root);   } 
	    void printPreorder()   {     printPreorder(root);  } 
	    int printTreeDepth() { return depthBinaryTree(root);}
	  
	    // Driver method 
	    public static void main(String[] args) 
	    { 
	    	BinaryTreeExample tree = new BinaryTreeExample(); 
	        tree.root = new Node(1); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(3); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(5); 
	  
	        System.out.println("Preorder traversal of binary tree is "); 
	        tree.printPreorder(); 
	  
	        System.out.println("\nInorder traversal of binary tree is "); 
	        tree.printInorder(); 
	  
	        System.out.println("\nPostorder traversal of binary tree is "); 
	        tree.printPostorder(); 
	        System.out.println("\n"+ tree.printTreeDepth() + ":Depth");
	        System.out.println("\n"+ tree.maxDepth(tree.root) + ":Depth method");
	        System.out.println("\n using non recursive appraoch"+ tree.findHeightTree(tree.root));
	    } 
	} 

