class PassbyReference_Value{
    public static void main(String value[]){
        reference a = new reference();
        a.x=10;
        a.name="krishna";
        System.out.println(a.x+", "+a.name);
        reference b;
        b=a;
        a.x=10;
        a.name="krishna";

        System.out.println("Before pass by reference : "+a.x+", "+a.name);

        b.x=121;
        b.name="krishna Patidar";

        System.out.println("After pass by reference : "+a.x+", "+a.name);
    }
}

class reference{
    int x;
    String name;  
}