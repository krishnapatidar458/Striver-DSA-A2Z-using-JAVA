class Nno{
    public static void main(String args[]){
        number();
    }
    static int i = 1,n=10;
    static void number(){
        if(i>n)
            return;
        System.out.println(i);
        i++;
        number();
    }
}