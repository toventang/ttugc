package com.p2082ss.android.ugc.aweme.relation.p3674c;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.c.c */
public final class C66893c {

    /* renamed from: b */
    public static String f150172b;

    /* renamed from: c */
    public static C66893c f150173c;

    /* renamed from: d */
    public static final C66894a f150174d = new C66894a((byte) 0);

    /* renamed from: a */
    public final Keva f150175a;

    /* renamed from: com.ss.android.ugc.aweme.relation.c.c$a */
    public static final class C66894a {
        static {
            Covode.recordClassIndex(78469);
        }

        private C66894a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r2, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0020;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p2082ss.android.ugc.aweme.relation.p3674c.C66893c m118637a() {
            /*
                r3 = 14247(0x37a7, float:1.9964E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
                com.ss.android.ugc.aweme.relation.c.c r0 = com.p2082ss.android.ugc.aweme.relation.p3674c.C66893c.f150173c
                if (r0 == 0) goto L_0x0020
                java.lang.String r2 = com.p2082ss.android.ugc.aweme.relation.p3674c.C66893c.f150172b
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                java.lang.String r0 = r1.getCurUserId()
                boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r2, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0041
            L_0x0020:
                java.lang.Class<com.ss.android.ugc.aweme.relation.c.c> r2 = com.p2082ss.android.ugc.aweme.relation.p3674c.C66893c.class
                monitor-enter(r2)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()     // Catch:{ all -> 0x003a }
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)     // Catch:{ all -> 0x003a }
                java.lang.String r0 = r1.getCurUserId()     // Catch:{ all -> 0x003a }
                com.p2082ss.android.ugc.aweme.relation.p3674c.C66893c.f150172b = r0     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.relation.c.c r0 = new com.ss.android.ugc.aweme.relation.c.c     // Catch:{ all -> 0x003a }
                r0.<init>()     // Catch:{ all -> 0x003a }
                com.p2082ss.android.ugc.aweme.relation.p3674c.C66893c.f150173c = r0     // Catch:{ all -> 0x003a }
                goto L_0x0040
            L_0x003a:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                throw r0
            L_0x0040:
                monitor-exit(r2)
            L_0x0041:
                com.ss.android.ugc.aweme.relation.c.c r0 = com.p2082ss.android.ugc.aweme.relation.p3674c.C66893c.f150173c
                if (r0 != 0) goto L_0x0048
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0048:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.p3674c.C66893c.C66894a.m118637a():com.ss.android.ugc.aweme.relation.c.c");
        }

        public /* synthetic */ C66894a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(78468);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        f150172b = g.getCurUserId();
    }

    public C66893c() {
        Keva repo = Keva.getRepo("social_relation" + f150172b);
        C89219l.m154716b(repo, "");
        this.f150175a = repo;
    }

    /* renamed from: a */
    public final void mo105822a(int i, int i2) {
        m118633d(i, i2);
        m118632a(i, i2, System.currentTimeMillis());
    }

    /* renamed from: b */
    public final boolean mo105823b(int i, int i2) {
        return this.f150175a.getBoolean("go_through_social_recommend_flow" + i + i2, false);
    }

    /* renamed from: c */
    public final long mo105824c(int i, int i2) {
        return this.f150175a.getLong("go_through_time_ms" + i + i2, -1);
    }

    /* renamed from: d */
    private final void m118633d(int i, int i2) {
        this.f150175a.storeBoolean("go_through_social_recommend_flow".concat(String.valueOf(i)), true);
        this.f150175a.storeBoolean("go_through_social_recommend_flow" + i + i2, true);
    }

    /* renamed from: a */
    private final void m118632a(int i, int i2, long j) {
        this.f150175a.storeLong("go_through_time_ms".concat(String.valueOf(i)), j);
        this.f150175a.storeLong("go_through_time_ms" + i + i2, j);
    }
}
