package DP;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetClientGet {
	
	   public static void main(String[] args) {
	        try {

	            URL url = new URL("https://jsonmock.hackerrank.com/api/countries?name=INDIA");//your url i.e fetch data from .
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	            conn.setRequestMethod("GET");
	            conn.setRequestProperty("Accept", "application/json");
	            if (conn.getResponseCode() != 200) {
	                throw new RuntimeException("Failed : HTTP Error code : "
	                        + conn.getResponseCode());
	            }
	            InputStreamReader in = new InputStreamReader(conn.getInputStream());
	            BufferedReader br = new BufferedReader(in);
	            String output;
	            String response = "" ;
	            while ((output = br.readLine()) != null) {
	                response = response+output;
	                                
	            }
	            System.out.println(response.contains("name	:"));
//	            JSONObject jsonObject = new JSONObject(response);
//                JSONObject myResponse = jsonObject.getJSONObject("data");
//                JSONArray tsmresponse = (JSONArray) myResponse.get("data");
//
//                ArrayList<String> list = new ArrayList<String>();
//
//                for(int i=0; i<tsmresponse.length(); i++){
//                    list.add(tsmresponse.getJSONObject(i).getString("name"));
//                }

                //System.out.println(list);
	            conn.disconnect();

	        } catch (Exception e) {
	            System.out.println("Exception in NetClientGet:- " + e);
	        }
	    }
	}