package com.p2082ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.videogift.g */
public final class C40515g extends BaseResponse {
    @AbstractC27891c(mo46611a = "video_gift_status")

    /* renamed from: a */
    public final Integer f94788a;

    static {
        Covode.recordClassIndex(48327);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C40515g) && C89219l.m154714a(this.f94788a, ((C40515g) obj).f94788a);
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f94788a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "VideoGiftSettingResponse(videoGiftStatus=" + this.f94788a + ")";
    }
}
