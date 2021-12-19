package com.p2082ss.android.ugc.aweme.p2477ci;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.ci.a */
public final class C36080a {
    static {
        Covode.recordClassIndex(43333);
    }

    /* renamed from: a */
    private static Paint m73532a() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        return paint;
    }

    /* renamed from: a */
    private static void m73534a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static Canvas m73538b(Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        return canvas;
    }

    /* renamed from: a */
    public static void m73533a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public static int[] m73536a(String str) {
        if (!C84902i.m145892a(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C84896h.m145856a(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: b */
    public static int m73537b(String str) {
        if (!C84902i.m145892a(str)) {
            return 0;
        }
        try {
            int attributeInt = C84896h.m145870c(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    private static Bitmap m73530a(Bitmap bitmap, int i, int i2) {
        float f;
        MethodCollector.m26663i(153);
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float f2 = 0.0f;
        if (i > i2) {
            float f3 = (((float) i) * 1.0f) / ((float) i2);
            float f4 = width / f3;
            if (height > f4) {
                f = (height - f4) / 2.0f;
                height = f4;
            } else {
                float f5 = f3 * height;
                f2 = (width - f5) / 2.0f;
                width = f5;
                f = 0.0f;
            }
        } else if (i < i2) {
            float f6 = (((float) i2) * 1.0f) / ((float) i);
            float f7 = height / f6;
            if (width > f7) {
                f2 = (width - f7) / 2.0f;
                width = f7;
                f = 0.0f;
            } else {
                float f8 = f6 * width;
                f = (height - f8) / 2.0f;
                height = f8;
            }
        } else if (width > height) {
            f2 = (width - height) / 2.0f;
            width = height;
            f = 0.0f;
        } else {
            f = (height - width) / 2.0f;
            height = width;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        m73538b(createBitmap).drawBitmap(bitmap, new Rect((int) f2, (int) f, (int) (f2 + width), (int) (f + height)), new Rect(0, 0, i, i2), m73532a());
        m73533a(bitmap);
        MethodCollector.m26664o(153);
        return createBitmap;
    }

    /* renamed from: a */
    public static boolean m73535a(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        Throwable th;
        Exception e;
        MethodCollector.m26663i(586);
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                m73534a((OutputStream) null);
                MethodCollector.m26664o(586);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, 100, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                m73534a(bufferedOutputStream2);
            } catch (Exception e2) {
                e = e2;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    e.printStackTrace();
                    m73534a(bufferedOutputStream);
                    MethodCollector.m26664o(586);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    m73534a(bufferedOutputStream);
                    MethodCollector.m26664o(586);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                m73534a(bufferedOutputStream);
                MethodCollector.m26664o(586);
                throw th;
            }
            MethodCollector.m26664o(586);
            return z;
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            m73534a(bufferedOutputStream);
            MethodCollector.m26664o(586);
            return z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        if (r11 < r5) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        if (r11 < r5) goto L_0x007f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m73531a(java.lang.String r18, int r19, int r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 521
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2477ci.C36080a.m73531a(java.lang.String, int, int, int, int):android.graphics.Bitmap");
    }
}
