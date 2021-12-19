package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a */
public final class C54914a {

    /* renamed from: b */
    public static String f125715b;

    /* renamed from: c */
    public static C54914a f125716c;

    /* renamed from: d */
    public static final C54915a f125717d = new C54915a((byte) 0);

    /* renamed from: a */
    public final Keva f125718a;

    /* renamed from: e */
    private long f125719e = -1;

    /* renamed from: f */
    private int f125720f;

    /* renamed from: g */
    private long f125721g = -1;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a$a */
    public static final class C54915a {
        static {
            Covode.recordClassIndex(64637);
        }

        private C54915a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r2, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0020;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.C54914a m100539a() {
            /*
                r3 = 3216(0xc90, float:4.507E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.C54914a.f125716c
                if (r0 == 0) goto L_0x0020
                java.lang.String r2 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.C54914a.f125715b
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                java.lang.String r0 = r1.getCurUserId()
                boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r2, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0041
            L_0x0020:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a> r2 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.C54914a.class
                monitor-enter(r2)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()     // Catch:{ all -> 0x003a }
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)     // Catch:{ all -> 0x003a }
                java.lang.String r0 = r1.getCurUserId()     // Catch:{ all -> 0x003a }
                com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.C54914a.f125715b = r0     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a r0 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a     // Catch:{ all -> 0x003a }
                r0.<init>()     // Catch:{ all -> 0x003a }
                com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.C54914a.f125716c = r0     // Catch:{ all -> 0x003a }
                goto L_0x0040
            L_0x003a:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                throw r0
            L_0x0040:
                monitor-exit(r2)
            L_0x0041:
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.C54914a.f125716c
                if (r0 != 0) goto L_0x0048
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0048:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.C54914a.C54915a.m100539a():com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a");
        }

        public /* synthetic */ C54915a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(64636);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        f125715b = g.getCurUserId();
    }

    public C54914a() {
        Keva repo = Keva.getRepo("recommend_friends_in_dm" + f125715b);
        C89219l.m154716b(repo, "");
        this.f125718a = repo;
    }

    /* renamed from: a */
    public final void mo91918a(int i) {
        this.f125720f = i;
        this.f125718a.storeInt("session_count", i);
    }

    /* renamed from: b */
    public final void mo91920b(long j) {
        this.f125721g = j;
        this.f125718a.storeLong("next_session_time_ms", j);
    }

    /* renamed from: a */
    public final void mo91919a(long j) {
        this.f125719e = j;
        this.f125718a.storeLong("last_session_time_ms", j);
    }
}
