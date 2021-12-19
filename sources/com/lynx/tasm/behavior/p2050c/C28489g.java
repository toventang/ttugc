package com.lynx.tasm.behavior.p2050c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIShadowProxy;

/* renamed from: com.lynx.tasm.behavior.c.g */
public final class C28489g extends AbstractC28495l {
    static {
        Covode.recordClassIndex(34487);
    }

    public C28489g(int i) {
        super(i, 13);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2050c.AbstractC28493k
    /* renamed from: a */
    public final void mo48990a(C28529q qVar) {
        LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(this.f67006b.f67007a));
        if (lynxBaseUI instanceof UIShadowProxy) {
            lynxBaseUI = ((UIShadowProxy) lynxBaseUI).f67262a;
        }
        lynxBaseUI.onAnimatedNodeReady();
    }
}
