package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1835g.EnumC24105b;

/* renamed from: com.facebook.imagepipeline.memory.m */
public final class C24495m implements AbstractC24485d {
    static {
        Covode.recordClassIndex(28639);
    }

    @Override // com.facebook.common.p1835g.AbstractC24106c
    /* renamed from: a */
    public final void mo39663a(EnumC24105b bVar) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.common.p1836h.AbstractC24120c, com.facebook.common.p1835g.AbstractC24109f
    /* renamed from: a */
    public final /* synthetic */ void mo39665a(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.facebook.common.p1835g.AbstractC24109f
    /* renamed from: a */
    public final /* synthetic */ Bitmap mo39664a(int i) {
        MethodCollector.m26663i(4052);
        double d = (double) i;
        Double.isNaN(d);
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(d / 2.0d), Bitmap.Config.RGB_565);
        MethodCollector.m26664o(4052);
        return createBitmap;
    }
}
