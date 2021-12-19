package com.p2082ss.android.ugc.aweme.discover.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1447b.C20155b;
import com.bytedance.jedi.p1445a.p1447b.C20157c;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1459i.AbstractC20272a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import com.p2082ss.android.ugc.aweme.discover.repo.fetcher.C42506b;
import com.p2082ss.android.ugc.aweme.discover.repo.fetcher.C42516c;
import com.p2082ss.android.ugc.aweme.discover.repo.gson.C42519a;
import com.p2082ss.android.ugc.aweme.discover.repo.p2796a.C42502a;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.repo.a */
public final class C42499a extends AbstractC20287b {

    /* renamed from: b */
    public static final C42501a f99103b = new C42501a((byte) 0);

    /* renamed from: d */
    private static final C42502a f99104d = new C42502a();

    /* renamed from: c */
    private final C42506b f99105c;

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.a$a */
    public static final class C42501a {
        static {
            Covode.recordClassIndex(50589);
        }

        private C42501a() {
        }

        public /* synthetic */ C42501a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(50587);
    }

    public C42499a() {
        C42506b bVar = new C42506b();
        this.f99105c = bVar;
        if (C42519a.m85003a()) {
            C42519a.f99137b.submit(C42519a.RunnableC42522c.f99143a);
        }
        mo33647a(C20165b.m38139a(bVar), C20165b.m38137a(f99104d), AbstractC20272a.C20276b.m38473a(AbstractC20272a.C20276b.C20277a.f48121a, C425001.f99106a));
    }

    /* renamed from: a */
    public final AbstractC88979t<DiscoverSectionList> mo72653a(C42516c cVar, boolean z) {
        AbstractC88979t c;
        C89219l.m154721d(cVar, "");
        if (cVar.getCursor() != -1 || !z) {
            c = this.f99105c.mo33487c(cVar);
        } else {
            c = C20155b.m38133a(this.f99105c, f99104d, C20155b.C20156a.f47930a).mo33480a(C20157c.C20159b.f47933a).mo33487c(cVar);
        }
        AbstractC88979t<DiscoverSectionList> b = c.mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }
}
