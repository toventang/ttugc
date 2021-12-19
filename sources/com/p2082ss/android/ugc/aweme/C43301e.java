package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import java.util.ArrayList;
import java.util.Collection;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.e */
public final /* synthetic */ class C43301e implements AbstractC1729g {

    /* renamed from: a */
    private final Bundle f101071a;

    static {
        Covode.recordClassIndex(51510);
    }

    public C43301e(Bundle bundle) {
        this.f101071a = bundle;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        Bundle bundle = this.f101071a;
        ArrayList arrayList = new ArrayList();
        C53427i.m98592a(bundle, arrayList);
        C53427i.m98594c(bundle, arrayList);
        C53427i.m98595d(bundle, arrayList);
        C53427i.m98593b(bundle, arrayList);
        C31373a.C31374a.m65593a(C89070n.m154585g((Collection) arrayList));
        C31373a.C31374a.m65590a();
        C31373a.C31374a.m65591a(bundle);
        return iVar.mo5545d();
    }
}
