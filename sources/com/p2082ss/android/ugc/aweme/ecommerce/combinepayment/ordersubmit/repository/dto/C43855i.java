package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.i */
public final class C43855i {
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: a */
    public final String f102197a;
    @AbstractC27891c(mo46611a = "arguments")

    /* renamed from: b */
    public final HashMap<String, String> f102198b;

    static {
        Covode.recordClassIndex(52135);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43855i)) {
            return false;
        }
        C43855i iVar = (C43855i) obj;
        return C89219l.m154714a(this.f102197a, iVar.f102197a) && C89219l.m154714a(this.f102198b, iVar.f102198b);
    }

    public final int hashCode() {
        String str = this.f102197a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        HashMap<String, String> hashMap = this.f102198b;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OSPBottomNotice(text=" + this.f102197a + ", arguments=" + this.f102198b + ")";
    }
}
