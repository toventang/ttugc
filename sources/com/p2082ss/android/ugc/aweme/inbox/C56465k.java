package com.p2082ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56323c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.k */
public final class C56465k {

    /* renamed from: a */
    static final AbstractC89244h f128762a = C89250i.m154773a((AbstractC89171a) C56467b.f128766a);

    /* renamed from: b */
    public static final C56465k f128763b = new C56465k();

    /* renamed from: c */
    private static final AbstractC89244h f128764c = C89250i.m154773a((AbstractC89171a) C56466a.f128765a);

    /* renamed from: a */
    public static boolean m102443a() {
        return ((Boolean) f128764c.getValue()).booleanValue();
    }

    private C56465k() {
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.k$c */
    static final class CallableC56468c<V> implements Callable {

        /* renamed from: a */
        public static final CallableC56468c f128767a = new CallableC56468c();

        static {
            Covode.recordClassIndex(66288);
        }

        CallableC56468c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Boolean.valueOf(C56465k.m102443a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.k$a */
    static final class C56466a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56466a f128765a = new C56466a();

        static {
            Covode.recordClassIndex(66286);
        }

        C56466a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!((Boolean) C56465k.f128762a.getValue()).booleanValue());
        }
    }

    static {
        Covode.recordClassIndex(66285);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.k$b */
    static final class C56467b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56467b f128766a = new C56467b();

        static {
            Covode.recordClassIndex(66287);
        }

        C56467b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Keva b = C56465k.m102444b();
            boolean z = false;
            int i = b.getInt("expand_limit_times", 0);
            if (i < C56511t.m102471a().f128746b.f128698c) {
                if (System.currentTimeMillis() - b.getLong("expand_limit_start", 0) >= ((long) C56511t.m102471a().f128746b.f128697b) * 86400000) {
                    if (b.getInt("expand_times", 0) >= C56511t.m102471a().f128746b.f128696a) {
                        b.storeLong("expand_limit_start", System.currentTimeMillis());
                        b.storeInt("expand_times", 0);
                        b.storeInt("expand_limit_times", i + 1);
                    }
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: b */
    public static Keva m102444b() {
        String str;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        Keva repo = Keva.getRepo(("inbox_collapse_" + C56323c.m102314a() + "_") + str);
        C89219l.m154716b(repo, "");
        return repo;
    }
}
