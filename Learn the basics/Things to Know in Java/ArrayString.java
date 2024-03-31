class ArrayString{
    public static void main(String[] args){
        String [] str = {"Hello","World"};
        System.out.println("Original array:");
        displayArray(str);
    }
    
    //Function to print the elements of an array 
    public static void displayArray(String arr[]) {    
        int n = arr.length;  
        for(String s : arr){
            System.out.print(s + " ");        
        }
    }
}