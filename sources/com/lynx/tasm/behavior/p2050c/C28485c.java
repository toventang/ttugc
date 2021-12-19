package com.lynx.tasm.behavior.p2050c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;

/* renamed from: com.lynx.tasm.behavior.c.c */
public final class C28485c extends AbstractC28490h {

    /* renamed from: a */
    private final long f67000a;

    static {
        Covode.recordClassIndex(34483);
    }

    public C28485c(long j) {
        super(10);
        this.f67000a = j;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2050c.AbstractC28493k
    /* renamed from: a */
    public final void mo48990a(C28529q qVar) {
        LynxBaseUI lynxBaseUI;
        long j = this.f67000a;
        if (j != 0 && (lynxBaseUI = qVar.f67113e.get(Integer.valueOf((int) (j >>> 32)))) != null) {
            String str = "UIOwner.layoutFinish." + lynxBaseUI.mTagName;
            TraceEvent.m56864a(0, str);
            lynxBaseUI.onLayoutFinish(j);
            TraceEvent.m56869b(0, str);
        }
    }
}
