package com.facebook.imageutils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.Pair;
import androidx.core.p036g.C0693f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imageutils.a */
public final class C24656a {

    /* renamed from: a */
    private static final C0693f.C0696c<ByteBuffer> f58577a = new C0693f.C0696c<>(12);

    static {
        Covode.recordClassIndex(28808);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imageutils.a$1 */
    public static /* synthetic */ class C246571 {

        /* renamed from: a */
        static final /* synthetic */ int[] f58578a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 28809(0x7089, float:4.037E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imageutils.C24656a.C246571.f58578a = r2
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imageutils.C24656a.C246571.f58578a     // Catch:{ NoSuchFieldError -> 0x0022 }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.imageutils.C24656a.C246571.f58578a     // Catch:{ NoSuchFieldError -> 0x002d }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.imageutils.C24656a.C246571.f58578a     // Catch:{ NoSuchFieldError -> 0x0038 }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.facebook.imageutils.C24656a.C246571.f58578a     // Catch:{ NoSuchFieldError -> 0x0043 }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.C24656a.C246571.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m47171a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        int i = Build.VERSION.SDK_INT;
        return bitmap.getByteCount();
    }

    /* renamed from: a */
    public static int m47170a(Bitmap.Config config) {
        int i = C246571.f58578a[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        if (i == 5) {
            return 8;
        }
        throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m47172a(InputStream inputStream) {
        MethodCollector.m26663i(4969);
        C24091i.m45617a(inputStream);
        C0693f.C0696c<ByteBuffer> cVar = f58577a;
        ByteBuffer acquire = cVar.acquire();
        if (acquire == null) {
            acquire = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = acquire.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1) {
                if (options.outHeight != -1) {
                    pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                }
            }
            cVar.release(acquire);
            MethodCollector.m26664o(4969);
            return pair;
        } catch (Throwable th) {
            f58577a.release(acquire);
            MethodCollector.m26664o(4969);
            throw th;
        }
    }

    /* renamed from: b */
    public static C24661d m47173b(InputStream inputStream) {
        MethodCollector.m26663i(4973);
        C24091i.m45617a(inputStream);
        C0693f.C0696c<ByteBuffer> cVar = f58577a;
        ByteBuffer acquire = cVar.acquire();
        if (acquire == null) {
            acquire = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = acquire.array();
            ColorSpace colorSpace = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (Build.VERSION.SDK_INT >= 26) {
                colorSpace = options.outColorSpace;
            }
            C24661d dVar = new C24661d(options.outWidth, options.outHeight, colorSpace);
            cVar.release(acquire);
            MethodCollector.m26664o(4973);
            return dVar;
        } catch (Throwable th) {
            f58577a.release(acquire);
            MethodCollector.m26664o(4973);
            throw th;
        }
    }

    /* renamed from: a */
    public static int m47169a(int i, int i2, Bitmap.Config config) {
        return i * i2 * m47170a(config);
    }
}
