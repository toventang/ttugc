package com.p2082ss.android.ugc.aweme.story.live;

import com.bytedance.android.livesdkapi.p699l.AbstractC11827c;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.android.livesdkapi.p699l.C11826b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C35470cg;
import com.p2082ss.android.ugc.aweme.C35478ch;
import com.p2082ss.android.ugc.aweme.live.model.C58722b;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.story.live.h */
final /* synthetic */ class C77358h implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC11827c f173555a;

    static {
        Covode.recordClassIndex(90387);
    }

    C77358h(AbstractC11827c cVar) {
        this.f173555a = cVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC11827c cVar = this.f173555a;
        C58722b bVar = (C58722b) obj;
        C77355e.f173551b = bVar.f133653a.f133654a;
        C77355e.f173552c = bVar.f133653a.f133655b.f83672d;
        C35478ch chVar = bVar.f133653a.f133655b;
        C35470cg cgVar = bVar.f133653a.f133656c;
        C11825a aVar = null;
        C11826b bVar2 = chVar != null ? new C11826b(chVar.f83672d, chVar.f83669a, chVar.f83671c, chVar.f83670b, chVar.f83673e) : null;
        if (cgVar != null) {
            aVar = new C11825a(cgVar.f83651c, cgVar.f83650b, cgVar.f83649a);
        }
        cVar.mo14878a(Boolean.valueOf(C77355e.f173551b), bVar2, aVar);
    }
}
