package br.com.alura.desafio.imdb_filmes;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SevenDaysOfCodeJavaDay1 {
	
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		// cliente HTTP
		HttpClient client = HttpClient.newHttpClient();
		
		String apiKey = "k_x062wd9t";
		
		// criar a requisição
		HttpRequest request = HttpRequest
					.newBuilder()
					.GET()
					.uri(new URI("https://imdb-api.com/en/API/Top250TVs/" + apiKey ))
					.build();
		
		// enviando uma solicitação
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		String json = response.body();
		
		// imprimir o conteudo recebido 
//		System.out.println(response.statusCode());
		System.out.println(json);
//		String[] array = json.split("},");
//		System.out.println(array[0]);
//		
		
//		String titles[] = json.split("title", 0);
//		System.out.println(titles[1]);
//		
//		String Urls[] = json.split("https:");
//		System.out.println(Urls[1]);
//		
//		String years[] = json.split("year");
//		System.out.println(years[1]);
//		
//		String notas[] = json.split("imDbRating");
//		System.out.println(notas[1]);
		
		
	}
}

