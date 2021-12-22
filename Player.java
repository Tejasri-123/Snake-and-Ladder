
public class Player {
    private String name;
    private int position = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int currentposition) {
        this.position = currentposition;
    }

    public int getPosition() {
        return position;
    }
}