import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
 private ArrayList<T> list;
 public Heap() {
     list = new ArrayList<>();
 }

 private void swap(int first, int second ) {
     T temp  =list.get(first);
     list.set(first , list.get(second));
     list.set(second , temp);
 }
 private int parent(int index) {
     return (index - 1) / 2;
 }
 private int left(int index) {
     return index*2 +1;
 }
  private int right(int index) {
     return index*2 + 2;
  }

  //INSERTION INSIDE THE HEAP
    public void insert(T value ) {
     list.add(value);
     upheap(list.size()-1);
    }
    public void upheap(int index) {
     if(index==0) {
         return;
     }
     int p=parent(index);
     if(list.get(index).compareTo(list.get(p)) < 0) {
         swap(index,p);
         upheap(p);
     }

    }
}
