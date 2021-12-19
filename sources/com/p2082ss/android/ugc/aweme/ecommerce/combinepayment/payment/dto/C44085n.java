package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n */
public final class C44085n {
    @AbstractC27891c(mo46611a = "payment_method_info")

    /* renamed from: a */
    public final C44087p f102788a;
    @AbstractC27891c(mo46611a = "payment_method")

    /* renamed from: b */
    public C44086o f102789b;
    @AbstractC27891c(mo46611a = "use_shipping_address")

    /* renamed from: c */
    public final Boolean f102790c;
    @AbstractC27891c(mo46611a = "is_valid")

    /* renamed from: d */
    public Boolean f102791d;
    @AbstractC27891c(mo46611a = "region_string")

    /* renamed from: e */
    public String f102792e;
    @AbstractC27891c(mo46611a = "region_geo_id")

    /* renamed from: f */
    public String f102793f;

    static {
        Covode.recordClassIndex(52396);
    }

    private C44085n(C44087p pVar, C44086o oVar, Boolean bool, Boolean bool2, String str, String str2) {
        this.f102788a = pVar;
        this.f102789b = oVar;
        this.f102790c = bool;
        this.f102791d = bool2;
        this.f102792e = str;
        this.f102793f = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C44085n(C44087p pVar, C44086o oVar, Boolean bool, Boolean bool2, String str, String str2, int i) {
        this(pVar, oVar, bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str, (i & 32) == 0 ? str2 : null);
    }
}
