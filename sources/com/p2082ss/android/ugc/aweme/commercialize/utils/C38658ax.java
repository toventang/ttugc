package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38655av;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ax */
public final /* synthetic */ class C38658ax implements AbstractC1729g {

    /* renamed from: a */
    private final C38655av.AbstractC38656a f91339a;

    static {
        Covode.recordClassIndex(46199);
    }

    C38658ax(C38655av.AbstractC38656a aVar) {
        this.f91339a = aVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        boolean z;
        C38655av.AbstractC38656a aVar = this.f91339a;
        if (C17873f.f42636l || System.currentTimeMillis() - C17873f.f42639o < 5000) {
            z = true;
        } else {
            z = false;
        }
        aVar.mo67224a(z);
        return null;
    }
}
