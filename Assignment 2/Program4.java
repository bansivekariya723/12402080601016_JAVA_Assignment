import java.util.*;

class Book implements Comparable<Book> {
    int id;
    String name;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Book b) {
        return this.id - b.id; // sort by id
    }
}

class NameComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b1.name.compareTo(b2.name);
    }
}

 class Main4 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(2, "Java"));
        list.add(new Book(1, "Python"));

        Collections.sort(list);
        System.out.println("Sorted by ID:");
        for (Book b : list)
            System.out.println(b.id + " " + b.name);

        Collections.sort(list, new NameComparator());
        System.out.println("Sorted by Name:");
        for (Book b : list)
            System.out.println(b.id + " " + b.name);
    }
}