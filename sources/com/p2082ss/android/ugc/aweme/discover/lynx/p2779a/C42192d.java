package com.p2082ss.android.ugc.aweme.discover.lynx.p2779a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.a.d */
public final class C42192d {

    /* renamed from: a */
    private final List<AbstractC42191c> f98349a = new ArrayList();

    static {
        Covode.recordClassIndex(50131);
    }

    /* renamed from: a */
    public final void mo71391a(AbstractC42191c cVar) {
        C89219l.m154721d(cVar, "");
        this.f98349a.add(cVar);
    }

    /* renamed from: a */
    public final void mo71390a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        for (AbstractC42191c cVar : this.f98349a) {
            cVar.mo71389a(bVar);
        }
    }
}
