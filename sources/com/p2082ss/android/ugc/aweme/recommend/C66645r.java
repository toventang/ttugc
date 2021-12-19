package com.p2082ss.android.ugc.aweme.recommend;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.r */
public final class C66645r {

    /* renamed from: b */
    public static String f149810b;

    /* renamed from: c */
    public static C66645r f149811c;

    /* renamed from: d */
    public static final C66646a f149812d = new C66646a((byte) 0);

    /* renamed from: a */
    public final Keva f149813a;

    /* renamed from: com.ss.android.ugc.aweme.recommend.r$a */
    public static final class C66646a {
        static {
            Covode.recordClassIndex(78204);
        }

        private C66646a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r2, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0020;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p2082ss.android.ugc.aweme.recommend.C66645r m118420a() {
            /*
                r3 = 8001(0x1f41, float:1.1212E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
                com.ss.android.ugc.aweme.recommend.r r0 = com.p2082ss.android.ugc.aweme.recommend.C66645r.f149811c
                if (r0 == 0) goto L_0x0020
                java.lang.String r2 = com.p2082ss.android.ugc.aweme.recommend.C66645r.f149810b
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                java.lang.String r0 = r1.getCurUserId()
                boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r2, r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0041
            L_0x0020:
                java.lang.Class<com.ss.android.ugc.aweme.recommend.r> r2 = com.p2082ss.android.ugc.aweme.recommend.C66645r.class
                monitor-enter(r2)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p2082ss.android.ugc.aweme.account.C31575b.m65865g()     // Catch:{ all -> 0x003a }
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)     // Catch:{ all -> 0x003a }
                java.lang.String r0 = r1.getCurUserId()     // Catch:{ all -> 0x003a }
                com.p2082ss.android.ugc.aweme.recommend.C66645r.f149810b = r0     // Catch:{ all -> 0x003a }
                com.ss.android.ugc.aweme.recommend.r r0 = new com.ss.android.ugc.aweme.recommend.r     // Catch:{ all -> 0x003a }
                r0.<init>()     // Catch:{ all -> 0x003a }
                com.p2082ss.android.ugc.aweme.recommend.C66645r.f149811c = r0     // Catch:{ all -> 0x003a }
                goto L_0x0040
            L_0x003a:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                throw r0
            L_0x0040:
                monitor-exit(r2)
            L_0x0041:
                com.ss.android.ugc.aweme.recommend.r r0 = com.p2082ss.android.ugc.aweme.recommend.C66645r.f149811c
                if (r0 != 0) goto L_0x0048
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0048:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.recommend.C66645r.C66646a.m118420a():com.ss.android.ugc.aweme.recommend.r");
        }

        public /* synthetic */ C66646a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(78203);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        f149810b = g.getCurUserId();
    }

    public C66645r() {
        Keva repo = Keva.getRepo("i18n_recommmend_user_" + f149810b);
        C89219l.m154716b(repo, "");
        this.f149813a = repo;
    }

    /* renamed from: a */
    public final boolean mo105648a() {
        if (this.f149813a.getInt("dialog_close_without_action_in_times", 0) < 2) {
            return false;
        }
        long j = this.f149813a.getLong("dialog_close_without_action_in_times_maximum_timestamp", 0);
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        if (instance.getTimeInMillis() < j) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo105649b() {
        long millis = TimeUnit.DAYS.toMillis((long) C66644q.m118417a());
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        if (instance.getTimeInMillis() < this.f149813a.getLong("dialog_last_shown_timestamp", 0) + millis) {
            return true;
        }
        return false;
    }
}
