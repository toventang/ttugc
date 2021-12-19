package com.p2082ss.android.ugc.aweme.push.downgrade;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.push.downgrade.c */
public final /* synthetic */ class C65712c implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f148063a = new C65712c();

    static {
        Covode.recordClassIndex(77210);
    }

    private C65712c() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        if (((Boolean) obj).booleanValue() && !C65711b.f148061a) {
            C65711b.f148061a = true;
            new C58221f.C58224c().mo95703b((AbstractC58264w) new OptimizePushAccount$1()).mo95706a();
        }
    }
}
