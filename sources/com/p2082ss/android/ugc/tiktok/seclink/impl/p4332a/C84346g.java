package com.p2082ss.android.ugc.tiktok.seclink.impl.p4332a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.seclink.impl.a.g */
public final class C84346g {

    /* renamed from: a */
    public static final C84347a f188588a = new C84347a();

    /* renamed from: b */
    public static final C84346g f188589b = new C84346g();

    private C84346g() {
    }

    /* renamed from: com.ss.android.ugc.tiktok.seclink.impl.a.g$a */
    public static final class C84347a {
        @AbstractC27891c(mo46611a = "enabled")

        /* renamed from: a */
        public final boolean f188590a;
        @AbstractC27891c(mo46611a = "scenes")

        /* renamed from: b */
        public final List<String> f188591b;
        @AbstractC27891c(mo46611a = "tokens")

        /* renamed from: c */
        public final List<String> f188592c;

        static {
            Covode.recordClassIndex(98298);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C84347a)) {
                return false;
            }
            C84347a aVar = (C84347a) obj;
            return this.f188590a == aVar.f188590a && C89219l.m154714a(this.f188591b, aVar.f188591b) && C89219l.m154714a(this.f188592c, aVar.f188592c);
        }

        public final int hashCode() {
            boolean z = this.f188590a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            List<String> list = this.f188591b;
            int i5 = 0;
            int hashCode = (i4 + (list != null ? list.hashCode() : 0)) * 31;
            List<String> list2 = this.f188592c;
            if (list2 != null) {
                i5 = list2.hashCode();
            }
            return hashCode + i5;
        }

        public final String toString() {
            return "SecLinkTokenConfig(enable=" + this.f188590a + ", allowScenes=" + this.f188591b + ", allowTokens=" + this.f188592c + ")";
        }

        public /* synthetic */ C84347a() {
            this(new ArrayList(), new ArrayList());
        }

        private C84347a(List<String> list, List<String> list2) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            this.f188590a = false;
            this.f188591b = list;
            this.f188592c = list2;
        }
    }

    static {
        Covode.recordClassIndex(98297);
    }

    /* renamed from: a */
    public static C84347a m145091a() {
        try {
            SettingsManager a = SettingsManager.m29616a();
            C84347a aVar = f188588a;
            C84347a aVar2 = (C84347a) a.mo25397a("seclink_token_config", C84347a.class, aVar);
            return aVar2 == null ? aVar : aVar2;
        } catch (Throwable unused) {
            return f188588a;
        }
    }
}
