package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.i */
public final class C74286i extends Drawable {

    /* renamed from: a */
    public static final int f167034a = 1;

    /* renamed from: b */
    public static final int f167035b = 2;

    /* renamed from: c */
    public static final C74288b f167036c = new C74288b((byte) 0);

    /* renamed from: d */
    private final Paint f167037d;

    /* renamed from: e */
    private final Paint f167038e;

    /* renamed from: f */
    private RectF f167039f;

    /* renamed from: g */
    private final int f167040g;

    /* renamed from: h */
    private final int[] f167041h;

    /* renamed from: i */
    private final int f167042i;

    /* renamed from: j */
    private final int f167043j;

    /* renamed from: k */
    private final int f167044k;

    /* renamed from: l */
    private final int f167045l;

    /* renamed from: m */
    private final int f167046m;

    public final int getOpacity() {
        return -3;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.i$b */
    public static final class C74288b {
        static {
            Covode.recordClassIndex(87060);
        }

        private C74288b() {
        }

        public /* synthetic */ C74288b(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m130698a(View view, int i, int i2, int i3, int i4, int i5, int i6) {
            C89219l.m154721d(view, "");
            C74287a a = new C74287a().mo116888a(i);
            a.f167047a = i2;
            a.f167048b = i3;
            a.f167049c = i4;
            a.f167050d = i5;
            a.f167051e = i6;
            C74286i a2 = a.mo116889a();
            view.setLayerType(1, null);
            C0792v.m2746a(view, a2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.i$a */
    public static final class C74287a {

        /* renamed from: a */
        int f167047a = 12;

        /* renamed from: b */
        int f167048b = Color.parseColor("#4d000000");

        /* renamed from: c */
        int f167049c = 18;

        /* renamed from: d */
        int f167050d = 0;

        /* renamed from: e */
        int f167051e = 0;

        /* renamed from: f */
        private int f167052f = C74286i.f167034a;

        /* renamed from: g */
        private int[] f167053g;

        static {
            Covode.recordClassIndex(87059);
        }

        /* renamed from: a */
        public final C74286i mo116889a() {
            return new C74286i(this.f167052f, this.f167053g, this.f167047a, this.f167048b, this.f167049c, this.f167050d, this.f167051e, (byte) 0);
        }

        public C74287a() {
            int[] iArr = new int[1];
            this.f167053g = iArr;
            iArr[0] = 0;
        }

        /* renamed from: a */
        public final C74287a mo116888a(int i) {
            this.f167053g[0] = i;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(87058);
    }

    public final void setAlpha(int i) {
        this.f167037d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f167037d.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        int[] iArr = this.f167041h;
        if (iArr != null) {
            if (iArr.length == 1) {
                this.f167038e.setColor(iArr[0]);
            } else {
                Paint paint = this.f167038e;
                RectF rectF = this.f167039f;
                if (rectF == null) {
                    C89219l.m154715b();
                }
                float f = rectF.left;
                RectF rectF2 = this.f167039f;
                if (rectF2 == null) {
                    C89219l.m154715b();
                }
                float height = rectF2.height() / 2.0f;
                RectF rectF3 = this.f167039f;
                if (rectF3 == null) {
                    C89219l.m154715b();
                }
                float f2 = rectF3.right;
                RectF rectF4 = this.f167039f;
                if (rectF4 == null) {
                    C89219l.m154715b();
                }
                paint.setShader(new LinearGradient(f, height, f2, rectF4.height() / 2.0f, this.f167041h, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        if (this.f167040g == f167034a) {
            RectF rectF5 = this.f167039f;
            if (rectF5 == null) {
                C89219l.m154715b();
            }
            int i = this.f167042i;
            canvas.drawRoundRect(rectF5, (float) i, (float) i, this.f167037d);
            RectF rectF6 = this.f167039f;
            if (rectF6 == null) {
                C89219l.m154715b();
            }
            int i2 = this.f167042i;
            canvas.drawRoundRect(rectF6, (float) i2, (float) i2, this.f167038e);
            return;
        }
        RectF rectF7 = this.f167039f;
        if (rectF7 == null) {
            C89219l.m154715b();
        }
        float centerX = rectF7.centerX();
        RectF rectF8 = this.f167039f;
        if (rectF8 == null) {
            C89219l.m154715b();
        }
        float centerY = rectF8.centerY();
        RectF rectF9 = this.f167039f;
        if (rectF9 == null) {
            C89219l.m154715b();
        }
        float width = rectF9.width();
        RectF rectF10 = this.f167039f;
        if (rectF10 == null) {
            C89219l.m154715b();
        }
        canvas.drawCircle(centerX, centerY, Math.min(width, rectF10.height()) / 2.0f, this.f167037d);
        RectF rectF11 = this.f167039f;
        if (rectF11 == null) {
            C89219l.m154715b();
        }
        float centerX2 = rectF11.centerX();
        RectF rectF12 = this.f167039f;
        if (rectF12 == null) {
            C89219l.m154715b();
        }
        float centerY2 = rectF12.centerY();
        RectF rectF13 = this.f167039f;
        if (rectF13 == null) {
            C89219l.m154715b();
        }
        float width2 = rectF13.width();
        RectF rectF14 = this.f167039f;
        if (rectF14 == null) {
            C89219l.m154715b();
        }
        canvas.drawCircle(centerX2, centerY2, Math.min(width2, rectF14.height()) / 2.0f, this.f167038e);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.f167044k;
        int i6 = this.f167045l;
        int i7 = this.f167046m;
        this.f167039f = new RectF((float) ((i + i5) - i6), (float) ((i2 + i5) - i7), (float) ((i3 - i5) - i6), (float) ((i4 - i5) - i7));
    }

    private C74286i(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        this.f167040g = i;
        this.f167041h = iArr;
        this.f167042i = i2;
        this.f167043j = i3;
        this.f167044k = i4;
        this.f167045l = i5;
        this.f167046m = i6;
        Paint paint = new Paint();
        this.f167037d = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setShadowLayer((float) i4, (float) i5, (float) i6, i3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        Paint paint2 = new Paint();
        this.f167038e = paint2;
        paint2.setAntiAlias(true);
    }

    public /* synthetic */ C74286i(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, byte b) {
        this(i, iArr, i2, i3, i4, i5, i6);
    }
}
