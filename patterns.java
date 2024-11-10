public class patterns {
    static void p1(){
        int n = 5 ; 
        for(int i = 1  ; i  <= n; i++){
            for(int j =  1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void p2(){
        int n = 5 ; 
        for(int i = 1  ; i  <= n; i++){
            for(int j =  i ; j >= 1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }   
    static void p3(){
        int n = 5 ; 
        for(int i = n  ; i  >= 1; i--){
            for(int j =  1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void p5(){
        int n = 5 ; 
        for(int i = n  ; i  >= 1; i--){
            for(int j =  n ; j >= i ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void p4(){
        int n = 5 ; 
        for(int i = 1 ; i<=n ; i++){
            for(int j = i  ; j<=n ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void p6(){
        int n = 5;
        for(int i = n ; i>=1 ; i--){
            for(int j = i  ; j<=n ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        // for(int i = 1 ; i<=n ; i++){
        //     for(int j = i ; j>=1 ; j--){
        //         System.out.print(n-j+1);
        //     }
        //     System.out.println();

        }

    static void p7(){
        for(int i = 5 ; i >=1 ;i--){
            for(int j = 1; j<=i ; j++){
                System.out.print(5-j+1);
            }
            System.out.println();
        }
    }
    static void p8(){
        for(int i = 5  ; i>=1 ; i--){
            for(int j = i ; j >=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    //    p1();
    //    p2();
    //    p3();
    //    p5();
    //    p4();
       p6();
       p7();
       p8();
       
    }
}
