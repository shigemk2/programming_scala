package objects;
public class PersonUser {
    public static void main(String[] args) {
        // 次の行はコンパイルできない。
        // Person buck = Person.apply("Buck Trends", 100);
        Person buck = PersonFactory.make("Buck Trends", 100);
        System.out.println(buck);
    }
}
