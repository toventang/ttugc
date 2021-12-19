package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.v */
public final class C38258v implements Serializable {
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: a */
    private String f90417a;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: b */
    private String f90418b;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: c */
    private String f90419c;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: d */
    private int f90420d;

    static {
        Covode.recordClassIndex(45742);
    }

    public C38258v() {
        this(null, null, null, 0, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_model_DisclaimerText_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77607xe7cbd82(int i) {
        return i;
    }

    public static /* synthetic */ C38258v copy$default(C38258v vVar, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = vVar.f90417a;
        }
        if ((i2 & 2) != 0) {
            str2 = vVar.f90418b;
        }
        if ((i2 & 4) != 0) {
            str3 = vVar.f90419c;
        }
        if ((i2 & 8) != 0) {
            i = vVar.f90420d;
        }
        return vVar.copy(str, str2, str3, i);
    }

    public final String component1() {
        return this.f90417a;
    }

    public final String component2() {
        return this.f90418b;
    }

    public final String component3() {
        return this.f90419c;
    }

    public final int component4() {
        return this.f90420d;
    }

    public final C38258v copy(String str, String str2, String str3, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new C38258v(str, str2, str3, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38258v)) {
            return false;
        }
        C38258v vVar = (C38258v) obj;
        return C89219l.m154714a(this.f90417a, vVar.f90417a) && C89219l.m154714a(this.f90418b, vVar.f90418b) && C89219l.m154714a(this.f90419c, vVar.f90419c) && this.f90420d == vVar.f90420d;
    }

    public final int hashCode() {
        String str = this.f90417a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f90418b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f90419c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + m77607xe7cbd82(this.f90420d);
    }

    public final String toString() {
        return "DisclaimerText(text=" + this.f90417a + ", url=" + this.f90418b + ", id=" + this.f90419c + ", type=" + this.f90420d + ")";
    }

    public final String getId() {
        return this.f90419c;
    }

    public final String getText() {
        return this.f90417a;
    }

    public final int getType() {
        return this.f90420d;
    }

    public final String getUrl() {
        return this.f90418b;
    }

    public final void setType(int i) {
        this.f90420d = i;
    }

    public final void setId(String str) {
        C89219l.m154721d(str, "");
        this.f90419c = str;
    }

    public final void setText(String str) {
        C89219l.m154721d(str, "");
        this.f90417a = str;
    }

    public final void setUrl(String str) {
        C89219l.m154721d(str, "");
        this.f90418b = str;
    }

    public C38258v(String str, String str2, String str3, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f90417a = str;
        this.f90418b = str2;
        this.f90419c = str3;
        this.f90420d = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38258v(String str, String str2, String str3, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? -1 : i);
    }
}
