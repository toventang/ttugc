package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.k */
public final class C55140k extends AbstractC56226b {

    /* renamed from: a */
    public final long f126177a;

    static {
        Covode.recordClassIndex(64868);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C55140k) && this.f126177a == ((C55140k) obj).f126177a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f126177a;
        return (int) (j ^ (j >>> 32));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b
    public final String toString() {
        return "StickerShowEventKey(stickerId=" + this.f126177a + ")";
    }

    public C55140k(long j) {
        super("aweme_im_sticker_show", String.valueOf(j));
        this.f126177a = j;
    }
}
