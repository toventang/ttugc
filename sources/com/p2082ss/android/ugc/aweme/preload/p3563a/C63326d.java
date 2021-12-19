package com.p2082ss.android.ugc.aweme.preload.p3563a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.preload.p3563a.C63318c;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88985y;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.preload.a.d */
public final class C63326d {

    /* renamed from: a */
    public static final C63326d f143728a = new C63326d();

    private C63326d() {
    }

    static {
        Covode.recordClassIndex(74609);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.preload.a.d$a */
    public static final class C63327a<Upstream, Downstream> implements AbstractC88985y {

        /* renamed from: a */
        public static final C63327a f143729a = new C63327a();

        static {
            Covode.recordClassIndex(74610);
        }

        C63327a() {
        }

        @Override // p4560f.p4561a.AbstractC88985y
        /* renamed from: a */
        public final AbstractC88984x<T> mo17921a(AbstractC88979t<T> tVar) {
            C89219l.m154721d(tVar, "");
            return tVar.mo143278b(C88925a.m154182c(C88946a.f201993e)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.preload.a.d$b */
    public static final class C63328b<Upstream, Downstream> implements AbstractC88985y {

        /* renamed from: a */
        final /* synthetic */ C63329e f143730a;

        static {
            Covode.recordClassIndex(74611);
        }

        C63328b(C63329e eVar) {
            this.f143730a = eVar;
        }

        @Override // p4560f.p4561a.AbstractC88985y
        /* renamed from: a */
        public final AbstractC88984x<T> mo17921a(AbstractC88979t<T> tVar) {
            C89219l.m154721d(tVar, "");
            C63318c cVar = C63318c.C63321c.f143718a;
            C63329e eVar = this.f143730a;
            C89219l.m154721d(eVar, "");
            return tVar.mo143278b((AbstractC88398aa) new C63318c.C63322d(cVar, eVar)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        }
    }

    /* renamed from: a */
    public static <T> AbstractC88985y<T, T> m114817a(C63329e eVar) {
        C89219l.m154721d(eVar, "");
        if (eVar.f143734c > 10 || eVar.f143734c <= 0) {
            throw new IllegalArgumentException("Priority should be between RxTaskInfo.PRIORITY_BACKGROUND and RxTaskInfo.PRIORITY_IMMEDIATE!".toString());
        } else if (10 == eVar.f143734c) {
            return C63327a.f143729a;
        } else {
            return new C63328b(eVar);
        }
    }
}
