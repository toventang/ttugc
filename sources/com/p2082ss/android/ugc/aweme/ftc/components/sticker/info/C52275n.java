package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.n */
public final /* synthetic */ class C52275n implements AbstractC1214u {

    /* renamed from: a */
    private final C52264i f120464a;

    static {
        Covode.recordClassIndex(61663);
    }

    C52275n(C52264i iVar) {
        this.f120464a = iVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52264i iVar = this.f120464a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            iVar.mo88025f();
        }
    }
}
