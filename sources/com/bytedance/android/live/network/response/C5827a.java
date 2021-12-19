package com.bytedance.android.live.network.response;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.bytedance.android.live.network.response.a */
public class C5827a<T, R extends Extra> {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public int f14683a;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: b */
    public List<T> f14684b;
    @AbstractC27891c(mo46611a = "extra")

    /* renamed from: c */
    public R f14685c;

    /* renamed from: d */
    public transient RequestError f14686d;

    static {
        Covode.recordClassIndex(6434);
    }
}
