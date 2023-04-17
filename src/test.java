// import java.util.ArrayList;

// abstract class LibraryResource {
// private String title;
// private String publisher;
// private int year;

// public LibraryResource(String title, String publisher, int year) {
// this.title = title;
// this.publisher = publisher;
// this.year = year;
// }

// public String getTitle() {
// return title;
// }

// public String getPublisher() {
// return publisher;
// }

// public int getYear() {
// return year;
// }

// abstract void checkOut();

// abstract void checkIn();
// }

// class Book extends LibraryResource {
// private String author;
// private boolean isFiction;

// public Book(String title, String publisher, int year, String author, boolean
// isFiction) {
// super(title, publisher, year);
// this.author = author;
// this.isFiction = isFiction;
// }

// public String getAuthor() {
// return author;
// }

// public boolean isFiction() {
// return isFiction;
// }

// @Override
// void checkOut() {
// // Implement check-out logic for books
// }

// @Override
// void checkIn() {
// // Implement check-in logic for books
// }
// }

// class Magazine extends LibraryResource {
// private String editor;
// private int issueNumber;

// public Magazine(String title, String publisher, int year, String editor, int
// issueNumber) {
// super(title, publisher, year);
// this.editor = editor;
// this.issueNumber = issueNumber;
// }

// public String getEditor() {
// return editor;
// }

// public int getIssueNumber() {
// return issueNumber;
// }

// @Override
// void checkOut() {
// // Implement check-out logic for magazines
// }

// @Override
// void checkIn() {
// // Implement check-in logic for magazines
// }
// }

// class DVD extends LibraryResource {
// private String director;
// private int length;

// public DVD(String title, String publisher, int year, String director, int
// length) {
// super(title, publisher, year);
// this.director = director;
// this.length = length;
// }

// public String getDirector() {
// return director;
// }

// public int getLength() {
// return length;
// }

// @Override
// void checkOut() {
// // Implement check-out logic for DVDs
// }

// @Override
// void checkIn() {
// // Implement check-in logic for DVDs
// }
// }

// class User {
// private String name;
// private ArrayList<LibraryResource> borrowedResources;

// public User(String name) {
// this.name = name;
// this.borrowedResources = new ArrayList<>();
// }

// public User(String string, int i) {
// }

// public void borrowResource(LibraryResource resource) {
// borrowedResources.add(resource);
// resource.checkOut();
// }

// public void returnResource(LibraryResource resource) {
// borrowedResources.remove(resource);
// resource.checkIn();
// }

// public ArrayList<LibraryResource> getBorrowedResources() {
// return borrowedResources;
// }
// }

// public class LibraryManagementSystem {
// public static void main(String[] args) {
// Book book1 = new Book("To Kill a Mockingbird", "HarperCollins", 1960, "Harper
// Lee", true);
// Magazine magazine1 = new Magazine("National Geographic", "National Geographic
// Society", 1888, "Susan Goldberg", 1);
// DVD
