package com.bytedance.android.live.liveinteract.match.p311ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.PKProgressBar */
public final class PKProgressBar extends View {

    /* renamed from: d */
    public static final C5063a f13160d = new C5063a((byte) 0);

    /* renamed from: a */
    public float f13161a;

    /* renamed from: b */
    AbstractC89172b<? super Float, C89391z> f13162b;

    /* renamed from: c */
    public AbstractC89172b<? super Float, C89391z> f13163c;

    /* renamed from: e */
    private int f13164e;

    /* renamed from: f */
    private int f13165f;

    /* renamed from: g */
    private int f13166g;

    /* renamed from: h */
    private int f13167h;

    /* renamed from: i */
    private int f13168i;

    /* renamed from: j */
    private int f13169j;

    /* renamed from: k */
    private int f13170k;

    /* renamed from: l */
    private int f13171l;

    /* renamed from: m */
    private int f13172m;

    /* renamed from: n */
    private int f13173n;

    /* renamed from: o */
    private float f13174o;

    /* renamed from: p */
    private ValueAnimator f13175p;

    /* renamed from: q */
    private final AbstractC89244h f13176q;

    /* renamed from: r */
    private final RectF f13177r;

    /* renamed from: s */
    private final RectF f13178s;

    /* renamed from: t */
    private boolean f13179t;

    /* renamed from: u */
    private boolean f13180u;

    /* renamed from: v */
    private final AbstractC89244h f13181v;

    static {
        Covode.recordClassIndex(5651);
    }

    public PKProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final Paint getMPaint() {
        return (Paint) this.f13176q.getValue();
    }

    public final float getStartSpacing() {
        return ((Number) this.f13181v.getValue()).floatValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.PKProgressBar$a */
    public static final class C5063a {
        static {
            Covode.recordClassIndex(5652);
        }

        private C5063a() {
        }

        public /* synthetic */ C5063a(byte b) {
            this();
        }
    }

    public final float getCoverWidth() {
        return this.f13174o;
    }

    public final int getLeftValue() {
        return this.f13172m;
    }

    public final boolean getMIsAnimationToRight() {
        return this.f13180u;
    }

    public final int getRightValue() {
        return this.f13173n;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.PKProgressBar$d */
    static final class C5066d extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        public static final C5066d f13184a = new C5066d();

        static {
            Covode.recordClassIndex(5655);
        }

        C5066d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(((float) C3966y.m9664c()) * 0.16f);
        }
    }

