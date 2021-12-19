package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20749f;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1890o.AbstractC24635a;

/* renamed from: com.bytedance.lighten.loader.d */
final class C20785d extends AbstractC24635a {

    /* renamed from: a */
    private C20749f f49181a;

    static {
        Covode.recordClassIndex(24361);
    }

    C20785d(C20749f fVar) {
        this.f49181a = fVar;
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final C24117a<Bitmap> process(Bitmap bitmap, AbstractC24357f fVar) {
        return C24117a.m45711b(fVar.mo40151a(bitmap, this.f49181a.f48970a, this.f49181a.f48971b, this.f49181a.f48972c, this.f49181a.f48973d));
    }
}
