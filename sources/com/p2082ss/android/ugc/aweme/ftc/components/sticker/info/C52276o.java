package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.o */
public final /* synthetic */ class C52276o implements AbstractC1214u {

    /* renamed from: a */
    private final C52264i f120465a;

    static {
        Covode.recordClassIndex(61664);
    }

    C52276o(C52264i iVar) {
        this.f120465a = iVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52264i iVar = this.f120465a;
        if (iVar.f120421L) {
            iVar.f120437h.isEnabled();
            iVar.mo88025f();
            iVar.mo88014a(0, iVar.f120447r.mo56246G());
            iVar.f120448s.mo87976a().setValue(C88296t.m153436a((long) iVar.f120447r.mo56386s(((Long) Objects.requireNonNull(iVar.f120437h.getPlayBoundary().f2751b)).intValue())));
        }
    }
}
