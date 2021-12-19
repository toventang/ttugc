package com.p2082ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.tools.draft.ad */
public final /* synthetic */ class CallableC78128ad implements Callable {

    /* renamed from: a */
    private final C78473z f175459a;

    /* renamed from: b */
    private final List f175460b;

    static {
        Covode.recordClassIndex(91243);
    }

    CallableC78128ad(C78473z zVar, List list) {
        this.f175459a = zVar;
        this.f175460b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C78473z zVar = this.f175459a;
        List<C43223c> list = this.f175460b;
        if (!zVar.f129386a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C43223c cVar : list) {
                arrayList.add(cVar);
            }
        }
        zVar.f176352c.setVisibility(8);
        zVar.f176358i.mo122051a(list);
        zVar.mo122393b(list);
        return arrayList;
    }
}
