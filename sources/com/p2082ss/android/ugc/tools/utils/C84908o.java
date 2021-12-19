package com.p2082ss.android.ugc.tools.utils;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tools.utils.o */
public final class C84908o {
    static {
        Covode.recordClassIndex(98902);
    }

    /* renamed from: a */
    public static void m145918a(RectF rectF, float f) {
        float width = rectF.width();
        float height = rectF.height();
        float f2 = ((f * width) - width) / 2.0f;
        float f3 = ((f * height) - height) / 2.0f;
        rectF.left -= f2;
        rectF.top -= f3;
        rectF.right += f2;
        rectF.bottom += f3;
    }

    /* renamed from: a */
    public static void m145917a(Point point, float f, float f2, float f3) {
        double d = (double) f3;
        float sin = (float) Math.sin(Math.toRadians(d));
        float cos = (float) Math.cos(Math.toRadians(d));
        point.set((int) ((((((float) point.x) - f) * cos) + f) - ((((float) point.y) - f2) * sin)), (int) (f2 + ((((float) point.y) - f2) * cos) + ((((float) point.x) - f) * sin)));
    }

    /* renamed from: b */
    public static boolean m145920b(RectF rectF, float f, float f2, float f3) {
        if (Math.abs(f3) <= 0.0f) {
            return rectF.contains(f, f2);
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        double d = (double) (-f3);
        float sin = (float) Math.sin(Math.toRadians(d));
        float cos = (float) Math.cos(Math.toRadians(d));
        float f4 = f - centerX;
        float f5 = f2 - centerY;
        return rectF.contains((centerX + (f4 * cos)) - (f5 * sin), centerY + (f5 * cos) + (f4 * sin));
    }

    /* renamed from: a */
    public static PointF m145916a(PointF pointF, float f, float f2, float f3) {
        if (Math.abs(f3) <= 0.0f) {
            return pointF;
        }
        double d = (double) (pointF.x - f);
        double d2 = (double) f3;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        double d3 = d * cos;
        double d4 = (double) (pointF.y - f2);
        double sin = Math.sin(d2);
        Double.isNaN(d4);
        double d5 = d3 - (d4 * sin);
        double d6 = (double) f;
        Double.isNaN(d6);
        double d7 = (double) (pointF.x - f);
        double sin2 = Math.sin(d2);
        Double.isNaN(d7);
        double d8 = d7 * sin2;
        double d9 = (double) (pointF.y - f2);
        double cos2 = Math.cos(d2);
        Double.isNaN(d9);
        double d10 = (double) f2;
        Double.isNaN(d10);
        float f4 = (float) (d5 + d6);
        float f5 = (float) (d8 + (d9 * cos2) + d10);
        pointF.set(f4, f5);
        return new PointF(f4, f5);
    }

    /* renamed from: a */
    public static void m145919a(RectF rectF, float f, float f2, float f3) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        double d = (double) f3;
        float sin = (float) Math.sin(Math.toRadians(d));
        float cos = (float) Math.cos(Math.toRadians(d));
        float f4 = centerX - f;
        float f5 = centerY - f2;
        rectF.offset(((f + (f4 * cos)) - (f5 * sin)) - centerX, ((f2 + (f5 * cos)) + (f4 * sin)) - centerY);
    }
}
