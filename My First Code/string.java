// public class string {
//     public static void main(String[] args){
//         String name = "KUNAL";
//         String name1 = "BHUMI ";
//         System.out.println(name +" "+ name1);

//     }
    
// }

//-----------------------------------------------------------------------------------------------------------------------------------
// import java .util.*;
// public class string{
//     public static void main (String[] args ){
//         Scanner Sc = new Scanner (System.in);
//         System.out.println("Enter your String length:");
//         int Stringlength = Sc.nextInt();
//        String[] name = new String[Stringlength];
        
//         {
//             System.out.println("Enter your String Data:");
//         for(int i=0; i<Stringlength; i++){
//             name[i] = Sc.nextLine();
           
//         }
//         for(int i=0; i<Stringlength; i++){
//             System.out.println(name[i]);
//         }
        
//     }
// }
// }

//-----------------------------------------------------------------------------------------------------------------------------------

// import java.util.*;

// public class string {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Kitni Strings enter karni hain?");
//         int stringLength = sc.nextInt();

//         sc.nextLine(); // Enter ko consume karega

//         String[] name = new String[stringLength];

//         // Input
//         for (int i = 0; i < stringLength; i++) {
//             System.out.print("Enter String " + (i + 1) + ": ");
//             name[i] = sc.nextLine();
//         }

//         // Output
//         System.out.println("\nYour Strings are:");

//         for (int i = 0; i < stringLength; i++) {
//             System.out.println(name[i]);
//         }

//         sc.close();
//     }
// }