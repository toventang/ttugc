package com.p2082ss.android.ugc.aweme.shortvideo.p3788aa;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C23001b;
import com.p2082ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.d */
public final class C69763d extends ReplacementSpan {

    /* renamed from: c */
    public static final C69764a f155914c = new C69764a((byte) 0);

    /* renamed from: a */
    public C69765b f155915a;

    /* renamed from: b */
    public MentionEditText f155916b;

    /* renamed from: d */
    private int f155917d;

    /* renamed from: e */
    private int f155918e;

    /* renamed from: f */
    private Rect f155919f;

    /* renamed from: g */
    private int f155920g;

    /* renamed from: h */
    private final Paint.FontMetricsInt f155921h = new Paint.FontMetricsInt();

    /* renamed from: i */
    private Context f155922i;

    /* renamed from: j */
    private int f155923j;

    /* renamed from: k */
    private int f155924k;

    static {
        Covode.recordClassIndex(82169);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.d$a */
    public static final class C69764a {
        static {
            Covode.recordClassIndex(82170);
        }

        private C69764a() {
        }

        public /* synthetic */ C69764a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final void m123290a() {
        Rect rect;
        int i;
        C69765b bVar = this.f155915a;
        if (bVar != null) {
            rect = bVar.getBounds();
        } else {
            rect = null;
        }
        this.f155919f = rect;
        int i2 = 0;
        if (rect != null) {
            i = rect.width();
        } else {
            i = 0;
        }
        this.f155917d = i;
        Rect rect2 = this.f155919f;
        if (rect2 != null) {
            i2 = rect2.height();
        }
        this.f155918e = i2;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.d$b */
    public static final class C69765b extends C23001b {

        /* renamed from: g */
        public float f155925g;

        static {
            Covode.recordClassIndex(82171);
        }

        @Override // com.bytedance.tux.p1710c.C23001b
        public final void draw(Canvas canvas) {
            C89219l.m154721d(canvas, "");
            int width = getBounds().width();
            int height = getBounds().height();
            canvas.save();
            canvas.rotate(this.f155925g, ((float) getBounds().left) + (((float) width) / 2.0f), ((float) getBounds().top) + (((float) height) / 2.0f));
            super.draw(canvas);
            canvas.restore();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69765b(Context context, int i) {
            super(context, i);
            C89219l.m154721d(context, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.aa.d$c */
    static final class C69766c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C69763d f155926a;

        static {
            Covode.recordClassIndex(82172);
        }

        C69766c(C69763d dVar) {
            this.f155926a = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C69765b bVar = this.f155926a.f155915a;
            if (bVar != null) {
                bVar.f155925g = floatValue;
                bVar.invalidateSelf();
            }
            this.f155926a.f155916b.invalidate();
        }
    }

    /* renamed from: a */
    private final int m123289a(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.f155920g;
        if (i == 0) {
            return fontMetricsInt.descent - this.f155918e;
        }
        if (i == 1) {
            return -this.f155918e;
        }
        if (i != 2) {
            return -this.f155918e;
        }
        return fontMetricsInt.ascent + (((fontMetricsInt.descent - fontMetricsInt.ascent) - this.f155918e) / 2);
    }

    public C69763d(Context context, MentionEditText mentionEditText) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(mentionEditText, "");
        this.f155922i = context;
        this.f155916b = mentionEditText;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.ap6, R.attr.arj}, R.attr.c6, 0);
        C89219l.m154716b(obtainStyledAttributes, "");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int color = obtainStyledAttributes.getColor(1, 0);
        C69765b bVar = new C69765b(this.f155922i, resourceId);
        bVar.mo37377c(color);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a = C89241a.m154730a(TypedValue.applyDimension(1, 0.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 0.0f, system2.getDisplayMetrics()));
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        int a3 = C89241a.m154730a(TypedValue.applyDimension(1, 13.0f, system3.getDisplayMetrics()));
        Resources system4 = Resources.getSystem();
        C89219l.m154709a((Object) system4, "");
        bVar.setBounds(a, a2, a3, C89241a.m154730a(TypedValue.applyDimension(1, 13.0f, system4.getDisplayMetrics())));
        this.f155915a = bVar;
        this.f155920g = 2;
        m123290a();
        MentionEditText mentionEditText2 = this.f155916b;
        mentionEditText2.setLayerType(1, mentionEditText2.getPaint());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ValueAnimator duration = ofFloat.setDuration(1000L);
        C89219l.m154716b(duration, "");
        duration.setInterpolator(new LinearInterpolator());
        C89219l.m154716b(ofFloat, "");
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new C69766c(this));
        C69765b bVar2 = this.f155915a;
        if (bVar2 != null) {
            bVar2.setAlpha(255);
        }
        ofFloat.start();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        C89219l.m154721d(paint, "");
        int i4 = this.f155923j + this.f155924k;
        m123290a();
        if (fontMetricsInt == null) {
            i3 = this.f155917d;
        } else {
            int a = m123289a(fontMetricsInt);
            int i5 = this.f155918e + a;
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
            i3 = this.f155917d;
        }
        return i3 + i4;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int a;
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(paint, "");
        paint.getFontMetricsInt(this.f155921h);
        if (this.f155920g == 2) {
            a = ((i5 + i3) - this.f155918e) / 2;
        } else {
            a = i4 + m123289a(this.f155921h);
        }
        float f2 = f + ((float) this.f155923j);
        float f3 = (float) a;
        canvas.translate(f2, f3);
        C69765b bVar = this.f155915a;
        if (bVar != null) {
            bVar.draw(canvas);
        }
        canvas.translate(-f2, -f3);
    }
}
