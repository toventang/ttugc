package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.e */
public final class C55134e extends AbstractC56226b {

    /* renamed from: a */
    public final int f126165a;

    static {
        Covode.recordClassIndex(64862);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C55134e) && this.f126165a == ((C55134e) obj).f126165a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f126165a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b
    public final String toString() {
        return "FirstInitEventKey(inbox=" + this.f126165a + ")";
    }

    public C55134e(int i) {
        super("aweme_im_init_end", String.valueOf(i));
        this.f126165a = i;
    }
}
