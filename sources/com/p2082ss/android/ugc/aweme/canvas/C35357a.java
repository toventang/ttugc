package com.p2082ss.android.ugc.aweme.canvas;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.a */
public final class C35357a {
    static {
        Covode.recordClassIndex(42528);
    }

    /* renamed from: a */
    private static final void m72369a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    private static int m72365a(String str) {
        if (!C84902i.m145892a(str)) {
            return 0;
        }
        try {
            ExifInterface c = C84896h.m145870c(str);
            if (c == null) {
                return 0;
            }
            Integer valueOf = Integer.valueOf(c.getAttributeInt("Orientation", 1));
            if (valueOf == null) {
                return 0;
            }
            if (valueOf.intValue() == 6) {
                return 90;
            }
            if (valueOf.intValue() == 3) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (valueOf.intValue() == 8) {
                return 270;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static int m72364a(int i, int i2) {
        int i3 = 1;
        if (i2 > 0 && i > 0) {
            while (i / (i3 * i3) > i2) {
                i3 <<= 1;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static final Bitmap m72366a(Bitmap bitmap, int i) {
        MethodCollector.m26663i(7976);
        if (i == 0) {
            MethodCollector.m26664o(7976);
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        m72369a(bitmap);
        MethodCollector.m26664o(7976);
        return createBitmap;
    }

    /* renamed from: a */
    private static Bitmap m72367a(String str, int i, int i2, Bitmap.Config config) {
        MethodCollector.m26663i(7839);
        C89219l.m154721d(config, "");
        Bitmap bitmap = null;
        if (!C84902i.m145892a(str)) {
            MethodCollector.m26664o(7839);
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C84896h.m145856a(str, options);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = config;
        options.inSampleSize = 1;
        try {
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            Bitmap a = C84896h.m145856a(str, options);
            if (a == null) {
                MethodCollector.m26664o(7839);
                return null;
            }
            int a2 = m72365a(str);
            if (a2 % LiveFeedRefreshTimeSetting.DEFAULT == 90) {
                i2 = i;
                i = i2;
            }
            if (options.outWidth > i || options.outHeight > i2) {
                float f = (float) i;
                float f2 = (float) i2;
                if (((float) options.outWidth) / f > ((float) options.outHeight) / f2) {
                    i2 = (int) ((f * ((float) options.outHeight)) / ((float) options.outWidth));
                } else {
                    i = (int) ((f2 * ((float) options.outWidth)) / ((float) options.outHeight));
                }
                a = Bitmap.createScaledBitmap(a, i, i2, true);
                C89219l.m154716b(a, "");
            }
            bitmap = m72366a(a, a2);
            MethodCollector.m26664o(7839);
            return bitmap;
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap m72368a(java.lang.String r4, int r5, int r6, boolean r7, android.graphics.Bitmap.Config r8) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.canvas.C35357a.m72368a(java.lang.String, int, int, boolean, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }
}
