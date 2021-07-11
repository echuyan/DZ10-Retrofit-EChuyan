package ru.otus.retrofittest;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class ApiClientHelper {
    public static final String BASE_URL = "http:/reqres.in/api/users/";


    private static Retrofit retrofit = null;
  public  static Retrofit getClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        return retrofit;
    }

}
