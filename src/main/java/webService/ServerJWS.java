package webService;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8080/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Server started, link to app : " + url);
    }
}