    /* renamed from: a */
    public final void mo10796a() {
        this.f13172m = 0;
        this.f13173n = 0;
        this.f13161a = 0.5f;
        this.f13179t = true;
        invalidate();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.PKProgressBar$b */
    static final class C5064b extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        public static final C5064b f13182a = new C5064b();

        static {
            Covode.recordClassIndex(5653);
        }

        C5064b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setDither(true);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    private final Path getClipPath() {
        float leftPaddingOffset = (float) getLeftPaddingOffset();
        float topPaddingOffset = (float) getTopPaddingOffset();
        float rightPaddingOffset = (float) getRightPaddingOffset();
        float bottomPaddingOffset = (float) getBottomPaddingOffset();
        float width = (((float) getWidth()) - leftPaddingOffset) - rightPaddingOffset;
        Path path = new Path();
        path.moveTo(leftPaddingOffset, topPaddingOffset);
        float f = width + leftPaddingOffset;
        path.lineTo(f, topPaddingOffset);
        float height = ((((float) getHeight()) - topPaddingOffset) - bottomPaddingOffset) + topPaddingOffset;
        path.lineTo(f, height);
        path.lineTo(leftPaddingOffset, height);
        path.lineTo(leftPaddingOffset, topPaddingOffset);
        path.close();
        return path;
    }

    public final void setCoverWidth(float f) {
        this.f13174o = f;
    }

    public final void setMIsAnimationToRight(boolean z) {
        this.f13180u = z;
    }

    public final void setLeftValue(int i) {
        this.f13179t = false;
        this.f13172m = i;
        int i2 = this.f13173n;
        if (i2 + i == 0) {
            this.f13179t = true;
            setProgress(0.5f);
            return;
        }
        setProgress(((float) i) / ((float) (i + i2)));
    }

    public final void setRightValue(int i) {
        this.f13179t = false;
        this.f13173n = i;
        int i2 = this.f13172m;
        if (i + i2 == 0) {
            this.f13179t = true;
            setProgress(0.5f);
            return;
        }
        setProgress(((float) i2) / ((float) (i2 + i)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.view.PKProgressBar$c */
    public static final class C5065c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PKProgressBar f13183a;

        static {
            Covode.recordClassIndex(5654);
        }

        C5065c(PKProgressBar pKProgressBar) {
            this.f13183a = pKProgressBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154721d(valueAnimator, "");
            PKProgressBar pKProgressBar = this.f13183a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            pKProgressBar.f13161a = ((Float) animatedValue).floatValue();
            AbstractC89172b<? super Float, C89391z> bVar = this.f13183a.f13163c;
            if (bVar != null) {
                bVar.invoke(Float.valueOf(this.f13183a.f13161a));
            }
            this.f13183a.invalidate();
        }
    }

    private final void setProgress(float f) {
        ValueAnimator valueAnimator;
        AbstractC89172b<? super Float, C89391z> bVar = this.f13162b;
        if (bVar != null) {
            bVar.invoke(Float.valueOf(f));
        }
        float f2 = this.f13161a;
        ValueAnimator valueAnimator2 = this.f13175p;
        if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = this.f13175p) == null)) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.f13175p = ofFloat;
        if (ofFloat == null) {
            C89219l.m154715b();
        }
        ofFloat.setDuration(300L);
        ValueAnimator valueAnimator3 = this.f13175p;
        if (valueAnimator3 == null) {
            C89219l.m154715b();
        }
        valueAnimator3.addUpdateListener(new C5065c(this));
        ValueAnimator valueAnimator4 = this.f13175p;
        if (valueAnimator4 == null) {
            C89219l.m154715b();
        }
        valueAnimator4.start();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(5594);
        super.onDraw(canvas);
        if (canvas == null) {
            MethodCollector.m26664o(5594);
            return;
        }
        float startSpacing = getStartSpacing();
        float width = (this.f13161a * (((float) getWidth()) - (startSpacing * 2.0f))) + startSpacing;
        this.f13177r.set(0.0f, 0.0f, width, (float) getHeight());
        this.f13178s.set(width, 0.0f, (float) getWidth(), (float) getHeight());
        canvas.clipPath(getClipPath());
        LinearGradient linearGradient = new LinearGradient(this.f13177r.left, this.f13177r.top, this.f13177r.right, this.f13177r.bottom, this.f13166g, this.f13167h, Shader.TileMode.MIRROR);
        LinearGradient linearGradient2 = new LinearGradient(this.f13178s.left, this.f13178s.top, this.f13178s.right, this.f13178s.bottom, this.f13168i, this.f13169j, Shader.TileMode.MIRROR);
        if (this.f13179t) {
            getMPaint().setShader(linearGradient);
            canvas.drawRect(this.f13177r, getMPaint());
            getMPaint().setShader(linearGradient2);
            canvas.drawRect(this.f13178s, getMPaint());
            getMPaint().setShader(null);
            MethodCollector.m26664o(5594);
            return;
        }
        getMPaint().setShader(linearGradient2);
        canvas.drawRect(this.f13178s, getMPaint());
        getMPaint().setShader(linearGradient);
        float f = 24.0f;
        float a = (width + ((float) (C3966y.m9653a(this.f13174o) / 2))) - 24.0f;
        Path path = new Path();
        float f2 = a - 0.0f;
        float height = ((float) getHeight()) - 0.0f;
        float f3 = f2 / 2.0f;
        if (24.0f <= f3) {
            f3 = 24.0f;
        }
        float f4 = height / 2.0f;
        if (24.0f > f4) {
            f = f4;
        }
        float f5 = f2 - (f3 * 2.0f);
        float f6 = height - (2.0f * f);
        path.moveTo(a, f + 0.0f);
        float f7 = -f;
        float f8 = -f3;
        path.rQuadTo(0.0f, f7, f8, f7);
        path.rLineTo(-f5, 0.0f);
        path.rLineTo(f8, 0.0f);
        path.rLineTo(0.0f, f);
        path.rLineTo(0.0f, f6);
        path.rLineTo(0.0f, f);
        path.rLineTo(f3, 0.0f);
        path.rLineTo(f5, 0.0f);
        path.rQuadTo(f3, 0.0f, f3, f7);
        path.rLineTo(0.0f, -f6);
        path.close();
        canvas.drawPath(path, getMPaint());
        getMPaint().setShader(null);
        MethodCollector.m26664o(5594);
    }

    private /* synthetic */ PKProgressBar(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PKProgressBar(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        String str;
        String str2;
        C89219l.m154721d(context, "");
        boolean z = false;
        MethodCollector.m26663i(5736);
        this.f13176q = C89250i.m154773a((AbstractC89171a) C5064b.f13182a);
        this.f13177r = new RectF();
        this.f13178s = new RectF();
        this.f13179t = true;
        this.f13180u = true;
        this.f13181v = C89250i.m154773a((AbstractC89171a) C5066d.f13184a);
        this.f13164e = Color.parseColor("#FB6844");
        this.f13165f = Color.parseColor("#359FF2");
        this.f13170k = Color.parseColor("#7D0044");
        this.f13171l = Color.parseColor("#0A1276");
        this.f13172m = 0;
        this.f13173n = 0;
        this.f13161a = 0.5f;
        z = EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0 ? true : z;
        String str3 = "#F93659";
        if (z) {
            str = str3;
        } else {
            str = "#fd2d55";
        }
        this.f13166g = Color.parseColor(str);
        this.f13167h = Color.parseColor(!z ? "#ff3ce3" : str3);
        String str4 = "#0D8BFF";
        if (z) {
            str2 = str4;
        } else {
            str2 = "#7ddeff";
        }
        this.f13168i = Color.parseColor(str2);
        this.f13169j = Color.parseColor(!z ? "#606bff" : str4);
        MethodCollector.m26664o(5736);
    }
}
