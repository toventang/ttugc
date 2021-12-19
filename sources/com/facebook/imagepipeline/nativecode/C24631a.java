package com.facebook.imagepipeline.nativecode;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1892q.AbstractC24649b;
import com.facebook.imagepipeline.p1892q.AbstractC24650c;
import com.facebook.p1870h.C24313b;
import com.facebook.p1870h.C24314c;

/* renamed from: com.facebook.imagepipeline.nativecode.a */
public final class C24631a implements AbstractC24650c {

    /* renamed from: a */
    private final int f58542a;

    /* renamed from: b */
    private final boolean f58543b;

    static {
        Covode.recordClassIndex(28781);
    }

    public C24631a(int i, boolean z) {
        this.f58542a = i;
        this.f58543b = z;
    }

    @Override // com.facebook.imagepipeline.p1892q.AbstractC24650c
    /* renamed from: a */
    public final AbstractC24649b mo40473a(C24314c cVar, boolean z) {
        if (cVar != C24313b.f57651a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f58542a, this.f58543b);
    }
}
