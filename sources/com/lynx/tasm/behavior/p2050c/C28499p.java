package com.lynx.tasm.behavior.p2050c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.utils.C28929m;

/* renamed from: com.lynx.tasm.behavior.c.p */
public final class C28499p extends AbstractC28488f {

    /* renamed from: a */
    private final Object f67032a;

    /* renamed from: c */
    private boolean f67033c;

    static {
        Covode.recordClassIndex(34497);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2050c.AbstractC28493k
    /* renamed from: a */
    public final void mo48990a(C28529q qVar) {
        if (!this.f67033c) {
            int i = this.f67006b.f67007a;
            Object obj = this.f67032a;
            C28929m.m57951b();
            LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                String str = "UIOwner.updateViewExtra" + lynxBaseUI.mTagName;
                TraceEvent.m56864a(0, str);
                lynxBaseUI.updateExtraData(obj);
                TraceEvent.m56869b(0, str);
            }
            this.f67033c = true;
        }
    }

    public C28499p(int i, Object obj) {
        super(i, 7);
        this.f67032a = obj;
    }
}
