package com.p2082ss.android.ugc.aweme.qainvitation.p3640e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.e.j */
public final class C65853j extends BaseResponse {
    @AbstractC27891c(mo46611a = "block_results")

    /* renamed from: a */
    public final List<C65851h> f148402a;

    static {
        Covode.recordClassIndex(77354);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C65853j) && C89219l.m154714a(this.f148402a, ((C65853j) obj).f148402a);
        }
        return true;
    }

    public final int hashCode() {
        List<C65851h> list = this.f148402a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UserPrivacyCheckData(filteredContactList=" + this.f148402a + ")";
    }

    private C65853j() {
        this.f148402a = null;
    }

    public /* synthetic */ C65853j(byte b) {
        this();
    }
}
