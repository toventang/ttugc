package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.u */
public final /* synthetic */ class C71386u implements AbstractC1214u {

    /* renamed from: a */
    private final C71056i f159964a;

    static {
        Covode.recordClassIndex(83914);
    }

    C71386u(C71056i iVar) {
        this.f159964a = iVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C71056i iVar = this.f159964a;
        Long l = (Long) obj;
        if (iVar.f159106M && l != null) {
            iVar.f159138t.mo112195a().setValue(C88296t.m153436a((long) iVar.f159137s.mo56386s(l.intValue())));
        }
    }
}
