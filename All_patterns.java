
public class All_patterns{
    public static void main(String[] args) {
        // Square(3);
        // pyramid(3);
        // halfpyramid(4);
        // inverted(4);
        // numberPyramid(4);
        // floydTriangle(5);
        // zeroOneTriangle(5);
        // palindromePyramid(5);
        // diamond(5);
        // decreasingTriangle(5);
        rightTriangle(5);
    }

    public static void Square(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void decreasingTriangle(int n){
    for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

    public static void diamond(int n) {

    for (int i = 1; i <= n; i++) {

        for (int k = 1; k <= n - i; k++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }

        System.out.println();
    }

    for (int i = n - 1; i >= 1; i--) {

        for (int s = 1; s <= n - i; s++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

    public static void zeroOneTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            
            if ((i + j) % 2 == 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }

        }
        System.out.println();
    }
}

public static void rightTriangle(int n){
    for(int i=1; i<=n; i++){

        for(int k=1; k<=n-i; k++){
            System.out.print(" ");
        }

        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        System.out.println();
    }
}


    public static void pyramid(int n){
          for(int i=0; i<n; i++){

            for(int k=0; k<n-i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<1*i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

        public static void numberPyramid(int n){
            for(int i=1; i<=n; i++){

                for(int k=1; k<=n-i; k++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }

    public static void floydTriangle(int n) {
    int num = 1;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
    }
}

public static void palindromePyramid(int n) {
    for (int i = 1; i <= n; i++) {

        for (int k = 1; k <= n - i; k++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }

        for (int j = i - 1; j >= 1; j--) {
            System.out.print(j);
        }

        System.out.println();
    }
}



    public static void halfpyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}