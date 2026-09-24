public class Book {
    private String Subject;
    private boolean Fiction;
    private int PageCt;
    private int ChapCt;
    public int CurrentPage = 0;
    public double price;
    private int VolNum;

    public Book(String Subject, int PageCt, boolean Fiction){
        this.Subject = Subject;
        this.PageCt = PageCt;
        this.Fiction = Fiction;
    }

    public void read(int pages){

        //System.out.println("Page "+CurrentPage+" -> "+CurrentPage+pages);

        CurrentPage += pages;

        if(CurrentPage>PageCt){
            VolNum += 1;
            PageCt = 0;
            pages = 0;
            System.out.println("book finished!");
        }
        System.out.println("Page "+(CurrentPage-pages)+" -> "+CurrentPage);
    }

    public void bookInfo(){
        System.out.println("Subject: "+Subject+"\nPage Count: "+PageCt+"\nIs Fiction: "+Fiction+"\nChapter Count: "+ChapCt+"\nCurrent Page: "+CurrentPage+"\nPrice: "+price+"\nVolume Number: "+VolNum+"\n");
    }

    public void discount(double percentage){

        if (percentage == 100){
            System.out.println("Book is FREE!");
        }
        else if (percentage == 0){
            System.out.println("Price: "+price);
        }
        else{
            System.out.println("Price "+price+" -> "+(price*percentage/100));
            price*=(percentage/100);
        }   
    }

    public void RateBook(int stars){
        if (5 <= stars && stars >= 1){
            if (stars>=){
                System.out.println("Rating: High - "+stars+"/5 stars");
            }
            else if (stars<=3){
                System.out.println("Rating: Low - "+stars+"/5 stars");
            }
        }
        else{
            System.out.println("Please give a rating from 1-5 stars");
        }
    }
}
