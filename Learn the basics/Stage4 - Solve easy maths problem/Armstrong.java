class Armstrong{
    public static void main(String args[]){
        int n = 153,m=n,sum=0;
        int nm = String.valueOf(n).length();
        while(n>0){
            sum+=Math.pow(n%10,nm);
            n/=10;
        }
        System.out.println(sum==m?sum: "Not an Armstrong number");
    }
}