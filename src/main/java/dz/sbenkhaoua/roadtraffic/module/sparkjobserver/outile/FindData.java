package dz.sbenkhaoua.roadtraffic.module.sparkjobserver.outile;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * Created by sbenkhaoua on 08/05/15.
 */
public class FindData {
    public FindData(){

    }

    public   String get(String parametre) throws IOException {
        String urlParameters = "date='\"Tue May 05 23:16:55 CEST 2015\"''\"&\"''\"Tue May 05 23:6:55 CEST 2015\"' ";
        byte[] postData = urlParameters.getBytes(Charset.forName("UTF-8"));
        int postDataLength = postData.length;
        String request = "http://localhost:8090/jobs?appName=roadtraffic6&classPath=LuncherCarRoadCountWithParameter&context=test-context&sync=true";
        URL url = new URL(request);

        HttpURLConnection cox = (HttpURLConnection) url.openConnection();
        cox.setDoOutput(false);
        cox.setDoInput(false);
        try {
            cox = (HttpURLConnection) url.openConnection();
            cox.setDoOutput(true);
            cox.setDoInput(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        cox.setInstanceFollowRedirects(false);
        cox.setRequestMethod("POST");
        cox.setRequestProperty("X-Requested-With", "Curl");
        cox.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        cox.setRequestProperty("charset", "utf-8");
        cox.setRequestProperty("Content-Length", Integer.toString(postDataLength));
        cox.setUseCaches(false);
        try (DataOutputStream wr = new DataOutputStream(cox.getOutputStream())) {
            wr.write(postData);
        }
        if (cox.getResponseCode() != HttpURLConnection.HTTP_OK) {
            System.out.println(cox.getResponseCode());
        }
        InputStream in = cox.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(cox.getInputStream());
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuilder result = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            result.append(line);
        }
        System.out.println("line "+line);
        return  result.toString();
    }
}
