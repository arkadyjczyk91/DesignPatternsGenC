package iterator;

public interface Iterator {
    public boolean hasNext();
    public Object next();
    public interface Container {
        public Iterator getIterator();
    }

}

