package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.u */
public final class C32292u implements Serializable {
    @AbstractC27891c(mo46611a = "avatar_url")

    /* renamed from: a */
    private final String f77008a;
    @AbstractC27891c(mo46611a = "nickname")

    /* renamed from: b */
    private final String f77009b;
    @AbstractC27891c(mo46611a = "email")

    /* renamed from: c */
    private final String f77010c;
    @AbstractC27891c(mo46611a = "error_code")

    /* renamed from: d */
    private final Integer f77011d;
    @AbstractC27891c(mo46611a = "has_email")

    /* renamed from: e */
    private Boolean f77012e;
    @AbstractC27891c(mo46611a = "has_mobile")

    /* renamed from: f */
    private Boolean f77013f;
    @AbstractC27891c(mo46611a = "has_oauth")

    /* renamed from: g */
    private Boolean f77014g;
    @AbstractC27891c(mo46611a = "has_pwd")

    /* renamed from: h */
    private Boolean f77015h;
    @AbstractC27891c(mo46611a = "is_most_device")

    /* renamed from: i */
    private final Boolean f77016i;
    @AbstractC27891c(mo46611a = "mobile")

    /* renamed from: j */
    private final String f77017j;
    @AbstractC27891c(mo46611a = "token")

    /* renamed from: k */
    private final String f77018k;
    @AbstractC27891c(mo46611a = "is_login")

    /* renamed from: l */
    private final Boolean f77019l;

    static {
        Covode.recordClassIndex(39057);
    }

    public static /* synthetic */ C32292u copy$default(C32292u uVar, String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str4, String str5, Boolean bool6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uVar.f77008a;
        }
        if ((i & 2) != 0) {
            str2 = uVar.f77009b;
        }
        if ((i & 4) != 0) {
            str3 = uVar.f77010c;
        }
        if ((i & 8) != 0) {
            num = uVar.f77011d;
        }
        if ((i & 16) != 0) {
            bool = uVar.f77012e;
        }
        if ((i & 32) != 0) {
            bool2 = uVar.f77013f;
        }
        if ((i & 64) != 0) {
            bool3 = uVar.f77014g;
        }
        if ((i & 128) != 0) {
            bool4 = uVar.f77015h;
        }
        if ((i & 256) != 0) {
            bool5 = uVar.f77016i;
        }
        if ((i & 512) != 0) {
            str4 = uVar.f77017j;
        }
        if ((i & 1024) != 0) {
            str5 = uVar.f77018k;
        }
        if ((i & 2048) != 0) {
            bool6 = uVar.f77019l;
        }
        return uVar.copy(str, str2, str3, num, bool, bool2, bool3, bool4, bool5, str4, str5, bool6);
    }

    public final String component1() {
        return this.f77008a;
    }

    public final String component10() {
        return this.f77017j;
    }

    public final String component11() {
        return this.f77018k;
    }

    public final Boolean component12() {
        return this.f77019l;
    }

    public final String component2() {
        return this.f77009b;
    }

    public final String component3() {
        return this.f77010c;
    }

    public final Integer component4() {
        return this.f77011d;
    }

    public final Boolean component5() {
        return this.f77012e;
    }

    public final Boolean component6() {
        return this.f77013f;
    }

    public final Boolean component7() {
        return this.f77014g;
    }

    public final Boolean component8() {
        return this.f77015h;
    }

    public final Boolean component9() {
        return this.f77016i;
    }

    public final C32292u copy(String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str4, String str5, Boolean bool6) {
        return new C32292u(str, str2, str3, num, bool, bool2, bool3, bool4, bool5, str4, str5, bool6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32292u)) {
            return false;
        }
        C32292u uVar = (C32292u) obj;
        return C89219l.m154714a(this.f77008a, uVar.f77008a) && C89219l.m154714a(this.f77009b, uVar.f77009b) && C89219l.m154714a(this.f77010c, uVar.f77010c) && C89219l.m154714a(this.f77011d, uVar.f77011d) && C89219l.m154714a(this.f77012e, uVar.f77012e) && C89219l.m154714a(this.f77013f, uVar.f77013f) && C89219l.m154714a(this.f77014g, uVar.f77014g) && C89219l.m154714a(this.f77015h, uVar.f77015h) && C89219l.m154714a(this.f77016i, uVar.f77016i) && C89219l.m154714a(this.f77017j, uVar.f77017j) && C89219l.m154714a(this.f77018k, uVar.f77018k) && C89219l.m154714a(this.f77019l, uVar.f77019l);
    }

    public final int hashCode() {
        String str = this.f77008a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77009b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f77010c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f77011d;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f77012e;
        int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f77013f;
        int hashCode6 = (hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f77014g;
        int hashCode7 = (hashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f77015h;
        int hashCode8 = (hashCode7 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.f77016i;
        int hashCode9 = (hashCode8 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        String str4 = this.f77017j;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f77018k;
        int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool6 = this.f77019l;
        if (bool6 != null) {
            i = bool6.hashCode();
        }
        return hashCode11 + i;
    }

    public final String toString() {
        return "TwoSvUserData(avatar_url=" + this.f77008a + ", nickname=" + this.f77009b + ", email=" + this.f77010c + ", errorCode=" + this.f77011d + ", has_email=" + this.f77012e + ", has_mobile=" + this.f77013f + ", has_oauth=" + this.f77014g + ", has_pwd=" + this.f77015h + ", is_most_device=" + this.f77016i + ", mobile=" + this.f77017j + ", token=" + this.f77018k + ", is_login=" + this.f77019l + ")";
    }

    public final String getAvatar_url() {
        return this.f77008a;
    }

    public final String getEmail() {
        return this.f77010c;
    }

    public final Integer getErrorCode() {
        return this.f77011d;
    }

    public final Boolean getHas_email() {
        return this.f77012e;
    }

    public final Boolean getHas_mobile() {
        return this.f77013f;
    }

    public final Boolean getHas_oauth() {
        return this.f77014g;
    }

    public final Boolean getHas_pwd() {
        return this.f77015h;
    }

    public final String getMobile() {
        return this.f77017j;
    }

    public final String getNickname() {
        return this.f77009b;
    }

    public final String getToken() {
        return this.f77018k;
    }

    public final Boolean is_login() {
        return this.f77019l;
    }

    public final Boolean is_most_device() {
        return this.f77016i;
    }

    public final void setHas_email(Boolean bool) {
        this.f77012e = bool;
    }

    public final void setHas_mobile(Boolean bool) {
        this.f77013f = bool;
    }

    public final void setHas_oauth(Boolean bool) {
        this.f77014g = bool;
    }

    public final void setHas_pwd(Boolean bool) {
        this.f77015h = bool;
    }

    public C32292u(String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str4, String str5, Boolean bool6) {
        this.f77008a = str;
        this.f77009b = str2;
        this.f77010c = str3;
        this.f77011d = num;
        this.f77012e = bool;
        this.f77013f = bool2;
        this.f77014g = bool3;
        this.f77015h = bool4;
        this.f77016i = bool5;
        this.f77017j = str4;
        this.f77018k = str5;
        this.f77019l = bool6;
    }
}
