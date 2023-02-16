package hw_06_03;

import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Born {
    int year() default 1978;
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
 @interface Gender{
     String genus() default "male";
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface MyInheritedAnnotation{
    String surname() default "Family";
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface Synopsis{
    String name() default "Victor";
    int age() default 45;
}