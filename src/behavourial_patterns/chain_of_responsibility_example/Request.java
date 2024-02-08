package behavourial_patterns.chain_of_responsibility_example;

public class Request {
    
    private String authenticationMethod;

    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    public Request(String authMeth) {
        this.authenticationMethod = authMeth;
    }
}
