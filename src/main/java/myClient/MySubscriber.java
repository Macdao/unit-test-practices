package myclient;

public interface MySubscriber {
    void onBegin();

    void onMessage(String message);
}
