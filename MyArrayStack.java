import java.util.*;

@SuppressWarnings("unchecked")

public class MyArrayStack<E> implements StackInterface<E> {

	//data members
   private E s[];
   private int top;
   
   private int capacity;
   public static final int CAPACITY = 12; //default capacity
   
   //default constructor
   public MyArrayStack() {
      this(CAPACITY);
   }
   
   //overloaded constructor
   public MyArrayStack( int n ) {
      capacity = n;
      top = -1;
      
      s = (E[]) new Object[capacity];
   }
   
   //implement size() method
   public int size() {
      return 0;
   }
   
   //implement isEmpty() method
   public boolean isEmpty() {
         return false;
   }
   
   //implement peek() method
   public E peek() throws EmptyStackException {
      return null;
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
      
      return null;
   }
   
}//end of class













