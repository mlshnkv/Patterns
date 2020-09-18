package patterns.Structural.Composite;

public class CompositeApp {
    public static void main(String[] args) {
        Composite mainComposite = new Composite();
        Composite subComposite1 = new Composite();
        Composite subComposite2 = new Composite();

        subComposite1.addComponent(new Leaf());
        subComposite1.addComponent(new Leaf());
        mainComposite.addComponent(subComposite1);
        subComposite2.addComponent(new Leaf());
        subComposite2.addComponent(new Leaf());
        mainComposite.addComponent(subComposite2);
        mainComposite.operation();
    }
}
