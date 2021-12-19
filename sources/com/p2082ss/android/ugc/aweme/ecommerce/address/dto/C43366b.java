package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.b */
public final class C43366b {
    @AbstractC27891c(mo46611a = "shipping_address")

    /* renamed from: a */
    public final Address f101215a;
    @AbstractC27891c(mo46611a = "session_key")

    /* renamed from: b */
    public final String f101216b;
    @AbstractC27891c(mo46611a = "autocomplete_address_id")

    /* renamed from: c */
    public final String f101217c;

    static {
        Covode.recordClassIndex(51592);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43366b)) {
            return false;
        }
        C43366b bVar = (C43366b) obj;
        return C89219l.m154714a(this.f101215a, bVar.f101215a) && C89219l.m154714a(this.f101216b, bVar.f101216b) && C89219l.m154714a(this.f101217c, bVar.f101217c);
    }

    public final int hashCode() {
        Address address = this.f101215a;
        int i = 0;
        int hashCode = (address != null ? address.hashCode() : 0) * 31;
        String str = this.f101216b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f101217c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CandDetailPlaceRequest(shippingAddress=" + this.f101215a + ", sessionKey=" + this.f101216b + ", autocompleteAddressId=" + this.f101217c + ")";
    }

    public C43366b(Address address, String str, String str2) {
        C89219l.m154721d(address, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f101215a = address;
        this.f101216b = str;
        this.f101217c = str2;
    }
}
