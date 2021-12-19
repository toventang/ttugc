package com.p2082ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.request.c */
public final class C60136c {

    /* renamed from: c */
    public static final C60138b f137074c = new C60138b((byte) 0);

    /* renamed from: a */
    public int f137075a;

    /* renamed from: b */
    public int f137076b = 10;

    /* renamed from: d */
    private final AbstractC89244h f137077d = C89250i.m154773a((AbstractC89171a) C60139c.f137080a);

    static {
        Covode.recordClassIndex(70663);
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.c$b */
    public static final class C60138b {
        static {
            Covode.recordClassIndex(70665);
        }

        private C60138b() {
        }

        public /* synthetic */ C60138b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.c$a */
    public static final class C60137a {

        /* renamed from: a */
        public int f137078a;

        /* renamed from: b */
        private int f137079b = 10;

        static {
            Covode.recordClassIndex(70664);
        }

        /* renamed from: a */
        public final C60136c mo97814a() {
            C60136c cVar = new C60136c();
            cVar.f137075a = this.f137078a;
            cVar.f137076b = this.f137079b;
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.c$c */
    static final class C60139c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C60139c f137080a = new C60139c();

        static {
            Covode.recordClassIndex(70666);
        }

        C60139c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            IAccountUserService e = AccountService.m65215a().mo57069e();
            C89219l.m154716b(e, "");
            return e.getCurUserId();
        }
    }
}
