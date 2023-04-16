package inheritance;

public class Square extends Rectangle{
    public Square(){
    }
    public Square(double side){
      super(side,side);
    }
    public Square(String color,boolean filled,double side){
        super(color,filled,side,side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double width){//gias tri cua side = doi so truyen vao width
        setSide(width);
    }
    public void setLength(double length){//gias tri cua side = doi so truyen vao width
        setSide(length);
    }
    public String toString(){
      return "A Square with side="+getSide()+", which is a subclass of"+ super.toString();
    }
}
