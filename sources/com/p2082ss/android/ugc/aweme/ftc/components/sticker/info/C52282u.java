package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.u */
public final /* synthetic */ class C52282u implements AbstractC1214u {

    /* renamed from: a */
    private final C52264i f120471a;

    static {
        Covode.recordClassIndex(61670);
    }

    C52282u(C52264i iVar) {
        this.f120471a = iVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52264i iVar = this.f120471a;
        Long l = (Long) obj;
        if (iVar.f120421L && l != null) {
            iVar.f120448s.mo87976a().setValue(C88296t.m153436a((long) iVar.f120447r.mo56386s(l.intValue())));
        }
    }
}
