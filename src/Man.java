import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GOval;

public class Man extends GCompound {
    private GLine rope, pole, top,base,armR,armL,legR,legL,body;
    private GOval head;

    public Man(){
        rope = new GLine(50,0,50,30);
        top = new GLine(50,0,120,0);
        pole = new GLine(120,0,120,200);
        base = new GLine(0,200,240,200);
        add(rope);
        add(top);
        add(pole);
        add(base);
        head = new GOval(30,30);
        add(head,(rope.getEndPoint().getX()-(head.getWidth()/2)),rope.getEndPoint().getY());
        body = new GLine(rope.getEndPoint().getX(),rope.getEndPoint().getY()+head.getHeight(),rope.getEndPoint().getX(),rope.getEndPoint().getY()+head.getHeight()+(pole.getHeight()/3));
        add(body);
    }
}
