package com.succez.train;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树
 * <p>Copyright: Copyright (c) 2011<p>
 * <p>succez<p>
 * @author wanwei
 * @createdate 2011-11-8
 */
public class TNode {
	String value;
	TNode left, right;

	public TNode() {
	}

	public TNode(String value) {
		this.value = value;
	}

	/**
	 * 获取第level层的所有节点
	 * 比如下面树，如果level为3，会返回节点G,H,C,F。
	 * 		 A
	 *    B     D
	 *  G  H   C  F
	 * @param root
	 * @param level
	 * @return
	 */
	public static List<TNode> getNodesByTreeLevel(TNode root, int level) {
		List<TNode> result = new ArrayList<TNode>();
		loopTree(root, 1, level, result);
		return result;
	}

    /**
     * 遍历二叉树并将第level层的节点放入result里，采用递归算法
     * currentlevel表示参数currentnode所在的层次
     */
	private static void loopTree(TNode currentnode, int currentlevel, int targetlevel,
			List<TNode> result) {
		if (currentlevel == targetlevel - 1) {
			if (currentnode.left != null)
				result.add(currentnode.left);
			if (currentnode.right != null)
				result.add(currentnode.right);
		} else {
			loopTree(currentnode.left, currentlevel + 1, targetlevel, result);
			loopTree(currentnode.right, currentlevel + 1, targetlevel, result);
		}
	}
}