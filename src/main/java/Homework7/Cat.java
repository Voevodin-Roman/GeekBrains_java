package Homework7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat (Bowl p){
        if(p.getFeed() >= appetite){
            p.decreaseFeed(appetite);
            this.satiety = true;
        }
        sated(satiety);
    }
    private void sated(boolean satiety) {
        String a = satiety ?
                name + " съел " + appetite + " единиц корма, но отвисшее до земли брюхо не позволило ему съесть больше." +
                        "\nКот наелся до отвала!" :
                name + " с презрением понюхал содержимое миски и гордо утопал прочь." +
                        "\nКот остался голодным!";
        System.out.println(a);
    }
}
