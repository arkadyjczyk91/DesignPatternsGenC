package iterator;

public class Main {
    public static void main(String[] args) {
        CollectionOfNames cmpnyRepository = new CollectionOfNames();

        for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
