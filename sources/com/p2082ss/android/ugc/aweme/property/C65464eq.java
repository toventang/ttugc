package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.eq */
public final class C65464eq {
    @AbstractC27891c(mo46611a = "ve_synthesis_settings_key")

    /* renamed from: a */
    public final String f147653a;
    @AbstractC27891c(mo46611a = "high_quality_ve_synthesis_settings_key")

    /* renamed from: b */
    public final String f147654b;

    static {
        Covode.recordClassIndex(76951);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65464eq)) {
            return false;
        }
        C65464eq eqVar = (C65464eq) obj;
        return C89219l.m154714a(this.f147653a, eqVar.f147653a) && C89219l.m154714a(this.f147654b, eqVar.f147654b);
    }

    public final int hashCode() {
        String str = this.f147653a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f147654b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VESettingConfigs(veSynthesisSettingsKey=" + this.f147653a + ", highQualityVeSynthesisSettingsKey=" + this.f147654b + ")";
    }

    private /* synthetic */ C65464eq() {
        this("", "");
    }

    private C65464eq(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f147653a = str;
        this.f147654b = str2;
    }
}
