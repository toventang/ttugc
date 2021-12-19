package com.lynx.tasm.behavior.p2052ui.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.lynx.tasm.behavior.ui.text.a */
public abstract class AbstractC28676a extends ReplacementSpan {

    /* renamed from: a */
    public int f67593a;

    /* renamed from: b */
    public int f67594b;

    /* renamed from: c */
    public int f67595c;

    /* renamed from: d */
    public float f67596d;

    /* renamed from: e */
    public Drawable.Callback f67597e;

    /* renamed from: f */
    private int f67598f;

    /* renamed from: g */
    private int f67599g;

    /* renamed from: h */
    private int f67600h;

    /* renamed from: i */
    private int f67601i;

    static {
        Covode.recordClassIndex(34751);
    }

    /* renamed from: a */
    public abstract Drawable mo49742a();

    /* renamed from: b */
    public abstract void mo49744b();

    /* renamed from: c */
    public abstract void mo49745c();

    /* renamed from: d */
    public abstract void mo49746d();

    /* renamed from: e */
    public abstract void mo49748e();

    /* renamed from: a */
    public void mo49743a(Drawable.Callback callback) {
        this.f67597e = callback;
    }

    /* renamed from: a */
    private int m57387a(Paint.FontMetricsInt fontMetricsInt) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i6 = this.f67593a + this.f67601i;
        switch (this.f67595c) {
            case 1:
                return -i6;
            case 2:
                i = fontMetricsInt.descent - i6;
                i2 = (int) (((float) i5) * 0.1f);
                return i - i2;
            case 3:
                i3 = fontMetricsInt.ascent;
                i4 = (int) (((float) i5) * 0.1f);
                return i3 + i4;
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return fontMetricsInt.ascent;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            default:
                i3 = fontMetricsInt.ascent;
                i4 = (i5 - i6) / 2;
                return i3 + i4;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return fontMetricsInt.descent - i6;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                i = -i6;
                i2 = (int) (this.f67596d * ((float) i5));
                return i - i2;
        }
    }

    /* renamed from: a */
    public static void m57388a(Spanned spanned, Drawable.Callback callback) {
        AbstractC28676a[] aVarArr = (AbstractC28676a[]) spanned.getSpans(0, spanned.length(), AbstractC28676a.class);
        for (AbstractC28676a aVar : aVarArr) {
            aVar.mo49746d();
            aVar.mo49743a(callback);
        }
    }

    public AbstractC28676a(int i, int i2, int[] iArr) {
        this.f67594b = i;
        this.f67593a = i2;
        this.f67598f = iArr[0];
        this.f67599g = iArr[1];
        this.f67600h = iArr[0] + iArr[2];
        this.f67601i = iArr[1] + iArr[3];
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            if (fontMetricsInt.descent == fontMetricsInt.ascent) {
                fontMetricsInt.ascent = paint.getFontMetricsInt().ascent;
                fontMetricsInt.descent = paint.getFontMetricsInt().descent;
            }
            int a = m57387a(fontMetricsInt);
            if (fontMetricsInt.ascent > a) {
                fontMetricsInt.ascent = a;
            }
            int i3 = fontMetricsInt.descent;
            int i4 = this.f67593a;
            int i5 = this.f67601i;
            if (i3 < a + i4 + i5) {
                fontMetricsInt.descent = a + i4 + i5;
            }
            if (fontMetricsInt.top > fontMetricsInt.ascent) {
                fontMetricsInt.top = fontMetricsInt.ascent;
            }
            if (fontMetricsInt.bottom < fontMetricsInt.descent) {
                fontMetricsInt.bottom = fontMetricsInt.descent;
            }
        }
        return this.f67594b + this.f67600h;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (mo49742a() != null) {
            Drawable a = mo49742a();
            canvas.save();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = this.f67595c;
            if (i6 == 0) {
                i3 = i4 + ((((fontMetricsInt.ascent + fontMetricsInt.descent) - this.f67593a) - this.f67601i) / 2);
            } else if (i6 != 4) {
                if (i6 == 6) {
                    i3 = (((i5 + i3) - this.f67593a) - this.f67601i) / 2;
                } else if (i6 != 7) {
                    i3 = i4 + m57387a(fontMetricsInt);
                } else {
                    i3 = (i5 - this.f67593a) - this.f67601i;
                }
            }
            canvas.translate(f + ((float) this.f67598f), (float) (i3 + this.f67599g));
            a.draw(canvas);
            canvas.restore();
        }
    }
}
