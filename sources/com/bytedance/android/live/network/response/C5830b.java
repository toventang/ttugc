package com.bytedance.android.live.network.response;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.live.network.response.b */
public class C5830b<T, R extends Extra> {
    @AbstractC27891c(mo46611a = "data")
    public T data;
    public transient RequestError error;
    @AbstractC27891c(mo46611a = "extra")
    public R extra;
    public int requestType;
    @AbstractC27891c(mo46611a = "status_code")
    public int statusCode;

    static {
        Covode.recordClassIndex(6437);
    }
}
