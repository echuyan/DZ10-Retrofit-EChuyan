
package ru.otus.retrofittest.jsonExamples.pojo.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Resource {

    @JsonProperty("data")
    private ru.otus.retrofittest.jsonExamples.pojo.resource.Data data;
    @JsonProperty("support")
    private ru.otus.retrofittest.jsonExamples.pojo.resource.Support support;


    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }


    @Override
    public String toString() {
        return "Resource{" +
                "data=" + data +
                ", support=" + support +
                '}';
    }
}
