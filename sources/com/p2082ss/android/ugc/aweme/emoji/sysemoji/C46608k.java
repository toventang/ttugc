package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.k */
public final class C46608k implements Serializable {
    @AbstractC27891c(mo46611a = "v")

    /* renamed from: a */
    private String f108674a;
    @AbstractC27891c(mo46611a = "d")

    /* renamed from: b */
    private List<? extends C46582a> f108675b;

    static {
        Covode.recordClassIndex(55198);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.emoji.sysemoji.a>, java.util.List<com.ss.android.ugc.aweme.emoji.sysemoji.a> */
    public final List<C46582a> getD() {
        return this.f108675b;
    }

    public final String getV() {
        return this.f108674a;
    }

    public final void setD(List<? extends C46582a> list) {
        this.f108675b = list;
    }

    public final void setV(String str) {
        this.f108674a = str;
    }
}
