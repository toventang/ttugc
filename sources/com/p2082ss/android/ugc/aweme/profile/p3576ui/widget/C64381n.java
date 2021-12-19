package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56250c;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.n */
public final /* synthetic */ class C64381n implements AbstractC89172b {

    /* renamed from: a */
    private final View$OnClickListenerC64377l f145979a;

    static {
        Covode.recordClassIndex(75835);
    }

    C64381n(View$OnClickListenerC64377l lVar) {
        this.f145979a = lVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        View$OnClickListenerC64377l lVar = this.f145979a;
        C56250c cVar = (C56250c) obj;
        if (cVar.f128291a || !cVar.f128292b) {
            return null;
        }
        lVar.f145963d.setOnClickListener(lVar);
        return null;
    }
}
