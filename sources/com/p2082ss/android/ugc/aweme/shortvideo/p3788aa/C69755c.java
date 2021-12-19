package com.p2082ss.android.ugc.aweme.shortvideo.p3788aa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.c */
public final class C69755c extends ReplacementSpan {

    /* renamed from: a */
    public Bitmap f155895a;

    /* renamed from: b */
    public final Context f155896b;

    /* renamed from: c */
    private int f155897c;

    /* renamed from: d */
    private final AbstractC89244h f155898d = C89250i.m154773a((AbstractC89171a) new C69756a(this));

    /* renamed from: e */
    private final AbstractC89244h f155899e = C89250i.m154773a((AbstractC89171a) new C69762g(this));

    /* renamed from: f */
    private final AbstractC89244h f155900f = C89250i.m154773a((AbstractC89171a) new C69757b(this));

    /* renamed from: g */
    private final AbstractC89244h f155901g = C89250i.m154773a((AbstractC89171a) new C69758c(this));

    /* renamed from: h */
    private final AbstractC89244h f155902h = C89250i.m154773a((AbstractC89171a) new C69759d(this));

    /* renamed from: i */
    private final AbstractC89244h f155903i = C89250i.m154773a((AbstractC89171a) new C69760e(this));

    /* renamed from: j */
    private final AbstractC89244h f155904j = C89250i.m154773a((AbstractC89171a) new C69761f(this));

    /* renamed from: k */
    private String f155905k = "";

    /* renamed from: l */
    private final View f155906l;

    static {
        Covode.recordClassIndex(82161);
    }

    /* renamed from: a */
    private final float m123286a() {
        return ((Number) this.f155898d.getValue()).floatValue();
    }

    /* renamed from: b */
    private final float m123287b() {
        return ((Number) this.f155899e.getValue()).floatValue();
    }

    /* renamed from: c */
    private final float m123288c() {
        return ((Number) this.f155901g.getValue()).floatValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.c$a */
    static final class C69756a extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C69755c f155907a;

        static {
            Covode.recordClassIndex(82162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69756a(C69755c cVar) {
            super(0);
            this.f155907a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f155907a.f155896b, 24.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.c$b */
    static final class C69757b extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C69755c f155908a;

        static {
            Covode.recordClassIndex(82163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69757b(C69755c cVar) {
            super(0);
            this.f155908a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f155908a.f155896b, 15.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.c$c */
    static final class C69758c extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C69755c f155909a;

        static {
            Covode.recordClassIndex(82164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69758c(C69755c cVar) {
            super(0);
            this.f155909a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f155909a.f155896b, 13.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.c$d */
    static final class C69759d extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C69755c f155910a;

        static {
            Covode.recordClassIndex(82165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69759d(C69755c cVar) {
            super(0);
            this.f155910a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f155910a.f155896b, 18.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.c$e */
    static final class C69760e extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C69755c f155911a;

        static {
            Covode.recordClassIndex(82166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69760e(C69755c cVar) {
            super(0);
            this.f155911a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f155911a.f155896b, 12.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.c$f */
    static final class C69761f extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C69755c f155912a;

        static {
            Covode.recordClassIndex(82167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69761f(C69755c cVar) {
            super(0);
            this.f155912a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f155912a.f155896b, 4.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.c$g */
    static final class C69762g extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C69755c f155913a;

        static {
            Covode.recordClassIndex(82168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69762g(C69755c cVar) {
            super(0);
            this.f155913a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f155913a.f155896b, 1.0f));
        }
    }

    public C69755c(Context context, View view) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        this.f155896b = context;
        this.f155906l = view;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        String str = "";
        C89219l.m154721d(paint, str);
        C89219l.m154721d(charSequence, str);
        int i3 = i + 1;
        if (i3 >= i2) {
            return 0;
        }
        paint.setTextSize(m123288c());
        paint.setFakeBoldText(true);
        this.f155897c = (int) (paint.measureText(charSequence, i3, i2) + m123286a());
        this.f155905k = charSequence.subSequence(i3, i2).toString();
        View view = this.f155906l;
        if ((view instanceof AbstractC69754b) && this.f155897c >= ((AbstractC69754b) view).getHookAtMaxWidth()) {
            int hookAtMaxWidth = ((AbstractC69754b) this.f155906l).getHookAtMaxWidth();
            float a = m123286a();
            C89219l.m154721d(charSequence, str);
            C89219l.m154721d(paint, str);
            String obj = charSequence.subSequence(i3, i2).toString();
            int measureText = (int) (paint.measureText(obj) + a);
            if (hookAtMaxWidth != 0 && measureText > hookAtMaxWidth) {
                while (true) {
                    if (obj.length() != 1) {
                        int length = obj.length();
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                        obj = C89361p.m154892a(obj, obj.length() - 1, length).toString();
                        if (((int) (paint.measureText(obj + "…") + a)) <= hookAtMaxWidth && !Character.isHighSurrogate(obj.charAt(obj.length() - 1))) {
                            str = obj + "…";
                            break;
                        }
                    } else {
                        str = "…";
                        break;
                    }
                }
            }
            this.f155905k = str;
            this.f155897c = (int) (paint.measureText(str) + m123286a());
        }
        return this.f155897c;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(charSequence, "");
        C89219l.m154721d(paint, "");
        if (i + 1 < i2) {
            if (((float) this.f155897c) + f > ((float) this.f155906l.getWidth())) {
                canvas.drawText("…", f, (float) i4, paint);
            } else if (charSequence.length() <= i || charSequence.charAt(i) != 8230) {
                paint.setAntiAlias(true);
                int color = paint.getColor();
                PathEffect pathEffect = paint.getPathEffect();
                paint.setTextSize(((Number) this.f155900f.getValue()).floatValue());
                paint.setColor(Color.parseColor("#0B222435"));
                paint.setPathEffect(new CornerPathEffect(m123287b() * 2.0f));
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                float f2 = fontMetrics.top;
                float f3 = fontMetrics.bottom;
                float f4 = (float) i4;
                float f5 = f4 + f2;
                canvas.drawRect(new RectF(f, f5, ((float) this.f155897c) + f, f4 + f3), paint);
                paint.setColor(color);
                float floatValue = ((f3 - f2) - ((Number) this.f155903i.getValue()).floatValue()) / 2.0f;
                Bitmap bitmap = this.f155895a;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, ((Number) this.f155904j.getValue()).floatValue() + f, f5 + floatValue, paint);
                }
                paint.setPathEffect(pathEffect);
                paint.setTextSize(m123288c());
                paint.setFakeBoldText(true);
                canvas.drawText(this.f155905k, f + ((Number) this.f155902h.getValue()).floatValue(), f4 - m123287b(), paint);
            } else {
                canvas.drawText("…", f, (float) i4, paint);
            }
        }
    }
}
