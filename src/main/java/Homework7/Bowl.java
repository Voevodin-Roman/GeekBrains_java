package Homework7;

public class Bowl {
    private int feed;
    public Bowl(int feed) {
        if (feed < 0){
            System.out.println("Корма не можект быть меньше нуля");
        }else {
            this.feed = feed;
        }
    }
    public int getFeed() {
        return feed;
    }
    public  void info(){
        System.out.println("В кошачьей миске " + feed + " единиц корма");
    }
    public void decreaseFeed(int n){
        if( n <= feed) {
            feed -= n;
        }
    }
    public void addingFeed(int n){
        if( n >= 0) {
            feed += n;
            System.out.println("Положили в миску еще " + n + " единиц корма.");
        }else {
            System.out.println("Нельзя добавить отрицательное количество еды!");
        }
    }

}
