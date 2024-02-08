class interfaceExample implements addition{
    public void display(){
        int sum = a+b;
        System.out.println("Sum :" +sum);
    }
    public static void main(String[] args)
{
    interfaceExample obj = new interfaceExample();
    obj.display();
}
    
}

interface addition{
    int a = 20;
    int b=30;
    public void display();
}
