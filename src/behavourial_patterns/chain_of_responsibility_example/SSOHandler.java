package behavourial_patterns.chain_of_responsibility_example;

public class SSOHandler extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getAuthenticationMethod().equals("SSO")) {
            System.out.println("Handling SSO process...Connecting to server...etc...");
        } else {
            if(successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
