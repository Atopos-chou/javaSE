package abstractClasses;

/**
 * @author 13033
 */
public abstract class Person {

    /**
     * 获取个人详细描述
     * @return 个体描述
     */
    public abstract String getDescription();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
