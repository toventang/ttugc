package com.p2082ss.android.ugc.tiktok.security.p4335c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.tiktok.security.c.c */
public final class C84368c {

    /* renamed from: a */
    public static final C84369a f188620a = new C84369a((byte) 0);

    /* renamed from: b */
    public static final C84368c f188621b = new C84368c();

    private C84368c() {
    }

    /* renamed from: com.ss.android.ugc.tiktok.security.c.c$a */
    public static final class C84369a {
        @AbstractC27891c(mo46611a = "enabled")

        /* renamed from: a */
        public boolean f188622a;

        static {
            Covode.recordClassIndex(98321);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C84369a) && this.f188622a == ((C84369a) obj).f188622a;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f188622a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "HttpsGuardConfig(enable=" + this.f188622a + ")";
        }

        private C84369a() {
            this.f188622a = false;
        }

        public /* synthetic */ C84369a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(98320);
    }

    /* renamed from: a */
    public static C84369a m145127a() {
        try {
            SettingsManager a = SettingsManager.m29616a();
            C84369a aVar = f188620a;
            C84369a aVar2 = (C84369a) a.mo25397a("webview_loadurl_force_https", C84369a.class, aVar);
            return aVar2 == null ? aVar : aVar2;
        } catch (Throwable unused) {
            return f188620a;
        }
    }
}
