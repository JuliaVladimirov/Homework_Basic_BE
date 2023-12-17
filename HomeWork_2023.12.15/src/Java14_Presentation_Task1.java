
public class Java14_Presentation_Task1 {
    public static void main(String[] args) {
       int tempereture1 = 150;
       int tempereture2 = 0;
       boolean finalResult = isWorking(tempereture1, tempereture2);
        System.out.println("The appliance is working correctly: " + finalResult);
    }
    public static boolean isWorking(int temp1, int temp2){
        boolean result;
         if (temp1 > 100 && temp2 < 100){
             result = true;
         } else {
             result = false;
         }
        return result;
    }

}