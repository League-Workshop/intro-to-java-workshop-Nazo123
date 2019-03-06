PImage mustache;
  PImage friend;
  PImage hat;
  
void setup(){
   friend = loadImage("friend.jpeg");
     size(800,600);
     friend.resize(width,height);
   mustache = loadImage("Moustache.png");
     mustache.resize(150,45);
     hat = loadImage("Hat.png");
      
    
}

void draw(){
  background(friend);
  if(mousePressed){
  image(mustache,370,260);
  }
  if(mouseButton == RIGHT){
  image(hat,370,600);
  
  }
 
}