package helpers.Responses;


import org.testng.Assert;

import javax.xml.ws.Response;


/**
 * Created by martynov on 18.04.2016.
 */
public class ResponseBad {

   /* // just look at your cookie's content (e.g. using browser) and import these settings from it
    private static final String SESSION_COOKIE_NAME = "JSESSIONID";
    private static final String DOMAIN = "domain.here.com";
    private static final String COOKIE_PATH = "/cookie/path/here";

    protected boolean isResourceAvailableByUrl(String resourceUrl) {
        HttpClient httpClient = new DefaultHttpClient();
        HttpContext localContext = new BasicHttpContext();
        BasicCookieStore cookieStore = new BasicCookieStore();
        cookieStore.addCookie(getSessionCookie());
        localContext.setAttribute(ClientContext.COOKIE_STORE, cookieStore);
        // resourceUrl - is url which leads to image
        HttpGet httpGet = new HttpGet(resourceUrl);

        try {
            HttpResponse httpResponse = httpClient.execute(httpGet, localContext);
            return httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK;
        } catch (IOException e) {
            return false;
        }
    }

    protected BasicClientCookie getSessionCookie() {
        Cookie originalCookie = webDriver.manage().getCookieNamed(SESSION_COOKIE_NAME);

        if (originalCookie == null) {
            return null;
        }

        String cookieName = originalCookie.getName();
        String cookieValue = originalCookie.getValue();
        BasicClientCookie resultCookie = new BasicClientCookie(cookieName, cookieValue);
        resultCookie.setDomain(DOMAIN);
        resultCookie.setExpiryDate(originalCookie.getExpiry());
        resultCookie.setPath(COOKIE_PATH);
        return resultCookie;
    }
*/
}
