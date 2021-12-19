package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.p2912a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.b.a.d */
public final class C46561d extends BaseResponse {
    @AbstractC27891c(mo46611a = "android_emoji_resource")

    /* renamed from: a */
    public final C46559b f108564a;
    @AbstractC27891c(mo46611a = "android_emoji_status")

    /* renamed from: b */
    public final int f108565b;
    @AbstractC27891c(mo46611a = "ios_emoji_resource")

    /* renamed from: c */
    public final C46559b f108566c;
    @AbstractC27891c(mo46611a = "ios_emoji_status")

    /* renamed from: d */
    public final int f108567d;

    static {
        Covode.recordClassIndex(55148);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46561d)) {
            return false;
        }
        C46561d dVar = (C46561d) obj;
        return C89219l.m154714a(this.f108564a, dVar.f108564a) && this.f108565b == dVar.f108565b && C89219l.m154714a(this.f108566c, dVar.f108566c) && this.f108567d == dVar.f108567d;
    }

    public final int hashCode() {
        C46559b bVar = this.f108564a;
        int i = 0;
        int hashCode = (((bVar != null ? bVar.hashCode() : 0) * 31) + this.f108565b) * 31;
        C46559b bVar2 = this.f108566c;
        if (bVar2 != null) {
            i = bVar2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f108567d;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "OnlineSmallEmojiResponse(resources=" + this.f108564a + ", emojiStatus=" + this.f108565b + ", iosResources=" + this.f108566c + ", iosEmojiStatus=" + this.f108567d + ")";
    }
}
