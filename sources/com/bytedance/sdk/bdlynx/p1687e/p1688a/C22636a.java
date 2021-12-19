package com.bytedance.sdk.bdlynx.p1687e.p1688a;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1690a.C22638a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.e.a.a */
public final class C22636a {

    /* renamed from: a */
    public LruCache<String, C22638a> f53458a = new LruCache<>(16);

    /* renamed from: b */
    private final int f53459b = 16;

    static {
        Covode.recordClassIndex(26453);
    }

    /* renamed from: a */
    public final void mo36917a(String str, C22638a aVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(aVar, "");
        this.f53458a.put(str, aVar);
    }
}
