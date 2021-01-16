import java.util.*;

@SuppressWarnings("unchecked")

public class MyArrayListStack<E> implements StackInterface<E> {
   
   //data members
   private ArrayList<E> s;
   private int top;
   
   private int capacity;
   public static final int CAPACITY = 12; //default capacity
   
   //default constructor
   public MyArrayListStack() {
      this(CAPACITY);
   }
   
   //overloaded constructor
   public MyArrayListStack( int n ) {
      capacity = n;
      top = -1;
      s = new ArrayList<E>(capacity);
   }
   
   //implement size() method
   public int size() {
      return top + 1;
      
      //return s.size(); also works
   }
   
   //implement isEmpty() method
   public boolean isEmpty() {
      if( top == -1 )
         return true;
      else
         return false;
   }
   
   //implement peek() method
   public E peek() throws EmptyStackException {
      if( isEmpty() )
         throw new EmptyStackException("Empty Stack");
      
      return s.get(top);
   }
   
   //implement push() method
   public void push(E element) {
      top++;
      s.add( top, element );
      
      //s.add( ++top, element ); also works
   }
   
   //implements pop() method
   public E pop() throws EmptyStackException {
      if( isEmpty() )
         throw new EmptyStackException("Empty Stack");
      
      E temp = s.remove(top);
      
      top--;    //E temp = s.remove( top-- ); also works
      
      return temp;
   }
   
   public String toString() {
      
      String result = "[";
      
      for(int i = s.size()-1; i>=0; i--) {
         result += s.get(i) + ", ";
         
      }
      
      return result + "]";
   }
   
}//end of class













