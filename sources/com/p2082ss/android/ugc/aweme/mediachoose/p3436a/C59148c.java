package com.p2082ss.android.ugc.aweme.mediachoose.p3436a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1447b.C20155b;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20181b;
import com.bytedance.jedi.p1445a.p1459i.AbstractC20272a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20284a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.bytedance.jedi.p1445a.p1461k.AbstractC20292c;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.a.c */
public final class C59148c extends AbstractC20287b {

    /* renamed from: c */
    public static final AbstractC89244h f134581c = C89250i.m154773a((AbstractC89171a) C59152b.f134589a);

    /* renamed from: d */
    public static final C59151a f134582d = new C59151a((byte) 0);

    /* renamed from: b */
    public final C59147b f134583b;

    /* renamed from: e */
    private final C59144a f134584e;

    /* renamed from: f */
    private final C59144a f134585f;

    /* renamed from: g */
    private final C59144a f134586g;

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a.c$a */
    public static final class C59151a {
        static {
            Covode.recordClassIndex(69509);
        }

        /* renamed from: a */
        public static C59148c m108660a() {
            return (C59148c) C59148c.f134581c.getValue();
        }

        private C59151a() {
        }

        public /* synthetic */ C59151a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a.c$b */
    static final class C59152b extends AbstractC89220m implements AbstractC89171a<C59148c> {

        /* renamed from: a */
        public static final C59152b f134589a = new C59152b();

        static {
            Covode.recordClassIndex(69510);
        }

        C59152b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C59148c invoke() {
            return new C59148c((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(69506);
    }

    private C59148c() {
        C59144a aVar = new C59144a();
        this.f134584e = aVar;
        C59144a aVar2 = new C59144a();
        this.f134585f = aVar2;
        this.f134586g = new C59144a();
        C59147b bVar = new C59147b();
        this.f134583b = bVar;
        AbstractC20292c unused = mo33647a(C20165b.m38139a(aVar), C20165b.m38137a(bVar), AbstractC20272a.C20276b.m38473a(AbstractC20272a.C20276b.C20277a.f48121a, AbstractC20284a.C20285a.C20286a.f48130a));
        mo33647a(C20165b.m38139a(aVar2), C20165b.m38137a(bVar), AbstractC20272a.C20276b.m38473a(C591491.f134587a, C591502.f134588a));
    }

    public /* synthetic */ C59148c(byte b) {
        this();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a.c$c */
    public static final class C59153c extends AbstractC89220m implements AbstractC89183m<AbstractC88979t<C59154d>, AbstractC88979t<C59154d>, AbstractC88979t<C59154d>> {

        /* renamed from: a */
        public static final C59153c f134590a = new C59153c();

        static {
            Covode.recordClassIndex(69511);
        }

        C59153c() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ AbstractC88979t<C59154d> invoke(AbstractC88979t<C59154d> tVar, AbstractC88979t<C59154d> tVar2) {
            AbstractC88979t<C59154d> tVar3 = tVar;
            AbstractC88979t<C59154d> tVar4 = tVar2;
            C89219l.m154721d(tVar3, "");
            C89219l.m154721d(tVar4, "");
            AbstractC88979t<C59154d> d = tVar4.mo143293d(tVar3);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: a */
    public final AbstractC88979t<C59154d> mo96653a(C59155e eVar, AbstractC59174d dVar) {
        AbstractC20181b bVar;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(dVar, "");
        if (C89219l.m154714a(dVar, AbstractC59174d.C59175a.f134652a)) {
            bVar = C20155b.m38133a(this.f134584e, this.f134583b, C20155b.C20156a.f47930a).mo33480a(C59153c.f134590a);
        } else if (C89219l.m154714a(dVar, AbstractC59174d.C59176b.f134653a)) {
            bVar = this.f134585f;
        } else if (C89219l.m154714a(dVar, AbstractC59174d.C59177c.f134654a)) {
            bVar = this.f134586g;
        } else {
            throw new C89376n();
        }
        return bVar.mo33487c(eVar);
    }
}
