package task.solid.demo;

public class Booker extends Book{
    private String color;

    public Booker(String name, String author, String text , String color) {
        super(name, author, text);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
