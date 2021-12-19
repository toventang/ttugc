package com.bytedance.ies.p1189c.p1190a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.c.a.a */
public final class C17066a {

    /* renamed from: a */
    public static final C17067a f40615a = new C17067a();

    /* renamed from: b */
    public static final C17066a f40616b = new C17066a();

    private C17066a() {
    }

    /* renamed from: com.bytedance.ies.c.a.a$a */
    public static final class C17067a {
        @AbstractC27891c(mo46611a = "enabled")

        /* renamed from: a */
        public final boolean f40617a;
        @AbstractC27891c(mo46611a = "force_https")

        /* renamed from: b */
        public final boolean f40618b;
        @AbstractC27891c(mo46611a = "domains_intercept")

        /* renamed from: c */
        public final boolean f40619c;
        @AbstractC27891c(mo46611a = "domains")

        /* renamed from: d */
        public final List<String> f40620d;

        static {
            Covode.recordClassIndex(19517);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17067a)) {
                return false;
            }
            C17067a aVar = (C17067a) obj;
            return this.f40617a == aVar.f40617a && this.f40618b == aVar.f40618b && this.f40619c == aVar.f40619c && C89219l.m154714a(this.f40620d, aVar.f40620d);
        }

        public final int hashCode() {
            boolean z = this.f40617a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.f40618b;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (i5 + i6) * 31;
            if (!this.f40619c) {
                i = 0;
            }
            int i10 = (i9 + i) * 31;
            List<String> list = this.f40620d;
            return i10 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "LynxSecConfig(enable=" + this.f40617a + ", forceHttps=" + this.f40618b + ", intercept=" + this.f40619c + ", whiteList=" + this.f40620d + ")";
        }

        public /* synthetic */ C17067a() {
            this(new ArrayList());
        }

        private C17067a(List<String> list) {
            C89219l.m154721d(list, "");
            this.f40617a = false;
            this.f40618b = false;
            this.f40619c = false;
            this.f40620d = list;
        }
    }

    static {
        Covode.recordClassIndex(19516);
    }

    /* renamed from: a */
    public static C17067a m31538a() {
        try {
            SettingsManager a = SettingsManager.m29616a();
            C17067a aVar = f40615a;
            C17067a aVar2 = (C17067a) a.mo25397a("lynx_sec_loadurl", C17067a.class, aVar);
            return aVar2 == null ? aVar : aVar2;
        } catch (Throwable unused) {
            return f40615a;
        }
    }
}
