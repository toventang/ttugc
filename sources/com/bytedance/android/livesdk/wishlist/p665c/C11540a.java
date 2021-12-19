package com.bytedance.android.livesdk.wishlist.p665c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.wishlist.c.a */
public final class C11540a {
    static {
        Covode.recordClassIndex(13199);
    }

    /* renamed from: a */
    public static Bitmap m20372a(Bitmap bitmap, int i) {
        MethodCollector.m26663i(6095);
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-16777216);
            float f = (float) i;
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), f, f, paint);
            int i2 = width - i;
            canvas.drawRect(new Rect(i2, 0, width, i), paint);
            int i3 = height - i;
            canvas.drawRect(new Rect(0, i3, i, height), paint);
            canvas.drawRect(new Rect(i2, i3, width, height), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            Rect rect = new Rect(0, 0, width, height);
            canvas.drawBitmap(bitmap, rect, rect, paint);
            MethodCollector.m26664o(6095);
            return createBitmap;
        } catch (Exception unused) {
            MethodCollector.m26664o(6095);
            return bitmap;
        }
    }
}
