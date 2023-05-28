package ai;
import java.util.*;
class node{
	int val;
	node right;
	node left;
	node(){this.left=null;this.right=null;}
	node(int val){this.val = val;this.left=null;this.right=null;}
	node(int val, node right,node left){this.val=val;this.right=right;this.left = left;}
}
public class dfs {
	private static node head = null;
	public static void main(String []args) {
		 
		boolean discovered[] = new boolean[100];
		for(int i=0;i<100;++i) {
			discovered[i]=false;
		}
		Queue<node>q=new ArrayDeque<>();		
		
		head = new node(5,new node(6,new node(3),new node(2)),new node(7));
		
		fs(head);
		System.out.println();
		q.add(head);
		fs2(head,discovered,q);
	}
	
	private static void fs(node head) {
		if(head==null) return;
		System.out.print(head.val+" ");
		fs(head.left);
		fs(head.right);
	}
	
	private static void fs2(node head,boolean discovered[],Queue<node>q) {
		
		if(q.isEmpty()) return;
		
		node t = q.poll();
		if(discovered[t.val]==false) {
			if(t.left != null) {
				q.add(t.left);
			}
			if(t.right != null) {
				q.add(t.right);
			}
			discovered[t.val]=true;
		
			System.out.print(t.val+" ");
			fs2(q.peek(),discovered,q);
		}
	}
}
