package com.bytedance.geckox.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class Response<T> {
    @AbstractC27891c(mo46611a = "data")
    public T data;
    @AbstractC27891c(mo46611a = "message")
    public String msg;
    @AbstractC27891c(mo46611a = "status")
    public int status;

    static {
        Covode.recordClassIndex(17105);
    }
}
