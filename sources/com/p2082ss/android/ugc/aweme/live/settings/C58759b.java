package com.p2082ss.android.ugc.aweme.live.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1469l.C20688a;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20695e;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.live.settings.b */
final /* synthetic */ class C58759b implements AbstractC1729g {

    /* renamed from: a */
    private final Context f133727a;

    static {
        Covode.recordClassIndex(69066);
    }

    C58759b(Context context) {
        this.f133727a = context;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C58760c cVar;
        Context context = this.f133727a;
        if (iVar.mo5544c() || (cVar = (C58760c) iVar.mo5545d()) == null || cVar.status_code != 0 || cVar.f133728a == null) {
            return null;
        }
        ((AbstractC20695e) C20688a.m38943b(AbstractC20695e.class)).mo34108a(context, cVar.f133728a);
        return null;
    }
}
