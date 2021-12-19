package com.p2082ss.android.account;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;

/* renamed from: com.ss.android.account.g */
public abstract class AbstractC29355g extends AbstractC22288a<C22292e> {
    static {
        Covode.recordClassIndex(35743);
    }

    /* renamed from: a */
    public abstract void mo51311a(C22292e eVar);

    /* renamed from: a */
    public abstract void mo51312a(C22292e eVar, String str);

    /* renamed from: b */
    public abstract void mo51313b(C22292e eVar);

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a
    /* renamed from: a */
    public final /* synthetic */ void mo36605a(C22292e eVar) {
        C22292e eVar2 = eVar;
        if (eVar2.f52713b) {
            mo51313b(eVar2);
        } else if (!eVar2.mo36606a()) {
            mo51311a(eVar2);
        } else if (eVar2.f52727m != null) {
            mo51312a(eVar2, eVar2.f52725k);
        } else {
            mo51311a(eVar2);
        }
    }
}
