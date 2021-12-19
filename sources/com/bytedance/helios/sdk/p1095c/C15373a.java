package com.bytedance.helios.sdk.p1095c;

import android.os.Handler;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.p754a.AbstractC12267d;
import com.bytedance.apm.p754a.AbstractC12268e;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.C15330a;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.api.p1088b.C15324r;
import com.bytedance.helios.api.p1090c.C15326b;
import com.bytedance.helios.p1085a.p1086a.C15294g;
import com.bytedance.helios.p1085a.p1086a.HandlerThreadC15288a;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.utils.C15484f;
import com.bytedance.keva.Keva;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.agilelogger.C29699a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.c.a */
public final class C15373a {

    /* renamed from: a */
    static long f37500a = m28277a().getLong("alog_last_upload_time", 0);

    /* renamed from: b */
    public static boolean f37501b;

    /* renamed from: c */
    public static long f37502c;

    /* renamed from: d */
    public static final C15373a f37503d = new C15373a();

    /* renamed from: e */
    private static final AbstractC89244h f37504e = C89250i.m154773a((AbstractC89171a) C15374a.f37506a);

    /* renamed from: f */
    private static Runnable f37505f;

    /* renamed from: com.bytedance.helios.sdk.c.a$c */
    public static final class RunnableC15376c implements Runnable {

        /* renamed from: a */
        public int f37509a;

        /* renamed from: b */
        final /* synthetic */ long f37510b;

        /* renamed from: c */
        final /* synthetic */ long f37511c;

        static {
            Covode.recordClassIndex(17628);
        }

        /* renamed from: com.bytedance.helios.sdk.c.a$c$a */
        static final class C15377a implements AbstractC12268e {

            /* renamed from: a */
            public static final C15377a f37512a = new C15377a();

            static {
                Covode.recordClassIndex(17629);
            }

            C15377a() {
            }

            @Override // com.bytedance.apm.p754a.AbstractC12268e
            /* renamed from: a */
            public final void mo19759a() {
                ALog.asyncFlush();
            }
        }

        public final void run() {
            Boolean bool;
            if (ALog.sConfig != null) {
                try {
                    C15484f.m28493a(false);
                    ALog.syncFlush();
                    C29699a aVar = ALog.sConfig;
                    C89219l.m154709a((Object) aVar, "");
                    C12290b.m22062a(aVar.f70857f, this.f37510b / 1000, this.f37511c / 1000, "sky_eye_alog_scene", C15377a.f37512a, new C15378b(this));
                } catch (Exception e) {
                    C15320o.m28229a(new C15324r("-101", e.getMessage()));
                    C15320o.m28230a(new C15326b(null, e, "label_upload_alog", null, 9));
                }
            } else {
                int i = this.f37509a + 1;
                this.f37509a = i;
                if (i <= 6) {
                    HandlerThreadC15288a.m28195b().postDelayed(this, 10000);
                    return;
                }
                StringBuilder sb = new StringBuilder("isFirstStart=");
                C15330a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
                if (envAppInfo != null) {
                    bool = Boolean.valueOf(envAppInfo.f37410e);
                } else {
                    bool = null;
                }
                C15320o.m28229a(new C15324r("-103", sb.append(bool).toString()));
            }
        }

        RunnableC15376c(long j, long j2) {
            this.f37510b = j;
            this.f37511c = j2;
        }

        /* renamed from: com.bytedance.helios.sdk.c.a$c$b */
        static final class C15378b implements AbstractC12267d {

            /* renamed from: a */
            final /* synthetic */ RunnableC15376c f37513a;

            static {
                Covode.recordClassIndex(17630);
            }

