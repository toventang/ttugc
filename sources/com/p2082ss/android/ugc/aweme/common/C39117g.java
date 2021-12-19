package com.p2082ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39134i;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.g */
public final class C39117g {

    /* renamed from: a */
    public static final C39117g f92317a = new C39117g();

    private C39117g() {
    }

    static {
        Covode.recordClassIndex(46735);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.g$b */
    public static final class C39119b implements AbstractC88406ae<DATA> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f92320a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f92321b;

        static {
            Covode.recordClassIndex(46737);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(DATA data) {
            this.f92320a.invoke(data);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            AbstractC89172b bVar = this.f92321b;
            if (bVar != null) {
                bVar.invoke(th);
            }
        }

        C39119b(AbstractC89172b bVar, AbstractC89172b bVar2) {
            this.f92320a = bVar;
            this.f92321b = bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.g$a */
    public static final class C39118a implements AbstractC88406ae<DATA> {

        /* renamed from: a */
        final /* synthetic */ C39121h f92318a;

        /* renamed from: b */
        final /* synthetic */ C39134i f92319b;

        static {
            Covode.recordClassIndex(46736);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSuccess(DATA data) {
            AbstractC89172b<DATA, C89391z> bVar;
            C39121h hVar = this.f92318a;
            if (!(hVar == null || (bVar = hVar.f92322a) == null)) {
                bVar.invoke(data);
            }
            this.f92319b.f92339a.setValue(new C39138j<>(data));
            this.f92319b.mo67891b();
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            AbstractC89172b<Throwable, C89391z> bVar;
            C89219l.m154721d(th, "");
            C39121h hVar = this.f92318a;
            if (!(hVar == null || (bVar = hVar.f92323b) == null)) {
                bVar.invoke(th);
            }
            C39134i iVar = this.f92319b;
            C89219l.m154721d(th, "");
            iVar.f92339a.setValue(new C39138j<>(null, th));
            this.f92319b.mo67891b();
        }

        C39118a(C39121h hVar, C39134i iVar) {
            this.f92318a = hVar;
            this.f92319b = iVar;
        }
    }

    /* renamed from: a */
    public static <DATA> void m79416a(AbstractC88979t<DATA> tVar, AbstractC89172b<? super DATA, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(bVar, "");
        AbstractC88403ab.m153601a((AbstractC88984x) tVar).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C39119b(bVar, bVar2));
    }

    /* renamed from: a */
    public static <DATA> void m79415a(AbstractC88979t<DATA> tVar, C39139k<DATA> kVar, C39121h<DATA> hVar) {
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(kVar, "");
        C39134i iVar = new C39134i();
        C89219l.m154721d(kVar, "");
        if (!iVar.mo67890a().containsKey(kVar)) {
            C39134i.C39136b bVar = new C39134i.C39136b(kVar);
            iVar.mo67890a().put(kVar, bVar);
            iVar.f92339a.observe(kVar.f92346a, bVar);
        }
        AbstractC88403ab.m153601a((AbstractC88984x) tVar).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C39118a(hVar, iVar));
    }
}
