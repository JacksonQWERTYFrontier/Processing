float x,y,vx,vy, g;
color newColor;

ArrayList<Ball> ballList = new ArrayList<ball>();

void setup() {
  size(800,600);
  g = 0.5;
  for (int i = 0; i< 10; i++) {
  x = random(width);
  y = random(height);
  radius = random(40);
  vx = random(21) - 10;
  vy = random(21) - 10;
  newColor = color(random(256), random(256), random(256));
  Ball one = new Ball(x,y, radius, vx, vy, 0, 0, newColor);
  ballList.add(one);
  
}


void draw() {
  background(0);
  stroke(255);
  line(0, height * 7/8, width, height * 7/8);
  fill(300,75,250);
  for(Ball ball:ballList) {
    one.drawBall();
    one.moveBall();
}
