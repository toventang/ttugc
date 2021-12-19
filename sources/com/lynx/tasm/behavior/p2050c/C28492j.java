package com.lynx.tasm.behavior.p2050c;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.C28529q;

/* renamed from: com.lynx.tasm.behavior.c.j */
public final class C28492j extends AbstractC28490h {

    /* renamed from: a */
    private final ReadableMap f67005a;

    static {
        Covode.recordClassIndex(34490);
    }

    public C28492j(ReadableMap readableMap) {
        super(12);
        this.f67005a = readableMap;
    }

    @Override // com.lynx.tasm.behavior.p2050c.AbstractC28493k
    /* renamed from: a */
    public final void mo48990a(C28529q qVar) {
        qVar.f67111c.mo49036a(this.f67005a.getMap("keyframes"));
    }
}
