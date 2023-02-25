package br.com.alura.desafio.imdb_filmes;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CriandoRequisicao {
	
	
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		// cliente HTTP
		HttpClient client = HttpClient.newHttpClient();
		
		// criar a requisição
		HttpRequest request = HttpRequest
					.newBuilder()
					.GET()
					.uri(new URI("https://imdb-api.com/en/API/Top250Movies/k_x062wd9t"))
					.build();
		
		// enviando uma solicitação
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		String json = response.body();
		
		// imprimir o conteudo recebido 
//		System.out.println(response.statusCode());
		System.out.println(json);
		
		
	}
}
