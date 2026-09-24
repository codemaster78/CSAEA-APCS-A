public class BookTester {
    public static void main(String[] args){
        Book Joel = new Book("Biography",false,19.99);
        Book Arben = new Book("Rich",true,9.99);

        Joel.bookInfo();
         
        Arben.bookInfo();

    }
}
