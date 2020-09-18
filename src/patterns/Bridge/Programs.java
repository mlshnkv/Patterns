package patterns.Bridge;

public class Programs {
    public static void main(String[] args) {
        Program[] programs = {new Banking(new JavaDeveloper()), new Game(new CppDeveloper())};
        for (Program program : programs) {
            program.developProgram();
        }
    }
}
