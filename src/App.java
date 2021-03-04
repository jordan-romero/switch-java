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

        int switchValue = 4; 

        switch(switchValue) {
            case 1: 
                System.out.println("value was 1");
                break; 
            case 2: 
                System.out.println("value was 2");
                break; 
            case 3: case 4: case 5: 
                System.out.println("greater than 2 less than 6");
                break; 
            default:
                System.out.println("other");
                break; 
        }

        char character = 'A';
        
        switch (character) {
            case 'A': 
                System.out.println("A");
                break;
            case 'B': 
                System.out.println("B");
                break;
            case 'C': 
                System.out.println("C");
                break;
            case 'D': 
                System.out.println("D");
                break;
            case 'E': 
                System.out.println("E");
                break;
            default: 
                System.out.println("not found");
                break;
        }

        String month = "March"; 

        switch(month) {
            case "March": 
                System.out.println("SPRING");
        }
    }
}
