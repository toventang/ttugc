package com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.payment.a.b */
public final class C44627b {
    @AbstractC27891c(mo46611a = "idc")

    /* renamed from: a */
    public final String f104106a;
    @AbstractC27891c(mo46611a = "merchant_id")

    /* renamed from: b */
    public final String f104107b;
    @AbstractC27891c(mo46611a = "merchant_user_id")

    /* renamed from: c */
    public final String f104108c;
    @AbstractC27891c(mo46611a = "env")

    /* renamed from: d */
    public final String f104109d;
    @AbstractC27891c(mo46611a = "nonce")

    /* renamed from: e */
    public final String f104110e;
    @AbstractC27891c(mo46611a = "origin_key")

    /* renamed from: f */
    public final String f104111f;
    @AbstractC27891c(mo46611a = "locale")

    /* renamed from: g */
    public final String f104112g;
    @AbstractC27891c(mo46611a = "notification_url")

    /* renamed from: h */
    public final String f104113h;
    @AbstractC27891c(mo46611a = "country_or_region")

    /* renamed from: i */
    public final String f104114i;
    @AbstractC27891c(mo46611a = "payment_params")

    /* renamed from: j */
    public final C44629d f104115j;
    @AbstractC27891c(mo46611a = "risk_info")

    /* renamed from: k */
    public final String f104116k;
    @AbstractC27891c(mo46611a = "ret_code")

    /* renamed from: l */
    public final String f104117l;
    @AbstractC27891c(mo46611a = "address")

    /* renamed from: m */
    public C44626a f104118m;

    static {
        Covode.recordClassIndex(53006);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44627b)) {
            return false;
        }
        C44627b bVar = (C44627b) obj;
        return C89219l.m154714a(this.f104106a, bVar.f104106a) && C89219l.m154714a(this.f104107b, bVar.f104107b) && C89219l.m154714a(this.f104108c, bVar.f104108c) && C89219l.m154714a(this.f104109d, bVar.f104109d) && C89219l.m154714a(this.f104110e, bVar.f104110e) && C89219l.m154714a(this.f104111f, bVar.f104111f) && C89219l.m154714a(this.f104112g, bVar.f104112g) && C89219l.m154714a(this.f104113h, bVar.f104113h) && C89219l.m154714a(this.f104114i, bVar.f104114i) && C89219l.m154714a(this.f104115j, bVar.f104115j) && C89219l.m154714a(this.f104116k, bVar.f104116k) && C89219l.m154714a(this.f104117l, bVar.f104117l) && C89219l.m154714a(this.f104118m, bVar.f104118m);
    }

    public final int hashCode() {
        String str = this.f104106a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104107b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104108c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f104109d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f104110e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f104111f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f104112g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f104113h;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f104114i;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        C44629d dVar = this.f104115j;
        int hashCode10 = (hashCode9 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str10 = this.f104116k;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f104117l;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        C44626a aVar = this.f104118m;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode12 + i;
    }

    public final String toString() {
        return "Cashier(idc=" + this.f104106a + ", merchantId=" + this.f104107b + ", merchantUserId=" + this.f104108c + ", env=" + this.f104109d + ", nonce=" + this.f104110e + ", originKey=" + this.f104111f + ", locale=" + this.f104112g + ", notificationUrl=" + this.f104113h + ", countryOrRegion=" + this.f104114i + ", paymentParams=" + this.f104115j + ", riskInfo=" + this.f104116k + ", retCode=" + this.f104117l + ", address=" + this.f104118m + ")";
    }
}
