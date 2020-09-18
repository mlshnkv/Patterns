package patterns.Bridge;

public abstract class Program {
    Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    void developProgram() {
        System.out.println("Developing " + getClass().getSimpleName());
        developer.writeCode();
    }
}
