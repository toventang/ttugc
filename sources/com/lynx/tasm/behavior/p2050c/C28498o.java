package com.lynx.tasm.behavior.p2050c;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIShadowProxy;
import com.lynx.tasm.utils.C28929m;

/* renamed from: com.lynx.tasm.behavior.c.o */
public final class C28498o extends AbstractC28488f {

    /* renamed from: a */
    private final ReadableMap f67030a;

    /* renamed from: c */
    private final boolean f67031c;

    static {
        Covode.recordClassIndex(34496);
    }

    @Override // com.lynx.tasm.behavior.p2050c.AbstractC28488f, com.lynx.tasm.behavior.p2050c.AbstractC28493k
    /* renamed from: a */
    public final void mo49012a(AbstractC28493k kVar) {
        ((JavaOnlyMap) this.f67030a).merge(((C28498o) kVar).f67030a);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2050c.AbstractC28493k
    /* renamed from: a */
    public final void mo48990a(C28529q qVar) {
        C28716v vVar;
        int i = this.f67006b.f67007a;
        boolean z = this.f67031c;
        if (this.f67030a != null) {
            vVar = new C28716v(this.f67030a);
        } else {
            vVar = null;
        }
        C28929m.m57951b();
        LynxBaseUI lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
        String str = "UIOwner.updateProps." + lynxBaseUI.mTagName;
        TraceEvent.m56864a(0, str);
        if (qVar.f67111c.f67076q) {
            lynxBaseUI.updateAttributes(vVar);
            return;
        }
        if (vVar != null) {
            if (qVar.f67111c.f67077r && !z && lynxBaseUI.isFlatten()) {
                qVar.mo49081a(i, z);
                lynxBaseUI = qVar.f67113e.get(Integer.valueOf(i));
            }
            if (vVar.mo49821a("transition")) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    ((UIShadowProxy) lynxBaseUI).f67262a.initTransitionAnimator(vVar.f67715a);
                } else {
                    lynxBaseUI.initTransitionAnimator(vVar.f67715a);
                }
            }
            if (vVar.mo49821a("animation")) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    ((UIShadowProxy) lynxBaseUI).f67262a.setAnimation(vVar.mo49825d("animation"));
                } else {
                    lynxBaseUI.setAnimation(vVar.mo49825d("animation"));
                }
            }
            if (C28529q.m57040a(vVar) && (!(vVar.mo49825d("box-shadow") == null && vVar.mo49820a("outline-style", -1) == -1) && !(lynxBaseUI instanceof UIShadowProxy) && lynxBaseUI.mParent != null && !(lynxBaseUI.mParent instanceof UIShadowProxy))) {
                LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
                int index = parentBaseUI.getIndex(lynxBaseUI);
                qVar.mo49076a(parentBaseUI.getSign(), lynxBaseUI.getSign());
                UIShadowProxy uIShadowProxy = new UIShadowProxy(qVar.f67111c, lynxBaseUI);
                qVar.f67113e.put(Integer.valueOf(lynxBaseUI.getSign()), uIShadowProxy);
                qVar.mo49077a(parentBaseUI.getSign(), uIShadowProxy.getSign(), index);
            }
            lynxBaseUI.updateProperties(vVar);
        }
        TraceEvent.m56869b(0, str);
    }

    public C28498o(int i, boolean z, ReadableMap readableMap) {
        super(i, 4);
        this.f67030a = readableMap;
        this.f67031c = z;
    }
}
