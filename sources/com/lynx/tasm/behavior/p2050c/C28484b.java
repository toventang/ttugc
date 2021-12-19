package com.lynx.tasm.behavior.p2050c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;

/* renamed from: com.lynx.tasm.behavior.c.b */
public final class C28484b extends AbstractC28495l {

    /* renamed from: a */
    private final int f66999a;

    static {
        Covode.recordClassIndex(34482);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2050c.AbstractC28493k
    /* renamed from: a */
    public final void mo48990a(C28529q qVar) {
        int i = this.f66999a;
        int i2 = this.f67006b.f67007a;
        TraceEvent.m56864a(0, "UIOwner.destroy");
        if (qVar.f67113e.size() > 0) {
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            LynxBaseUI lynxBaseUI2 = qVar.f67113e.get(Integer.valueOf(i2));
            if (lynxBaseUI == null || lynxBaseUI2 == null) {
                TraceEvent.m56869b(0, "UIOwner.destroy");
                return;
            }
            if (qVar.f67111c.f67077r) {
                C28529q.m57038a(lynxBaseUI2);
            }
            lynxBaseUI.removeChild(lynxBaseUI2);
            qVar.f67113e.remove(Integer.valueOf(i2));
            lynxBaseUI2.destroy();
            qVar.mo49085b(lynxBaseUI2);
        }
        TraceEvent.m56869b(0, "UIOwner.destroy");
    }

    public C28484b(int i, int i2) {
        super(i2, 1);
        this.f66999a = i;
    }
}
