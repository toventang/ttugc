package com.p2082ss.android.ugc.aweme.editSticker.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.ab */
public final class C45997ab {
    static {
        Covode.recordClassIndex(54530);
    }

    /* renamed from: a */
    public static final float m88786a() {
        return m88787a(new Paint());
    }

    /* renamed from: a */
    private static float m88787a(Paint paint) {
        MethodCollector.m26663i(11455);
        C89219l.m154721d(paint, "");
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        C89219l.m154716b(createBitmap, "");
        Canvas canvas = new Canvas(createBitmap);
        float f = 1.0f;
        float f2 = 1.0f;
        while (true) {
            if (f >= 99999.0f) {
                f = 99999.0f;
                break;
            } else if (!m88788a(createBitmap, canvas, paint, f)) {
                break;
            } else {
                f2 = f;
                f = 2.0f * f;
            }
        }
        while (f - f2 > 1.0f) {
            float f3 = (f + f2) / 2.0f;
            if (!m88788a(createBitmap, canvas, paint, f3)) {
                f = f3;
            } else {
                f2 = f3;
            }
        }
        double d = (double) f2;
        Double.isNaN(d);
        float f4 = (float) (d / 1.42d);
        MethodCollector.m26664o(11455);
        return f4;
    }

    /* renamed from: a */
    private static final boolean m88788a(Bitmap bitmap, Canvas canvas, Paint paint, float f) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        paint.setTextSize(f);
        float abs = Math.abs(paint.ascent());
        float abs2 = Math.abs(paint.descent());
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("🏻", 0.5f, (((abs + abs2) / 2.0f) + 0.5f) - abs2, paint);
        if (bitmap.getPixel(0, 0) != 0) {
            return true;
        }
        return false;
    }
}
