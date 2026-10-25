class Animal
{
    void sound()
    {
        System.out.println("Animal Sound");
    }
}
    class Dog extends Animal
    {
      
        void sound()
        {
            System.out.println("Dog Sound");
        }
    }

    class Cat extends Animal
    {
       
        void sound()
        {
            System.out.println("Cat Sound");
        }
    }



public class PolymorMethodOR
{
  public static void main(String[] args)
  {
     
    Animal a;
    a = new Dog();
    a.sound();
    a = new Cat();
    a.sound();
  }
}