package hw_06_03;
/*  Создайте несколько классов, один класс наследует другой и использует аннотацию Inherited.
    Помимо этого, попробуйте ещё в проекте использовать 5 различных аннотаций.
 */

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Child individual = new Child();
        Class<?> cls = parent.getClass();
        Class<?> clsNew = individual.getClass();

        System.out.println("class: " + cls.getSimpleName());
        parent.display();

        System.out.println("class: " + clsNew.getSimpleName());
        individual.display();

        System.out.println("    ");


        try {
            Annotation[] myAnnotation = cls.getAnnotations();
            System.out.println("Для класса 'Parent' применены аннотации: ");
            for (Annotation annotationName : myAnnotation) {
                System.out.println("\t" + annotationName);
            }

            Annotation[] myAnnotationNew = clsNew.getAnnotations();
            System.out.println("\nДля класса 'Child' применены аннотации: ");
            for (Annotation annotationName : myAnnotationNew) {
                System.out.println("\t" + annotationName);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
