package com.p2082ss.android.ugc.aweme.newfollow.p3504a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24031j;
import com.p2082ss.android.p2133d.C29853b;

/* renamed from: com.ss.android.ugc.aweme.newfollow.a.a */
public final class C61494a implements AbstractC24641d {

    /* renamed from: a */
    private int f139594a;

    /* renamed from: b */
    private float f139595b;

    /* renamed from: c */
    private AbstractC61495a f139596c;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.a.a$a */
    public interface AbstractC61495a {
        static {
            Covode.recordClassIndex(72152);
        }

        void processorFinish(Object obj);
    }

    static {
        Covode.recordClassIndex(72151);
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final String getName() {
        return "blurProcessor";
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final AbstractC24026e getPostprocessorCacheKey() {
        return new C24031j("blur_bitmap_processor");
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final C24117a<Bitmap> process(Bitmap bitmap, AbstractC24357f fVar) {
        float f;
        int i;
        MethodCollector.m26663i(9287);
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
        if (this.f139595b != 0.0f) {
            float f2 = (float) round;
            float f3 = (float) round2;
            if (Math.abs((f2 / f3) - ((float) this.f139594a)) > 0.2f) {
                float f4 = this.f139595b;
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
        Bitmap a2 = a.mo39695a();
        C29853b.m60160a(createScaledBitmap, a2, this.f139594a);
        createScaledBitmap.recycle();
        AbstractC61495a aVar = this.f139596c;
        if (aVar != null) {
            aVar.processorFinish(a2);
        }
        MethodCollector.m26664o(9287);
        return a;
    }

    public C61494a(int i, float f, AbstractC61495a aVar) {
        this.f139595b = f;
        this.f139594a = i;
        this.f139596c = aVar;
    }
}
