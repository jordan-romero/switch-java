public class App {
    public static void main(String[] args) {
        // int value = 1; 
        // if(value == 1) {
        //     System.out.println("value was 1");
        // } else if (value == 2) {
        //     System.out.println("value was 2");
        // } else {
        //     System.out.println("value was greater than 2");
        // }

        int switchValue = 2; 

        switch(switchValue) {
            case 1: 
                System.out.println("value was 1");
                break; 
            case 2: 
                System.out.println("value was 2");
                break; 
            default:
                System.out.println("other");
                break; 
        }
    }
}
