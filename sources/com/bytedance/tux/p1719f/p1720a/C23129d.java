package com.bytedance.tux.p1719f.p1720a;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.f.a.d */
public final class C23129d implements LineHeightSpan {

    /* renamed from: a */
    public boolean f54745a;

    /* renamed from: b */
    public int f54746b;

    /* renamed from: c */
    private final AbstractC89244h f54747c = C89250i.m154773a((AbstractC89171a) C23134b.f54753a);

    /* renamed from: com.bytedance.tux.f.a.d$a */
    static final class C23130a {

        /* renamed from: a */
        public static final C23131a f54748a = new C23131a((byte) 0);

        /* renamed from: b */
        private final AbstractC89244h f54749b = C89250i.m154773a((AbstractC89171a) C23133c.f54752a);

        /* renamed from: c */
        private final AbstractC89244h f54750c = C89250i.m154773a((AbstractC89171a) C23132b.f54751a);

        static {
            Covode.recordClassIndex(27059);
        }

        /* renamed from: a */
        public final Rect mo37618a() {
            return (Rect) this.f54749b.getValue();
        }

        /* renamed from: b */
        public final TextPaint mo37619b() {
            return (TextPaint) this.f54750c.getValue();
        }

        /* renamed from: com.bytedance.tux.f.a.d$a$a */
        public static final class C23131a {
            static {
                Covode.recordClassIndex(27060);
            }

            private C23131a() {
            }

            public /* synthetic */ C23131a(byte b) {
                this();
            }
        }

        /* renamed from: com.bytedance.tux.f.a.d$a$c */
        static final class C23133c extends AbstractC89220m implements AbstractC89171a<Rect> {

            /* renamed from: a */
            public static final C23133c f54752a = new C23133c();

            static {
                Covode.recordClassIndex(27062);
            }

            C23133c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Rect invoke() {
                return new Rect();
            }
        }

        /* renamed from: com.bytedance.tux.f.a.d$a$b */
        static final class C23132b extends AbstractC89220m implements AbstractC89171a<TextPaint> {

            /* renamed from: a */
            public static final C23132b f54751a = new C23132b();

            static {
                Covode.recordClassIndex(27061);
            }

            C23132b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ TextPaint invoke() {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(30.0f);
                return textPaint;
            }
        }
    }

    static {
        Covode.recordClassIndex(27058);
    }

    /* renamed from: com.bytedance.tux.f.a.d$b */
    static final class C23134b extends AbstractC89220m implements AbstractC89171a<C23130a> {

        /* renamed from: a */
        public static final C23134b f54753a = new C23134b();

        static {
            Covode.recordClassIndex(27063);
        }

        C23134b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23130a invoke() {
            return new C23130a();
        }
    }

    public C23129d(int i) {
        this.f54746b = i;
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        C89219l.m154719c(charSequence, "");
        C89219l.m154719c(fontMetricsInt, "");
        int i5 = fontMetricsInt.descent;
        int i6 = this.f54746b;
        if (i5 > i6) {
            fontMetricsInt.descent = Math.min(i6, fontMetricsInt.descent);
            fontMetricsInt.bottom = fontMetricsInt.descent;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.f54746b) {
            if (fontMetricsInt.descent < fontMetricsInt.bottom) {
                fontMetricsInt.bottom = fontMetricsInt.descent;
                C23130a aVar = (C23130a) this.f54747c.getValue();
                C89219l.m154719c(charSequence, "");
                if (Build.VERSION.SDK_INT >= 29) {
                    aVar.mo37619b().getTextBounds(charSequence, i, i2, aVar.mo37618a());
                } else {
                    aVar.mo37619b().getTextBounds(charSequence.toString(), i, i2, aVar.mo37618a());
                }
                if (((float) aVar.mo37618a().height()) / 30.0f <= 1.0f) {
                    fontMetricsInt.ascent = (-this.f54746b) + fontMetricsInt.descent;
                }
                fontMetricsInt.top = fontMetricsInt.ascent;
            }
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.f54746b) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.f54746b;
        } else {
            int i7 = (-fontMetricsInt.top) + fontMetricsInt.bottom;
            int i8 = this.f54746b;
            if (i7 > i8) {
                fontMetricsInt.top = fontMetricsInt.bottom - this.f54746b;
                return;
            }
            double d = (double) (((float) (i8 - ((-fontMetricsInt.top) + fontMetricsInt.bottom))) / 2.0f);
            fontMetricsInt.top -= (int) ((float) Math.ceil(d));
            fontMetricsInt.bottom += (int) ((float) Math.floor(d));
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}
