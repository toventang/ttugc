package com.bytedance.android.livesdk.gift.p545c.p546a.p547a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.gift.c.a.a.a */
public final class C8795a {
    static {
        Covode.recordClassIndex(9673);
    }

    /* renamed from: com.bytedance.android.livesdk.gift.c.a.a.a$a */
    enum EnumC8796a {
        VERTICAL,
        HORIZONTAL;

        static {
            Covode.recordClassIndex(9674);
        }
    }

    /* renamed from: b */
    public static Bitmap m17103b(Bitmap bitmap) {
        MethodCollector.m26663i(10019);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap);
            MethodCollector.m26664o(10019);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            MethodCollector.m26664o(10019);
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m17102a(Bitmap bitmap) {
        EnumC8796a aVar;
        Rect rect;
        MethodCollector.m26663i(10017);
        try {
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
            Point point = new Point(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            if (bitmap.getWidth() > bitmap.getHeight()) {
                aVar = EnumC8796a.HORIZONTAL;
            } else {
                aVar = EnumC8796a.VERTICAL;
            }
            int i = min * 2;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(new Rect(0, 0, i, i));
            float min2 = (float) (Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, min2, min2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            if (aVar == EnumC8796a.HORIZONTAL) {
                rect = new Rect(point.x - min, 0, point.x + min, i);
            } else {
                rect = new Rect(0, point.y - min, i, point.y + min);
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            MethodCollector.m26664o(10017);
            return createBitmap;
        } catch (Exception unused) {
            MethodCollector.m26664o(10017);
            return bitmap;
        } catch (OutOfMemoryError unused2) {
            MethodCollector.m26664o(10017);
            return null;
        }
    }
}
