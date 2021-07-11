
package ru.otus.retrofittest.jsonExamples.pojo.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Support {
    @JsonProperty("text")
    private String text;
    @JsonProperty("url")
    private String url;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Support{" +
                "text='" + text + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
