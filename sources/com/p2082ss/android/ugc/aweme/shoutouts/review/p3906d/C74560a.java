package com.p2082ss.android.ugc.aweme.shoutouts.review.p3906d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shoutouts.model.C74440d;
import com.p2082ss.android.ugc.aweme.shoutouts.model.C74443g;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrderListApi;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsProductApi;
import com.p2082ss.android.ugc.aweme.shoutouts.p3901a.AbstractC74382a;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.d.a */
public final class C74560a {

    /* renamed from: a */
    public final AbstractC74382a.AbstractC74383a f167664a;

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.d.a$a */
    static final class C74561a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C74561a f167665a = new C74561a();

        static {
            Covode.recordClassIndex(87368);
        }

        C74561a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.d.a$c */
    static final class C74563c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C74563c f167667a = new C74563c();

        static {
            Covode.recordClassIndex(87370);
        }

        C74563c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.d.a$f */
    static final class C74566f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C74566f f167670a = new C74566f();

        static {
            Covode.recordClassIndex(87373);
        }

        C74566f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(87367);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.d.a$d */
    static final class C74564d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C74560a f167668a;

        static {
            Covode.recordClassIndex(87371);
        }

        C74564d(C74560a aVar) {
            this.f167668a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f167668a.f167664a.mo116999a();
        }
    }

    public C74560a(AbstractC74382a.AbstractC74383a aVar) {
        C89219l.m154721d(aVar, "");
        this.f167664a = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.d.a$b */
    static final class C74562b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C74560a f167666a;

        static {
            Covode.recordClassIndex(87369);
        }

        C74562b(C74560a aVar) {
            this.f167666a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C74440d dVar = (C74440d) obj;
            if (dVar != null && dVar.f167405a == 0 && dVar.f167406b != null && dVar.f167406b.length != 0) {
                this.f167666a.f167664a.mo117001b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.d.a$e */
    static final class C74565e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C74560a f167669a;

        static {
            Covode.recordClassIndex(87372);
        }

        C74565e(C74560a aVar) {
            this.f167669a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C74443g gVar = (C74443g) obj;
            if (gVar == null || gVar.f167421a != 0 || gVar.f167422b == null) {
                this.f167669a.f167664a.mo116999a();
            } else {
                this.f167669a.f167664a.mo117000a(gVar.f167422b);
            }
        }
    }

    /* renamed from: a */
    public final void mo117223a(String str) {
        C89219l.m154721d(str, "");
        ShoutoutsOrderListApi.C74432a.m130886a().getOrderList(2, str, 1).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143264a(C74561a.f167665a).mo143254a(new C74562b(this), C74563c.f167667a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066 A[Catch:{ Exception -> 0x0067 }, RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m130985b(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shoutouts.review.p3906d.C74560a.m130985b(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo117224a(String str, String str2) {
        ShoutoutsProductApi.C74433a.m130891a().getProduct(str, str2).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142924c(new C74564d(this)).mo142915a(new C74565e(this), C74566f.f167670a);
    }
}
