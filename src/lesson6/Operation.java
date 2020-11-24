package lesson6;

public class Operation extends Thread {

    private String operationName;
    private int operationTime;

    public Operation() {
    }

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }


    public void run(){
        try{
            System.out.println("operation " + operationName + ":started");

            for (int i= 1; i<=operationTime;i++){
                System.out.println("operation " + operationName + ":" + i + " seconds");
                Thread.sleep(1000);
            }
            System.out.println("operation " + operationName + " :finished");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
