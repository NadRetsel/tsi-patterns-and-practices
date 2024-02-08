package behavourial_patterns.chain_of_responsibility_example;

public class OAuthHandler extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getAuthenticationMethod().equals("OAuth")) {
            System.out.println("Handling authenticating user using OAuth...This takes many steps...");
        } else {
            if(successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
