package com.lynx.tasm.p2062ui.image.p2063a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.imagepipeline.p1890o.AbstractC24635a;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24031j;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.ui.image.a.b */
public class C28873b extends AbstractC24635a {

    /* renamed from: a */
    private int f68203a;

    /* renamed from: b */
    private int f68204b;

    /* renamed from: c */
    private int f68205c;

    /* renamed from: d */
    private int f68206d;

    /* renamed from: e */
    private int f68207e;

    /* renamed from: f */
    private int f68208f;

    /* renamed from: g */
    private float[] f68209g;

    /* renamed from: h */
    private C24229q.AbstractC24231b f68210h;

    /* renamed from: i */
    private C24031j f68211i;

    /* renamed from: j */
    private String[] f68212j;

    /* renamed from: k */
    private float f68213k;

    /* renamed from: l */
    private Bitmap.Config f68214l;

    static {
        Covode.recordClassIndex(34996);
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
    public AbstractC24026e getPostprocessorCacheKey() {
        return this.f68211i;
    }

    /* renamed from: a */
    private static float m57834a(String str) {
        float f = 1.0f;
        if (str == null || str.equalsIgnoreCase("")) {
            return 1.0f;
        }
        try {
            f = Float.parseFloat(str);
            return f;
        } catch (Throwable th) {
            LLog.m56861c("BaseRoundedCornerPostprocessor", "initCapInsetsScale error " + th.getMessage());
            return f;
        }
    }

    /* renamed from: b */
    private static String[] m57838b(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            return null;
        }
        String[] split = str.split(" ");
        if (split.length > 4) {
            return null;
        }
        boolean z = true;
        for (int i = 0; i < Math.min(split.length, 4); i++) {
            if (split[i].endsWith("px") || split[i].endsWith("%")) {
                if (!split[i].endsWith("px")) {
                    if (split[i].endsWith("%")) {
                        if (split[i].length() > 1) {
                            z = split[i].substring(0, split[i].length() - 1).matches("[+]?[0-9]*\\.?[0-9]+");
                        }
                    }
                } else if (split[i].length() > 2) {
                    z = split[i].substring(0, split[i].length() - 2).matches("[+]?[0-9]*\\.?[0-9]+");
                }
            }
            z = false;
        }
        if (z) {
            return split;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0117 A[Catch:{ all -> 0x0508 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0123 A[Catch:{ all -> 0x0508 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0130 A[Catch:{ all -> 0x0508 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01db A[Catch:{ all -> 0x0508 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0529 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.common.p1836h.C24117a<android.graphics.Bitmap> process(android.graphics.Bitmap r35, com.facebook.imagepipeline.p1878c.AbstractC24357f r36) {
        /*
        // Method dump skipped, instructions count: 1333
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.p2062ui.image.p2063a.C28873b.process(android.graphics.Bitmap, com.facebook.imagepipeline.c.f):com.facebook.common.h.a");
    }

    /* renamed from: a */
    private Canvas m57835a(Bitmap bitmap, int i, int i2) {
        Canvas canvas = new Canvas(bitmap);
        canvas.clipRect(this.f68205c, this.f68208f, i - this.f68206d, i2 - this.f68207e);
        canvas.drawARGB(0, 0, 0, 0);
        return canvas;
    }

    /* renamed from: a */
    private static float[] m57837a(String[] strArr, int i, int i2) {
        if (strArr == null || strArr.length > 4) {
            return null;
        }
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3].endsWith("px")) {
                fArr[i3] = Float.parseFloat(strArr[i3].substring(0, strArr[i3].length() - 2));
            } else if (strArr[i3].endsWith("%")) {
                if (i3 == 0 || i3 == 2) {
                    fArr[i3] = Float.parseFloat(strArr[i3].substring(0, strArr[i3].length() - 2)) * ((float) i2);
                } else {
                    fArr[i3] = Float.parseFloat(strArr[i3].substring(0, strArr[i3].length() - 2)) * ((float) i);
                }
            }
        }
        return fArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d A[Catch:{ all -> 0x036a }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8 A[Catch:{ all -> 0x036a }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m57836a(int r32, int r33, int r34, int r35, com.facebook.drawee.p1854e.C24229q.AbstractC24231b r36, java.lang.String r37, java.lang.String r38, android.graphics.Canvas r39, android.graphics.Bitmap r40) {
        /*
        // Method dump skipped, instructions count: 902
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.p2062ui.image.p2063a.C28873b.m57836a(int, int, int, int, com.facebook.drawee.e.q$b, java.lang.String, java.lang.String, android.graphics.Canvas, android.graphics.Bitmap):boolean");
    }

    public C28873b(String str, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, C24229q.AbstractC24231b bVar, String str2, String str3, Bitmap.Config config) {
        this.f68210h = bVar;
        this.f68203a = i;
        this.f68204b = i2;
        this.f68205c = i3;
        this.f68208f = i4;
        this.f68206d = i5;
        this.f68207e = i6;
        this.f68209g = fArr;
        this.f68212j = m57838b(str2);
        this.f68213k = m57834a(str3);
        this.f68214l = config;
        StringBuilder sb = new StringBuilder(str);
        sb.append(bVar);
        if (fArr != null) {
            for (float f : fArr) {
                sb.append(f);
            }
        }
        sb.append(this.f68203a);
        sb.append(this.f68204b);
        sb.append(this.f68207e);
        sb.append(this.f68208f);
        sb.append(this.f68205c);
        sb.append(this.f68206d);
        sb.append(this.f68210h);
        String[] strArr = this.f68212j;
        if (strArr != null) {
            sb.append(strArr);
            sb.append(this.f68213k);
        }
        sb.append(this.f68214l);
        this.f68211i = new C24031j(sb.toString());
        int i7 = this.f68205c;
        int i8 = this.f68206d;
        int i9 = i7 + i8;
        int i10 = this.f68203a;
        if (i9 > i10 && i10 > 0) {
            float f2 = (float) (i10 / (i7 + i8));
            this.f68205c = (int) (((float) i7) * f2);
            this.f68206d = (int) (((float) i8) * f2);
        }
        int i11 = this.f68208f;
        int i12 = this.f68207e;
        int i13 = i11 + i12;
        int i14 = this.f68204b;
        if (i13 > i14 && i14 > 0) {
            float f3 = (float) (i14 / (i11 + i12));
            this.f68208f = (int) (((float) i11) * f3);
            this.f68207e = (int) (((float) i12) * f3);
        }
    }
}
