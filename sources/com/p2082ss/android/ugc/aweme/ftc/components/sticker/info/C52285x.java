package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import androidx.core.p036g.AbstractC0688a;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.x */
public final /* synthetic */ class C52285x implements AbstractC0688a {

    /* renamed from: a */
    private final C52264i f120476a;

    /* renamed from: b */
    private final boolean f120477b;

    static {
        Covode.recordClassIndex(61673);
    }

    C52285x(C52264i iVar, boolean z) {
        this.f120476a = iVar;
        this.f120477b = z;
    }

    @Override // androidx.core.p036g.AbstractC0688a
    /* renamed from: a */
    public final void mo2720a(Object obj) {
        C52264i iVar = this.f120476a;
        boolean z = this.f120477b;
        boolean z2 = !z;
        iVar.f120433d.setVisibility(z2 ? 0 : 4);
        if (z2) {
            iVar.f120433d.mo87957b();
        }
        if (z) {
            iVar.f120433d.f120317k = C52264i.f120409O;
            iVar.f120447r.mo56311a(true);
        } else {
            iVar.f120433d.f120317k = 0;
            iVar.f120448s.mo87976a().setValue(C88296t.m153438b(0));
            iVar.f120447r.mo56311a(true);
            iVar.f120448s.mo87976a().setValue(C88296t.m153435a());
        }
        iVar.f120435f.getTranslationY();
        iVar.f120437h.getTranslationY();
        iVar.f120437h.getVisibility();
    }
}
