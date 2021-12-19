package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.p */
public final /* synthetic */ class C52277p implements AbstractC1214u {

    /* renamed from: a */
    private final C52264i f120466a;

    static {
        Covode.recordClassIndex(61665);
    }

    C52277p(C52264i iVar) {
        this.f120466a = iVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52264i iVar = this.f120466a;
        if (iVar.f120421L) {
            C0692e<Long, Long> playBoundary = iVar.f120437h.getPlayBoundary();
            iVar.f120448s.mo87976a().setValue(C88296t.m153436a((long) iVar.f120447r.mo56386s(((Long) Objects.requireNonNull(playBoundary.f2751b)).intValue())));
            iVar.mo88014a(Math.max(((Long) Objects.requireNonNull(playBoundary.f2750a)).intValue() - 30, 0), Math.min(playBoundary.f2751b.intValue() + 150, iVar.f120447r.mo56368j()));
        }
    }
}
