package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.b */
public final class C38231b implements Serializable {
    @AbstractC27891c(mo46611a = "enable_sub_category")

    /* renamed from: a */
    private final int f90333a;
    @AbstractC27891c(mo46611a = "sub_categories")

    /* renamed from: b */
    private final List<C38233d> f90334b;

    static {
        Covode.recordClassIndex(45715);
    }

    public C38231b() {
        this(0, null, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_model_AdDislikeInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77596x283c3fa6(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.b */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38231b copy$default(C38231b bVar, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f90333a;
        }
        if ((i2 & 2) != 0) {
            list = bVar.f90334b;
        }
        return bVar.copy(i, list);
    }

    public final int component1() {
        return this.f90333a;
    }

    public final List<C38233d> component2() {
        return this.f90334b;
    }

    public final C38231b copy(int i, List<C38233d> list) {
        return new C38231b(i, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38231b)) {
            return false;
        }
        C38231b bVar = (C38231b) obj;
        return this.f90333a == bVar.f90333a && C89219l.m154714a(this.f90334b, bVar.f90334b);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_model_AdDislikeInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m77596x283c3fa6(this.f90333a) * 31;
        List<C38233d> list = this.f90334b;
        return com_ss_android_ugc_aweme_commercialize_model_AdDislikeInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AdDislikeInfo(enable=" + this.f90333a + ", categoryList=" + this.f90334b + ")";
    }

    public final List<C38233d> getCategoryList() {
        return this.f90334b;
    }

    public final int getEnable() {
        return this.f90333a;
    }

    public C38231b(int i, List<C38233d> list) {
        this.f90333a = i;
        this.f90334b = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38231b(int i, List list, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
    }
}
