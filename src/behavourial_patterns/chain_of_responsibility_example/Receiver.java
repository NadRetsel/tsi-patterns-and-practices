package behavourial_patterns.chain_of_responsibility_example;

/*
A receiver class is not necessary for the chain-of-responsibility, but this gives me a nice place
to place some example code
*/

public class Receiver {

    private Handler rootHandler;

    public Receiver() {
        rootHandler = new SSOHandler();
        rootHandler.setHandler(new OAuthHandler());
        rootHandler.getHandler().setHandler(new PasswordHandler());
    }

    public void handOffRequest(Request request) {
        rootHandler.handleRequest(request);
    }
}

/*
    public static void main(String[] args) {
        Receiver clientReceiver = new Receiver();
        Request incomingRequest = new Request("SSO"); //change this around to see it working
        clientReceiver.handOffRequest(incomingRequest);
    }
 */
