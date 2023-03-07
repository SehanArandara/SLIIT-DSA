package Tree;

public class Treex {
	private Node root;
	
	public Treex() {
		root = null;
	}
	
	public Node find(int key) {
		Node cur = root;
		
		while(cur.iData!=key) {
			if(key<cur.iData){
				cur = cur.leftchild;
			}else {
				cur = cur.rightChild;
			}
			if(cur==null)
				return cur;
		}
		
		return cur;
	}
	
	@SuppressWarnings("unused")
	public void insert(int id,double dData) {
		Node newNode = new Node();
		newNode.iData =  id;
		newNode.dData = dData;
	
		if(root==null)
			root =  newNode;
		
		else {
			Node cur = root;
			Node pre = root;
			
			while(true) {
				pre = cur;
				if(id < cur.iData) {
					cur =  cur.leftchild;
					if(cur==null) {
						pre.leftchild = newNode;
						return ;
					}
				}
				else {
					if(id>cur.iData) {
						cur = cur.rightChild;
						if(cur==null) {
							pre.rightChild = newNode;
							return ;
						}
					}
				}
			}
		}
		
		
	}
	
	public Node minimum() {
		Node cur = root;
		while(cur.leftchild!=null) {
			cur = cur.leftchild;
		}
		
		return cur;
		
	}
	public Node maximum() {
		Node cur =root;
		while(cur.rightChild!=null) {
			cur = cur.rightChild;
		}
		
		return cur;
	}
	
	private void inOrder(Node localRoot) {
		
		if(localRoot!= null) {
			inOrder(localRoot.leftchild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	public void inOrder() {
		inOrder(root);
	}
	
	private void preOrder(Node localRoot) {
		
		if(localRoot!= null) {
			localRoot.displayNode();
			preOrder(localRoot.leftchild);
			preOrder(localRoot.rightChild);
		}
	}
	public void preOrder() {
		preOrder(root);
	}
	
	private void postOrder(Node localRoot) {
		if(localRoot!= null) {
			
			postOrder(localRoot.leftchild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	public void postOrder() {
		postOrder(root);
	}
	
}
