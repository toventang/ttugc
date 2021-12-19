package com.p2082ss.android.ugc.aweme.notification.p3523e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61536a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.C62496e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62269l;
import java.lang.ref.WeakReference;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.notification.e.a */
public final class C61933a {

    /* renamed from: a */
    public static WeakReference<Object> f140586a;

    /* renamed from: b */
    public static volatile C61943d f140587b;

    /* renamed from: c */
    public static final C61933a f140588c = new C61933a();

    /* renamed from: d */
    private static C61935b f140589d;

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$b */
    public static final class C61935b {

        /* renamed from: c */
        public static final C61936a f140592c = new C61936a((byte) 0);

        /* renamed from: a */
        public final Keva f140593a;

        /* renamed from: b */
        public final String f140594b;

        static {
            Covode.recordClassIndex(72684);
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$b$a */
        public static final class C61936a {
            static {
                Covode.recordClassIndex(72685);
            }

            private C61936a() {
            }

            public /* synthetic */ C61936a(byte b) {
                this();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$b$b */
        public static final class C61937b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C61935b f140595a;

            /* renamed from: b */
            final /* synthetic */ String f140596b;

            static {
                Covode.recordClassIndex(72686);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C61937b(C61935b bVar, String str) {
                super(0);
                this.f140595a = bVar;
                this.f140596b = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                MethodCollector.m26663i(3192);
                C39109f.m79403b("NoticePerfManager", "DataStore erase " + this.f140596b);
                synchronized (this.f140595a) {
                    try {
                        this.f140595a.f140593a.storeString(this.f140596b, "");
                    } catch (Throwable th) {
                        MethodCollector.m26664o(3192);
                        throw th;
                    }
                }
                C89391z zVar = C89391z.f203057a;
                MethodCollector.m26664o(3192);
                return zVar;
            }
        }

        /* renamed from: a */
        public final void mo100008a() {
            long d = C17867d.m33083d();
            long j = this.f140593a.getLong("version", 0);
            if (j <= 0 || d != j) {
                this.f140593a.clear();
                this.f140593a.storeLong("version", d);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$b$e */
        public static final class C61940e extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C61935b f140600a;

            /* renamed from: b */
            final /* synthetic */ NoticeCombineResponse f140601b;

            static {
                Covode.recordClassIndex(72689);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61940e(C61935b bVar, NoticeCombineResponse noticeCombineResponse) {
                super(0);
                this.f140600a = bVar;
                this.f140601b = noticeCombineResponse;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Removed duplicated region for block: B:11:0x0035 A[Catch:{ all -> 0x0051 }] */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0041 A[Catch:{ all -> 0x0051 }] */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ p4600h.C89391z invoke() {
                /*
                    r6 = this;
                    r5 = 1247(0x4df, float:1.747E-42)
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
                    java.lang.String r1 = "NoticePerfManager"
                    java.lang.String r0 = "DataStore store janus"
                    com.p2082ss.android.ugc.aweme.common.C39109f.m79403b(r1, r0)
                    com.ss.android.ugc.aweme.notification.e.a$b r3 = r6.f140600a
                    monitor-enter(r3)
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.f140600a     // Catch:{ all -> 0x0051 }
                    r0.mo100008a()     // Catch:{ all -> 0x0051 }
                    com.ss.android.ugc.aweme.notification.e.a$c r4 = new com.ss.android.ugc.aweme.notification.e.a$c     // Catch:{ all -> 0x0051 }
                    long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0051 }
                    com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse r0 = r6.f140601b     // Catch:{ all -> 0x0051 }
                    r4.<init>(r1, r0)     // Catch:{ all -> 0x0051 }
                    com.google.gson.f r0 = com.p2082ss.android.ugc.aweme.utils.C80342dg.m139300a()     // Catch:{ all -> 0x0051 }
                    java.lang.String r2 = r0.mo46674b(r4)     // Catch:{ all -> 0x0051 }
                    if (r2 == 0) goto L_0x0032
                    int r0 = r2.length()     // Catch:{ all -> 0x0051 }
                    if (r0 != 0) goto L_0x0030
                    goto L_0x0032
                L_0x0030:
                    r0 = 0
                    goto L_0x0033
                L_0x0032:
                    r0 = 1
                L_0x0033:
                    if (r0 == 0) goto L_0x0041
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.f140600a     // Catch:{ all -> 0x0051 }
                    com.bytedance.keva.Keva r2 = r0.f140593a     // Catch:{ all -> 0x0051 }
                    java.lang.String r1 = "janus_data"
                    java.lang.String r0 = ""
                    r2.storeString(r1, r0)     // Catch:{ all -> 0x0051 }
                    goto L_0x004a
                L_0x0041:
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.f140600a     // Catch:{ all -> 0x0051 }
                    com.bytedance.keva.Keva r1 = r0.f140593a     // Catch:{ all -> 0x0051 }
                    java.lang.String r0 = "janus_data"
                    r1.storeString(r0, r2)     // Catch:{ all -> 0x0051 }
                L_0x004a:
                    monitor-exit(r3)
                    h.z r0 = p4600h.C89391z.f203057a
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                    return r0
                L_0x0051:
                    r0 = move-exception
                    monitor-exit(r3)
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a.C61935b.C61940e.invoke():java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$b$f */
        public static final class C61941f extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C61935b f140602a;

            /* renamed from: b */
            final /* synthetic */ NoticeListsResponse f140603b;

            static {
                Covode.recordClassIndex(72690);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61941f(C61935b bVar, NoticeListsResponse noticeListsResponse) {
                super(0);
                this.f140602a = bVar;
                this.f140603b = noticeListsResponse;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Removed duplicated region for block: B:11:0x0035 A[Catch:{ all -> 0x0051 }] */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0041 A[Catch:{ all -> 0x0051 }] */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ p4600h.C89391z invoke() {
                /*
                    r6 = this;
                    r5 = 3107(0xc23, float:4.354E-42)
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
                    java.lang.String r1 = "NoticePerfManager"
                    java.lang.String r0 = "DataStore store notice"
                    com.p2082ss.android.ugc.aweme.common.C39109f.m79403b(r1, r0)
                    com.ss.android.ugc.aweme.notification.e.a$b r3 = r6.f140602a
                    monitor-enter(r3)
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.f140602a     // Catch:{ all -> 0x0051 }
                    r0.mo100008a()     // Catch:{ all -> 0x0051 }
                    com.ss.android.ugc.aweme.notification.e.a$e r4 = new com.ss.android.ugc.aweme.notification.e.a$e     // Catch:{ all -> 0x0051 }
                    long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0051 }
                    com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse r0 = r6.f140603b     // Catch:{ all -> 0x0051 }
                    r4.<init>(r1, r0)     // Catch:{ all -> 0x0051 }
                    com.google.gson.f r0 = com.p2082ss.android.ugc.aweme.utils.C80342dg.m139300a()     // Catch:{ all -> 0x0051 }
                    java.lang.String r2 = r0.mo46674b(r4)     // Catch:{ all -> 0x0051 }
                    if (r2 == 0) goto L_0x0032
                    int r0 = r2.length()     // Catch:{ all -> 0x0051 }
                    if (r0 != 0) goto L_0x0030
                    goto L_0x0032
                L_0x0030:
                    r0 = 0
                    goto L_0x0033
                L_0x0032:
                    r0 = 1
                L_0x0033:
                    if (r0 == 0) goto L_0x0041
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.f140602a     // Catch:{ all -> 0x0051 }
                    com.bytedance.keva.Keva r2 = r0.f140593a     // Catch:{ all -> 0x0051 }
                    java.lang.String r1 = "notice_data"
                    java.lang.String r0 = ""
                    r2.storeString(r1, r0)     // Catch:{ all -> 0x0051 }
                    goto L_0x004a
                L_0x0041:
                    com.ss.android.ugc.aweme.notification.e.a$b r0 = r6.f140602a     // Catch:{ all -> 0x0051 }
                    com.bytedance.keva.Keva r1 = r0.f140593a     // Catch:{ all -> 0x0051 }
                    java.lang.String r0 = "notice_data"
                    r1.storeString(r0, r2)     // Catch:{ all -> 0x0051 }
                L_0x004a:
                    monitor-exit(r3)
                    h.z r0 = p4600h.C89391z.f203057a
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                    return r0
                L_0x0051:
                    r0 = move-exception
                    monitor-exit(r3)
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a.C61935b.C61941f.invoke():java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$b$d */
        static final class C61939d extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C61935b f140598a;

            /* renamed from: b */
            final /* synthetic */ AbstractC88982v f140599b;

            static {
                Covode.recordClassIndex(72688);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C61939d(C61935b bVar, AbstractC88982v vVar) {
                super(0);
                this.f140598a = bVar;
                this.f140599b = vVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[Catch:{ all -> 0x0095 }] */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A[Catch:{ all -> 0x0095 }] */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x004c A[Catch:{ all -> 0x0095 }] */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x006a A[Catch:{ all -> 0x0095 }] */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ p4600h.C89391z invoke() {
                /*
                // Method dump skipped, instructions count: 167
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a.C61935b.C61939d.invoke():java.lang.Object");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$b$c */
        public static final class C61938c<T> implements AbstractC88983w {

            /* renamed from: a */
            final /* synthetic */ C61935b f140597a;

            static {
                Covode.recordClassIndex(72687);
            }

            C61938c(C61935b bVar) {
                this.f140597a = bVar;
            }

            @Override // p4560f.p4561a.AbstractC88983w
            public final void subscribe(AbstractC88982v<C61934a> vVar) {
                C89219l.m154721d(vVar, "");
                C61994d.m112123b(new C61939d(this.f140597a, vVar));
            }
        }

        /* renamed from: a */
        public final C1731i<C89391z> mo100007a(String str) {
            C89219l.m154721d(str, "");
            return C61994d.m112123b(new C61937b(this, str));
        }

        public C61935b(String str) {
            C89219l.m154721d(str, "");
            this.f140594b = str;
            this.f140593a = Keva.getRepo("notice_cache_" + str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$g */
    public enum EnumC61952g {
        BOOT,
        BOOT_LAZY,
        POST_UNREAD,
        TAB_CLICK;

        static {
            Covode.recordClassIndex(72701);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$f */
    public static final class C61949f {

        /* renamed from: a */
        public static final C61950a f140619a = new C61950a((byte) 0);

        /* renamed from: b */
        public static final C61949f f140620b = new C61949f();

        /* renamed from: c */
        private static final AbstractC89244h f140621c = C89250i.m154773a((AbstractC89171a) C61951b.f140633a);

        /* renamed from: a */
        public static C61950a m112083a() {
            return (C61950a) f140621c.getValue();
        }

        private C61949f() {
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$f$b */
        static final class C61951b extends AbstractC89220m implements AbstractC89171a<C61950a> {

            /* renamed from: a */
            public static final C61951b f140633a = new C61951b();

            static {
                Covode.recordClassIndex(72700);
            }

            C61951b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C61950a invoke() {
                Object a = C16048b.m29633a().mo25416a(true, "opt_notification_perf", C61950a.class, C61949f.f140619a);
                if (a == null) {
                    return C61949f.f140619a;
                }
                return a;
            }
        }

        static {
            Covode.recordClassIndex(72698);
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$f$a */
        public static final class C61950a {
            @AbstractC27891c(mo46611a = "stable_id")

            /* renamed from: a */
            public final boolean f140622a;
            @AbstractC27891c(mo46611a = "load_more_preload")

            /* renamed from: b */
            public final boolean f140623b;
            @AbstractC27891c(mo46611a = "click_preload")

            /* renamed from: c */
            public final boolean f140624c;
            @AbstractC27891c(mo46611a = "boot_cache_preload")

            /* renamed from: d */
            public final boolean f140625d;
            @AbstractC27891c(mo46611a = "boot_lazy_preload")

            /* renamed from: e */
            public final boolean f140626e;
            @AbstractC27891c(mo46611a = "unread_post_preload")

            /* renamed from: f */
            public final boolean f140627f;
            @AbstractC27891c(mo46611a = "boot_lazy_preload_delay")

            /* renamed from: g */
            public final long f140628g;
            @AbstractC27891c(mo46611a = "preload_req_duration")

            /* renamed from: h */
            public final long f140629h;
            @AbstractC27891c(mo46611a = "refresh_again_duration")

            /* renamed from: i */
            public final long f140630i;
            @AbstractC27891c(mo46611a = "live_abandon_duration")

            /* renamed from: j */
            public final long f140631j;
            @AbstractC27891c(mo46611a = "notice_abandon_duration")

            /* renamed from: k */
            public final long f140632k;

            static {
                Covode.recordClassIndex(72699);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C61950a)) {
                    return false;
                }
                C61950a aVar = (C61950a) obj;
                return this.f140622a == aVar.f140622a && this.f140623b == aVar.f140623b && this.f140624c == aVar.f140624c && this.f140625d == aVar.f140625d && this.f140626e == aVar.f140626e && this.f140627f == aVar.f140627f && this.f140628g == aVar.f140628g && this.f140629h == aVar.f140629h && this.f140630i == aVar.f140630i && this.f140631j == aVar.f140631j && this.f140632k == aVar.f140632k;
            }

            public final String toString() {
                return "MetaData(enableStableId=" + this.f140622a + ", enableLoadMorePreload=" + this.f140623b + ", enableClickPreload=" + this.f140624c + ", enableBootPreload=" + this.f140625d + ", enableBootLazyPreload=" + this.f140626e + ", enableUnreadPostPreload=" + this.f140627f + ", bootLazyPreloadDelayMs=" + this.f140628g + ", preloadReqDurationMs=" + this.f140629h + ", refreshAgainDurationMs=" + this.f140630i + ", liveAbandonDurationMs=" + this.f140631j + ", noticeAbandonDurationMs=" + this.f140632k + ")";
            }

            private C61950a() {
                this.f140622a = true;
                this.f140623b = false;
                this.f140624c = false;
                this.f140625d = false;
                this.f140626e = false;
                this.f140627f = false;
                this.f140628g = 0;
                this.f140629h = 120000;
                this.f140630i = 15000;
                this.f140631j = 120000;
                this.f140632k = 43200000;
            }

            public final int hashCode() {
                boolean z = this.f140622a;
                int i = 1;
                if (z) {
                    z = true;
                }
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = i2 * 31;
                boolean z2 = this.f140623b;
                if (z2) {
                    z2 = true;
                }
                int i6 = z2 ? 1 : 0;
                int i7 = z2 ? 1 : 0;
                int i8 = z2 ? 1 : 0;
                int i9 = (i5 + i6) * 31;
                boolean z3 = this.f140624c;
                if (z3) {
                    z3 = true;
                }
                int i10 = z3 ? 1 : 0;
                int i11 = z3 ? 1 : 0;
                int i12 = z3 ? 1 : 0;
                int i13 = (i9 + i10) * 31;
                boolean z4 = this.f140625d;
                if (z4) {
                    z4 = true;
                }
                int i14 = z4 ? 1 : 0;
                int i15 = z4 ? 1 : 0;
                int i16 = z4 ? 1 : 0;
                int i17 = (i13 + i14) * 31;
                boolean z5 = this.f140626e;
                if (z5) {
                    z5 = true;
                }
                int i18 = z5 ? 1 : 0;
                int i19 = z5 ? 1 : 0;
                int i20 = z5 ? 1 : 0;
                int i21 = (i17 + i18) * 31;
                if (!this.f140627f) {
                    i = 0;
                }
                long j = this.f140628g;
                long j2 = this.f140629h;
                long j3 = this.f140630i;
                long j4 = this.f140631j;
                long j5 = this.f140632k;
                return ((((((((((i21 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)));
            }

            public /* synthetic */ C61950a(byte b) {
                this();
            }
        }
    }

    private C61933a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$d */
    public static final class C61943d {

        /* renamed from: a */
        public int f140606a;

        /* renamed from: b */
        public volatile C62496e f140607b = new C62496e();

        /* renamed from: c */
        public volatile boolean f140608c;

        /* renamed from: d */
        public final String f140609d;

        /* renamed from: e */
        public final C61935b f140610e;

        /* renamed from: f */
        private final AbstractC89244h f140611f = C89250i.m154773a((AbstractC89171a) C61944a.f140612a);

        static {
            Covode.recordClassIndex(72692);
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$d$a */
        static final class C61944a extends AbstractC89220m implements AbstractC89171a<C88411a> {

            /* renamed from: a */
            public static final C61944a f140612a = new C61944a();

            static {
                Covode.recordClassIndex(72693);
            }

            C61944a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C88411a invoke() {
                return new C88411a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$d$b */
        public static final class C61945b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C61943d f140613a;

            static {
                Covode.recordClassIndex(72694);
            }

            C61945b(C61943d dVar) {
                this.f140613a = dVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                final C61934a aVar = (C61934a) obj;
                C61994d.m112120a(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a.C61943d.C61945b.C619461 */

                    /* renamed from: a */
                    final /* synthetic */ C61945b f140614a;

                    static {
                        Covode.recordClassIndex(72695);
                    }

                    {
                        this.f140614a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
                    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ p4600h.C89391z invoke() {
                        /*
                        // Method dump skipped, instructions count: 382
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a.C61943d.C61945b.C619461.invoke():java.lang.Object");
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notification.e.a$d$c */
        public static final class C61947c<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C61947c f140616a = new C61947c();

            static {
                Covode.recordClassIndex(72696);
            }

            C61947c() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C39109f.m79401a("NoticePerfManager", "ModelHolder preloadByCache error", (Throwable) obj);
            }
        }

        /* renamed from: a */
        public final boolean mo100012a(EnumC61952g gVar) {
            C89219l.m154721d(gVar, "");
            int i = C61967b.f140656a[gVar.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new C89376n();
                } else if (this.f140608c) {
                    C39109f.m79403b("NoticePerfManager", "ModelHolder preloadByRefresh but drained, reason:".concat(String.valueOf(gVar)));
                    return false;
                } else {
                    C39109f.m79403b("NoticePerfManager", "ModelHolder preloadByRefresh, reason:".concat(String.valueOf(gVar)));
                    return this.f140607b.mo100454a(gVar);
                }
            } else if (this.f140608c || !this.f140607b.mo100455n()) {
                C39109f.m79403b("NoticePerfManager", "ModelHolder preloadByCache not needed: " + this.f140608c);
                return false;
            } else {
                C61935b bVar = this.f140610e;
                if (bVar == null) {
                    return false;
                }
                C39109f.m79403b("NoticePerfManager", "ModelHolder preloadByCache start");
                AbstractC88979t a = AbstractC88979t.m154294a(new C61935b.C61938c(bVar));
                C89219l.m154716b(a, "");
                AbstractC88412b a2 = a.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C61945b(this), C61947c.f140616a);
                C89219l.m154716b(a2, "");
                C88934a.m154195a(a2, (C88411a) this.f140611f.getValue());
                return true;
            }
        }

        public C61943d(String str, C61935b bVar) {
            C89219l.m154721d(str, "");
            this.f140609d = str;
            this.f140610e = bVar;
        }
    }

    /* renamed from: c */
    public static C1731i<C89391z> m112078c() {
        return C61994d.m112120a(C61955i.f140637a);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$h */
    public static final class C61953h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C61953h f140635a = new C61953h();

        static {
            Covode.recordClassIndex(72702);
        }

        C61953h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C61933a.m112076a(EnumC61952g.BOOT, C619541.f140636a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$i */
    public static final class C61955i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C61955i f140637a = new C61955i();

        static {
            Covode.recordClassIndex(72704);
        }

        C61955i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C61933a.m112076a(EnumC61952g.BOOT_LAZY, C619561.f140638a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$j */
    public static final class C61957j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C61957j f140639a = new C61957j();

        static {
            Covode.recordClassIndex(72706);
        }

        C61957j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C61933a.m112076a(EnumC61952g.TAB_CLICK, C619581.f140640a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$k */
    public static final class C61959k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f140641a;

        static {
            Covode.recordClassIndex(72708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61959k(int i) {
            super(0);
            this.f140641a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C61933a.m112076a(EnumC61952g.POST_UNREAD, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a.C61959k.C619601 */

                /* renamed from: a */
                final /* synthetic */ C61959k f140642a;

                static {
                    Covode.recordClassIndex(72709);
                }

                {
                    this.f140642a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C61943d a = C61933a.f140588c.mo100003a(true);
                    if (!(a == null || a.f140606a == this.f140642a.f140641a)) {
                        a.f140606a = this.f140642a.f140641a;
                        a.mo100012a(EnumC61952g.POST_UNREAD);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(72682);
    }

    /* renamed from: a */
    public static C61949f.C61950a m112075a() {
        C61949f.C61950a a = C61949f.m112083a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$c */
    public static final class C61942c {
        @AbstractC27891c(mo46611a = "ts")

        /* renamed from: a */
        public final long f140604a;
        @AbstractC27891c(mo46611a = "resp")

        /* renamed from: b */
        public final NoticeCombineResponse f140605b;

        static {
            Covode.recordClassIndex(72691);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61942c)) {
                return false;
            }
            C61942c cVar = (C61942c) obj;
            return this.f140604a == cVar.f140604a && C89219l.m154714a(this.f140605b, cVar.f140605b);
        }

        public final String toString() {
            return "JanusData(timestamp=" + this.f140604a + ", resp=" + this.f140605b + ")";
        }

        public final int hashCode() {
            int i;
            long j = this.f140604a;
            int i2 = ((int) (j ^ (j >>> 32))) * 31;
            NoticeCombineResponse noticeCombineResponse = this.f140605b;
            if (noticeCombineResponse != null) {
                i = noticeCombineResponse.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public C61942c(long j, NoticeCombineResponse noticeCombineResponse) {
            C89219l.m154721d(noticeCombineResponse, "");
            this.f140604a = j;
            this.f140605b = noticeCombineResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$e */
    public static final class C61948e {
        @AbstractC27891c(mo46611a = "ts")

        /* renamed from: a */
        public final long f140617a;
        @AbstractC27891c(mo46611a = "resp")

        /* renamed from: b */
        public final NoticeListsResponse f140618b;

        static {
            Covode.recordClassIndex(72697);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61948e)) {
                return false;
            }
            C61948e eVar = (C61948e) obj;
            return this.f140617a == eVar.f140617a && C89219l.m154714a(this.f140618b, eVar.f140618b);
        }

        public final String toString() {
            return "NoticeData(timestamp=" + this.f140617a + ", resp=" + this.f140618b + ")";
        }

        public final int hashCode() {
            int i;
            long j = this.f140617a;
            int i2 = ((int) (j ^ (j >>> 32))) * 31;
            NoticeListsResponse noticeListsResponse = this.f140618b;
            if (noticeListsResponse != null) {
                i = noticeListsResponse.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public C61948e(long j, NoticeListsResponse noticeListsResponse) {
            C89219l.m154721d(noticeListsResponse, "");
            this.f140617a = j;
            this.f140618b = noticeListsResponse;
        }
    }

    /* renamed from: b */
    public static C61935b m112077b() {
        MethodCollector.m26663i(1063);
        synchronized (C61935b.class) {
            try {
                String str = null;
                if (!m112075a().f140625d) {
                    return null;
                }
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                String curUserId = g.getCurUserId();
                C89219l.m154716b(curUserId, "");
                Long g2 = C89361p.m154865g(curUserId);
                if (g2 == null || g2.longValue() <= 0) {
                    f140589d = null;
                } else {
                    C61935b bVar = f140589d;
                    if (bVar != null) {
                        str = bVar.f140594b;
                    }
                    if (!C89219l.m154714a((Object) curUserId, (Object) str)) {
                        f140589d = new C61935b(curUserId);
                    }
                }
                C61935b bVar2 = f140589d;
                MethodCollector.m26664o(1063);
                return bVar2;
            } finally {
                MethodCollector.m26664o(1063);
            }
        }
    }

    /* renamed from: a */
    public final synchronized C61943d mo100003a(boolean z) {
        long j;
        C61943d dVar;
        String str;
        MethodCollector.m26663i(1079);
        synchronized (C61943d.class) {
            try {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                String curUserId = g.getCurUserId();
                C89219l.m154716b(curUserId, "");
                Long g2 = C89361p.m154865g(curUserId);
                if (g2 != null) {
                    j = g2.longValue();
                } else {
                    j = 0;
                }
                C61943d dVar2 = null;
                if (j > 0) {
                    C61943d dVar3 = f140587b;
                    if (dVar3 != null) {
                        str = dVar3.f140609d;
                    } else {
                        str = null;
                    }
                    if (!C89219l.m154714a((Object) curUserId, (Object) str)) {
                        if (z) {
                            dVar2 = new C61943d(curUserId, m112077b());
                        }
                    }
                    dVar = f140587b;
                }
                f140587b = dVar2;
                dVar = f140587b;
            } finally {
                MethodCollector.m26664o(1079);
            }
        }
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$a */
    public static final class C61934a {

        /* renamed from: a */
        public final C61942c f140590a;

        /* renamed from: b */
        public final C61948e f140591b;

        static {
            Covode.recordClassIndex(72683);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61934a)) {
                return false;
            }
            C61934a aVar = (C61934a) obj;
            return C89219l.m154714a(this.f140590a, aVar.f140590a) && C89219l.m154714a(this.f140591b, aVar.f140591b);
        }

        public final int hashCode() {
            C61942c cVar = this.f140590a;
            int i = 0;
            int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
            C61948e eVar = this.f140591b;
            if (eVar != null) {
                i = eVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "DataCache(janusData=" + this.f140590a + ", noticeData=" + this.f140591b + ")";
        }

        public C61934a(C61942c cVar, C61948e eVar) {
            this.f140590a = cVar;
            this.f140591b = eVar;
        }
    }

    /* renamed from: a */
    public static void m112076a(EnumC61952g gVar, AbstractC89171a<C89391z> aVar) {
        if (C56318b.m102310a() == 0 && C61536a.m111449b()) {
            C89219l.m154721d(gVar, "");
            if ((C61949f.m112083a().f140624c && gVar == EnumC61952g.TAB_CLICK) || ((C61949f.m112083a().f140625d && gVar == EnumC61952g.BOOT) || ((C61949f.m112083a().f140626e && gVar == EnumC61952g.BOOT_LAZY) || (C61949f.m112083a().f140627f && gVar == EnumC61952g.POST_UNREAD)))) {
                WeakReference<Object> weakReference = f140586a;
                if (weakReference == null || weakReference.get() == null) {
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    if (g.isLogin() && !C62269l.m112652a()) {
                        aVar.invoke();
                    }
                }
            }
        }
    }
}
