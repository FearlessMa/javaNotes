package chapter0;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class exampleList {
  public static void main(String[] args) {
    // LearnArrayList arrList = new LearnArrayList();
    // arrList.init();
    LearnLinkedList linkedList = new LearnLinkedList();
    linkedList.init();
  }
}

class LearnArrayList {

  public void init() {
    System.out.println("----ArrayList----");
    ArrayList<Object> arrList = new ArrayList<Object>();
    // 增加元素
    arrList.add(1);
    arrList.add("2");
    arrList.add("3");
    arrList.add(4);
    // foreach 遍历
    // for (Object item : arrList) {
    // System.out.println(item);
    // }

    System.out.println("arrList=" + arrList);
    // 获取指定index值
    Object a = arrList.get(0);
    System.out.println(a);
    // 是否包含元素
    boolean has1 = arrList.contains(1);
    System.out.println(has1);
    // 删除元素
    Object removeObj = arrList.remove(0);
    System.out.println("removeObj:" + removeObj);
    // 是否包含元素
    boolean has = arrList.contains(1);
    System.out.println(has);

    // foreach(arrList);
    System.out.println(arrList);

    // 根据索引替换元素
    Object preEle = arrList.set(0, 5);
    System.out.println("被替换的值为：" + preEle);

    // foreach(arrList);
    System.out.println(arrList);

    // 获取元素index
    int index = arrList.indexOf(4);
    System.out.println("4的index =" + index);
    // 截取新的 List
    List<Object> newList = arrList.subList(1, arrList.size());
    System.out.println(newList);
    foreach(newList);

    // 判断是否为空
    boolean isEmpty = arrList.isEmpty();
    System.out.println("isEmpty = " + isEmpty);

    newList.add(5);
    boolean isEquals = newList.equals(arrList);
    System.out.println("newList = " + newList);
    System.out.println("arrList = " + arrList);
    System.out.println("isEquals = " + isEquals);

    System.out.println("--- end ----");
  }

  public <T extends List<Object>> void foreach(T list) {
    System.out.println("***当前ArrayList元素***");
    for (Object item : list) {
      System.out.println(item);
    }
    System.out.println("*** end ***");
  }
}

class MyArrayList {

  ArrayList<Object> arrList;

  MyArrayList() {
    ArrayList<Object> arr = new ArrayList<Object>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    this.arrList = arr;
  }

  public void forEach() {
    for (int i = 0; i < this.arrList.size(); i++) {
      // callBcak(i,this.arrList.get(i));
    }
  }
}

class LearnLinkedList {

  public void init() {
    System.out.println("---LinkedList---");
    LinkedList<Object> linkedList = new LinkedList<Object>();
    linkedList.add(1);
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    System.out.println("linkedList = " + linkedList);
  }

}
