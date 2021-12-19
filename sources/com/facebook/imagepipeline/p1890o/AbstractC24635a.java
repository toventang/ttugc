package com.facebook.imagepipeline.p1890o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.p1826c.p1827a.AbstractC24026e;

/* renamed from: com.facebook.imagepipeline.o.a */
public abstract class AbstractC24635a implements AbstractC24641d {
    public static final Bitmap.Config FALLBACK_BITMAP_CONFIGURATION = Bitmap.Config.ARGB_8888;

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public String getName() {
        return "Unknown postprocessor";
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public AbstractC24026e getPostprocessorCacheKey() {
        return null;
    }

    public void process(Bitmap bitmap) {
    }

    static {
        Covode.recordClassIndex(28785);
    }

    public void process(Bitmap bitmap, Bitmap bitmap2) {
        internalCopyBitmap(bitmap, bitmap2);
        process(bitmap);
    }

    private static void internalCopyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.copyBitmap(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public C24117a<Bitmap> process(Bitmap bitmap, AbstractC24357f fVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = FALLBACK_BITMAP_CONFIGURATION;
        }
        C24117a<Bitmap> a = fVar.mo40148a(width, height, config);
        try {
            process(a.mo39695a(), bitmap);
            return C24117a.m45711b(a);
        } finally {
            C24117a.m45712c(a);
        }
    }
}
