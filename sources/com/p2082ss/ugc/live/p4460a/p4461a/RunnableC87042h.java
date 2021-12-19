package com.p2082ss.ugc.live.p4460a.p4461a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.p4460a.p4461a.p4464c.C87021a;

/* renamed from: com.ss.ugc.live.a.a.h */
final /* synthetic */ class RunnableC87042h implements Runnable {

    /* renamed from: a */
    private final C87040f f196241a;

    /* renamed from: b */
    private final C87020c f196242b;

    /* renamed from: c */
    private final C87021a f196243c;

    static {
        Covode.recordClassIndex(102808);
    }

    RunnableC87042h(C87040f fVar, C87020c cVar, C87021a aVar) {
        this.f196241a = fVar;
        this.f196242b = cVar;
        this.f196243c = aVar;
    }

    public final void run() {
        C87040f fVar = this.f196241a;
        C87020c cVar = this.f196242b;
        C87021a aVar = this.f196243c;
        C87045k kVar = fVar.f196231b.get(cVar.f196189a);
        if (kVar != null) {
            if (cVar.f196196h < Math.max(cVar.f196191c.length, fVar.f196232c.f196216c) - 1) {
                fVar.f196235f.postDelayed(new RunnableC87043i(fVar, cVar), (long) fVar.f196232c.mo140638a());
                return;
            }
        }
        fVar.f196234e.put(cVar.f196189a, new Pair<>(false, Long.valueOf(System.currentTimeMillis())));
        if (kVar != null) {
            for (AbstractC87026d dVar : kVar.f196250b) {
                dVar.mo16291a(aVar);
            }
        }
        fVar.f196231b.remove(cVar.f196189a);
        for (AbstractC87013b bVar : fVar.f196233d) {
            bVar.mo16293a(aVar);
        }
        fVar.f196236g--;
        fVar.f196237h++;
        fVar.mo140642b();
    }
}
