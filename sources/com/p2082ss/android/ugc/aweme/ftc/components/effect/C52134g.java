package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.g */
public final /* synthetic */ class C52134g implements AbstractC84917a {

    /* renamed from: a */
    private final C52125f f120128a;

    static {
        Covode.recordClassIndex(61515);
    }

    C52134g(C52125f fVar) {
        this.f120128a = fVar;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C52125f fVar = this.f120128a;
        if (i != 4 || !fVar.f120072K) {
            return false;
        }
        if (fVar.f120110t == null) {
            return true;
        }
        fVar.f120110t.performClick();
        return true;
    }
}
