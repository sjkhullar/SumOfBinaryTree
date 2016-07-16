package org.learn.Question;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfNodes {

	public static int sumOfNodes(Node root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return -1;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		int totalSum = 0;
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			totalSum += node.data;
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		return totalSum;
	}
}
