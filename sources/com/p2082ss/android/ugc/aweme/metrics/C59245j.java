package com.p2082ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.metrics.j */
public final class C59245j extends AbstractC59255t {

    /* renamed from: b */
    private final HashMap<String, String> f135233b;

    static {
        Covode.recordClassIndex(69608);
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59255t
    public final HashMap<String, String> buildParams() {
        return this.f135233b;
    }

    public final HashMap<String, String> getInputParam() {
        return this.f135233b;
    }

    public C59245j(HashMap<String, String> hashMap) {
        C89219l.m154721d(hashMap, "");
        this.f135233b = hashMap;
    }
}
