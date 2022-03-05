package StructuralPatterns.Proxy.Example1;

public class Client {
    ISubject subject;

    Client(){
        subject = new Proxy();
    }

    public void doBar(){
        System.out.println("Inside Cliente doBar()");
        subject.foo();
    }
}
