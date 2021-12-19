package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.g */
public final class C55136g extends AbstractC56226b {

    /* renamed from: a */
    public final String f126171a;

    static {
        Covode.recordClassIndex(64864);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C55136g) && C89219l.m154714a(this.f126171a, ((C55136g) obj).f126171a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f126171a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b
    public final String toString() {
        return "ImageShowEventKey(imageId=" + this.f126171a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55136g(String str) {
        super("aweme_im_image_show", str);
        C89219l.m154721d(str, "");
        this.f126171a = str;
    }
}
