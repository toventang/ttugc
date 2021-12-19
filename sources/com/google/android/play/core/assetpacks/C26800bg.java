package com.google.android.play.core.assetpacks;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.bg */
public final /* synthetic */ class C26800bg implements AbstractC26805bl {

    /* renamed from: a */
    private final C26806bm f63546a;

    /* renamed from: b */
    private final int f63547b;

    static {
        Covode.recordClassIndex(32275);
    }

    C26800bg(C26806bm bmVar, int i) {
        this.f63546a = bmVar;
        this.f63547b = i;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26805bl
    /* renamed from: a */
    public final Object mo44493a() {
        C26806bm bmVar = this.f63546a;
        int i = this.f63547b;
        C26803bj b = bmVar.mo44496b(i);
        if (C26816bw.m53270b(b.f63556c.f63551c)) {
            C26769ac acVar = bmVar.f63564b;
            C26802bi biVar = b.f63556c;
            acVar.mo44458g(biVar.f63549a, b.f63555b, biVar.f63550b);
            C26802bi biVar2 = b.f63556c;
            int i2 = biVar2.f63551c;
            if (i2 != 5 && i2 != 6) {
                return null;
            }
            C26769ac acVar2 = bmVar.f63564b;
            String str = biVar2.f63549a;
            if (!acVar2.mo44441a(str).exists()) {
                return null;
            }
            C26769ac.m53178c(acVar2.mo44441a(str));
            return null;
        }
        throw new C26787au(C1764a.m5928a("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }
}
