package com.p2082ss.android.ugc.aweme.shortvideo.p3839l;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.l.r */
public final /* synthetic */ class C71968r implements AbstractC84917a {

    /* renamed from: a */
    private final C71962q f161281a;

    static {
        Covode.recordClassIndex(84517);
    }

    C71968r(C71962q qVar) {
        this.f161281a = qVar;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C71962q qVar = this.f161281a;
        if (i != 4 || !qVar.f161266f || qVar.f161268h == null) {
            return false;
        }
        qVar.f161268h.mo88209a();
        return true;
    }
}
