package com.p2082ss.android.ugc.aweme.feed.p2970ui.p2972b;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.b.a */
public final class C50096a {

    /* renamed from: a */
    public static final C50096a f115635a = new C50096a();

    private C50096a() {
    }

    static {
        Covode.recordClassIndex(59222);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.b.a$a */
    public static final class C50097a extends ShapeDrawable.ShaderFactory {

        /* renamed from: a */
        final /* synthetic */ float f115636a = 0.0f;

        /* renamed from: b */
        final /* synthetic */ float f115637b = 0.0f;

        /* renamed from: c */
        final /* synthetic */ float f115638c = 0.0f;

        /* renamed from: d */
        final /* synthetic */ float f115639d = 1.0f;

        /* renamed from: e */
        final /* synthetic */ int[] f115640e;

        static {
            Covode.recordClassIndex(59223);
        }

        C50097a(int[] iArr) {
            this.f115640e = iArr;
        }

        public final Shader resize(int i, int i2) {
            float f = (float) i;
            float f2 = (float) i2;
            return new LinearGradient(f * this.f115636a, f2 * this.f115637b, f * this.f115638c, f2 * this.f115639d, this.f115640e, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    /* renamed from: a */
    public static Drawable m94050a(int i) {
        int max = Math.max(8, 4);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        int[] iArr = new int[max];
        int alpha = Color.alpha(i);
        for (int i2 = 0; i2 < max; i2++) {
            iArr[i2] = (((int) (((float) alpha) * Math.max(0.0f, Math.min(1.0f, (float) Math.pow((double) ((((float) i2) * 1.0f) / ((float) (max - 1))), 3.0d))))) << 24) | (16777215 & i);
        }
        paintDrawable.setShaderFactory(new C50097a(iArr));
        return paintDrawable;
    }
}
