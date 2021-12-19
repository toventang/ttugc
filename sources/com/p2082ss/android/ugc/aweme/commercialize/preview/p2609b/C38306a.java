package com.p2082ss.android.ugc.aweme.commercialize.preview.p2609b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.preview.b.a */
public final class C38306a implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    private final int f90529a;
    @AbstractC27891c(mo46611a = "ad_ids")

    /* renamed from: b */
    private final List<String> f90530b;
    @AbstractC27891c(mo46611a = "creative_ids")

    /* renamed from: c */
    private final List<String> f90531c;

    static {
        Covode.recordClassIndex(45794);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_preview_model_AdsPreviewResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77702xedcd3d0a(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.preview.b.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38306a copy$default(C38306a aVar, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f90529a;
        }
        if ((i2 & 2) != 0) {
            list = aVar.f90530b;
        }
        if ((i2 & 4) != 0) {
            list2 = aVar.f90531c;
        }
        return aVar.copy(i, list, list2);
    }

    public final int component1() {
        return this.f90529a;
    }

    public final List<String> component2() {
        return this.f90530b;
    }

    public final List<String> component3() {
        return this.f90531c;
    }

    public final C38306a copy(int i, List<String> list, List<String> list2) {
        return new C38306a(i, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38306a)) {
            return false;
        }
        C38306a aVar = (C38306a) obj;
        return this.f90529a == aVar.f90529a && C89219l.m154714a(this.f90530b, aVar.f90530b) && C89219l.m154714a(this.f90531c, aVar.f90531c);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_preview_model_AdsPreviewResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m77702xedcd3d0a(this.f90529a) * 31;
        List<String> list = this.f90530b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_preview_model_AdsPreviewResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f90531c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AdsPreviewResponse(statusCode=" + this.f90529a + ", adIds=" + this.f90530b + ", creativeIds=" + this.f90531c + ")";
    }

    public final List<String> getAdIds() {
        return this.f90530b;
    }

    public final List<String> getCreativeIds() {
        return this.f90531c;
    }

    public final int getStatusCode() {
        return this.f90529a;
    }

    public C38306a(int i, List<String> list, List<String> list2) {
        this.f90529a = i;
        this.f90530b = list;
        this.f90531c = list2;
    }
}
