package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1458h.AbstractC20270e;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50747h;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50710a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.c */
public final class C50756c extends AbstractC20270e<C50710a> implements AbstractC50747h {

    /* renamed from: a */
    private final AbstractC50747h f117150a;

    /* renamed from: b */
    private final AbstractC50747h f117151b;

    static {
        Covode.recordClassIndex(59924);
    }

    @Override // com.bytedance.jedi.p1445a.p1458h.AbstractC20266a
    /* renamed from: b */
    public final AbstractC88979t<C50710a> mo33640b() {
        AbstractC88979t<C50710a> d = this.f117151b.mo33639a().mo143296e(C50758b.f117153a).mo143293d(this.f117150a.mo33639a().mo143296e(C50757a.f117152a));
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.c$b */
    static final class C50758b<T, R> implements AbstractC88434g<Throwable, AbstractC88984x<? extends C50710a>> {

        /* renamed from: a */
        public static final C50758b f117153a = new C50758b();

        static {
            Covode.recordClassIndex(59926);
        }

        C50758b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ AbstractC88984x<? extends C50710a> apply(Throwable th) {
            C89219l.m154721d(th, "");
            return C88925a.m154171a(C88790v.f201616a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.c$a */
    static final class C50757a<T, R> implements AbstractC88434g<Throwable, AbstractC88984x<? extends C50710a>> {

        /* renamed from: a */
        public static final C50757a f117152a = new C50757a();

        static {
            Covode.recordClassIndex(59925);
        }

        C50757a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ AbstractC88984x<? extends C50710a> apply(Throwable th) {
            C89219l.m154721d(th, "");
            return AbstractC88979t.m154310b(new C50710a(C50687a.f117027a, true));
        }
    }

    public C50756c(AbstractC50747h hVar, AbstractC50747h hVar2) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(hVar2, "");
        this.f117150a = hVar;
        this.f117151b = hVar2;
    }
}
