package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.b.a */
public final class C55730a implements Serializable {

    /* renamed from: a */
    private final int f127102a;

    /* renamed from: b */
    private final List<String> f127103b;

    /* renamed from: c */
    private final List<Long> f127104c;

    static {
        Covode.recordClassIndex(65516);
    }

    /* renamed from: com_ss_android_ugc_aweme_im_sdk_relations_data_model_FamiliarRelationModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m101484x78c1ce26(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.relations.data.b.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C55730a copy$default(C55730a aVar, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f127102a;
        }
        if ((i2 & 2) != 0) {
            list = aVar.f127103b;
        }
        if ((i2 & 4) != 0) {
            list2 = aVar.f127104c;
        }
        return aVar.copy(i, list, list2);
    }

    public final int component1() {
        return this.f127102a;
    }

    public final List<String> component2() {
        return this.f127103b;
    }

    public final List<Long> component3() {
        return this.f127104c;
    }

    public final C55730a copy(int i, List<String> list, List<Long> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        return new C55730a(i, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55730a)) {
            return false;
        }
        C55730a aVar = (C55730a) obj;
        return this.f127102a == aVar.f127102a && C89219l.m154714a(this.f127103b, aVar.f127103b) && C89219l.m154714a(this.f127104c, aVar.f127104c);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_im_sdk_relations_data_model_FamiliarRelationModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m101484x78c1ce26(this.f127102a) * 31;
        List<String> list = this.f127103b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_im_sdk_relations_data_model_FamiliarRelationModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Long> list2 = this.f127104c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FamiliarRelationModel(relationType=" + this.f127102a + ", secUserIds=" + this.f127103b + ", createdTimes=" + this.f127104c + ")";
    }

    public final List<Long> getCreatedTimes() {
        return this.f127104c;
    }

    public final int getRelationType() {
        return this.f127102a;
    }

    public final List<String> getSecUserIds() {
        return this.f127103b;
    }

    public C55730a(int i, List<String> list, List<Long> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f127102a = i;
        this.f127103b = list;
        this.f127104c = list2;
    }
}
