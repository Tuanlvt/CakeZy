package com.fstyle.cakezy.data.source.remote.api.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by MyPC on 30/10/2017.
 */

public class ErrorResponse {
    @Expose
    @SerializedName("code")
    private int code;
    @Expose
    @SerializedName("messages")
    private String messages;

    public String getMessage() {
        return messages;
    }
}
