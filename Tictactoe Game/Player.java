public class Player {
    private String name;
    private int mark; // 'X' or 'O'

    public Player(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
} 
