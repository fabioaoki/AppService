package br.com.aoki.programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBException;

public class Programa {

	private static int HTTP_COD_SUCESSO = 200;
	
	public static void main(String[] args) throws IOException, JAXBException {
		URL url = new URL("http://localhost:8080/weather/1");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		
		if (con.getResponseCode() != HTTP_COD_SUCESSO) {
            throw new RuntimeException("HTTP error code : "+ con.getResponseCode());
        }
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
		
		System.out.println(br.readLine());
		con.disconnect();
	}

}
