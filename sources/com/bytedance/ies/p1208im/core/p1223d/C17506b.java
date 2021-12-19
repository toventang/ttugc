package com.bytedance.ies.p1208im.core.p1223d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.d.b */
public final class C17506b implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    private final int f41897a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    private final C17507c f41898b;

    static {
        Covode.recordClassIndex(19995);
    }

    /* renamed from: com_bytedance_ies_im_core_model_CheckExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m32485x334678f5(int i) {
        return i;
    }

    public static /* synthetic */ C17506b copy$default(C17506b bVar, int i, C17507c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f41897a;
        }
        if ((i2 & 2) != 0) {
            cVar = bVar.f41898b;
        }
        return bVar.copy(i, cVar);
    }

    public final int component1() {
        return this.f41897a;
    }

    public final C17507c component2() {
        return this.f41898b;
    }

    public final C17506b copy(int i, C17507c cVar) {
        return new C17506b(i, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17506b)) {
            return false;
        }
        C17506b bVar = (C17506b) obj;
        return this.f41897a == bVar.f41897a && C89219l.m154714a(this.f41898b, bVar.f41898b);
    }

    public final int hashCode() {
        int com_bytedance_ies_im_core_model_CheckExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m32485x334678f5(this.f41897a) * 31;
        C17507c cVar = this.f41898b;
        return com_bytedance_ies_im_core_model_CheckExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "CheckExtra(checkCode=" + this.f41897a + ", checkMsg=" + this.f41898b + ")";
    }

    public final int getCheckCode() {
        return this.f41897a;
    }

    public final C17507c getCheckMsg() {
        return this.f41898b;
    }

    public C17506b(int i, C17507c cVar) {
        this.f41897a = i;
        this.f41898b = cVar;
    }
}
