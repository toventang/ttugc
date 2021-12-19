package com.p2082ss.android.ugc.aweme.ecommerce.p2819ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.h */
public final class C43325h {
    @AbstractC27891c(mo46611a = "order_entrance_info_keys")

    /* renamed from: a */
    public List<String> f101113a;
    @AbstractC27891c(mo46611a = "add_to_cart_entrance_info_keys")

    /* renamed from: b */
    public List<String> f101114b;
    @AbstractC27891c(mo46611a = "single_sku_order_enable")

    /* renamed from: c */
    public boolean f101115c;

    static {
        Covode.recordClassIndex(51539);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43325h)) {
            return false;
        }
        C43325h hVar = (C43325h) obj;
        return C89219l.m154714a(this.f101113a, hVar.f101113a) && C89219l.m154714a(this.f101114b, hVar.f101114b) && this.f101115c == hVar.f101115c;
    }

    public final int hashCode() {
        List<String> list = this.f101113a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f101114b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f101115c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "OrderConfig(orderEntranceInfoKeys=" + this.f101113a + ", addToCardEntranceInfoKeys=" + this.f101114b + ", singleSkuOrderEnable=" + this.f101115c + ")";
    }

    private /* synthetic */ C43325h() {
        this(new ArrayList(), new ArrayList());
    }

    public C43325h(List<String> list, List<String> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f101113a = list;
        this.f101114b = list2;
        this.f101115c = true;
    }
}
