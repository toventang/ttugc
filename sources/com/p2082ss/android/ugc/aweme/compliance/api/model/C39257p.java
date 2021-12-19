package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.p */
public final class C39257p implements Serializable {
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: a */
    private final int f92739a;
    @AbstractC27891c(mo46611a = "show_type")

    /* renamed from: b */
    private final int f92740b;
    @AbstractC27891c(mo46611a = "res_type")

    /* renamed from: c */
    private final int f92741c;

    static {
        Covode.recordClassIndex(46915);
    }

    public C39257p() {
        this(0, 0, 0, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionOption_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m79638xcf45f7e9(int i) {
        return i;
    }

    public static /* synthetic */ C39257p copy$default(C39257p pVar, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = pVar.f92739a;
        }
        if ((i4 & 2) != 0) {
            i2 = pVar.f92740b;
        }
        if ((i4 & 4) != 0) {
            i3 = pVar.f92741c;
        }
        return pVar.copy(i, i2, i3);
    }

    public final int component1() {
        return this.f92739a;
    }

    public final int component2() {
        return this.f92740b;
    }

    public final int component3() {
        return this.f92741c;
    }

    public final C39257p copy(int i, int i2, int i3) {
        return new C39257p(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39257p)) {
            return false;
        }
        C39257p pVar = (C39257p) obj;
        return this.f92739a == pVar.f92739a && this.f92740b == pVar.f92740b && this.f92741c == pVar.f92741c;
    }

    public final int hashCode() {
        return (((m79638xcf45f7e9(this.f92739a) * 31) + m79638xcf45f7e9(this.f92740b)) * 31) + m79638xcf45f7e9(this.f92741c);
    }

    public final int getResType() {
        return this.f92741c;
    }

    public final int getShowType() {
        return this.f92740b;
    }

    public final int getValue() {
        return this.f92739a;
    }

    public final String toString() {
        return "{'value':" + this.f92739a + ", 'show_type':" + this.f92740b + ", 'res_type':" + this.f92741c + "}";
    }

    public C39257p(int i, int i2, int i3) {
        this.f92739a = i;
        this.f92740b = i2;
        this.f92741c = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39257p(int i, int i2, int i3, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
