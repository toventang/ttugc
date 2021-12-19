package com.google.android.play.core.p1966e.p1968b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1966e.AbstractC27034f;
import com.google.android.play.core.p1966e.C26993a;
import com.google.android.play.core.p1966e.C27032e;
import java.util.ArrayList;

/* renamed from: com.google.android.play.core.e.b.e */
final /* synthetic */ class C27022e implements AbstractC27028k {

    /* renamed from: a */
    private final C27032e f63961a;

    static {
        Covode.recordClassIndex(32498);
    }

    C27022e(C27032e eVar) {
        this.f63961a = eVar;
    }

    @Override // com.google.android.play.core.p1966e.p1968b.AbstractC27028k
    /* renamed from: a */
    public final AbstractC27034f mo44726a(AbstractC27034f fVar) {
        int i;
        C27032e eVar = this.f63961a;
        if (fVar != null) {
            int b = fVar.mo44735b();
            if (b == 0 || b == 5 || b == 6 || b == 7) {
                i = 1 + fVar.mo44734a();
            } else {
                throw new C26993a(-1);
            }
        } else {
            i = 1;
        }
        return AbstractC27034f.m53721a(i, 1, 0, 0, 0, eVar.f63984a, new ArrayList());
    }
}
