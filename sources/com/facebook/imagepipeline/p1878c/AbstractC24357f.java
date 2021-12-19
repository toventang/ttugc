package com.facebook.imagepipeline.p1878c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1836h.C24117a;

/* renamed from: com.facebook.imagepipeline.c.f */
public abstract class AbstractC24357f {
    static {
        Covode.recordClassIndex(28499);
    }

    /* renamed from: a */
    public abstract C24117a<Bitmap> mo40148a(int i, int i2, Bitmap.Config config);

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.c.f$1 */
    public static /* synthetic */ class C243581 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57750a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 28500(0x6f54, float:3.9937E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imagepipeline.p1878c.AbstractC24357f.C243581.f57750a = r2
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imagepipeline.p1878c.AbstractC24357f.C243581.f57750a     // Catch:{ NoSuchFieldError -> 0x0022 }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.imagepipeline.p1878c.AbstractC24357f.C243581.f57750a     // Catch:{ NoSuchFieldError -> 0x002d }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.imagepipeline.p1878c.AbstractC24357f.C243581.f57750a     // Catch:{ NoSuchFieldError -> 0x0038 }
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1878c.AbstractC24357f.C243581.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static Bitmap.Config m46354a(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap.Config config2 = bitmap.getConfig();
        if (config2 == null) {
            return config;
        }
        int i = C243581.f57750a[config2.ordinal()];
        if (i == 1) {
            return Bitmap.Config.RGB_565;
        }
        if (i != 2) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.ALPHA_8;
    }

    /* renamed from: a */
    public final C24117a<Bitmap> mo40150a(int i, int i2) {
        return mo40152b(i, i2, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: c */
    private static void m46360c(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45621a(z, "x must be >= 0");
        if (i2 < 0) {
            z2 = false;
        }
        C24091i.m45621a(z2, "y must be >= 0");
    }

    /* renamed from: a */
    private static void m46356a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
        int i = Build.VERSION.SDK_INT;
        bitmap2.setHasAlpha(bitmap.hasAlpha());
        int i2 = Build.VERSION.SDK_INT;
        bitmap2.setPremultiplied(bitmap.isPremultiplied());
    }

    /* renamed from: b */
    private static void m46359b(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45621a(z, "width must be > 0");
        if (i2 <= 0) {
            z2 = false;
        }
        C24091i.m45621a(z2, "height must be > 0");
    }

    /* renamed from: b */
    public final C24117a<Bitmap> mo40152b(int i, int i2, Bitmap.Config config) {
        return mo40148a(i, i2, config);
    }

    /* renamed from: a */
    private C24117a<Bitmap> m46355a(int i, int i2, Bitmap.Config config, boolean z) {
        return m46357b(i, i2, config, z);
    }

    /* renamed from: b */
    private C24117a<Bitmap> m46357b(int i, int i2, Bitmap.Config config, boolean z) {
        m46359b(i, i2);
        C24117a<Bitmap> a = mo40148a(i, i2, config);
        Bitmap a2 = a.mo39695a();
        int i3 = Build.VERSION.SDK_INT;
        a2.setHasAlpha(z);
        if (config == Bitmap.Config.ARGB_8888 && !z) {
            a2.eraseColor(-16777216);
        }
        return a;
    }

    /* renamed from: c */
    private static void m46361c(Bitmap bitmap, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2 = true;
        if (i + i3 <= bitmap.getWidth()) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45621a(z, "x + width must be <= bitmap.width()");
        if (i2 + i4 > bitmap.getHeight()) {
            z2 = false;
        }
        C24091i.m45621a(z2, "y + height must be <= bitmap.height()");
    }

    /* renamed from: b */
    private C24117a<Bitmap> m46358b(Bitmap bitmap, int i, int i2, int i3, int i4) {
        C24091i.m45618a(bitmap, "Source bitmap cannot be null");
        m46360c(i, i2);
        m46359b(i3, i4);
        m46361c(bitmap, i, i2, i3, i4);
        Rect rect = new Rect(i, i2, i + i3, i2 + i4);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i3, (float) i4);
        C24117a<Bitmap> a = m46355a(i3, i4, m46354a(bitmap), bitmap.hasAlpha());
        m46356a(bitmap, a.mo39695a());
        Canvas canvas = new Canvas(a.mo39695a());
        canvas.drawBitmap(bitmap, rect, rectF, (Paint) null);
        canvas.setBitmap(null);
        return a;
    }

    /* renamed from: a */
    public final C24117a<Bitmap> mo40151a(Bitmap bitmap, int i, int i2, int i3, int i4) {
        return m46358b(bitmap, i, i2, i3, i4);
    }
}
