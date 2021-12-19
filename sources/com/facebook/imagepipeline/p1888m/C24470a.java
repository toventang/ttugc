package com.facebook.imagepipeline.p1888m;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.imagepipeline.p1884i.AbstractC24451a;
import com.facebook.imagepipeline.p1890o.AbstractC24635a;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24031j;

/* renamed from: com.facebook.imagepipeline.m.a */
public final class C24470a extends AbstractC24635a {

    /* renamed from: a */
    private static final boolean f58118a = true;

    /* renamed from: b */
    private final int f58119b;

    /* renamed from: c */
    private final Context f58120c;

    /* renamed from: d */
    private final int f58121d;

    /* renamed from: e */
    private AbstractC24026e f58122e;

    static {
        Covode.recordClassIndex(28613);
        int i = Build.VERSION.SDK_INT;
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final AbstractC24026e getPostprocessorCacheKey() {
        String a;
        if (this.f58122e == null) {
            if (f58118a) {
                a = C1764a.m5929a(null, "IntrinsicBlur;%d", new Object[]{Integer.valueOf(this.f58121d)});
            } else {
                a = C1764a.m5929a(null, "IterativeBoxBlur;%d;%d", new Object[]{Integer.valueOf(this.f58119b), Integer.valueOf(this.f58121d)});
            }
            this.f58122e = new C24031j(a);
        }
        return this.f58122e;
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a
    public final void process(Bitmap bitmap) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        OutOfMemoryError e;
        int i = this.f58119b;
        int i2 = this.f58121d;
        C24091i.m45617a(bitmap);
        C24091i.m45620a(bitmap.isMutable());
        int i3 = 1;
        if (((float) bitmap.getHeight()) <= 2048.0f) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        if (((float) bitmap.getWidth()) <= 2048.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        C24091i.m45620a(z2);
        if (i2 <= 0 || i2 > 25) {
            z3 = false;
        } else {
            z3 = true;
        }
        C24091i.m45620a(z3);
        if (i > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C24091i.m45620a(z4);
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i4 = i2 + 1;
            int i5 = i4 + i2;
            int[] iArr2 = new int[(i5 * 256)];
            int i6 = 1;
            do {
                for (int i7 = 0; i7 < i5; i7++) {
                    iArr2[i4] = i6;
                    i4++;
                }
                i6++;
            } while (i6 <= 255);
            int[] iArr3 = new int[Math.max(width, height)];
            int i8 = 0;
            while (i8 < i) {
                int i9 = 0;
                while (i9 < height) {
                    int i10 = width * i9;
                    i9++;
                    int i11 = (width * i9) - i3;
                    int i12 = i5 >> 1;
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    for (int i17 = -i12; i17 < width + i12; i17++) {
                        int i18 = iArr[AbstractC24451a.m46661a(i10 + i17, i10, i11)];
                        i13 += (i18 >> 16) & 255;
                        i14 += (i18 >> 8) & 255;
                        i15 += i18 & 255;
                        i16 += i18 >>> 24;
                        if (i17 >= i12) {
                            iArr3[i17 - i12] = (iArr2[i16] << 24) | (iArr2[i13] << 16) | (iArr2[i14] << 8) | iArr2[i15];
                            int i19 = iArr[AbstractC24451a.m46661a((i17 - (i5 - 1)) + i10, i10, i11)];
                            i13 -= (i19 >> 16) & 255;
                            i14 -= (i19 >> 8) & 255;
                            i15 -= i19 & 255;
                            i16 -= i19 >>> 24;
                        }
                    }
                    System.arraycopy(iArr3, 0, iArr, i10, width);
                    i3 = 1;
                }
                for (int i20 = 0; i20 < width; i20++) {
                    int i21 = ((height - 1) * width) + i20;
                    int i22 = (i5 >> 1) * width;
                    int i23 = (i5 - 1) * width;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    for (int i29 = i20 - i22; i29 <= i21 + i22; i29 += width) {
                        try {
                            int i30 = iArr[AbstractC24451a.m46661a(i29, i20, i21)];
                            i24 += (i30 >> 16) & 255;
                            i25 += (i30 >> 8) & 255;
                            i26 += i30 & 255;
                            i27 += i30 >>> 24;
                            if (i29 - i22 >= i20) {
                                try {
                                    iArr3[i28] = (iArr2[i27] << 24) | (iArr2[i24] << 16) | (iArr2[i25] << 8) | iArr2[i26];
                                    i28++;
                                    int i31 = iArr[AbstractC24451a.m46661a(i29 - i23, i20, i21)];
                                    i24 -= (i31 >> 16) & 255;
                                    i25 -= (i31 >> 8) & 255;
                                    i26 -= i31 & 255;
                                    i27 -= i31 >>> 24;
                                } catch (OutOfMemoryError e2) {
                                    e = e2;
                                    C24099a.m45657c("IterativeBoxBlurFilter", C1764a.m5929a(null, "OOM: %d iterations on %dx%d with %d radius", new Object[]{Integer.valueOf(i), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i2)}));
                                    throw e;
                                }
                            }
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            C24099a.m45657c("IterativeBoxBlurFilter", C1764a.m5929a(null, "OOM: %d iterations on %dx%d with %d radius", new Object[]{Integer.valueOf(i), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i2)}));
                            throw e;
                        }
                    }
                    int i32 = i20;
                    for (int i33 = 0; i33 < height; i33++) {
                        iArr[i32] = iArr3[i33];
                        i32 += width;
                    }
                }
                i8++;
                i3 = 1;
            }
            bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        } catch (OutOfMemoryError e4) {
            e = e4;
            C24099a.m45657c("IterativeBoxBlurFilter", C1764a.m5929a(null, "OOM: %d iterations on %dx%d with %d radius", new Object[]{Integer.valueOf(i), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i2)}));
            throw e;
        }
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a
    public final void process(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        if (f58118a) {
            Context context = this.f58120c;
            int i = this.f58121d;
            C24091i.m45617a(bitmap);
            C24091i.m45617a(bitmap2);
            C24091i.m45617a(context);
            if (i <= 0 || i > 25) {
                z = false;
            } else {
                z = true;
            }
            C24091i.m45620a(z);
            RenderScript renderScript = null;
            try {
                renderScript = RenderScript.create(context);
                ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap2);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(renderScript, bitmap);
                create.setRadius((float) i);
                create.setInput(createFromBitmap);
                create.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(bitmap);
            } finally {
                if (renderScript != null) {
                    renderScript.destroy();
                }
            }
        } else {
            super.process(bitmap, bitmap2);
        }
    }

    public C24470a(int i, Context context, int i2) {
        boolean z;
        boolean z2 = true;
        if (i <= 0 || i > 25) {
            z = false;
        } else {
            z = true;
        }
        C24091i.m45620a(z);
        C24091i.m45620a(i2 <= 0 ? false : z2);
        C24091i.m45617a(context);
        this.f58119b = i2;
        this.f58121d = i;
        this.f58120c = context;
    }
}
