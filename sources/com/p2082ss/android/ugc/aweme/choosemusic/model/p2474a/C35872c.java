package com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1447b.C20155b;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1459i.AbstractC20272a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20284a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.bytedance.jedi.p1445a.p1461k.AbstractC20292c;
import com.p2082ss.android.ugc.aweme.choosemusic.model.p2474a.AbstractC35878f;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.a.c */
public final class C35872c extends AbstractC20287b {

    /* renamed from: c */
    public static final AbstractC89244h f84661c = C89250i.m154773a((AbstractC89171a) C35874b.f84665a);

    /* renamed from: d */
    public static final C35873a f84662d = new C35873a((byte) 0);

    /* renamed from: b */
    public final C35868a f84663b;

    /* renamed from: e */
    private final C35869b f84664e;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.model.a.c$a */
    public static final class C35873a {
        static {
            Covode.recordClassIndex(43113);
        }

        /* renamed from: a */
        public static C35872c m73265a() {
            return (C35872c) C35872c.f84661c.getValue();
        }

        private C35873a() {
        }

        public /* synthetic */ C35873a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.model.a.c$b */
    static final class C35874b extends AbstractC89220m implements AbstractC89171a<C35872c> {

        /* renamed from: a */
        public static final C35874b f84665a = new C35874b();

        static {
            Covode.recordClassIndex(43114);
        }

        C35874b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C35872c invoke() {
            return new C35872c((byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(43112);
    }

    private C35872c() {
        C35869b bVar = new C35869b();
        this.f84664e = bVar;
        C35868a aVar = new C35868a();
        this.f84663b = aVar;
        AbstractC20292c unused = mo33647a(C20165b.m38139a(bVar), C20165b.m38137a(aVar), AbstractC20272a.C20276b.m38473a(AbstractC20272a.C20276b.C20277a.f48121a, AbstractC20284a.C20285a.C20286a.f48130a));
    }

    public /* synthetic */ C35872c(byte b) {
        this();
    }

    /* renamed from: a */
    public final AbstractC88979t<C35876d> mo62973a(C35877e eVar, AbstractC35878f fVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(fVar, "");
        return C20155b.m38133a(this.f84664e, this.f84663b, C20155b.C20156a.f47930a).mo33480a(new C35875c(fVar)).mo33487c(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.model.a.c$c */
    public static final class C35875c extends AbstractC89220m implements AbstractC89183m<AbstractC88979t<C35876d>, AbstractC88979t<C35876d>, AbstractC88979t<C35876d>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC35878f f84666a;

        static {
            Covode.recordClassIndex(43115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35875c(AbstractC35878f fVar) {
            super(2);
            this.f84666a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ AbstractC88979t<C35876d> invoke(AbstractC88979t<C35876d> tVar, AbstractC88979t<C35876d> tVar2) {
            AbstractC88979t<C35876d> tVar3 = tVar;
            AbstractC88979t<C35876d> tVar4 = tVar2;
            C89219l.m154721d(tVar3, "");
            C89219l.m154721d(tVar4, "");
            AbstractC35878f fVar = this.f84666a;
            if (C89219l.m154714a(fVar, AbstractC35878f.C35879a.f84673a)) {
                AbstractC88979t<C35876d> d = tVar4.mo143293d(tVar3);
                C89219l.m154716b(d, "");
                return d;
            } else if (C89219l.m154714a(fVar, AbstractC35878f.C35880b.f84674a)) {
                return tVar3;
            } else {
                throw new C89376n();
            }
        }
    }
}
