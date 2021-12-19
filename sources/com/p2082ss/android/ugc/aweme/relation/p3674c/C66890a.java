package com.p2082ss.android.ugc.aweme.relation.p3674c;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.service.IFriendsService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.c.a */
public final class C66890a implements IFriendsService.AbstractC51638b {

    /* renamed from: b */
    public static String f150166b;

    /* renamed from: c */
    public static C66890a f150167c;

    /* renamed from: d */
    public static final C66891a f150168d = new C66891a((byte) 0);

    /* renamed from: a */
    public final Keva f150169a = Keva.getRepo("permission_dialog" + f150166b);

    /* renamed from: com.ss.android.ugc.aweme.relation.c.a$a */
    public static final class C66891a {
        static {
            Covode.recordClassIndex(78466);
        }

        private C66891a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r2, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0020;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a m118631a() {
            /*
                r3 = 14032(0x36d0, float:1.9663E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
                com.ss.android.ugc.aweme.relation.c.a r0 = com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a.f150167c
                if (r0 == 0) goto L_0x0020
                java.lang.String r2 = com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a.f150166b
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                java.lang.String r0 = r1.getCurUserId()
                boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r2, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0041
            L_0x0020:
                java.lang.Class<com.ss.android.ugc.aweme.relation.c.a> r2 = com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a.class
                monitor-enter(r2)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()     // Catch:{ all -> 0x003a }
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)     // Catch:{ all -> 0x003a }
                java.lang.String r0 = r1.getCurUserId()     // Catch:{ all -> 0x003a }
                com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a.f150166b = r0     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.relation.c.a r0 = new com.ss.android.ugc.aweme.relation.c.a     // Catch:{ all -> 0x003a }
                r0.<init>()     // Catch:{ all -> 0x003a }
                com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a.f150167c = r0     // Catch:{ all -> 0x003a }
                goto L_0x0040
            L_0x003a:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                throw r0
            L_0x0040:
                monitor-exit(r2)
            L_0x0041:
                com.ss.android.ugc.aweme.relation.c.a r0 = com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a.f150167c
                if (r0 != 0) goto L_0x0048
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0048:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a.C66891a.m118631a():com.ss.android.ugc.aweme.relation.c.a");
        }

        public /* synthetic */ C66891a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService.AbstractC51638b
    /* renamed from: a */
    public final void mo87344a() {
        this.f150169a.erase("after_login_permission_pop_up");
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFriendsService.AbstractC51638b
    /* renamed from: b */
    public final boolean mo87345b() {
        return this.f150169a.getBoolean("after_login_permission_pop_up", false);
    }

    static {
        Covode.recordClassIndex(78465);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        f150166b = g.getCurUserId();
    }
}
