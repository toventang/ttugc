package com.p2082ss.android.ugc.aweme.favorites.p2920b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.MixStruct;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.b.a */
public final class C47200a extends BaseResponse {
    @AbstractC27891c(mo46611a = "mix_infos")

    /* renamed from: a */
    public final List<MixStruct> f109867a;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    public final long f109868b;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public final int f109869c;

    static {
        Covode.recordClassIndex(55813);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47200a)) {
            return false;
        }
        C47200a aVar = (C47200a) obj;
        return C89219l.m154714a(this.f109867a, aVar.f109867a) && this.f109868b == aVar.f109868b && this.f109869c == aVar.f109869c;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MixListCollectionResponse(mixInfos=" + this.f109867a + ", cursor=" + this.f109868b + ", hasMore=" + this.f109869c + ")";
    }

    public final int hashCode() {
        int i;
        List<MixStruct> list = this.f109867a;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        long j = this.f109868b;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f109869c;
    }
}
