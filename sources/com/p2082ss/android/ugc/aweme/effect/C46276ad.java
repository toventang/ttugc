package com.p2082ss.android.ugc.aweme.effect;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;

/* renamed from: com.ss.android.ugc.aweme.effect.ad */
final /* synthetic */ class C46276ad implements AbstractC84917a {

    /* renamed from: a */
    private final C46267ac f107910a;

    static {
        Covode.recordClassIndex(54853);
    }

    C46276ad(C46267ac acVar) {
        this.f107910a = acVar;
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C46267ac acVar = this.f107910a;
        if (i != 4 || !acVar.f107850K) {
            return false;
        }
        if (acVar.f107892t == null) {
            return true;
        }
        acVar.f107892t.performClick();
        return true;
    }
}
