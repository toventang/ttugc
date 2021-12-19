package com.bytedance.p1399im.core.p1404a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.a.k */
public class C19497k implements Serializable {
    public static int FALLBACK_CLEAR = 1;
    public static int FALLBACK_NORMAL;
    @AbstractC27891c(mo46611a = "index_v2_base")
    public long baseIndexV2 = 1;
    @AbstractC27891c(mo46611a = "enable")
    public int enable;
    @AbstractC27891c(mo46611a = "fallback_strategy")
    public int fallbackStrategy = FALLBACK_NORMAL;

    static {
        Covode.recordClassIndex(22341);
    }

    public String toString() {
        return "RecentLinkConfig{enable=" + this.enable + ", baseIndexV2=" + this.baseIndexV2 + ", fallbackStrategy=" + this.fallbackStrategy + "}";
    }
}
