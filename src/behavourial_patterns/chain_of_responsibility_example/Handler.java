package behavourial_patterns.chain_of_responsibility_example;

public abstract class Handler {
    protected Handler successor;
    public abstract void handleRequest(Request request);
    public void setHandler(Handler newHandler) {
        this.successor = newHandler;
    }
    public Handler getHandler() {
        return this.successor;
    }
}
