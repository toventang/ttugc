package com.bytedance.android.livesdk.p668y.p671c;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.y.c.b */
public final /* synthetic */ class C11602b implements AbstractC88434g {

    /* renamed from: a */
    private final C11599a f27758a;

    static {
        Covode.recordClassIndex(13268);
    }

    C11602b(C11599a aVar) {
        this.f27758a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        return Long.valueOf(this.f27758a.f27753b - (((Long) obj).longValue() * 1000));
    }
}
