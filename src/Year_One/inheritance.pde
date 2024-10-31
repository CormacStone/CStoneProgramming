//Cormac Stone

import java.util.Scanner;

Trend food = new Trend("die");
Food tred = new Food("die ", 87);
//String s = food;
void setup ()
{
  Scanner in = new Scanner(System.in);
  println(food);
  println(tred);
  size(400,400);
  in.close();
}

void draw()
{
  color(255,255,0);
  textSize(100);
  textAlign(CENTER);
  text("400",200,200);
  //text(tred, 150,150);
}

class Trend {

  private String co;

  public Trend(String co)
  {
    this.co = co;
  }

  public String getColor()
  {
    return co;
  }
  
  public String toString()
  {
    return co;
  }
  
}

class Food extends Trend
{
  private int weight;
  
  public Food(String co, int weight)
  {
    super(co);
    this.weight = weight;
  }
  
    public String toString()
  {
    return super.getColor() + weight;
  }
}
