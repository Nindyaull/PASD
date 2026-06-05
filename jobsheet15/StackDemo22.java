package jobsheet15;

import java.util.Stack;

public class StackDemo22 {
    public static void main(String[] args) {
        Book22 book1 = new Book22("1234", "Dasar Pemrograman");
        Book22 book2 = new Book22("7145", "Hafalan Shalat Delisa");
        Book22 book3 = new Book22("3562", "Muhammad Al-Fatih");

        Stack<Book22> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book22 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book22 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book22 book : books) {
            System.out.println(book.toString());
            System.out.println(books);
        }
    }
}
