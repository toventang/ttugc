package com.p2082ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.c */
final /* synthetic */ class CallableC78213c implements Callable {

    /* renamed from: a */
    private final C78121a f175668a;

    /* renamed from: b */
    private final List f175669b;

    static {
        Covode.recordClassIndex(91328);
    }

    CallableC78213c(C78121a aVar, List list) {
        this.f175668a = aVar;
        this.f175669b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        for (C43223c cVar : this.f175669b) {
            if (cVar.f100925y) {
                C78121a.m136579a(cVar);
                C1731i.m5640b(new CallableC78248f(cVar), C1731i.f5564c);
            }
        }
        return null;
    }
}
