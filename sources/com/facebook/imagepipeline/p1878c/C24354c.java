package com.facebook.imagepipeline.p1878c;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;

/* renamed from: com.facebook.imagepipeline.c.c */
public final class C24354c extends AbstractC24357f {
    static {
        Covode.recordClassIndex(28496);
    }

    @Override // com.facebook.imagepipeline.p1878c.AbstractC24357f
    /* renamed from: a */
    public final C24117a<Bitmap> mo40148a(int i, int i2, Bitmap.Config config) {
        MethodCollector.m26663i(5637);
        C24117a<Bitmap> a = C24117a.m45707a(Bitmap.createBitmap(i, i2, config), C24359g.m46366a());
        MethodCollector.m26664o(5637);
        return a;
    }
}
