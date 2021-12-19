package com.p2082ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.PhoneCountryData */
public final class PhoneCountryData {
    private final int code;
    private final String displayname;

    /* renamed from: en */
    private final String f76327en;
    private final String key;

    static {
        Covode.recordClassIndex(38715);
    }

    /* renamed from: com_ss_android_ugc_aweme_account_login_model_PhoneCountryData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m66332xc32da6ff(int i) {
        return i;
    }

    public static /* synthetic */ PhoneCountryData copy$default(PhoneCountryData phoneCountryData, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = phoneCountryData.key;
        }
        if ((i2 & 2) != 0) {
            str2 = phoneCountryData.f76327en;
        }
        if ((i2 & 4) != 0) {
            i = phoneCountryData.code;
        }
        if ((i2 & 8) != 0) {
            str3 = phoneCountryData.displayname;
        }
        return phoneCountryData.copy(str, str2, i, str3);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.f76327en;
    }

    public final int component3() {
        return this.code;
    }

    public final String component4() {
        return this.displayname;
    }

    public final PhoneCountryData copy(String str, String str2, int i, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new PhoneCountryData(str, str2, i, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneCountryData)) {
            return false;
        }
        PhoneCountryData phoneCountryData = (PhoneCountryData) obj;
        return C89219l.m154714a(this.key, phoneCountryData.key) && C89219l.m154714a(this.f76327en, phoneCountryData.f76327en) && this.code == phoneCountryData.code && C89219l.m154714a(this.displayname, phoneCountryData.displayname);
    }

    public final int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f76327en;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + m66332xc32da6ff(this.code)) * 31;
        String str3 = this.displayname;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "PhoneCountryData(key=" + this.key + ", en=" + this.f76327en + ", code=" + this.code + ", displayname=" + this.displayname + ")";
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDisplayname() {
        return this.displayname;
    }

    public final String getEn() {
        return this.f76327en;
    }

    public final String getKey() {
        return this.key;
    }

    public PhoneCountryData(String str, String str2, int i, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.key = str;
        this.f76327en = str2;
        this.code = i;
        this.displayname = str3;
    }
}
