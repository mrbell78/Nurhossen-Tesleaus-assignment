package com.nurhossen.nur_assignmentapp.service.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Meta {

@SerializedName("last_page")
@Expose
private Integer lastPage;
@SerializedName("next_page_url")
@Expose
private String nextPageUrl;
@SerializedName("prev_page_url")
@Expose
private Object prevPageUrl;
@SerializedName("total")
@Expose
private Integer total;

public Integer getLastPage() {
return lastPage;
}

public void setLastPage(Integer lastPage) {
this.lastPage = lastPage;
}

public String getNextPageUrl() {
return nextPageUrl;
}

public void setNextPageUrl(String nextPageUrl) {
this.nextPageUrl = nextPageUrl;
}

public Object getPrevPageUrl() {
return prevPageUrl;
}

public void setPrevPageUrl(Object prevPageUrl) {
this.prevPageUrl = prevPageUrl;
}

public Integer getTotal() {
return total;
}

public void setTotal(Integer total) {
this.total = total;
}

}