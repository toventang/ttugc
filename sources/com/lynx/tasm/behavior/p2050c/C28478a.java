package com.lynx.tasm.behavior.p2050c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.p2054c.C28723a;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.c.a */
public final class C28478a extends AbstractC28495l {

    /* renamed from: a */
    Map<String, C28723a> f66977a;

    /* renamed from: c */
    private final String f66978c;

    /* renamed from: d */
    private final C28716v f66979d;

    /* renamed from: e */
    private final boolean f66980e;

    static {
        Covode.recordClassIndex(34476);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2050c.AbstractC28493k
    /* renamed from: a */
    public final void mo48990a(C28529q qVar) {
        qVar.mo49080a(this.f67006b.f67007a, this.f66978c, this.f66979d, this.f66977a, this.f66980e);
    }

    public C28478a(int i, String str, C28716v vVar, Map<String, C28723a> map, boolean z) {
        super(i, 0);
        this.f66979d = vVar;
        this.f66977a = map;
        this.f66978c = str;
        this.f66980e = z;
    }
}
