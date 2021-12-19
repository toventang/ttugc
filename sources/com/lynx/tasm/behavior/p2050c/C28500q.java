package com.lynx.tasm.behavior.p2050c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;

/* renamed from: com.lynx.tasm.behavior.c.q */
public final class C28500q extends AbstractC28488f {
    static {
        Covode.recordClassIndex(34498);
    }

    public C28500q(int i) {
        super(i, 8);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2050c.AbstractC28493k
    /* renamed from: a */
    public final void mo48990a(C28529q qVar) {
        LynxBaseUI a = qVar.mo49070a(this.f67006b.f67007a);
        if (a == null) {
            LLog.m56856a(6, "LynxUIOwner", "try to validate a not-existing node");
        } else {
            a.renderIfNeeded();
        }
    }
}
