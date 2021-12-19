package com.p2082ss.android.ugc.tools.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.tools.utils.c */
public final class C84891c {
    static {
        Covode.recordClassIndex(98885);
    }

    /* renamed from: a */
    public static void m145846a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public static void m145847a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static int[] m145849a(String str) {
        if (!C84902i.m145892a(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C84896h.m145856a(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    public static Bitmap m145844a(String str, int[] iArr) {
        return m145845a(str, iArr, Bitmap.Config.RGB_565);
    }

    /* renamed from: a */
    public static Bitmap m145843a(Bitmap bitmap, Bitmap bitmap2) {
        MethodCollector.m26663i(9897);
        if (bitmap == null || bitmap.isRecycled()) {
            MethodCollector.m26664o(9897);
            return bitmap2;
        } else if (bitmap2 == null || bitmap2.isRecycled()) {
            MethodCollector.m26664o(9897);
            return bitmap;
        } else {
            Paint paint = new Paint(2);
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            new Canvas(copy).drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), paint);
            MethodCollector.m26664o(9897);
            return copy;
        }
    }

    /* renamed from: a */
    public static int m145842a(BitmapFactory.Options options, int i, int i2) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r3 <= 0) goto L_0x0027;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m145845a(java.lang.String r6, int[] r7, android.graphics.Bitmap.Config r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r4 = 1
            r5.inJustDecodeBounds = r4
            r5.inPreferredConfig = r8
            com.p2082ss.android.ugc.tools.utils.C84896h.m145856a(r6, r5)
            r0 = 0
            r5.inJustDecodeBounds = r0
            int r3 = r5.outWidth
            int r2 = r5.outHeight
            r1 = r7[r0]
            r0 = r7[r4]
            if (r3 < r2) goto L_0x002e
            if (r3 <= r1) goto L_0x002e
            int r3 = r3 / r1
        L_0x0025:
            if (r3 > 0) goto L_0x0036
        L_0x0027:
            r5.inSampleSize = r4
            android.graphics.Bitmap r0 = com.p2082ss.android.ugc.tools.utils.C84896h.m145856a(r6, r5)
            return r0
        L_0x002e:
            if (r3 >= r2) goto L_0x0035
            if (r2 <= r0) goto L_0x0035
            int r3 = r2 / r0
            goto L_0x0025
        L_0x0035:
            r3 = 1
        L_0x0036:
            r4 = r3
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.utils.C84891c.m145845a(java.lang.String, int[], android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static boolean m145848a(Bitmap bitmap, File file, int i, Bitmap.CompressFormat compressFormat) {
        Throwable th;
        Exception e;
        MethodCollector.m26663i(9895);
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                m145847a((OutputStream) null);
                MethodCollector.m26664o(9895);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, i, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                m145847a(bufferedOutputStream2);
            } catch (Exception e2) {
                e = e2;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    e.printStackTrace();
                    m145847a(bufferedOutputStream);
                    MethodCollector.m26664o(9895);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    m145847a(bufferedOutputStream);
                    MethodCollector.m26664o(9895);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                m145847a(bufferedOutputStream);
                MethodCollector.m26664o(9895);
                throw th;
            }
            MethodCollector.m26664o(9895);
            return z;
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            m145847a(bufferedOutputStream);
            MethodCollector.m26664o(9895);
            return z;
        }
    }
}
