package Iterator;

/**
 * Created by wb-cengyanyu on 2016/6/28.
 */
public  class Myiterator implements Iterator {
    private Collection collection;
    int pos=-1;
    public Myiterator(Collection collection){
        this.collection=collection;
    }

    @Override
    public Object next() {
        if(pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public Object previous() {
        if(pos>0){
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object first() {
        pos=0;
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1)
            return true;
        else
            return false;
    }
}
