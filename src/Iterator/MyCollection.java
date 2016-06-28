package Iterator;

/**
 * Created by wb-cengyanyu on 2016/6/28.
 */
public class MyCollection implements Collection {
    public String string[] = {"A","B","C","D","E"};
    public Iterator iterator(){
        return new Myiterator(this);
    }
    public int size(){
        return string.length;
    }
    public Object get(int i){
        return string[i];
    }
}
