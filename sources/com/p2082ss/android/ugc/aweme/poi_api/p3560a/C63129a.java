package com.p2082ss.android.ugc.aweme.poi_api.p3560a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.poi_api.a.a */
public final class C63129a {

    /* renamed from: a */
    public static final C63130a f143466a = null;

    /* renamed from: b */
    public static final C63129a f143467b = new C63129a();

    private C63129a() {
    }

    static {
        Covode.recordClassIndex(74340);
    }

    /* renamed from: com.ss.android.ugc.aweme.poi_api.a.a$a */
    public static final class C63130a {
        @AbstractC27891c(mo46611a = "enable")

        /* renamed from: a */
        public final boolean f143468a;
        @AbstractC27891c(mo46611a = "poi_service_settings")

        /* renamed from: b */
        public final String f143469b;
        @AbstractC27891c(mo46611a = "location_map_settings")

        /* renamed from: c */
        public final String f143470c;
        @AbstractC27891c(mo46611a = "location_cache_time")

        /* renamed from: d */
        public final int f143471d;
        @AbstractC27891c(mo46611a = "waze_url")

        /* renamed from: e */
        public final String f143472e;
        @AbstractC27891c(mo46611a = "static_map_url")

        /* renamed from: f */
        public final String f143473f;

        static {
            Covode.recordClassIndex(74341);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C63130a)) {
                return false;
            }
            C63130a aVar = (C63130a) obj;
            return this.f143468a == aVar.f143468a && C89219l.m154714a(this.f143469b, aVar.f143469b) && C89219l.m154714a(this.f143470c, aVar.f143470c) && this.f143471d == aVar.f143471d && C89219l.m154714a(this.f143472e, aVar.f143472e) && C89219l.m154714a(this.f143473f, aVar.f143473f);
        }

        public final int hashCode() {
            boolean z = this.f143468a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            String str = this.f143469b;
            int i5 = 0;
            int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f143470c;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f143471d) * 31;
            String str3 = this.f143472e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f143473f;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            return hashCode3 + i5;
        }

        private C63130a() {
            this.f143468a = false;
            this.f143469b = null;
            this.f143470c = null;
            this.f143471d = 3600000;
            this.f143472e = null;
            this.f143473f = null;
        }

        public final String toString() {
            return "Config(enable=" + this.f143468a + ", poiKey=" + this.f143469b + ", mapKey=" + this.f143470c + ", locationCacheTime=" + this.f143471d + ')';
        }

        public /* synthetic */ C63130a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static C63130a m114087a() {
        C63130a aVar = (C63130a) SettingsManager.m29616a().mo25397a("poi_config", C63130a.class, f143466a);
        if (aVar == null) {
            aVar = new C63130a((byte) 0);
        }
        C89219l.m154716b(aVar, "");
        return aVar;
    }
}
