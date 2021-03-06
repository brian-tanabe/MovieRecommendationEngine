package com.btanabe.mre.web;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.btanabe.mre.web.WebConstants.*;

/**
 * Created by Brian on 2/22/15.
 */
public class WebRequest {

    public String getPage(String url) throws IOException {
        HttpResponse response = getPageResponse(url);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuffer stringBuffer = new StringBuffer();
        String line = "";
        while((line = bufferedReader.readLine()) != null){
            stringBuffer.append(line);
        }

        return stringBuffer.toString();
    }

    public int getPageResponseCode(String url) throws IOException {
        HttpResponse response = getPageResponse(url);
        return response.getStatusLine().getStatusCode();
    }

    public Document getPageAsDocument(String url) throws IOException {
        return Jsoup.parse(getPage(url));
    }

    private HttpResponse getPageResponse(String url) throws IOException {
        HttpGet request = new HttpGet(url);
        request.addHeader("User-agent", USER_AGENT);
        return HttpClientBuilder.create().build().execute(request);
    }
}
