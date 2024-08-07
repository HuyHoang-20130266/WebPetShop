package vn.edu.hcmuaf.fit.beans;

public class ConstantsGoogle {
    public static String GOOGLE_CLIENT_ID = System.getenv("GOOGLE_CLIENT_ID");
    public static String GOOGLE_CLIENT_SECRET = System.getenv("GOOGLE_CLIENT_SECRET");
    public static String GOOGLE_REDIRECT_URI = "http://localhost:8080/Petshop_website_final_war/LoginGoogleHandler";
    public static String GOOGLE_LINK_GET_TOKEN = "https://accounts.google.com/o/oauth2/token";
    public static String GOOGLE_LINK_GET_USER_INFO = "https://www.googleapis.com/oauth2/v1/userinfo?access_token=";
    public static String GOOGLE_GRANT_TYPE = "authorization_code";
}
