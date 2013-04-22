package refle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import refle.Refle;

/**
 * Created by bungubbang
 * Email: bungubbang57@gmail.com
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // Class refle = Class.forName("refle.Refle");
        // Class refle = Refle.class;

        Refle cons = new Refle();
        Class refle = cons.getClass();


        // Fields
        System.out.println("==== Field ====");

        Field[] fields = refle.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
        System.out.println("");

        Field[] declaredFields = refle.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
        System.out.println("");


        // Constructor
        System.out.println("==== Constructor ====");
        Constructor[] constructors = refle.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }
        System.out.println("");


        // Method
        System.out.println("==== Method ====");
        Method[] methods = refle.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
        System.out.println("");


        // isEnum
        refle.isAnnotation();
        System.out.println("refle.isEnum() = " + refle.isEnum());
        System.out.println("");


        // isInterface
        refle.isInterface();
        System.out.println("refle.isInterface() = " + refle.isInterface());
        System.out.println("");


        // getSuperclass
        refle.getSuperclass();
        System.out.println("refle.getSuperclass() = " + refle.getSuperclass());
        System.out.println("");



        // newInstance
        Object newRefle = refle.newInstance();
        System.out.println("newInstance = " + newRefle);
        System.out.println("new Class = " + new Refle());

        // * 물론 Constructor 를 받고 args를 삽입하는것도 가능하다.
    }
}
