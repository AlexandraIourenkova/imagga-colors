package telran.imagga.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import telran.imagga.dto.ResponseDto;

public class ImaggaAppl {
	final static String TOKEN = "Basic YWNjX2I3MjBhNzE5NDFlYjkxNjpmMTNlNmY1NzRjMWE5ZDczMzRjMGI3NTc0NzVjNzI4NQ==";
	static RestTemplate restTemplate = new RestTemplate();

	public static void main(String[] args) {
		String httpUrl = "https://api.imagga.com/v2/colors";
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(httpUrl)
				.queryParam("image_url", "https://images8.alphacoders.com/414/414960.jpg")
				.queryParam("language", "eng")
				.queryParam("limit", 3);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", TOKEN);
		RequestEntity<String> requestEntity = new RequestEntity<>(headers , HttpMethod.GET, builder.build().toUri());
		ResponseEntity<ResponseDto> responseEntity = restTemplate.exchange(requestEntity, ResponseDto.class);
		responseEntity.getBody().getResult().getColors().getListOfColors().forEach(System.out::println);
	}
}
