package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.n */
public final /* synthetic */ class C71379n implements AbstractC1214u {

    /* renamed from: a */
    private final C71056i f159957a;

    static {
        Covode.recordClassIndex(83907);
    }

    C71379n(C71056i iVar) {
        this.f159957a = iVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C71056i iVar = this.f159957a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            iVar.mo112257g();
        }
    }
}
