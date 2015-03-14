package info.deepidea.designpatterns.behavior.state;

public class HappyState implements EmotionalState {
    @Override
    public String sayGoodbye() {
        return "Bye, friend!";
    }

    @Override
    public String sayHello() {
        return "Hello, friend!";
    }
}
