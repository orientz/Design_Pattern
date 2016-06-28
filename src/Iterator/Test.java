package Iterator;

/**
 * Created by wb-cengyanyu on 2016/6/28.
 */
public class Test {
    public static void main(String[] args) {
        Collection collection=new MyCollection();
        Iterator it =collection.iterator();
        System.out.println(collection.size());
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
