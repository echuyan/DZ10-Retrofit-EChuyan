package ru.otus.retrofittest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Response;
import ru.otus.retrofittest.jsonExamples.pojo.User;
import ru.otus.retrofittest.jsonExamples.pojo.UserList;

import java.io.IOException;

@SpringBootTest
class ListUsersApplicationTests {


	@Test
	void retrofitTest1() {
		Response<UserList> response;

		//Endpoint client for send request
		APIInterfaceList service = ApiClientHelper.getClient().create(APIInterfaceList.class);

		//GET request for get request

		try {
			response = service.getUser().execute();
			if (response.isSuccessful()) {
				System.out.println("Success");
				System.out.println(response.body().getPage());
				System.out.println(response.body());
			} else {
				System.out.println("ERROR");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
