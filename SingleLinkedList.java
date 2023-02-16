package com.org.SingleLinkedList;

import java.util.Scanner;

public class SingleLinkedList {
	private Node start;
	public SingleLinkedList() {
		start=null;
	}
	
	//Traversing in singlyLinkedLIst
	public void display() {
		Node p;
		if(start==null) {
			System.out.println("list is empty");
		}
		System.out.println("list are :--");
		p=start;
		while(p!=null) {
			System.out.println(p.info + " ");
			p=p.link;
		}
	}
	
	//searching in singlyLinkedList
	
	public boolean search(int x) {
		Node p;
		int position=0;
//		if(start==null) {
//			System.out.println("list is empty");
//		}
		p=start;
		while(p!=null) {
			if(p.info==x)
				break;
			position++;
			p=p.link;	
		}
		if(p==null) {
			System.out.println(x+"is not found in List");
			return false;
		}
		else {
			System.out.println(x +"is found at "+ position+"position");
			return true;
		}
	}
	public void findingReferenceToPredecessorOfANodeWithParticlrInfo(int x) {
		Node p;
		if(start==null) {
			System.out.println("list is empty");
		}
		p=start;
		while(p.link!=null) {
			if(p.link.info==x) {
				break;
			}
			p=p.link;
		}
		if(p==null)
			System.out.println(x+"is not prasent in list");
		else {
			System.out.println(x+"is prasent in the location"+p);
		}
	}
	//insertion at the begining 
	
	public void insertAtBegining(int x) {
	
		Node temp=new Node(x);
		temp.link=start;
		start=temp;
		
	}
	//insert at the end
	public void insertAtEnd(int x) {
		Node p;
		Node temp=new Node(x);
		if(start==null) {
			start=temp;
			return;
		}
		p=start;
		while(p.link!=null) {
			p=p.link;
			
		}
		p.link=temp;;
	}
	//insertion after a node
	
	public void insertAfterANode(int data,int x) {
		Node p=start;
		while(p!=null) {
			if(p.info==x)
				break;
			p=p.link;
		}
		if(p==null)
		{
			System.out.println(x +"is not prasent in list");
		}
		else {
			Node temp=new Node(data);
			temp.link=p.link;
			p.link=temp;
		}
	}
	//insert Before a node
	public void insertBeforeANode(int data,int x) {
		Node temp;
		if(start==null) {
			System.out.println("list is empty");
		}
		if(x==start.info) {
			temp=new Node(data);
			temp.link=start;
			start=temp;
			return;
		}
		Node p=start;
		while(p.link!=null) {
			if(p.link.info==x)
				break;
			p=p.link;
		}
		if(p.link==null) {
			System.out.println(x+"is not prasent in list");
		}
		else {
			temp=new Node(data);
			temp.link=p.link;
			p.link=temp;
		}
		
	}
	//insertion AT GIVEN POSITIOn
	public void insertAtGivenPosition(int data,int pos) {
		Node p,temp;
		int i;
		if(pos==0) {
			temp=new Node(data);
			temp.link=start;
			start=temp;
			
		}
		p=start;
		for(i=0;i<pos-1 && p!=null;i++)
		{
			p=p.link;
		}
		if(p==null) {
			System.out.println("u can insert only"+i+ "th position");
		}
		else {
			temp=new Node(data);
			temp.link=p.link;
			p.link=temp;
		}
	}
	public void createList() {
		int i,n,data;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of nofe : ");
		n=scan.nextInt();
		if(n==0)
			return;
		for(i=1;i<=n;i++) {
			System.out.println("enter the data to be inserted : ");
			data=scan.nextInt();
			insertAtEnd(data);
		}
	}
	//deletion of first node
	
	public void deleteFirstNode() {
		if(start==null) {
			return;
		}
		start=start.link;
	}
	//delete last node
	public void deleteLastNode() {
		if(start==null)
			return;
		if(start.link==null)
			start=null;
		Node p=start;
		while(p.link.link!=null) {
			p=p.link;
		}
		p.link=null;
	}
	//delete given data node
	
	public void deleteNode(int x) {
		if(start==null) {
			System.out.println("list is empty");
			return;
		}
		if(start.info==x) {
			start.link=null;
			return;
		}
		//deletion in between or at the end
		Node p=start;
		while(p.link!=null) {
			if(p.link.info==x)
				break;
			p=p.link;
			
		}
		if(p.link==null)
			System.out.println(x+ "is not prasent in list");
		else
			p.link=p.link.link;
			
	}
	//reverse aa slinkedList
	public void reverse() {
		Node p,prev,next;
		prev=null;
		p=start;
		while(p!=null) {
			next=p.link;
			p.link=prev;
			prev=p;
			p=next;
		}
		start=prev;
	}
	//count node of slinkedList
	
	public void countNode() {
		int n=0;
		Node p=start;
		while(p!=null) {
			n++;
			p=p.link;
		}
		System.out.println("number of nodes in the list = "+n);
	}
//bubble sort uses data
	public void bubbleSortExData() {
		Node end,p,q;
		for(end=null;end!=start.link;end=p) {
			for(p=start;p.link!=end;p=p.link) {
				q=p.link;
				if(p.info>q.info) {
					int temp=p.info;
					p.info=q.info;
					q.info=temp;
					
				}
			}
		}
	}
	public void BubbleSOrtExLinks() {
		Node end,r,p,q,temp;
		for(end=null;end!=start.link;end=p) {
			for(r=p=start;p.link!=end;r=p,p=p.link) {
				q=p.link;
				if(p.info>q.info) {
					p.link=q.link;
					q.link=p;
					if(p!=start)
						r.link=q;
					else
						start=q;
					temp=p;
					p=q;
					q=temp;
				}
			}
		}
	}
}
