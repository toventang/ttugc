package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.settings.e */
public final class C68738e {

    /* renamed from: a */
    public static final C68739a f153764a = null;

    /* renamed from: b */
    public static final C68739a f153765b = ((C68739a) SettingsManager.m29616a().mo25397a("eoy_2021_config", C68739a.class, f153764a));

    /* renamed from: c */
    public static final C68738e f153766c = new C68738e();

    /* renamed from: com.ss.android.ugc.aweme.settings.e$a */
    public static final class C68739a {
        @AbstractC27891c(mo46611a = "eoy_grey_stage")

        /* renamed from: a */
        public final boolean f153767a;
        @AbstractC27891c(mo46611a = "expired_time")

        /* renamed from: b */
        public final int f153768b;

        static {
            Covode.recordClassIndex(81008);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C68739a)) {
                return false;
            }
            C68739a aVar = (C68739a) obj;
            return this.f153767a == aVar.f153767a && this.f153768b == aVar.f153768b;
        }

        public final int hashCode() {
            boolean z = this.f153767a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return (i * 31) + this.f153768b;
        }

        public final String toString() {
            return "Eoy2021Config(eoyGreyStage=" + this.f153767a + ", expiredTime=" + this.f153768b + ")";
        }
    }

    private C68738e() {
    }

    static {
        Covode.recordClassIndex(81007);
    }
}
