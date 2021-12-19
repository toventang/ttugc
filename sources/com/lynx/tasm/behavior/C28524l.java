package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.p2054c.C28724b;
import com.lynx.tasm.p2054c.C28726d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.lynx.tasm.behavior.l */
public class C28524l implements C28719c.AbstractC28721b {

    /* renamed from: a */
    public final ArrayList<C28521k> f67106a = new ArrayList<>();

    /* renamed from: b */
    private final WeakReference<AbstractC28520j> f67107b;

    /* renamed from: c */
    private final WeakReference<JSProxy> f67108c;

    static {
        Covode.recordClassIndex(34522);
    }

    /* renamed from: a */
    public final AbstractC28520j mo49051a() {
        return this.f67107b.get();
    }

    /* renamed from: b */
    public final void mo49058b() {
        Iterator<C28521k> it = this.f67106a.iterator();
        while (it.hasNext()) {
            it.next().mo49045a();
        }
    }

    /* renamed from: a */
    public final C28521k mo49052a(int i) {
        Iterator<C28521k> it = this.f67106a.iterator();
        while (it.hasNext()) {
            C28521k next = it.next();
            if (next.f67083a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo49055a(C28521k kVar) {
        if (!this.f67106a.contains(kVar)) {
            this.f67106a.add(kVar);
        }
    }

    /* renamed from: a */
    public final void mo49056a(LynxBaseUI lynxBaseUI) {
        Iterator<C28521k> it = this.f67106a.iterator();
        while (it.hasNext()) {
            C28521k next = it.next();
            if (next.f67085c == lynxBaseUI) {
                this.f67106a.remove(next);
                return;
            }
        }
    }

    public C28524l(AbstractC28520j jVar, JSProxy jSProxy) {
        this.f67107b = new WeakReference<>(jVar);
        this.f67108c = new WeakReference<>(jSProxy);
    }

    /* renamed from: a */
    public final void mo49054a(int i, JavaOnlyMap javaOnlyMap) {
        this.f67107b.get().f67064e.mo49837b(new C28724b(i, "intersection", javaOnlyMap));
    }

    @Override // com.lynx.tasm.C28719c.AbstractC28721b
    /* renamed from: a */
    public final void mo49057a(C28719c.EnumC28722c cVar, C28726d dVar) {
        if (this.f67106a.size() != 0) {
            if (cVar != C28719c.EnumC28722c.kLynxEventTypeLayoutEvent) {
                if (cVar == C28719c.EnumC28722c.kLynxEventTypeCustomEvent) {
                    String str = dVar.f67739e;
                    if (!str.equals("scroll") && !str.equals("scrolltoupper") && !str.equals("scrolltolower")) {
                        return;
                    }
                } else {
                    return;
                }
            }
            mo49058b();
        }
    }

    /* renamed from: a */
    public final void mo49053a(int i, int i2, JavaOnlyMap javaOnlyMap) {
        JSProxy jSProxy = this.f67108c.get();
        if (jSProxy != null) {
            jSProxy.mo49858a(i, i2, javaOnlyMap);
        }
    }
}
