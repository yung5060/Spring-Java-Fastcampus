package class4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class c1 = Class.forName("class4.Person");

        Person person = (Person) c1.newInstance();
        person.setName("Yung");
        person.setAge(25);
        System.out.println(person);

        Class c2 = person.getClass();

        Person person2 = (Person) c2.newInstance();
        System.out.println(person2);

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Cho"};
        Person person3 = (Person) cons.newInstance(initargs);
        System.out.println(person3);

//        Person person4 = new Person("Park");
    }
}
