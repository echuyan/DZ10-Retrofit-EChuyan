
package ru.otus.retrofittest.jsonExamples.pojo.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Data {

    @JsonProperty("color")
    private String color;
    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pantoneValue")
    private String pantoneValue;
    @JsonProperty("year")
    private long year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPantoneValue() {
        return pantoneValue;
    }

    public void setPantoneValue(String pantoneValue) {
        this.pantoneValue = pantoneValue;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Data{" +
                "color='" + color + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", pantoneValue='" + pantoneValue + '\'' +
                ", year=" + year +
                '}';
    }
}
