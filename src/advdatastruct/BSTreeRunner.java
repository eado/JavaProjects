//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class BSTreeRunner {
   public static void main(String args[]) {
      // add test cases here
      BinarySearchTree bs = new BinarySearchTree();
      bs.add(90);
      bs.add(80);
      bs.add(100);
      bs.add(70);
      bs.add(85);
      bs.add(98);
      bs.add(120);
      bs.inOrder();
      bs.preOrder();
      bs.postOrder();
      bs.revOrder();

      out.println(bs.getNumLeaves());

      out.println(bs.getWidth());

      out.println(bs.getNumNodes());

      out.println(bs.isFull());
   }
}