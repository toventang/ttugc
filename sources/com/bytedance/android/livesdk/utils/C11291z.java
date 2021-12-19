package com.bytedance.android.livesdk.utils;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24031j;

/* renamed from: com.bytedance.android.livesdk.utils.z */
public final class C11291z implements AbstractC24641d {

    /* renamed from: a */
    private int f27003a;

    /* renamed from: b */
    private float f27004b;

    /* renamed from: c */
    private AbstractC11292a f27005c;

    /* renamed from: com.bytedance.android.livesdk.utils.z$a */
    public interface AbstractC11292a {
        static {
            Covode.recordClassIndex(12924);
        }
    }

    static {
        Covode.recordClassIndex(12923);
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final String getName() {
        return "blurProcessor";
    }

    public C11291z() {
        this.f27003a = 5;
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final AbstractC24026e getPostprocessorCacheKey() {
        return new C24031j("blur_bitmap_processor");
    }

    public C11291z(int i, float f) {
        this.f27004b = f;
        this.f27003a = i;
        this.f27005c = null;
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final C24117a<Bitmap> process(Bitmap bitmap, AbstractC24357f fVar) {
        float f;
        int i;
        MethodCollector.m26663i(9992);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 100 || height < 100) {
            f = 0.6f;
        } else if (width < 200 || height < 200) {
            f = 0.3f;
        } else {
            f = 0.1f;
        }
        int round = Math.round(((float) width) * f);
        int round2 = Math.round(((float) height) * f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        if (this.f27004b != 0.0f) {
            float f2 = (float) round;
            float f3 = (float) round2;
            if (Math.abs((f2 / f3) - ((float) this.f27003a)) > 0.2f) {
                float f4 = this.f27004b;
                int i2 = (int) (f2 / f4);
                if (i2 > round2) {
                    i = (int) (f3 * f4);
                    i2 = round2;
                } else {
                    i = round;
                }
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (round - i) >> 1, (round2 - i2) >> 1, i, i2);
                createScaledBitmap.recycle();
                createScaledBitmap = createBitmap;
                round = i;
                round2 = i2;
            }
        }
        C24117a<Bitmap> a = fVar.mo40150a(round, round2);
        C11263e.m19955a(createScaledBitmap, a.mo39695a(), this.f27003a);
        createScaledBitmap.recycle();
        MethodCollector.m26664o(9992);
        return a;
    }
}
