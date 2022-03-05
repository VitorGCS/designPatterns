package StructuralPatterns.Proxy.Example1;

//Level of indirection with a surrogate proxy object that implements the same interface as the subject object, and is responsible for controlling or enhancing access to it
public class Proxy implements ISubject{

    ISubject realSubject;

    public Proxy(){
        realSubject = new RealSubject();
    }

    @Override
    public void foo() {
        preProcessing();

        realSubject.foo();

        posProcessing();
    }

    private void preProcessing(){
        System.out.println("Some pre-processing in the proxy");
    }

    private void posProcessing(){
        System.out.println("Some pos-processing in the proxy");
    }
}
