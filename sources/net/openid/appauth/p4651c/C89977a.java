package net.openid.appauth.p4651c;

import android.util.Log;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: net.openid.appauth.c.a */
public final class C89977a {

    /* renamed from: a */
    private static C89977a f203877a;

    /* renamed from: b */
    private final AbstractC89979b f203878b;

    /* renamed from: c */
    private final int f203879c;

    /* renamed from: net.openid.appauth.c.a$b */
    public interface AbstractC89979b {
        static {
            Covode.recordClassIndex(106150);
        }

        /* renamed from: a */
        String mo144633a(Throwable th);

        /* renamed from: a */
        boolean mo144634a(String str, int i);
    }

    static {
        Covode.recordClassIndex(106148);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.openid.appauth.c.a$a */
    public static final class C89978a implements AbstractC89979b {

        /* renamed from: a */
        public static final C89978a f203880a = new C89978a();

        private C89978a() {
        }

        static {
            Covode.recordClassIndex(106149);
        }

        @Override // net.openid.appauth.p4651c.C89977a.AbstractC89979b
        /* renamed from: a */
        public final String mo144633a(Throwable th) {
            return Log.getStackTraceString(th);
        }

        @Override // net.openid.appauth.p4651c.C89977a.AbstractC89979b
        /* renamed from: a */
        public final boolean mo144634a(String str, int i) {
            return Log.isLoggable(str, i);
        }
    }

    /* renamed from: a */
    private static synchronized C89977a m156116a() {
        C89977a aVar;
        synchronized (C89977a.class) {
            MethodCollector.m26663i(12480);
            if (f203877a == null) {
                f203877a = new C89977a(C89978a.f203880a);
            }
            aVar = f203877a;
            MethodCollector.m26664o(12480);
        }
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C89977a(net.openid.appauth.p4651c.C89977a.AbstractC89979b r4) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = net.openid.appauth.C90009p.m156197a(r4)
            net.openid.appauth.c.a$b r0 = (net.openid.appauth.p4651c.C89977a.AbstractC89979b) r0
            r3.f203878b = r0
            r2 = 7
        L_0x000c:
            net.openid.appauth.c.a$b r1 = r3.f203878b
            java.lang.String r0 = "AppAuth"
            boolean r0 = r1.mo144634a(r0, r2)
            if (r0 == 0) goto L_0x001c
            int r2 = r2 + -1
            r0 = 2
            if (r2 < r0) goto L_0x001c
            goto L_0x000c
        L_0x001c:
            int r0 = r2 + 1
            r3.f203879c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.openid.appauth.p4651c.C89977a.<init>(net.openid.appauth.c.a$b):void");
    }

    /* renamed from: a */
    public static void m156118a(String str, Object... objArr) {
        m156116a().m156117a(3, null, str, objArr);
    }

    /* renamed from: b */
    public static void m156120b(String str, Object... objArr) {
        m156116a().m156117a(4, null, str, objArr);
    }

    /* renamed from: c */
    public static void m156122c(String str, Object... objArr) {
        m156116a().m156117a(5, null, str, objArr);
    }

    /* renamed from: d */
    public static void m156123d(String str, Object... objArr) {
        m156116a().m156117a(6, null, str, objArr);
    }

    /* renamed from: b */
    public static void m156121b(Throwable th, String str, Object... objArr) {
        m156116a().m156117a(6, th, str, objArr);
    }

    /* renamed from: a */
    public static void m156119a(Throwable th, String str, Object... objArr) {
        m156116a().m156117a(3, th, str, objArr);
    }

    /* renamed from: a */
    private void m156117a(int i, Throwable th, String str, Object... objArr) {
        if (this.f203879c <= i) {
            if (objArr != null && objArr.length > 0) {
                C1764a.m5928a(str, objArr);
            }
            if (th != null) {
                this.f203878b.mo144633a(th);
            }
        }
    }
}
