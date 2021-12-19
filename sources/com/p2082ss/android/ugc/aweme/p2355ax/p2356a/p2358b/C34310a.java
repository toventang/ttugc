package com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2358b;

import android.graphics.Bitmap;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.ax.a.b.a */
public final class C34310a {

    /* renamed from: com.ss.android.ugc.aweme.ax.a.b.a$a */
    public static class C34311a {

        /* renamed from: a */
        public int f81153a;

        /* renamed from: b */
        public int f81154b;

        /* renamed from: c */
        public Bitmap.Config f81155c;

        static {
            Covode.recordClassIndex(41255);
        }
    }

    static {
        Covode.recordClassIndex(41254);
    }

    /* renamed from: a */
    public static C34311a m70193a(View view) {
        int i;
        int i2;
        C34311a aVar = new C34311a();
        if (view == null || Looper.myLooper() != Looper.getMainLooper()) {
            aVar.f81153a = 3;
            return aVar;
        }
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        if (!isDrawingCacheEnabled) {
            try {
                view.setDrawingCacheEnabled(true);
            } catch (Throwable th) {
                if (!isDrawingCacheEnabled) {
                    view.setDrawingCacheEnabled(false);
                }
                throw th;
            }
        }
        SystemClock.uptimeMillis();
        Bitmap drawingCache = view.getDrawingCache();
        SystemClock.uptimeMillis();
        if (drawingCache != null) {
            int width = drawingCache.getWidth();
            int height = drawingCache.getHeight();
            aVar.f81155c = drawingCache.getConfig();
            if (width > 0 && height > 0) {
                int pixel = drawingCache.getPixel(0, 0);
                aVar.f81154b = pixel;
                C34317g gVar = new C34317g(pixel);
                int width2 = drawingCache.getWidth();
                int height2 = drawingCache.getHeight();
                if (width2 > 0 && height2 > 0) {
                    if (gVar.f81170a == 0) {
                        i2 = drawingCache.getPixel(0, 0);
                    } else {
                        i2 = gVar.f81170a;
                    }
                    int[] iArr = new int[width2];
                    Arrays.fill(iArr, i2);
                    int[] iArr2 = new int[width2];
                    int i3 = 0;
                    while (true) {
                        drawingCache.getPixels(iArr2, 0, width2, 0, i3, width2, 1);
                        if (Arrays.equals(iArr, iArr2)) {
                            i3++;
                            iArr2 = iArr2;
                            width2 = width2;
                            if (i3 >= height2) {
                                Integer.toHexString(i2);
                                i = 1;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                i = 2;
                aVar.f81153a = i;
                if (!isDrawingCacheEnabled) {
                    view.setDrawingCacheEnabled(false);
                }
                return aVar;
            }
        }
        if (!isDrawingCacheEnabled) {
            view.setDrawingCacheEnabled(false);
        }
        aVar.f81153a = 2;
        return aVar;
    }
}
