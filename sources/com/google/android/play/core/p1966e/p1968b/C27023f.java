package com.google.android.play.core.p1966e.p1968b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1966e.AbstractC27034f;
import com.google.android.play.core.p1966e.C26993a;

/* renamed from: com.google.android.play.core.e.b.f */
final /* synthetic */ class C27023f implements AbstractC27028k {

    /* renamed from: a */
    private final int f63962a;

    static {
        Covode.recordClassIndex(32499);
    }

    C27023f(int i) {
        this.f63962a = i;
    }

    @Override // com.google.android.play.core.p1966e.p1968b.AbstractC27028k
    /* renamed from: a */
    public final AbstractC27034f mo44726a(AbstractC27034f fVar) {
        int b;
        int i = this.f63962a;
        if (fVar != null && i == fVar.mo44734a() && ((b = fVar.mo44735b()) == 1 || b == 2 || b == 8 || b == 9 || b == 7)) {
            return AbstractC27034f.m53721a(i, 7, fVar.mo44736c(), fVar.mo44737d(), fVar.mo44738e(), fVar.mo44739f(), fVar.mo44740g());
        }
        throw new C26993a(-3);
    }
}
