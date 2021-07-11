
package ru.otus.retrofittest.jsonExamples.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)


public class UserList {
    @Override
    public String toString() {
        return "UserList{" +
                "data=" + data +
                ", page=" + page +
                ", perPage=" + perPage +
                ", support=" + support +
                ", total=" + total +
                ", totalPages=" + totalPages +
                '}';
    }

    @JsonProperty("data")
    private List<Datum> data;
    @JsonProperty("page")
    private long page;
    @JsonProperty("perPage")
    private long perPage;
    @JsonProperty("support")
    private Support support;
    @JsonProperty("total")
    private long total;
    @JsonProperty("totalPages")
    private long totalPages;

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public void setPerPage(long perPage) {
        this.perPage = perPage;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public List<Datum> getData() {
        return data;
    }

    public long getPage() {
        return page;
    }

    public long getPerPage() {
        return perPage;
    }

    public Support getSupport() {
        return support;
    }

    public long getTotal() {
        return total;
    }

    public long getTotalPages() {
        return totalPages;
    }
}
