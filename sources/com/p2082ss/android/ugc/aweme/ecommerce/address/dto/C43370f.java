package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.f */
public final class C43370f {
    @AbstractC27891c(mo46611a = "target_item_key")

    /* renamed from: a */
    public final String f101227a;
    @AbstractC27891c(mo46611a = "shipping_address")

    /* renamed from: b */
    public final Address f101228b;

    static {
        Covode.recordClassIndex(51596);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43370f)) {
            return false;
        }
        C43370f fVar = (C43370f) obj;
        return C89219l.m154714a(this.f101227a, fVar.f101227a) && C89219l.m154714a(this.f101228b, fVar.f101228b);
    }

    public final int hashCode() {
        String str = this.f101227a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Address address = this.f101228b;
        if (address != null) {
            i = address.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CandInputRequest(itemKey=" + this.f101227a + ", address=" + this.f101228b + ")";
    }

    public C43370f(String str, Address address) {
        C89219l.m154721d(address, "");
        this.f101227a = str;
        this.f101228b = address;
    }
}
