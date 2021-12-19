package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.o */
public final /* synthetic */ class C71380o implements AbstractC1214u {

    /* renamed from: a */
    private final C71056i f159958a;

    static {
        Covode.recordClassIndex(83908);
    }

    C71380o(C71056i iVar) {
        this.f159958a = iVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C71056i iVar = this.f159958a;
        if (iVar.f159106M) {
            iVar.f159126h.isEnabled();
            iVar.mo112257g();
            iVar.mo112243a(0, iVar.f159137s.mo56246G());
            iVar.f159138t.mo112195a().setValue(C88296t.m153436a((long) iVar.f159137s.mo56386s(iVar.f159126h.getPlayBoundary().f2751b.intValue())));
        }
    }
}
