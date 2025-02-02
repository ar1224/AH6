import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    // todo
    
      List<String> arr = new ArrayList<>();
      while(head != null){
        arr.add(head.val);
        head = head.next;
      }   
          
    return arr;
  }

  public static void main() {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;
  

    // a -> b -> c -> d

    Solution.linkedListValues(a); 
    // -> [ "a", "b", "c", "d" ]
  }
}
