package com.p2082ss.android.ugc.aweme.creatortools.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.creatortools.C40450a;
import com.p2082ss.android.ugc.aweme.creatortools.api.ProAccountApi;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.api.c */
public final class C40455c {

    /* renamed from: a */
    public static C40454b f94676a;

    /* renamed from: b */
    public static final C40455c f94677b = new C40455c();

    private C40455c() {
    }

    static {
        Covode.recordClassIndex(48259);
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.api.c$a */
    public static final class C40456a implements AbstractC88986z<C40457d> {

        /* renamed from: a */
        final /* synthetic */ C88411a f94678a;

        /* renamed from: b */
        final /* synthetic */ boolean f94679b;

        /* renamed from: c */
        final /* synthetic */ AbstractC40453a f94680c;

        static {
            Covode.recordClassIndex(48260);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            this.f94678a.mo142945a(bVar);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            if (this.f94679b) {
                C40455c.f94676a = null;
            }
            AbstractC40453a aVar = this.f94680c;
            if (aVar != null) {
                aVar.mo69524a(null);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C40457d dVar) {
            C40457d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C40454b bVar = dVar2.f94683c;
            if (this.f94679b) {
                C40455c.f94676a = bVar;
            }
            AbstractC40453a aVar = this.f94680c;
            if (aVar != null) {
                aVar.mo69524a(bVar);
            }
        }

        C40456a(C88411a aVar, boolean z, AbstractC40453a aVar2) {
            this.f94678a = aVar;
            this.f94679b = z;
            this.f94680c = aVar2;
        }
    }

    /* renamed from: a */
    public static void m81691a(boolean z, C88411a aVar, AbstractC40453a aVar2) {
        C89219l.m154721d(aVar, "");
        if (C40450a.m81688a()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                ProAccountApi.C40452a.m81689a().getShowCaseResp().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C40456a(aVar, z, aVar2));
            }
        }
    }
}
