package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.model.ao */
public final class C9531ao {
    @AbstractC27891c(mo46611a = "enable")

    /* renamed from: a */
    public final boolean f23132a;
    @AbstractC27891c(mo46611a = "uplink_strategy")

    /* renamed from: b */
    public int f23133b = 1;
    @AbstractC27891c(mo46611a = "ws_uplink_wait_timeout")

    /* renamed from: c */
    public long f23134c = 15000;
    @AbstractC27891c(mo46611a = "uplink_api_allowed_list")

    /* renamed from: d */
    public Map<String, ? extends Map<String, Long>> f23135d = new HashMap();

    static {
        Covode.recordClassIndex(11070);
    }
}
