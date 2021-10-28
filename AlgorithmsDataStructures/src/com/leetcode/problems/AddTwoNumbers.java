package com.leetcode.problems;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * @author bisu9
 *
 */
public class AddTwoNumbers {

	static class ListNode {
		int val;
		ListNode next;
		ListNode headNode;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode headNode = new ListNode(0);
		ListNode p = l1, q = l2, curr = headNode;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0)
			curr.next = new ListNode(carry);
		return headNode.next;
	}

	public static ListNode push(ListNode list, int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = null;
		if (list.headNode == null)
			list.headNode = newNode;
		else {
			ListNode last = list.headNode;
			while (last.next != null)
				last = last.next;
			last.next = newNode;
		}
		return list;
	}

	public static void printList(ListNode list) {
		ListNode currNode = list.headNode;
		while (currNode != null) {
			System.out.print(currNode.val + " -> ");
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode();
		l1 = push(l1, 2);
		l1 = push(l1, 4);
		l1 = push(l1, 3);
		printList(l1);
		System.out.println();
		ListNode l2 = new ListNode();
		l2 = push(l2, 5);
		l2 = push(l2, 6);
		l2 = push(l2, 4);
		printList(l2);
		System.out.println();
		ListNode l3 = addTwoNumbers(l1, l2);
		printList(l3);
	}

}
