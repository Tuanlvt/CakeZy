package com.fstyle.cakezy.data.model;

import com.google.gson.Gson;

/**
 * Created by Tuanlvt on 02/11/2017.
 */

public abstract class BaseModel implements Cloneable {
    public BaseModel clone() throws CloneNotSupportedException {
        super.clone();
        Gson gson = new Gson();
        return gson.fromJson(gson.toJson(this), this.getClass());
    }
}
