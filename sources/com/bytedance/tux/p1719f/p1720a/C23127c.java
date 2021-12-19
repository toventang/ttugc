package com.bytedance.tux.p1719f.p1720a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.f.a.c */
public final class C23127c extends ReplacementSpan {

    /* renamed from: a */
    public static final C23128a f54736a = new C23128a((byte) 0);

    /* renamed from: b */
    private int f54737b;

    /* renamed from: c */
    private int f54738c;

    /* renamed from: d */
    private Rect f54739d;

    /* renamed from: e */
    private int f54740e;

    /* renamed from: f */
    private final Paint.FontMetricsInt f54741f;

    /* renamed from: g */
    private Drawable f54742g;

    /* renamed from: h */
    private int f54743h;

    /* renamed from: i */
    private int f54744i;

    static {
        Covode.recordClassIndex(27056);
    }

    /* renamed from: com.bytedance.tux.f.a.c$a */
    public static final class C23128a {
        static {
            Covode.recordClassIndex(27057);
        }

        private C23128a() {
        }

        public /* synthetic */ C23128a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final void m43597a() {
        Rect rect;
        int i;
        Drawable drawable = this.f54742g;
        if (drawable != null) {
            rect = drawable.getBounds();
        } else {
            rect = null;
        }
        this.f54739d = rect;
        int i2 = 0;
        if (rect != null) {
            i = rect.width();
        } else {
            i = 0;
        }
        this.f54737b = i;
        Rect rect2 = this.f54739d;
        if (rect2 != null) {
            i2 = rect2.height();
        }
        this.f54738c = i2;
    }

    public /* synthetic */ C23127c(Drawable drawable) {
        this(drawable, 2);
    }

    /* renamed from: a */
    public final void mo37613a(int i) {
        Drawable drawable = this.f54742g;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    /* renamed from: a */
    private final int m43596a(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.f54740e;
        if (i == 0) {
            return fontMetricsInt.descent - this.f54738c;
        }
        if (i == 1) {
            return -this.f54738c;
        }
        if (i != 2) {
            return -this.f54738c;
        }
        return fontMetricsInt.ascent + (((fontMetricsInt.descent - fontMetricsInt.ascent) - this.f54738c) / 2);
    }

    /* renamed from: a */
    public final void mo37614a(boolean z, int i) {
        if (z) {
            this.f54743h = i;
            this.f54744i = 0;
            return;
        }
        this.f54743h = 0;
        this.f54744i = i;
    }

    public C23127c(Drawable drawable, int i) {
        this.f54741f = new Paint.FontMetricsInt();
        this.f54742g = drawable;
        this.f54740e = 2;
        m43597a();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        C89219l.m154719c(paint, "");
        int i4 = this.f54743h + this.f54744i;
        m43597a();
        if (fontMetricsInt == null) {
            i3 = this.f54737b;
        } else {
            int a = m43596a(fontMetricsInt);
            int i5 = this.f54738c + a;
            if (a < fontMetricsInt.ascent) {
                fontMetricsInt.ascent = a;
            }
            if (a < fontMetricsInt.top) {
                fontMetricsInt.top = a;
            }
            if (i5 > fontMetricsInt.descent) {
                fontMetricsInt.descent = i5;
            }
            if (i5 > fontMetricsInt.bottom) {
                fontMetricsInt.bottom = i5;
            }
            i3 = this.f54737b;
        }
        return i3 + i4;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int a;
        C89219l.m154719c(canvas, "");
        C89219l.m154719c(paint, "");
        paint.getFontMetricsInt(this.f54741f);
        if (this.f54740e == 2) {
            a = ((i5 + i3) - this.f54738c) / 2;
        } else {
            a = i4 + m43596a(this.f54741f);
        }
        float f2 = f + ((float) this.f54743h);
        float f3 = (float) a;
        canvas.translate(f2, f3);
        Drawable drawable = this.f54742g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.translate(-f2, -f3);
    }
}
