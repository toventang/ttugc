package com.p2082ss.ugc.live.p4460a.p4461a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ugc.live.a.a.g */
final /* synthetic */ class RunnableC87041g implements Runnable {

    /* renamed from: a */
    private final C87040f f196239a;

    /* renamed from: b */
    private final C87020c f196240b;

    static {
        Covode.recordClassIndex(102807);
    }

    RunnableC87041g(C87040f fVar, C87020c cVar) {
        this.f196239a = fVar;
        this.f196240b = cVar;
    }

    public final void run() {
        C87040f fVar = this.f196239a;
        C87020c cVar = this.f196240b;
        String str = cVar.f196189a;
        String d = fVar.mo140645d(cVar);
        C87045k kVar = fVar.f196231b.get(str);
        if (kVar != null) {
            for (AbstractC87026d dVar : kVar.f196250b) {
                dVar.mo16290a(d);
            }
        }
        fVar.f196231b.remove(str);
        for (AbstractC87013b bVar : fVar.f196233d) {
            bVar.mo16292a(cVar.f196190b, cVar);
        }
        fVar.f196236g--;
        fVar.f196237h = 0;
        fVar.mo140642b();
    }
}
