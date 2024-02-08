package behavourial_patterns.chain_of_responsibility_example;

public class PasswordHandler extends Handler {


    @Override
    public void handleRequest(Request request) {
        if(request.getAuthenticationMethod().equals("Password")) {
            System.out.println("Authenticating password provided...");
        } else {
            if(successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
