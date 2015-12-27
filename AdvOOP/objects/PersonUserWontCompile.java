// コンパイルできない
package objects;
public class PersonUserWontCompile {
    public static void main(String[] args) {
        Person buck = Person.apply("Buck Trends", 100); // エラー
        System.out.println(buck);
    }
}
