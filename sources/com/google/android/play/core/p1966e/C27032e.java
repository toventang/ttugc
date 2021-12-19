package com.google.android.play.core.p1966e;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.play.core.e.e */
public final class C27032e {

    /* renamed from: a */
    public final List<String> f63984a;

    /* renamed from: b */
    public final List<Locale> f63985b;

    /* renamed from: com.google.android.play.core.e.e$a */
    public static class C27033a {

        /* renamed from: a */
        final List<String> f63986a = new ArrayList();

        /* renamed from: b */
        public final List<Locale> f63987b = new ArrayList();

        static {
            Covode.recordClassIndex(32509);
        }

        private C27033a() {
        }

        /* synthetic */ C27033a(byte b) {
        }

        /* renamed from: a */
        public final C27033a mo44732a(String str) {
            this.f63986a.add(str);
            return this;
        }

        /* renamed from: a */
        public final C27032e mo44733a() {
            return new C27032e(this);
        }
    }

    static {
        Covode.recordClassIndex(32508);
    }

    /* renamed from: a */
    public static C27033a m53718a() {
        return new C27033a((byte) 0);
    }

    public final String toString() {
        return C1764a.m5928a("SplitInstallRequest{modulesNames=%s,languages=%s}", new Object[]{this.f63984a, this.f63985b});
    }

    /* synthetic */ C27032e(C27033a aVar) {
        this.f63984a = new ArrayList(aVar.f63986a);
        this.f63985b = new ArrayList(aVar.f63987b);
    }
}
