package com.bytedance.android.live.network.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class RequestError {
    @AbstractC27891c(mo46611a = "alert")
    public String alert;
    @AbstractC27891c(mo46611a = "message")
    public String message;
    @AbstractC27891c(mo46611a = "prompts")
    public String prompts = "Operation failed, please try again later";
    public transient String url;

    static {
        Covode.recordClassIndex(6433);
    }
}
