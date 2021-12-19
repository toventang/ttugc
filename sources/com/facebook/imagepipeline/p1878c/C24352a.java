package com.facebook.imagepipeline.p1878c;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.memory.AbstractC24485d;
import com.facebook.imageutils.C24656a;

/* renamed from: com.facebook.imagepipeline.c.a */
public final class C24352a extends AbstractC24357f {

    /* renamed from: a */
    private final AbstractC24485d f57740a;

    static {
        Covode.recordClassIndex(28494);
    }

    public C24352a(AbstractC24485d dVar) {
        this.f57740a = dVar;
    }

    @Override // com.facebook.imagepipeline.p1878c.AbstractC24357f
    /* renamed from: a */
    public final C24117a<Bitmap> mo40148a(int i, int i2, Bitmap.Config config) {
        boolean z;
        Bitmap bitmap = (Bitmap) this.f57740a.mo39664a(C24656a.m47169a(i, i2, config));
        if (bitmap.getAllocationByteCount() >= i * i2 * C24656a.m47170a(config)) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        bitmap.reconfigure(i, i2, config);
        return C24117a.m45707a(bitmap, this.f57740a);
    }
}
