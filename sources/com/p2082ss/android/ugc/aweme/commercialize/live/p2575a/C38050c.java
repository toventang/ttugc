package com.p2082ss.android.ugc.aweme.commercialize.live.p2575a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.live.C58589b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.a.c */
public final class C38050c extends BaseResponse {
    @AbstractC27891c(mo46611a = "component_data")

    /* renamed from: a */
    public final C38049b f89912a;
    @AbstractC27891c(mo46611a = "live_products")

    /* renamed from: b */
    public final Object f89913b;

    static {
        Covode.recordClassIndex(45515);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38050c)) {
            return false;
        }
        C38050c cVar = (C38050c) obj;
        return C89219l.m154714a(this.f89912a, cVar.f89912a) && C89219l.m154714a(this.f89913b, cVar.f89913b);
    }

    public final int hashCode() {
        C38049b bVar = this.f89912a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        Object obj = this.f89913b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "LiveAdCardModel(componentData=" + this.f89912a + ", liveProduct=" + this.f89913b + ")";
    }

    /* renamed from: a */
    public final C38051d mo66332a() {
        if (this.f89913b == null) {
            return null;
        }
        return (C38051d) C58589b.m107696a().mo46670a(C58589b.m107696a().mo46674b(this.f89913b), C38051d.class);
    }
}
