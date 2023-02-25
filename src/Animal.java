public class Animal {
    private String name;
    private int positionX;
    private int positionY;

    public Animal(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void moveDownAndLeft(){
        setPositionY(getPositionY() - 1);
        setPositionX(getPositionX() - 1);
        tellPosition();
    }

    public void moveUpandRight(){
        setPositionY(getPositionY() + 1);
        setPositionX(getPositionX() + 1);
        tellPosition();
    }

    public void tellPosition(){
        System.out.println("I am the " + getName() + " I am on square " + getPositionX() + ", " + getPositionY());
    }
    public void tellPositionSnakeKill(){
        System.out.println("I am the " + getName() + ", I am now standing on square " + getPositionX() + ", " + getPositionY());
        System.out.println(Colors.ANSI_RED + "Ahrrr I am eating you ha ha ha");
    }

    public void game(Animal rabbit, Animal snake){
        System.out.println("Welcome To Little Animal Horror ZOO");
        System.out.println("--------------------------");

       do {
           rabbit.moveUpandRight();
           snake.moveDownAndLeft();

           try {
               Thread.sleep(1000); // pause for 1 seconds
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           if (snake.getPositionY() - rabbit.getPositionY() <= 1){
               System.out.println("Nooooo please dont eat me snake");
               snake.tellPositionSnakeKill();
               break;
           }
       } while (true);

    }
}
