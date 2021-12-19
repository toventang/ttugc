package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.d.f */
public final class C44777f {

    /* renamed from: a */
    public final Image f104467a;

    static {
        Covode.recordClassIndex(53163);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C44777f) && C89219l.m154714a(this.f104467a, ((C44777f) obj).f104467a);
        }
        return true;
    }

    public final int hashCode() {
        Image image = this.f104467a;
        if (image != null) {
            return image.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductImageVO(image=" + this.f104467a + ")";
    }

    public C44777f(Image image) {
        C89219l.m154721d(image, "");
        this.f104467a = image;
    }
}
