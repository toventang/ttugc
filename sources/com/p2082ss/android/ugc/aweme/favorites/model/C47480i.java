package com.p2082ss.android.ugc.aweme.favorites.model;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27246l;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.i */
final /* synthetic */ class C47480i implements AbstractC27246l {

    /* renamed from: a */
    private final boolean f110299a;

    /* renamed from: b */
    private final List f110300b;

    static {
        Covode.recordClassIndex(56094);
    }

    C47480i(boolean z, List list) {
        this.f110299a = z;
        this.f110300b = list;
    }

    @Override // com.google.p1998c.p1999a.AbstractC27246l
    /* renamed from: a */
    public final boolean mo45331a(Object obj) {
        return this.f110299a || !this.f110300b.contains(obj);
    }
}
