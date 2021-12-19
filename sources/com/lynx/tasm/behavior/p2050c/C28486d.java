package com.lynx.tasm.behavior.p2050c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28532r;
import com.lynx.tasm.behavior.C28529q;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.c.d */
public final class C28486d extends AbstractC28490h {

    /* renamed from: a */
    private long f67001a;

    static {
        Covode.recordClassIndex(34484);
    }

    public C28486d(long j) {
        super(9);
        this.f67001a = j;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2050c.AbstractC28493k
    /* renamed from: a */
    public final void mo48990a(C28529q qVar) {
        List<AbstractC28532r> list = qVar.f67111c.f67080u;
        if (list != null) {
            for (AbstractC28532r rVar : list) {
                rVar.mo31123a();
            }
        }
    }
}
