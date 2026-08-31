// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//          for(int i = 1;i<=n;i++){
//             for(int j = 1;j<= m;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//          }
//     }
// }

//--------------------------------------------------------------------------------------------------------------

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//         for(int i = 1 ;i<=n;i++){
//             for(int j =1 ;j<=m;j++){
//                 if(j==1||j==5||i==1||i==4){
//                     System.err.print("*");
//                 }else{
//                     System.out.print(" ");

//                 }
//                 }
//                 System.out.println();
//             }
//         }
//     }

//--------------------------------------------------------------------------------------------------------------   

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 4 ;
//         for(int i =1 ;i<=n;i++){
//             for(int j = 1;j<=i;j++){
//              System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//-------------------------------------------------------------------------------------------------------------


// import java .util.*;
// public class Patterns {
//     public static void main(String[] args) {
//         int n=10;
//         for(int i=n;i>=1;i--){
//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }  
// }

//-------------------------------------------------------------------------------------------------------------

// import java.util.*;
// public class Patterns {

//     public static void main(String[] args) {
//         int n =4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");

//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// } 

//-------------------------------------------------------------------------------------------------------------


// public class Patterns {

//     public static void main(String[] args) {
        
//         int n = 5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+"");
//             }
//             System.out.println();
//         }
//     }
// }

//-------------------------------------------------------------------------------------------------------------

// public class Patterns {

//     public static void main(String[] args) {
        
//         int n =5;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j);

//             }
//             System.out.println();
//         }
//     }
//  }
   
//-------------------------------------------------------------------------------------------------------------

// public class Patterns {

//     public static void main(String[] args) {
         
//         int n = 5 ;

//         for(int i = 1;i<=n;i++){
//             for(int j=1 ;j<=i;j++){
//                 System.out.print(j+" ");
                
            
//             }
//             System.out.println();
//         }
//     }
// }

//-------------------------------------------------------------------------------------------------------------

//     public class Patterns {
    
//         public static void main(String[] args) {
//              int n =5;
                
//              for(int i=1;i<=n;i++){
//              for(int j=1;j<=i;j++){
//                 int sum =i+j;

//                 if( sum%2==0){

//                     System.out.print("1 ");
//                 }else{
//                     System.out.print("0 ");    
//                 }     
//             }
//             System.out.println();
//         }
//     }
// }               

 // START---------------------------------------------------------------------------------------------------------
    
// public class Patterns {

//     public static void main(String[] args) {
        
//         int n=15;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");

//             }
//             int spaces=2*(n-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//         for(int i=n;i>=1;i--){

        
//         for(int j=1;j<=i;j++){
//                 System.out.print("*");

//             }
//             int spaces=2*(n-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
    
//-----------------------------------------------------------------------------------------------------------

// public class Patterns {

//     public static void main(String[] args) {

//         int n = 25
//     ;  // upar ke half-heart ka size control karega

//         // Upper part (do semi-circles)
//         for (int i = n / 3; i <= n; i += 2) {
//             // left spaces
//             for (int j = 1; j < n - i; j += 2) {
//                 System.out.print(" ");
//             }
//             // left stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("^");
//             }
//             // middle spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // right stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("^");
//             }
//             System.out.println();
//         }

//         // Lower part (inverted pyramid)
//         for (int i = n; i >= 1; i--) {
//             for (int j = i; j < n; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= (i * 2) - 1; j++) {
//                 System.out.print("^");
//             }
//             System.out.println();
//         }
//     }
//}
//---------------------------------------------------------------------------------------------------------
// public class Patterns {

//     public static void main(String[] args) {
//         int n=35;
//         for(int i =1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");

//             }
//             int m=60;
//             for(int j=1;j<=m;j++){
//                 if(j%5==0){
//                     System.out.print("#");
//                 }else{
//                 if(j==1){
//                     System.out.print("#"+" ");
//                 }else{
//                 if(j==m||i==1){
//                     System.out.print("#"+" ");
                 
//                 }else{
//                 if(i%5==0){
//                     System.out.print("#"+" ");
//                 }
                
//             else {
//                 System.out.print("  ");}
//             }
//         }
//     }
// }    
//      System.out.println(); 
//     }
// }
// }

//---------------------------------------------------------------------------------------------------------
// public class Patterns {

//      public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=n-1;j>=i;j--){
//                 System.out.print(" ");
            
//         }
//             for(int j=1;j<=5;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//      }
// }
// }
    
// public class Patterns {

//      public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
            
//         }
//             for(int j=1;j<=5;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//      }
// }
// }

//--------------------------------------------------------------------------------------------------------
    
// public class Patterns {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
            
//         }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//      }
//     }
// }

//--------------------------------------------------------------------------------------------------------

// public class Patterns {

//     public static void main(String[] args) {
//         int n=5;
//         int number=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(number+" ");
//                 number++;
            
//         }
            
//             System.out.println();
//      }
//     }

    
// }

//--------------------------------------------------------------------------------------------------------

// public class Patterns {

//     public static void main(String[] args) {
//         int n=20;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }    
//             for(int j=2;j<=i;j++){
//                 System.out.print("*");
//             }
//         System.out.println();
//     }
//     for(int i=1;i<=n;i++){
//             for(int j=2;j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=n;j>=i;j--){
//                 System.out.print("*");
//             }    
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("*");
//             }
//         System.out.println();
//       }
//    }
//}

// //--------------------------------------------------------------------------------------------------------

// import java.util.*;

// public class Patterns {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         for(int i=1; i<=a; i++){
//             for(int j=1; j<=a; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }
// }

    
    







