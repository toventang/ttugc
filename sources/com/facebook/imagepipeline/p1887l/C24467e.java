package com.facebook.imagepipeline.p1887l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.p036g.C0693f;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.memory.AbstractC24485d;
import com.facebook.imageutils.C24656a;

/* renamed from: com.facebook.imagepipeline.l.e */
public class C24467e extends AbstractC24464b {
    static {
        Covode.recordClassIndex(28610);
    }

    public C24467e(AbstractC24485d dVar, int i, C0693f.C0696c cVar) {
        super(dVar, i, cVar);
    }

    @Override // com.facebook.imagepipeline.p1887l.AbstractC24464b
    /* renamed from: a */
    public int mo40317a(int i, int i2, BitmapFactory.Options options) {
        if (options.outColorSpace == null || !options.outColorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) {
            return C24656a.m47169a(i, i2, options.inPreferredConfig);
        }
        return i * i2 * 8;
    }
}
