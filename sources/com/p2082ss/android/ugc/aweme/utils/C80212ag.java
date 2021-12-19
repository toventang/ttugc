package com.p2082ss.android.ugc.aweme.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.utils.ag */
public final class C80212ag {
    static {
        Covode.recordClassIndex(93480);
    }

    /* renamed from: a */
    private static void m139039a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static Bitmap m139038a(Drawable drawable) {
        Bitmap.Config config;
        MethodCollector.m26663i(13183);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        MethodCollector.m26664o(13183);
        return createBitmap;
    }

    /* renamed from: a */
    public static boolean m139040a(Bitmap bitmap, File file, int i, Bitmap.CompressFormat compressFormat) {
        Throwable th;
        Exception e;
        MethodCollector.m26663i(13116);
        BufferedOutputStream bufferedOutputStream = null;
        boolean z = false;
        try {
            if (bitmap.isRecycled()) {
                m139039a((OutputStream) null);
                MethodCollector.m26664o(13116);
                return false;
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bitmap.compress(compressFormat, i, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                z = true;
                m139039a(bufferedOutputStream2);
            } catch (Exception e2) {
                e = e2;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    e.printStackTrace();
                    m139039a(bufferedOutputStream);
                    MethodCollector.m26664o(13116);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    m139039a(bufferedOutputStream);
                    MethodCollector.m26664o(13116);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = bufferedOutputStream2;
                m139039a(bufferedOutputStream);
                MethodCollector.m26664o(13116);
                throw th;
            }
            MethodCollector.m26664o(13116);
            return z;
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            m139039a(bufferedOutputStream);
            MethodCollector.m26664o(13116);
            return z;
        }
    }
}
