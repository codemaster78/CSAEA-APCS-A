public class Book {
    private String Subject;
    private boolean Fiction;
    private int PageCt;
    private int ChapCt;
    public int CurrentPage = 0;
    public double price;
    private int VolNum;

    public Book(String Subject, boolean Fiction, double price, int PageCt, int ChapCt){
        this.Subject = Subject;
        this.Fiction = Fiction;
        this.price = price;
    }

    public void read(int pages){

        //System.out.println("Page "+CurrentPage+" -> "+CurrentPage+pages);

        CurrentPage += pages;

        if(CurrentPage>PageCt){
            VolNum += 1;
            PageCt = 0;
            pages = 0;
        }
        System.out.println("Page "+(CurrentPage-pages)+" -> "+CurrentPage);
    }

    public void bookInfo(){
        System.out.println("Subject: "+Subject+"\nPage Count: "+PageCt+"\nIs Fiction: "+Fiction+"\nChapter Count: "+ChapCt+"\nCurrent Page: "+CurrentPage+"\nPrice: "+price+"\nVolume Number: "+VolNum+"\n");
    }

    public void discount(double percentage){
        
        System.out.println("Price "+price+" -> "+(price*percentage/100));
        price*=(percentage/100);
        
    }
    public void setPageCount(int count){
        PageCt = count;
        System.out.println("Page Count: "+count);
    }
}
