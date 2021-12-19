package com.p2082ss.android.ugc.p2207a.p2208a.p2209a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p2207a.p2208a.p2210b.C31008a;

/* renamed from: com.ss.android.ugc.a.a.a.a */
public final class C31003a<P extends C31008a> implements AbstractC31005c<P> {

    /* renamed from: a */
    private Class<P> f74324a;

    static {
        Covode.recordClassIndex(37631);
    }

    @Override // com.p2082ss.android.ugc.p2207a.p2208a.p2209a.AbstractC31005c
    /* renamed from: a */
    public final P mo56086a() {
        try {
            return this.f74324a.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public C31003a(Class<P> cls) {
        this.f74324a = cls;
    }
}
