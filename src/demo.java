import java.lang.reflect.Field;

interface IPerson {
    void info();
}

public class demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Person per = new Person("张三", 18);
        per.info();
        Class clazz = Class.forName("Person");
        Field[] fields = clazz.getFields();
        Field declaredFields [] = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("**************");
        for (Field fd : declaredFields){
            System.out.println(fd);
        }
    }
}

class Person implements IPerson {
    public String name;
    public int age;
    private double weight;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 70.00;
    }

    @Override
    public void info() {
        System.out.println("name = " + name + "; age = " + age);
    }
}

