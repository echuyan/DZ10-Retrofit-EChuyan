package ru.otus.retrofittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Response;
import ru.otus.retrofittest.jsonExamples.pojo.UserList;
import ru.otus.retrofittest.jsonExamples.pojo.resource.Resource;

import java.io.IOException;

@SpringBootTest
class ResourceApplicationTests {


	@Test
	void retrofitTest1() {
		Response<Resource> response;

		//Endpoint client for send request
		APIInterfaceResource service = ApiClientHelperREsource.getClient().create(APIInterfaceResource.class);


		try {
			response = service.getResource().execute();
			if (response.isSuccessful()) {
				System.out.println("Success");
				System.out.println(response.body());
				Assertions.assertEquals(response.body().getData().getId(),2);
				Assertions.assertEquals(response.body().getData().getColor(),"#C74375");
				Assertions.assertEquals(response.body().getData().getName(),"fuchsia rose");

			} else {
				System.out.println("ERROR");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
