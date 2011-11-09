package com.succez.train;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class TestTNode {
	@Test
	public void testGetNodesByTreeLevel() {
		TNode root = getTree();

		List<TNode> nodes = TNode.getNodesByTreeLevel(root, 3);
		Assert.assertEquals(4, nodes.size());
		Assert.assertEquals("G", nodes.get(0).value);
		Assert.assertEquals("H", nodes.get(1).value);
		Assert.assertEquals("C", nodes.get(2).value);
		Assert.assertEquals("F", nodes.get(3).value);

		//测试去掉一些节点后是否还符合要求
		root.left.left = null;
		nodes = TNode.getNodesByTreeLevel(root, 3);
		Assert.assertEquals(3, nodes.size());
		Assert.assertEquals("H", nodes.get(0).value);
		Assert.assertEquals("C", nodes.get(1).value);
		Assert.assertEquals("F", nodes.get(2).value);
		
		root.right.right = null;
		nodes = TNode.getNodesByTreeLevel(root, 3);
		Assert.assertEquals(2, nodes.size());
		Assert.assertEquals("H", nodes.get(0).value);
		Assert.assertEquals("C", nodes.get(1).value);		
	}

	/**
	 * 返回树的结构为
	 * 		A
	 *    B     D
	 *  G  H   C  F
	 * @return
	 */
	private TNode getTree() {
		TNode root = new TNode("A");
		TNode nodeB = new TNode("B");
		TNode nodeC = new TNode("C");
		TNode nodeD = new TNode("D");
		TNode nodeF = new TNode("F");
		TNode nodeG = new TNode("G");
		TNode nodeH = new TNode("H");

		root.left = nodeB;
		root.right = nodeD;
		nodeB.left = nodeG;
		nodeB.right = nodeH;
		nodeD.left = nodeC;
		nodeD.right = nodeF;
		return root;
	}
}