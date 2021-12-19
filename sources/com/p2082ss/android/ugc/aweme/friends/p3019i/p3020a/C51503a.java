package com.p2082ss.android.ugc.aweme.friends.p3019i.p3020a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.service.IFriendsService;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import p4600h.C89376n;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.i.a.a */
public final class C51503a implements IFriendsService.AbstractC51640d {

    /* renamed from: a */
    public static String f118689a;

    /* renamed from: b */
    public static C51503a f118690b;

    /* renamed from: c */
    public static final C51504a f118691c = new C51504a((byte) 0);

    /* renamed from: d */
    private final Keva f118692d;

    /* renamed from: com.ss.android.ugc.aweme.friends.i.a.a$a */
    public static final class C51504a {
        static {
            Covode.recordClassIndex(60769);
        }

        private C51504a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r2, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0020;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p2082ss.android.ugc.aweme.friends.p3019i.p3020a.C51503a m95974a() {
            /*
                r3 = 14212(0x3784, float:1.9915E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
                com.ss.android.ugc.aweme.friends.i.a.a r0 = com.p2082ss.android.ugc.aweme.friends.p3019i.p3020a.C51503a.f118690b
                if (r0 == 0) goto L_0x0020
                java.lang.String r2 = com.p2082ss.android.ugc.aweme.friends.p3019i.p3020a.C51503a.f118689a
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                java.lang.String r0 = r1.getCurUserId()
                boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r2, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0041
            L_0x0020:
                java.lang.Class<com.ss.android.ugc.aweme.friends.i.a.a> r2 = com.p2082ss.android.ugc.aweme.friends.p3019i.p3020a.C51503a.class
                monitor-enter(r2)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()     // Catch:{ all -> 0x003a }
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)     // Catch:{ all -> 0x003a }
                java.lang.String r0 = r1.getCurUserId()     // Catch:{ all -> 0x003a }
                com.p2082ss.android.ugc.aweme.friends.p3019i.p3020a.C51503a.f118689a = r0     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.friends.i.a.a r0 = new com.ss.android.ugc.aweme.friends.i.a.a     // Catch:{ all -> 0x003a }
                r0.<init>()     // Catch:{ all -> 0x003a }
                com.p2082ss.android.ugc.aweme.friends.p3019i.p3020a.C51503a.f118690b = r0     // Catch:{ all -> 0x003a }
                goto L_0x0040
            L_0x003a:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                throw r0
            L_0x0040:
                monitor-exit(r2)
            L_0x0041:
                com.ss.android.ugc.aweme.friends.i.a.a r0 = com.p2082ss.android.ugc.aweme.friends.p3019i.p3020a.C51503a.f118690b
                if (r0 != 0) goto L_0x0048
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0048:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3019i.p3020a.C51503a.C51504a.m95974a():com.ss.android.ugc.aweme.friends.i.a.a");
        }

        public /* synthetic */ C51504a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(60768);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        f118689a = g.getCurUserId();
    }

    public C51503a() {
        Keva repo = Keva.getRepo("recommend_friends_in_dm" + f118689a);
        C89219l.m154716b(repo, "");
        this.f118692d = repo;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService.AbstractC51640d
    /* renamed from: a */
    public final C89378p<Boolean, Long> mo87019a(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        int i = C51505b.f118693a[fVar.ordinal()];
        if (i == 1) {
            return C89387v.m154943a(Boolean.valueOf(this.f118692d.getBoolean("should_hide_facebook_source_type", false)), Long.valueOf(this.f118692d.getLong("hide_facebook_time#", -1)));
        } else if (i == 2) {
            return C89387v.m154943a(Boolean.valueOf(this.f118692d.getBoolean("should_hide_contact_source_type", false)), Long.valueOf(this.f118692d.getLong("hide_contact_time#", -1)));
        } else {
            throw new C89376n();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService.AbstractC51640d
    /* renamed from: a */
    public final void mo87020a(EnumC66622f fVar, C89378p<Boolean, Long> pVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(pVar, "");
        int i = C51505b.f118694b[fVar.ordinal()];
        if (i == 1) {
            this.f118692d.storeBoolean("should_hide_facebook_source_type", pVar.getFirst().booleanValue());
            this.f118692d.storeLong("hide_facebook_time#", pVar.getSecond().longValue());
        } else if (i == 2) {
            this.f118692d.storeBoolean("should_hide_contact_source_type", pVar.getFirst().booleanValue());
            this.f118692d.storeLong("hide_contact_time#", pVar.getSecond().longValue());
        }
    }
}
