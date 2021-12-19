package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.core.p036g.AbstractC0688a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.al */
final /* synthetic */ class C52110al implements AbstractC0688a {

    /* renamed from: a */
    private final C52125f f120032a;

    /* renamed from: b */
    private final boolean f120033b;

    static {
        Covode.recordClassIndex(61491);
    }

    C52110al(C52125f fVar, boolean z) {
        this.f120032a = fVar;
        this.f120033b = z;
    }

    @Override // androidx.core.p036g.AbstractC0688a
    /* renamed from: a */
    public final void mo2720a(Object obj) {
        C52125f fVar = this.f120032a;
        if (this.f120033b) {
            fVar.f120109s.setVisibility(0);
            fVar.f120110t.setVisibility(0);
        }
    }
}
