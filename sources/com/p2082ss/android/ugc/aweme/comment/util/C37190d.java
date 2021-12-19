package com.p2082ss.android.ugc.aweme.comment.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36223d;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;

/* renamed from: com.ss.android.ugc.aweme.comment.util.d */
public final class C37190d {
    static {
        Covode.recordClassIndex(44545);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.d$a */
    public static class C37191a extends ReplacementSpan {

        /* renamed from: a */
        private int f87701a;

        /* renamed from: b */
        private int f87702b;

        static {
            Covode.recordClassIndex(44546);
        }

        /* renamed from: a */
        private TextPaint m75156a(Paint paint) {
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) this.f87701a);
            textPaint.setColor(this.f87702b);
            return textPaint;
        }

        public C37191a(int i, int i2) {
            this.f87701a = i;
            this.f87702b = i2;
        }

        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            float measureText;
            if (C36223d.m73822a().f85544b) {
                measureText = m75156a(paint).measureText(charSequence.toString().substring(i, i2));
            } else {
                measureText = m75156a(paint).measureText(charSequence.subSequence(i, i2).toString());
            }
            return (int) measureText;
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            String str;
            if (C36223d.m73822a().f85544b) {
                str = charSequence.toString().substring(i, i2);
            } else {
                charSequence = charSequence.subSequence(i, i2);
                str = "";
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            TextPaint a = m75156a(paint);
            Paint.FontMetricsInt fontMetricsInt2 = a.getFontMetricsInt();
            if (C36223d.m73822a().f85544b) {
                canvas.drawText(str, f, (float) (i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), a);
            } else {
                canvas.drawText(charSequence.toString(), f, (float) (i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.d$b */
    public static class C37192b extends ReplacementSpan {

        /* renamed from: a */
        private int f87703a;

        /* renamed from: b */
        private int f87704b;

        /* renamed from: c */
        private Typeface f87705c;

        /* renamed from: d */
        private int f87706d = -1;

        /* renamed from: e */
        private int f87707e = -1;

        static {
            Covode.recordClassIndex(44547);
        }

        /* renamed from: a */
        private TextPaint m75157a(Paint paint) {
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) this.f87703a);
            textPaint.setColor(this.f87704b);
            return textPaint;
        }

        /* renamed from: b */
        private TextPaint m75159b(Paint paint) {
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) this.f87703a);
            textPaint.setColor(this.f87704b);
            textPaint.setTypeface(this.f87705c);
            return textPaint;
        }

        public C37192b(int i, int i2, Typeface typeface, int i3, int i4) {
            this.f87703a = i;
            this.f87704b = i2;
            this.f87705c = typeface;
            this.f87706d = i3;
            this.f87707e = i4;
        }

        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            float measureText;
            if (C36223d.m73822a().f85544b) {
                measureText = m75157a(paint).measureText(charSequence.toString().substring(i, i2));
            } else {
                measureText = m75157a(paint).measureText(charSequence.subSequence(i, i2).toString());
            }
            return (int) measureText;
        }

        /* renamed from: a */
        private void m75158a(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, Paint paint, boolean z) {
            String str;
            TextPaint a;
            if (i >= 0 && i2 <= charSequence.length() && i2 - i >= 0) {
                if (C36223d.m73822a().f85544b) {
                    str = charSequence.toString().substring(i, i2);
                } else {
                    charSequence = charSequence.subSequence(i, i2);
                    str = "";
                }
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                if (z) {
                    a = m75159b(paint);
                } else {
                    a = m75157a(paint);
                }
                Paint.FontMetricsInt fontMetricsInt2 = a.getFontMetricsInt();
                if (C36223d.m73822a().f85544b) {
                    canvas.drawText(str, f, (float) (i3 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), a);
                } else {
                    canvas.drawText(charSequence.toString(), f, (float) (i3 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), a);
                }
            }
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12 = i;
            int i13 = i2;
            boolean a = C80471gb.m139482a();
            if (a) {
                String charSequence2 = charSequence.toString();
                int i14 = this.f87707e;
                if ((i13 - i14) - 1 >= i12) {
                    i10 = (i13 - i14) - 1;
                } else {
                    i10 = i12;
                }
                int measureText = (int) m75159b(paint).measureText(charSequence2.substring(i10, i13));
                int i15 = this.f87707e;
                if ((i13 - i15) - 1 >= i12) {
                    i11 = (i13 - i15) - 1;
                } else {
                    i11 = i13;
                }
                m75158a(canvas, charSequence, i12, i11, f + ((float) measureText), i4, paint, false);
            } else {
                int i16 = this.f87706d;
                if (i16 <= 0 || i16 + i12 > charSequence.length()) {
                    i6 = i13;
                } else {
                    i6 = this.f87706d + i12;
                }
                m75158a(canvas, charSequence, i12, i6, f, i4, paint, false);
            }
            if (this.f87706d >= 0 && (i7 = this.f87707e) >= 0) {
                if (a) {
                    if ((i13 - i7) - 1 >= i12) {
                        i12 = (i13 - i7) - 1;
                    }
                    m75158a(canvas, charSequence, i12, i13, f, i4, paint, true);
                    return;
                }
                String charSequence3 = charSequence.toString();
                int i17 = this.f87706d;
                if (i12 + i17 <= i13) {
                    i8 = i17 + i12;
                } else {
                    i8 = i13;
                }
                int measureText2 = (int) m75157a(paint).measureText(charSequence3.substring(i12, i8));
                int i18 = this.f87706d;
                if (i18 <= 0 || i18 + i12 > charSequence.length()) {
                    i9 = i12;
                } else {
                    i9 = this.f87706d + i12;
                }
                if (this.f87706d + i12 + this.f87707e <= charSequence.length()) {
                    i13 = this.f87706d + i12 + this.f87707e;
                }
                m75158a(canvas, charSequence, i9, i13, f + ((float) measureText2), i4, paint, true);
            }
        }
    }
}
