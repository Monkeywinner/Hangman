import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GOval;

public class Man extends GCompound {
    private GLine rope, pole, top,base,armR,armL,legR,legL,body;
    private GOval head;

    public Man(int x){
        rope = new GLine(x/2,0,x/2,x/3);
        top = new GLine(x/2,0,x*1.2,0);
        pole = new GLine(x*1.2,0,x*1.2,x*2);
        base = new GLine(0,x*2,x*2.4,x*2);
        add(rope);
        add(top);
        add(pole);
        add(base);
        head = new GOval(x/3,x/3);
        add(head,(rope.getEndPoint().getX()-(head.getWidth()/2)),rope.getEndPoint().getY());
        body = new GLine(rope.getEndPoint().getX(),rope.getEndPoint().getY()+head.getHeight(),rope.getEndPoint().getX(),rope.getEndPoint().getY()+head.getHeight()+(pole.getHeight()/3));
        add(body);
        armL = new GLine(body.getX(),body.getEndPoint().getY()-(body.getY()*.75),body.getY()-(x*.5),body.getEndPoint().getY()-(body.getY()*1.25));
        add(armL);
        armR = new GLine(body.getX(),body.getEndPoint().getY()-(body.getY()*.75),body.getY()+(x*.5),body.getEndPoint().getY()-(body.getY()*1.25));
        add(armR);
        legR = new GLine(body.getX(),body.getEndPoint().getY(),body.getY()+top.getWidth()*.25,body.getEndPoint().getY()+(body.getY()*.5));
        add(legR);
        legL = new GLine(body.getX(),body.getEndPoint().getY(),body.getY()-top.getWidth()*.5,body.getEndPoint().getY()+(body.getY()*.5));
        add(legL);
    }
}