            C15378b(RunnableC15376c cVar) {
                this.f37513a = cVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
                if (r6 != null) goto L_0x0035;
             */
            @Override // com.bytedance.apm.p754a.AbstractC12267d
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo19758a(boolean r5, org.json.JSONObject r6) {
                /*
                    r4 = this;
                    if (r5 == 0) goto L_0x0026
                    com.bytedance.helios.sdk.c.a$c r0 = r4.f37513a
                    long r0 = r0.f37511c
                    com.bytedance.helios.sdk.p1095c.C15373a.f37500a = r0
                    com.bytedance.keva.Keva r3 = com.bytedance.helios.sdk.p1095c.C15373a.m28277a()
                    long r1 = com.bytedance.helios.sdk.p1095c.C15373a.f37500a
                    java.lang.String r0 = "alog_last_upload_time"
                    r3.storeLong(r0, r1)
                    com.bytedance.keva.Keva r1 = com.bytedance.helios.sdk.p1095c.C15373a.m28277a()
                    java.lang.String r0 = "alog_last_request_start_time"
                    r1.erase(r0)
                    com.bytedance.keva.Keva r1 = com.bytedance.helios.sdk.p1095c.C15373a.m28277a()
                    java.lang.String r0 = "alog_last_request_end_time"
                    r1.erase(r0)
                    return
                L_0x0026:
                    r2 = 0
                    if (r6 == 0) goto L_0x004a
                    java.lang.String r0 = "code"
                    java.lang.Object r0 = r6.opt(r0)
                    if (r0 == 0) goto L_0x004a
                    java.lang.String r1 = r0.toString()
                L_0x0035:
                    java.lang.String r0 = "exception"
                    java.lang.Object r0 = r6.opt(r0)
                    if (r0 == 0) goto L_0x0041
                    java.lang.String r2 = r0.toString()
                L_0x0041:
                    com.bytedance.helios.api.b.r r0 = new com.bytedance.helios.api.b.r
                    r0.<init>(r1, r2)
                    com.bytedance.helios.api.p1088b.C15320o.m28229a(r0)
                    return
                L_0x004a:
                    r1 = r2
                    if (r6 == 0) goto L_0x0041
                    goto L_0x0035
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.p1095c.C15373a.RunnableC15376c.C15378b.mo19758a(boolean, org.json.JSONObject):void");
            }
        }
    }

    /* renamed from: a */
    public static Keva m28277a() {
        return (Keva) f37504e.getValue();
    }

    private C15373a() {
    }

    /* renamed from: com.bytedance.helios.sdk.c.a$a */
    static final class C15374a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C15374a f37506a = new C15374a();

        static {
            Covode.recordClassIndex(17626);
        }

        C15374a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("helios", 1);
        }
    }

    /* renamed from: b */
    public static void m28279b() {
        long currentTimeMillis = System.currentTimeMillis();
        m28278a(currentTimeMillis - f37502c, currentTimeMillis, 5000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.helios.sdk.c.a$b */
    public static final class RunnableC15375b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f37507a;

        /* renamed from: b */
        final /* synthetic */ long f37508b;

        static {
            Covode.recordClassIndex(17627);
        }

        RunnableC15375b(long j, long j2) {
            this.f37507a = j;
            this.f37508b = j2;
        }

        public final void run() {
            long j = this.f37507a;
            long j2 = this.f37508b;
            C15294g.m28203a(j);
            C15294g.m28203a(j2);
            HandlerThreadC15288a.m28195b().post(new RunnableC15376c(j, j2));
        }
    }

    static {
        Covode.recordClassIndex(17625);
    }

    /* renamed from: a */
    public static void m28278a(long j, long j2, long j3) {
        Boolean bool;
        if (!f37501b) {
            StringBuilder sb = new StringBuilder("isFirstStart=");
            C15330a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
            if (envAppInfo != null) {
                bool = Boolean.valueOf(envAppInfo.f37410e);
            } else {
                bool = null;
            }
            C15320o.m28229a(new C15324r("-102", sb.append(bool).toString()));
            return;
        }
        Runnable runnable = f37505f;
        if (runnable != null) {
            HandlerThreadC15288a.m28195b().removeCallbacks(runnable);
        }
        f37505f = new RunnableC15375b(j, j2);
        Handler b = HandlerThreadC15288a.m28195b();
        Runnable runnable2 = f37505f;
        if (runnable2 == null) {
            C89219l.m154707a();
        }
        b.postDelayed(runnable2, j3);
    }
}
