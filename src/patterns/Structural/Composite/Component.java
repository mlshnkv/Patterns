package patterns.Structural.Composite;

public interface Component {
    default void operation(){
        System.out.println(getClass().getSimpleName());
    }
}
