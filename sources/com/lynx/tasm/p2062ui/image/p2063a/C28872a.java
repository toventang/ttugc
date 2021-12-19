package com.lynx.tasm.p2062ui.image.p2063a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1890o.AbstractC24635a;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24031j;

/* renamed from: com.lynx.tasm.ui.image.a.a */
public final class C28872a extends AbstractC24635a {

    /* renamed from: a */
    private int f68194a;

    /* renamed from: b */
    private int f68195b;

    /* renamed from: c */
    private int f68196c;

    /* renamed from: d */
    private int f68197d;

    /* renamed from: e */
    private int f68198e;

    /* renamed from: f */
    private int f68199f;

    /* renamed from: g */
    private C24031j f68200g;

    /* renamed from: h */
    private boolean f68201h;

    /* renamed from: i */
    private Bitmap.Config f68202i;

    static {
        Covode.recordClassIndex(34995);
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final AbstractC24026e getPostprocessorCacheKey() {
        return this.f68200g;
    }

    @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
    public final C24117a<Bitmap> process(Bitmap bitmap, AbstractC24357f fVar) {
        C24117a<Bitmap> a;
        try {
            Bitmap.Config config = this.f68202i;
            if (config == null) {
                config = bitmap.getConfig();
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (config == null) {
                config = FALLBACK_BITMAP_CONFIGURATION;
            }
            C24117a<Bitmap> a2 = fVar.mo40148a(width, height, config);
            process(a2.mo39695a(), bitmap);
            return C24117a.m45711b(a2);
        } catch (RuntimeException unused) {
            Bitmap.Config config2 = bitmap.getConfig();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            if (config2 == null) {
                config2 = FALLBACK_BITMAP_CONFIGURATION;
            }
            a = fVar.mo40148a(width2, height2, config2);
            new Canvas(a.mo39695a()).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            C24117a<Bitmap> b = C24117a.m45711b(a);
            C24117a.m45712c(a);
            return b;
        } catch (Throwable th) {
            C24117a.m45712c(a);
            throw th;
        }
    }

    public C28872a(String str, int i, int i2, int i3, int i4, int i5, int i6, Bitmap.Config config) {
        this.f68201h = true;
        this.f68201h = true;
        this.f68194a = i;
        this.f68195b = i2;
        this.f68196c = i3;
        this.f68199f = i4;
        this.f68197d = i5;
        this.f68198e = i6;
        this.f68202i = config;
        this.f68200g = new C24031j(str + this.f68201h + this.f68194a + this.f68195b + this.f68198e + this.f68199f + this.f68196c + this.f68197d + this.f68202i);
    }
}
