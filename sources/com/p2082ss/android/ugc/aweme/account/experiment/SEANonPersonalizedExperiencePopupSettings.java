package com.p2082ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.SEANonPersonalizedExperiencePopupSettings */
public final class SEANonPersonalizedExperiencePopupSettings {
    public static final C31636a DEFAULT = new C31636a();
    public static final SEANonPersonalizedExperiencePopupSettings INSTANCE = new SEANonPersonalizedExperiencePopupSettings();

    /* renamed from: com.ss.android.ugc.aweme.account.experiment.SEANonPersonalizedExperiencePopupSettings$a */
    public static final class C31636a {
        @AbstractC27891c(mo46611a = "days_until_show_popup")

        /* renamed from: a */
        public final int f75675a = 3;
        @AbstractC27891c(mo46611a = "days_until_force_login")

        /* renamed from: b */
        public final int f75676b = 5;

        static {
            Covode.recordClassIndex(38367);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31636a)) {
                return false;
            }
            C31636a aVar = (C31636a) obj;
            return this.f75675a == aVar.f75675a && this.f75676b == aVar.f75676b;
        }

        public final int hashCode() {
            return (this.f75675a * 31) + this.f75676b;
        }

        public final String toString() {
            return "Settings(daysUntilPopupShow=" + this.f75675a + ", daysUntilForcedLoginShow=" + this.f75676b + ")";
        }
    }

    private SEANonPersonalizedExperiencePopupSettings() {
    }

    public final C31636a getDEFAULT() {
        return DEFAULT;
    }

    static {
        Covode.recordClassIndex(38366);
    }

    public static final C31636a getPopupSettings() {
        return (C31636a) SettingsManager.m29616a().mo25397a("non_personalized_with_popup_and_force_login_time", C31636a.class, DEFAULT);
    }
}
