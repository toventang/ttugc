package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.t */
public final /* synthetic */ class C54568t implements AbstractC89172b {

    /* renamed from: a */
    private final C54565s f125083a;

    static {
        Covode.recordClassIndex(64279);
    }

    C54568t(C54565s sVar) {
        this.f125083a = sVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C54565s sVar = this.f125083a;
        Boolean bool = (Boolean) obj;
        if (sVar.f125077x == null) {
            return null;
        }
        if (!bool.booleanValue()) {
            sVar.f125077x.clearAnimation();
            sVar.f125077x.setVisibility(8);
            return null;
        } else if (sVar.f125077x.getVisibility() == 0) {
            return null;
        } else {
            sVar.f125077x.setVisibility(0);
            sVar.f125077x.startAnimation(sVar.f125062A);
            return null;
        }
    }
}
