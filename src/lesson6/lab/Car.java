package lesson6.lab;

public class Car extends Thread {

   private String name;
   private int speed;
   private double distance;



    public Car() {
    }

    public Car(String name, int speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void run(){
       try{
           int distance = 0;

           for(int i=0;i<=distance;i++){
               System.out.println(this.name + " at " + distance + " meters");
               distance = distance + speed;
               Thread.sleep(1000);
               
           }
           System.out.println(this.name + " at " + distance + " meters");

       }catch (Exception e){
           e.printStackTrace();
       }

   }

}
