package ru.otus.retrofittest;

import ru.otus.retrofittest.jsonExamples.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Response;

import java.io.IOException;

@SpringBootTest
class ApiHelpersApplicationTests {

	@Test
	void retrofitTest() {
		Response<User> response;

		//Endpoint client for send request
		APIInterface service = ApiClientHelper.getClient().create(APIInterface.class);

		//GET request for get request

		try {
			response = service.getUser().execute();
			if (response.isSuccessful()) {
				System.out.println("Success");
				System.out.println(response.body().getData());
				System.out.println(response.body());
			} else {
				System.out.println("ERROR");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}


}
