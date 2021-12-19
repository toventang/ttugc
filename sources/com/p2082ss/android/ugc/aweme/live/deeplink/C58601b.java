package com.p2082ss.android.ugc.aweme.live.deeplink;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.deeplink.b */
public final class C58601b implements AbstractC58600a {

    /* renamed from: a */
    public static final C58601b f133467a = new C58601b();

    /* renamed from: b */
    private static UniqueIdApi f133468b;

    /* renamed from: com.ss.android.ugc.aweme.live.deeplink.b$b */
    static final class C58603b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C58603b f133470a = new C58603b();

        static {
            Covode.recordClassIndex(68900);
        }

        C58603b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C58601b() {
    }

    static {
        Covode.recordClassIndex(68898);
        Object a = RetrofitFactory.m33635a().mo28817b("https://" + C17867d.f42587k.f42569a).mo28832d().mo28858a(UniqueIdApi.class);
        C89219l.m154716b(a, "");
        f133468b = (UniqueIdApi) a;
    }

    /* renamed from: com.ss.android.ugc.aweme.live.deeplink.b$a */
    static final class C58602a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f133469a;

        static {
            Covode.recordClassIndex(68899);
        }

        C58602a(AbstractC89172b bVar) {
            this.f133469a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f133469a.invoke(obj);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.deeplink.AbstractC58600a
    /* renamed from: a */
    public final void mo96057a(String str, AbstractC89172b<? super C58604c, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        f133468b.getRoomId(str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C58602a(bVar), C58603b.f133470a);
    }
}
