package com.p2082ss.android.p2133d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24031j;

/* renamed from: com.ss.android.d.c */
public final class C29854c implements AbstractC24641d {

    /* renamed from: a */
    private Context f71214a;

    /* renamed from: b */
    private int f71215b;

    /* renamed from: c */
    private float f71216c;

    /* renamed from: com.ss.android.d.c$a */
    public interface AbstractC29855a {
        static {
            Covode.recordClassIndex(36263);
        }
    }

    static {
        Covode.recordClassIndex(36262);
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
        float f2;
        int i;
        MethodCollector.m26663i(13639);
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
        if (this.f71216c != 0.0f) {
            float f3 = (float) round;
            float f4 = (float) round2;
            if (Math.abs((f3 / f4) - ((float) this.f71215b)) > 0.2f) {
                float f5 = this.f71216c;
                int i2 = (int) (f3 / f5);
                if (i2 > round2) {
                    i = (int) (f4 * f5);
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
        Context context = this.f71214a;
        int i3 = this.f71215b;
        int i4 = Build.VERSION.SDK_INT;
        RenderScript create = RenderScript.create(context);
        Bitmap createBitmap2 = Bitmap.createBitmap(createScaledBitmap);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createBitmap2, Allocation.MipmapControl.MIPMAP_NONE, 1);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        if (i3 > 0) {
            while (true) {
                if (i3 - 10 > 0) {
                    f2 = 10.0f;
                } else {
                    f2 = (float) i3;
                }
                create2.setRadius(f2);
                create2.setInput(createFromBitmap);
                create2.forEach(createTyped);
                i3 -= 10;
                if (i3 <= 0) {
                    break;
                }
                createFromBitmap.copyFrom(createTyped);
            }
            createTyped.copyTo(a2);
        }
        createBitmap2.recycle();
        createScaledBitmap.recycle();
        MethodCollector.m26664o(13639);
        return a;
    }
}
