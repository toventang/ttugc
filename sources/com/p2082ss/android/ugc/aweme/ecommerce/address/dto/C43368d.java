package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.d */
public final class C43368d {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final Integer f101220a;
    @AbstractC27891c(mo46611a = "view_items")

    /* renamed from: b */
    public final List<C43377m> f101221b;
    @AbstractC27891c(mo46611a = "shipping_address")

    /* renamed from: c */
    public final Address f101222c = null;
    @AbstractC27891c(mo46611a = "autocomplete_address_id")

    /* renamed from: d */
    public final String f101223d = null;

    static {
        Covode.recordClassIndex(51594);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43368d)) {
            return false;
        }
        C43368d dVar = (C43368d) obj;
        return C89219l.m154714a(this.f101220a, dVar.f101220a) && C89219l.m154714a(this.f101221b, dVar.f101221b) && C89219l.m154714a(this.f101222c, dVar.f101222c) && C89219l.m154714a(this.f101223d, dVar.f101223d);
    }

    public final int hashCode() {
        Integer num = this.f101220a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<C43377m> list = this.f101221b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Address address = this.f101222c;
        int hashCode3 = (hashCode2 + (address != null ? address.hashCode() : 0)) * 31;
        String str = this.f101223d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "CandInputData(type=" + this.f101220a + ", viewItems=" + this.f101221b + ", address=" + this.f101222c + ", autocompleteAddressId=" + this.f101223d + ")";
    }

    public C43368d(Integer num, List<C43377m> list) {
        this.f101220a = num;
        this.f101221b = list;
    }
}
