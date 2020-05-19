package stack;
import java.util.Stack;
public class Palindrome_stack {
	
	    public static void main(String[] a){
	 
	        Node n1 = new Node(10);//input
	        Node n2 = new Node(28);//input
	        Node n3 = new Node(15);//input
	        Node n4 = new Node(28);//input
	        Node n5 = new Node(10);//input
	        n1.next = n2;
	        n2.next = n3;
	        n3.next = n4;
	        n4.next = n5;
	        boolean result = isPalindrome(n1);
	        System.out.println("Is it palindrome: "+result);
	    }
	 
	    static class Node {
	        int data;
	        Node next;
	        Node(int tmp) {
	            data = tmp;
	        }
	    }
	 
	    static boolean isPalindrome(Node head) {
	 
	        Node tempNode = head;
	        Stack<Integer> stack = new Stack<Integer>();
	        while(tempNode != null) {
	            stack.push(tempNode.data);
	            tempNode = tempNode.next;
	        }
	        while(head != null) {
	            if(head.data != stack.pop()) {
	                return Boolean.FALSE;
	            }
	            head = head.next;
	        }
	 
	        return Boolean.TRUE;
	    }
	
}
