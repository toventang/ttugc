package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.p */
public final /* synthetic */ class C71381p implements AbstractC1214u {

    /* renamed from: a */
    private final C71056i f159959a;

    static {
        Covode.recordClassIndex(83909);
    }

    C71381p(C71056i iVar) {
        this.f159959a = iVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C71056i iVar = this.f159959a;
        if (iVar.f159106M) {
            C0692e<Long, Long> playBoundary = iVar.f159126h.getPlayBoundary();
            iVar.f159138t.mo112195a().setValue(C88296t.m153436a((long) iVar.f159137s.mo56386s(playBoundary.f2751b.intValue())));
            iVar.mo112243a(Math.max(playBoundary.f2750a.intValue() - 30, 0), Math.min(playBoundary.f2751b.intValue() + ((iVar.f159137s.mo56368j() - playBoundary.f2751b.intValue()) + -30 < 150 ? 120 : 0) + 30, iVar.f159137s.mo56368j()));
            iVar.mo112255e();
        }
    }
}
