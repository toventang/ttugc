package com.p2082ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86841f;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.p4440a.AbstractC86691a;
import com.p2082ss.ugc.effectplatform.p4440a.C86693b;
import com.p2082ss.ugc.effectplatform.p4440a.C86696c;
import com.p2082ss.ugc.effectplatform.p4444b.C86734a;
import com.p2082ss.ugc.effectplatform.task.C86861aa;
import com.p2082ss.ugc.effectplatform.task.C86880aj;
import com.p2082ss.ugc.effectplatform.task.p4457a.C86855a;
import com.p2082ss.ugc.effectplatform.task.p4457a.C86859c;
import com.p2082ss.ugc.effectplatform.task.p4459c.C86904a;
import java.util.ArrayList;
import java.util.Collection;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.algorithm.a */
public final class C86704a implements AbstractC86691a {

    /* renamed from: a */
    public final C86855a f195521a;

    /* renamed from: b */
    private final C86687a f195522b;

    /* renamed from: c */
    private final C86861aa f195523c;

    /* renamed from: d */
    private final C86712f f195524d;

    /* renamed from: e */
    private final C86734a f195525e;

    static {
        Covode.recordClassIndex(102403);
    }

    @Override // com.p2082ss.ugc.effectplatform.p4440a.AbstractC86691a
    /* renamed from: a */
    public final C86880aj<C86904a> mo78960a(C86693b bVar) {
        C89219l.m154719c(bVar, "");
        return new C86855a(new C86696c(this.f195522b).mo78960a(bVar), bVar, this.f195523c, this.f195524d, this.f195525e, this.f195522b);
    }

    /* renamed from: a */
    public final Collection<ModelInfo> mo139940a(String[] strArr) {
        ArrayList arrayList;
        C86841f a = C86861aa.C86862a.m150471a().mo140589a(0);
        if (a == null) {
            return new ArrayList();
        }
        try {
            C86855a aVar = this.f195521a;
            C89219l.m154719c(a, "");
            arrayList = C89379q.m157068constructorimpl(new C86859c(aVar.f195813d, aVar.f195810a, aVar.f195811b, aVar.f195812c, null, 0, 112).mo140585a(0, strArr, a));
        } catch (Throwable th) {
            arrayList = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        ArrayList arrayList2 = new ArrayList();
        if (C89379q.m157073isFailureimpl(arrayList)) {
            arrayList = arrayList2;
        }
        return (Collection) arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0090, code lost:
        if (r2 == null) goto L_0x0092;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139941a(java.util.List<java.lang.String> r60, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r61) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.algorithm.C86704a.mo139941a(java.util.List, java.util.Map):void");
    }

    public C86704a(C86687a aVar, C86861aa aaVar, C86712f fVar, C86734a aVar2) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(aVar2, "");
        this.f195522b = aVar;
        this.f195523c = aaVar;
        this.f195524d = fVar;
        this.f195525e = aVar2;
        this.f195521a = new C86855a(null, null, aaVar, fVar, aVar2, aVar);
    }
}
