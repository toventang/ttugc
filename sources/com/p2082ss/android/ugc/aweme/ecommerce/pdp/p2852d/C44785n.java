package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Video;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.n */
public final class C44785n {

    /* renamed from: a */
    public final Video f104490a;

    static {
        Covode.recordClassIndex(53171);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C44785n) && C89219l.m154714a(this.f104490a, ((C44785n) obj).f104490a);
        }
        return true;
    }

    public final int hashCode() {
        Video video = this.f104490a;
        if (video != null) {
            return video.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductVideoVO(video=" + this.f104490a + ")";
    }

    public C44785n(Video video) {
        C89219l.m154721d(video, "");
        this.f104490a = video;
    }
}
