package ru.otus.retrofittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Response;
import ru.otus.retrofittest.jsonExamples.pojo.UserList;

import java.io.IOException;

@SpringBootTest
class ListUsersApplicationTests {


	@Test
	void retrofitTest1() {
		Response<UserList> response;

		//Endpoint client for send request
		APIInterfaceList service = ApiClientHelper.getClient().create(APIInterfaceList.class);


		try {
			response = service.getUserList().execute();
			if (response.isSuccessful()) {
				System.out.println("Success");
				System.out.println(response.body());
				Assertions.assertEquals(response.body().getPage(),2);
				Assertions.assertTrue(response.body().getData().size()==6);
			} else {
				System.out.println("ERROR");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
