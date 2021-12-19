package com.bytedance.android.live.core.p210a;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88435h;

/* renamed from: com.bytedance.android.live.core.a.h */
final /* synthetic */ class C3845h implements AbstractC88435h {

    /* renamed from: a */
    private final long f10629a = Long.MAX_VALUE;

    static {
        Covode.recordClassIndex(4374);
    }

    C3845h(long j) {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88435h
    /* renamed from: a */
    public final Object mo9211a(Object obj, Object obj2, Object obj3) {
        Long l = (Long) obj3;
        return Boolean.valueOf(System.currentTimeMillis() - l.longValue() > this.f10629a || System.currentTimeMillis() < l.longValue());
    }
}
