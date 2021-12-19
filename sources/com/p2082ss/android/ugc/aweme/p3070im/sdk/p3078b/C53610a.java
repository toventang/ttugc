package com.p2082ss.android.ugc.aweme.p3070im.sdk.p3078b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.b.a */
public final class C53610a {

    /* renamed from: a */
    public static final C53610a f123035a = new C53610a();

    /* renamed from: b */
    private static final AbstractC89244h f123036b = C89250i.m154773a((AbstractC89171a) C53611a.f123037a);

    /* renamed from: a */
    public static Keva m98851a() {
        return (Keva) f123036b.getValue();
    }

    private C53610a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.a$a */
    static final class C53611a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C53611a f123037a = new C53611a();

        static {
            Covode.recordClassIndex(63191);
        }

        C53611a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("upvote_bounce_in_im");
        }
    }

    /* renamed from: b */
    public static String m98852b() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return g.getCurUserId();
    }

    static {
        Covode.recordClassIndex(63190);
    }
}
