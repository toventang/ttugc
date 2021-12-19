package com.bytedance.android.livesdk.util.rxutils.autodispose.p649b;

import com.bytedance.covode.number.Covode;
import java.util.Comparator;
import p4560f.p4561a.p4567d.AbstractC88438k;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.b.f */
public final /* synthetic */ class C11144f implements AbstractC88438k {

    /* renamed from: a */
    private final Comparator f26759a;

    /* renamed from: b */
    private final Object f26760b;

    static {
        Covode.recordClassIndex(12771);
    }

    C11144f(Comparator comparator, Object obj) {
        this.f26759a = comparator;
        this.f26760b = obj;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88438k
    /* renamed from: a */
    public final boolean mo7718a(Object obj) {
        return this.f26759a.compare(obj, this.f26760b) >= 0;
    }
}
