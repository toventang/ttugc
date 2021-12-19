package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m */
public final class C44084m implements Serializable {
    @AbstractC27891c(mo46611a = "element")

    /* renamed from: a */
    private final String f102783a;
    @AbstractC27891c(mo46611a = "param_name")

    /* renamed from: b */
    private final String f102784b;
    @AbstractC27891c(mo46611a = "param_value")

    /* renamed from: c */
    private String f102785c;
    @AbstractC27891c(mo46611a = "need_encryption")

    /* renamed from: d */
    private final Boolean f102786d;
    @AbstractC27891c(mo46611a = "is_encrypted")

    /* renamed from: e */
    private final Boolean f102787e;

    static {
        Covode.recordClassIndex(52395);
    }

    public C44084m() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ C44084m copy$default(C44084m mVar, String str, String str2, String str3, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mVar.f102783a;
        }
        if ((i & 2) != 0) {
            str2 = mVar.f102784b;
        }
        if ((i & 4) != 0) {
            str3 = mVar.f102785c;
        }
        if ((i & 8) != 0) {
            bool = mVar.f102786d;
        }
        if ((i & 16) != 0) {
            bool2 = mVar.f102787e;
        }
        return mVar.copy(str, str2, str3, bool, bool2);
    }

    public final String component1() {
        return this.f102783a;
    }

    public final String component2() {
        return this.f102784b;
    }

    public final String component3() {
        return this.f102785c;
    }

    public final Boolean component4() {
        return this.f102786d;
    }

    public final Boolean component5() {
        return this.f102787e;
    }

    public final C44084m copy(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        return new C44084m(str, str2, str3, bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44084m)) {
            return false;
        }
        C44084m mVar = (C44084m) obj;
        return C89219l.m154714a(this.f102783a, mVar.f102783a) && C89219l.m154714a(this.f102784b, mVar.f102784b) && C89219l.m154714a(this.f102785c, mVar.f102785c) && C89219l.m154714a(this.f102786d, mVar.f102786d) && C89219l.m154714a(this.f102787e, mVar.f102787e);
    }

    public final int hashCode() {
        String str = this.f102783a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102784b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f102785c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.f102786d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f102787e;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "PaymentElement(element=" + this.f102783a + ", paramName=" + this.f102784b + ", paramValue=" + this.f102785c + ", needEncryption=" + this.f102786d + ", isEncrypted=" + this.f102787e + ")";
    }

    public final String getElement() {
        return this.f102783a;
    }

    public final Boolean getNeedEncryption() {
        return this.f102786d;
    }

    public final String getParamName() {
        return this.f102784b;
    }

    public final String getParamValue() {
        return this.f102785c;
    }

    public final Boolean isEncrypted() {
        return this.f102787e;
    }

    public final void setParamValue(String str) {
        this.f102785c = str;
    }

    public C44084m(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.f102783a = str;
        this.f102784b = str2;
        this.f102785c = str3;
        this.f102786d = bool;
        this.f102787e = bool2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C44084m(String str, String str2, String str3, Boolean bool, Boolean bool2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? bool : null, (i & 16) != 0 ? false : bool2);
    }
}
