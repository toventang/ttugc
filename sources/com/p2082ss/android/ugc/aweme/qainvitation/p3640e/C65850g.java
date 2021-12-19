package com.p2082ss.android.ugc.aweme.qainvitation.p3640e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.e.g */
public final class C65850g extends BaseResponse {
    @AbstractC27891c(mo46611a = "user_list")

    /* renamed from: a */
    public final List<User> f148396a;
    @AbstractC27891c(mo46611a = "block_results")

    /* renamed from: b */
    public final List<C65851h> f148397b;

    static {
        Covode.recordClassIndex(77351);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65850g)) {
            return false;
        }
        C65850g gVar = (C65850g) obj;
        return C89219l.m154714a(this.f148396a, gVar.f148396a) && C89219l.m154714a(this.f148397b, gVar.f148397b);
    }

    public final int hashCode() {
        List<User> list = this.f148396a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C65851h> list2 = this.f148397b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "RecentContactsData(recentContacts=" + this.f148396a + ", recentContactsBlockedList=" + this.f148397b + ")";
    }

    private C65850g() {
        this.f148396a = null;
        this.f148397b = null;
    }

    public /* synthetic */ C65850g(byte b) {
        this();
    }
}
