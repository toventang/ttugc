package com.p2082ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.request.b */
public final class C60132b {

    /* renamed from: c */
    public static final C60134b f137067c = new C60134b((byte) 0);

    /* renamed from: a */
    public int f137068a;

    /* renamed from: b */
    public int f137069b = 10;

    /* renamed from: d */
    private final AbstractC89244h f137070d = C89250i.m154773a((AbstractC89171a) C60135c.f137073a);

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.b$a */
    public static final class C60133a {

        /* renamed from: a */
        public int f137071a = 10;

        /* renamed from: b */
        public int f137072b;

        static {
            Covode.recordClassIndex(70660);
        }
    }

    static {
        Covode.recordClassIndex(70659);
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.b$b */
    public static final class C60134b {
        static {
            Covode.recordClassIndex(70661);
        }

        private C60134b() {
        }

        public /* synthetic */ C60134b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.b$c */
    static final class C60135c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C60135c f137073a = new C60135c();

        static {
            Covode.recordClassIndex(70662);
        }

        C60135c() {
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
