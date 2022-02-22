import acm.program.GraphicsProgram;

public class Hangman extends GraphicsProgram {
    private Man man;

    @Override
    public void init(){
    man = new Man(500);
        add(man);
    }

    public static void main(String[] args) {
        Hangman x = new Hangman();
        x.start();
    }
}
