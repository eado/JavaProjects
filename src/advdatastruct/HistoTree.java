//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class HistoTree {
	private HistoNode root;

	public HistoTree() {
		root = null;
	}

	public void addData(Comparable data) {
		add(data, root);
	}

	private HistoNode add(Comparable data, HistoNode tree) {
		if (data.compareTo(tree.getData()) > 0) {
			if (tree.getRight)
			return add(data, tree.getRight());
		}
		return null;
	}

	public HistoNode search(Comparable data) {
		return null;
	}

	private HistoNode search(Comparable data, HistoNode tree) {
		return null;
	}

	public String toString() {
		return "";
	}

	private String toString(HistoNode tree) {
		return "";
	}
}