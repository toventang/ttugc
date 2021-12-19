package com.p2082ss.ugc.live.p4460a.p4461a;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* renamed from: com.ss.ugc.live.a.a.j */
final /* synthetic */ class RunnableC87044j implements Runnable {

    /* renamed from: a */
    private final C87040f f196246a;

    /* renamed from: b */
    private final C87020c f196247b;

    /* renamed from: c */
    private final int f196248c;

    static {
        Covode.recordClassIndex(102810);
    }

    RunnableC87044j(C87040f fVar, C87020c cVar, int i) {
        this.f196246a = fVar;
        this.f196247b = cVar;
        this.f196248c = i;
    }

    public final void run() {
        C87045k kVar = this.f196246a.f196231b.get(this.f196247b.f196189a);
        if (kVar != null) {
            Iterator<AbstractC87026d> it = kVar.f196250b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
