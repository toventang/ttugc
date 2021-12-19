package com.p2082ss.android.ugc.aweme.account.login.authorize.p2256b;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.p2082ss.android.account.AbstractC29355g;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.b.b */
public final class C31874b extends AbstractC29355g {

    /* renamed from: c */
    private final WeakReference<AbstractC31873a> f76168c;

    static {
        Covode.recordClassIndex(38618);
    }

    public C31874b(AbstractC31873a aVar) {
        this.f76168c = new WeakReference<>(aVar);
    }

    @Override // com.p2082ss.android.account.AbstractC29355g
    /* renamed from: a */
    public final void mo51311a(C22292e eVar) {
        if (this.f76168c.get() != null) {
            this.f76168c.get().mo57796a(eVar.f52715d, eVar.f52717f, eVar.f52735u, eVar);
        }
    }

    @Override // com.p2082ss.android.account.AbstractC29355g
    /* renamed from: b */
    public final void mo51313b(C22292e eVar) {
        if (this.f76168c.get() != null) {
            this.f76168c.get().mo57798a(eVar.f52724j);
        }
    }

    @Override // com.p2082ss.android.account.AbstractC29355g
    /* renamed from: a */
    public final void mo51312a(C22292e eVar, String str) {
        if (this.f76168c.get() != null) {
            this.f76168c.get().mo57796a(eVar.f52715d, eVar.f52717f, eVar.f52735u, eVar);
        }
    }
}
