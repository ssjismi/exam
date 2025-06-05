import java.util.*;

interface Readable {
    void read();
}

interface Writable {
    void write();
}

class Book implements Readable, Writable {
    String title;

    Book(String title) {
        this.title = title;
    }

    public void read() {
        System.out.println("the read is" + title);
    }

    public void write() {
        System.out.println("the write is:" + title);
    }

}

class Third {
    public static void main(String[] args) {
        Book b1 = new Book("hello");
        b1.read();
        b1.write();
    }
}