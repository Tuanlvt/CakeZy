package com.fstyle.cakezy.data.source.remote.api.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseResponse<T> {
    @Expose
    @SerializedName("data")
    T data;
    @Expose
    @SerializedName("code")
    private int mCode;
    @Expose
    @SerializedName("messages")
    private String mMessages;

    public BaseResponse(T data) {
        this.data = data;
    }

    public BaseResponse() {
    }

    public int getCode() {
        return mCode;
    }

    public String getMessage() {
        return mMessages;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
