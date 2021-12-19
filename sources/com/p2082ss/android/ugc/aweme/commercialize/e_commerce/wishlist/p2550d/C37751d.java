package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2550d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.d.d */
public final class C37751d implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    private final int f89147a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    private final String f89148b;
    @AbstractC27891c(mo46611a = "lynx_schema")

    /* renamed from: c */
    private final C37750c f89149c;

    static {
        Covode.recordClassIndex(45194);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_e_commerce_wishlist_model_WishListGeckoResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m76371x8c0f374b(int i) {
        return i;
    }

    public static /* synthetic */ C37751d copy$default(C37751d dVar, int i, String str, C37750c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dVar.f89147a;
        }
        if ((i2 & 2) != 0) {
            str = dVar.f89148b;
        }
        if ((i2 & 4) != 0) {
            cVar = dVar.f89149c;
        }
        return dVar.copy(i, str, cVar);
    }

    public final int component1() {
        return this.f89147a;
    }

    public final String component2() {
        return this.f89148b;
    }

    public final C37750c component3() {
        return this.f89149c;
    }

    public final C37751d copy(int i, String str, C37750c cVar) {
        return new C37751d(i, str, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37751d)) {
            return false;
        }
        C37751d dVar = (C37751d) obj;
        return this.f89147a == dVar.f89147a && C89219l.m154714a(this.f89148b, dVar.f89148b) && C89219l.m154714a(this.f89149c, dVar.f89149c);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_e_commerce_wishlist_model_WishListGeckoResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m76371x8c0f374b(this.f89147a) * 31;
        String str = this.f89148b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_e_commerce_wishlist_model_WishListGeckoResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C37750c cVar = this.f89149c;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "WishListGeckoResponse(statusCode=" + this.f89147a + ", statusMsg=" + this.f89148b + ", lynxSchema=" + this.f89149c + ")";
    }

    public final C37750c getLynxSchema() {
        return this.f89149c;
    }

    public final int getStatusCode() {
        return this.f89147a;
    }

    public final String getStatusMsg() {
        return this.f89148b;
    }

    public C37751d(int i, String str, C37750c cVar) {
        this.f89147a = i;
        this.f89148b = str;
        this.f89149c = cVar;
    }
}
