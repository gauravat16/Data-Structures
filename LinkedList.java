package com.basicstruct.gaurav;

import java.util.Scanner;

public class LinkedList {
	Scanner in = new Scanner(System.in);
	public Link firstlink;

	public LinkedList() {
		firstlink = null;
	}

	public boolean isEmpty() {
		if (firstlink == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insertFirstLink(String namein) {
		Link newlink = new Link(namein);
		newlink.next = firstlink;
		firstlink = newlink;
		System.out.println("inserted" + firstlink.name);

	}

	public void removeFirst() {
		Link Ref = firstlink;
		if (!isEmpty()) {
			firstlink = firstlink.next;
			System.out.println("removed" + Ref.name);
		}

	}

	public void display() {
		Link ref = firstlink;
		if (!isEmpty()) {
			while (firstlink != null) {
				System.out.println(firstlink.name);
				firstlink = firstlink.next;
			}

		}
		firstlink = ref;
	}

	public void addAny() {
		Link ref = firstlink;
		Link prev;
		String val, add, first;
		first = firstlink.name;
		// System.out.println(first);
		System.out.println("add before-");
		val = in.next();
		System.out.println("add what");
		add = in.next();
		prev = firstlink;
		while (firstlink != null) {
			//System.out.println(prev.name);

			if (firstlink.name.equals(val) && !val.equals(first)) {
				

				Link link = new Link(add);
				// System.out.println(link.name);
				prev.next = link;
				link.next = firstlink;
				
				//System.out.println(prev.name+"-"+firstlink.name);

				break;
			}
			prev = firstlink;
			firstlink = firstlink.next;

		}
		firstlink = ref;
		if (val.equals(first)) {
			this.insertFirstLink(add);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
