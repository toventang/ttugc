package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.a */
public final class C63555a {
    @AbstractC27891c(mo46611a = "max_num")

    /* renamed from: a */
    public final Integer f144234a;
    @AbstractC27891c(mo46611a = "pronouns_list")

    /* renamed from: b */
    public final List<String> f144235b;

    static {
        Covode.recordClassIndex(74871);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63555a)) {
            return false;
        }
        C63555a aVar = (C63555a) obj;
        return C89219l.m154714a(this.f144234a, aVar.f144234a) && C89219l.m154714a(this.f144235b, aVar.f144235b);
    }

    public final int hashCode() {
        Integer num = this.f144234a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<String> list = this.f144235b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProfileEditPronounsParams(maxPronounsNum=" + this.f144234a + ", pronounsList=" + this.f144235b + ")";
    }

    public /* synthetic */ C63555a() {
        this(4, C89086z.INSTANCE);
    }

    private C63555a(Integer num, List<String> list) {
        this.f144234a = num;
        this.f144235b = list;
    }
}
