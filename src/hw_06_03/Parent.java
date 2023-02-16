package hw_06_03;

@Synopsis(name = "Anna" , age = 20)
@Gender(genus = "female")
class Child extends Parent{
    @Override
    public void display() {
        System.out.println("\tВыполнился метод из класса-наследника");
    }

}
@Born
@Synopsis
@Gender
@MyInheritedAnnotation
public class Parent {

    public void display() {
        System.out.println("\tВыполнился метод из родительского класса");
    }
}
