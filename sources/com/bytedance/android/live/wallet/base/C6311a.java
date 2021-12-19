package com.bytedance.android.live.wallet.base;

import com.bytedance.android.live.wallet.base.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.live.wallet.base.a */
public class C6311a<T, R extends Extra> {
    @AbstractC27891c(mo46611a = "data")
    public T data;
    public transient RequestError error;
    @AbstractC27891c(mo46611a = "extra")
    public R extra;
    public String logId;
    @AbstractC27891c(mo46611a = "status_code")
    public int statusCode;

    static {
        Covode.recordClassIndex(7033);
    }
}
