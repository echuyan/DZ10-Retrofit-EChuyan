package ru.otus.retrofittest;

import retrofit2.Call;
import retrofit2.http.GET;
import ru.otus.retrofittest.jsonExamples.pojo.UserList;

public interface APIInterfaceList {
    @GET("?page=2")
    Call<UserList> getUserList();
}
