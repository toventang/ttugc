package com.p2082ss.android.ugc.tools.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.tools.utils.b */
public final class C84890b {
    static {
        Covode.recordClassIndex(98884);
    }

    /* renamed from: a */
    public static Bitmap m145841a(Bitmap bitmap, float f) {
        MethodCollector.m26663i(1977);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        MethodCollector.m26664o(1977);
        return createBitmap;
    }

    /* renamed from: a */
    public static int m145840a(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        if (!(i == 0 || i2 == 0)) {
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            if (i4 > i || i5 > i2) {
                int i6 = i4 >> 1;
                int i7 = i5 >> 1;
                while (i6 / i3 > i && i7 / i3 > i2) {
                    i3 <<= 1;
                }
            }
        }
        return i3;
    }
}
