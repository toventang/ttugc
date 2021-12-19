package com.p2082ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.feedpage.C58621e;
import java.util.Map;
import java.util.Set;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.live.feedpage.h */
public final /* synthetic */ class C58626h implements AbstractC88433f {

    /* renamed from: a */
    private final C58621e.RunnableC58623a f133526a;

    /* renamed from: b */
    private final long f133527b;

    static {
        Covode.recordClassIndex(68926);
    }

    C58626h(C58621e.RunnableC58623a aVar, long j) {
        this.f133526a = aVar;
        this.f133527b = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C58621e.RunnableC58623a aVar = this.f133526a;
        long j = this.f133527b;
        C58628j jVar = (C58628j) obj;
        if (!jVar.mo96091a().isEmpty()) {
            Set<Long> keySet = jVar.mo96091a().keySet();
            Map<Long, Long> a = jVar.mo96091a();
            for (Long l : keySet) {
                C58621e.this.f133507d.put(l, Long.valueOf(j));
                Long l2 = a.get(l);
                if (l2 == null) {
                    l2 = 0L;
                }
                if (!C58621e.f133504b.equals(l2)) {
                    C58621e.this.f133506c.put(l, l2);
                } else {
                    C58621e.this.f133506c.remove(l);
                }
            }
        } else {
            C58621e.this.f133506c.put(aVar.f133515b, 0L);
        }
        aVar.mo96089a();
    }
}
