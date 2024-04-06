import java.util.Scanner;
import java.io.*;
class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        // rectangle(sc);
        // halfpyramid(n);
        // halfNumpyramid(n);
        // halfNumSempyramid(n);
        // RevcHalfpyramid(n);
        // RevcHalfNumpyramid(n);
        // Pyramid(n);
        // RevPyramid(n);
        // Dimond(n);
        // HalfDiomand(n);
        // ZerOne(n);
        // NumSpace(n);
        // Num(n);
        // Abhalf(n);
        // RevAbhalf(n);
        // RepAbhalf(n);
        // AbPyramid(n);
        // EhalfPyramid(n);
        // EmptyDimond(n);
        // butterfly(n);
        // EmptySqure(n);
        BHULBULLAIYA(n);
    }
    public static void rectangle(Scanner sc){
        System.out.print("Enter the number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void halfpyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void halfNumpyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void halfNumSempyramid(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void RevcHalfpyramid(int m){
        for(int i=0;i<m;i++){
            // System.out.println(i);
            for(int j=m-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void RevcHalfNumpyramid(int m){
        for(int i=0;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pyramid(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void RevPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Dimond(int n) {
        int m=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Reverse Diamond
        for(int i=m;i>=1;i--){
            for(int j=m-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void HalfDiomand(int n){
        int m=1;
        for(int i=1;i<=n*2-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }
            else if(i>n){
                // int dec = n-m;
                for(int j=n-m;j>=1;j--){
                    System.out.print("*");
                }
                m++;
            }
            // count++;
            System.out.println();
        }
    }
    public static void ZerOne(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2!=0){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
    public static void NumSpace(int n){
        int sp = n*2-2;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            sp-=2;
        }
    }
    public static void Num(int n){
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
    static void Abhalf(int n){
        for(int i=1;i<=n;i++){
            char c = 'A';
            for(char j=1;j<=i;j++){
                System.out.print(c++ +" ");
            }
            System.out.println();
        }
    }
    static void RevAbhalf(int n){
        for(int i=n;i>=1;i--){
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c++ +" ");
            }
            System.out.println();
        }
    }
    static void RepAbhalf(int n){
        char c='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c +" ");
            }
            c++;
            System.out.println();
        }
    }
    static void AbPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            char c='A';
            for(int j=1;j<=2*i-1;j++){
                if(j<i){
                    System.out.print(c++ +" ");
                }else{
                    System.out.print(c-- +" ");
                }
            }
            System.out.println();
        }
    }
    static void EhalfPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j<=n;j++){
                // char c= 'A';
                System.out.print((char) ('A'+j-1) +" ");
            }
            System.out.println();
        }
    }
    static void EmptyDimond(int n){
        int sp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            sp+=2;
            System.out.println();
        }
        sp=n*2-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            sp-=2;
            System.out.println();
        }
    }
    static void butterfly(int n){
        int sp = n*2-2;
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=sp;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            sp-=2;
            System.out.println();
        }
        sp=0;
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            sp+=2;
            System.out.println();
        }
    }
    static void EmptySqure(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || j==n || i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void BHULBULLAIYA(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==n||i==1||j==1)
                    System.out.print(n+" ");
                else if(i==n-1||j==n-1||i==2||j==2)
                    System.out.print(n-1+" ");
                else if(i==n-2||j==n-2||i==3||j==3)
                    System.out.print(n-2+" ");
                else if(i==n-3||j==n-3||i==3||j==3)
                    System.out.print(n-3+" ");
            }
            System.out.println();
        }
    }
}