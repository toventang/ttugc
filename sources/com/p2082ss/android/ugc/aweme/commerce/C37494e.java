package com.p2082ss.android.ugc.aweme.commerce;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.e */
public final class C37494e implements Serializable {
    @AbstractC27891c(mo46611a = "new_content_num")

    /* renamed from: a */
    private final int f88504a;
    @AbstractC27891c(mo46611a = "update_time")

    /* renamed from: b */
    private final long f88505b;
    @AbstractC27891c(mo46611a = "enter_from_list")

    /* renamed from: c */
    private final List<String> f88506c;

    static {
        Covode.recordClassIndex(44881);
    }

    public final List<String> getEnterFroms() {
        return this.f88506c;
    }

    public final int getNewContentNum() {
        return this.f88504a;
    }

    public final long getUpdateTime() {
        return this.f88505b;
    }
}
