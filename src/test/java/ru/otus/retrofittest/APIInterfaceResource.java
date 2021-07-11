package ru.otus.retrofittest;

import retrofit2.Call;
import retrofit2.http.GET;
import ru.otus.retrofittest.jsonExamples.pojo.UserList;
import ru.otus.retrofittest.jsonExamples.pojo.resource.Resource;

public interface APIInterfaceResource {
    @GET("2")
    Call<Resource> getResource();
}
