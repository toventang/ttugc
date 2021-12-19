package com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d */
public final class C44457d {
    @AbstractC27891c(mo46611a = "address_reachable")

    /* renamed from: a */
    public final boolean f103649a;
    @AbstractC27891c(mo46611a = "shipping_address")

    /* renamed from: b */
    public final Address f103650b;
    @AbstractC27891c(mo46611a = "invalid_hint_message")

    /* renamed from: c */
    public final String f103651c;
    @AbstractC27891c(mo46611a = "address_valid")

    /* renamed from: d */
    public final Boolean f103652d;

    static {
        Covode.recordClassIndex(52800);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44457d)) {
            return false;
        }
        C44457d dVar = (C44457d) obj;
        return this.f103649a == dVar.f103649a && C89219l.m154714a(this.f103650b, dVar.f103650b) && C89219l.m154714a(this.f103651c, dVar.f103651c) && C89219l.m154714a(this.f103652d, dVar.f103652d);
    }

    public final int hashCode() {
        boolean z = this.f103649a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        Address address = this.f103650b;
        int i5 = 0;
        int hashCode = (i4 + (address != null ? address.hashCode() : 0)) * 31;
        String str = this.f103651c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f103652d;
        if (bool != null) {
            i5 = bool.hashCode();
        }
        return hashCode2 + i5;
    }

    public final String toString() {
        return "ReachableAddress(reachable=" + this.f103649a + ", address=" + this.f103650b + ", invalidHintMessage=" + this.f103651c + ", addressValid=" + this.f103652d + ")";
    }
}
