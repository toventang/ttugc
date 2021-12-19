package com.p2082ss.android.ugc.aweme.story.record.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout */
public final class StoryRecordLayout extends FrameLayout {

    /* renamed from: i */
    public static final C77672a f174191i = new C77672a((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f174192A;

    /* renamed from: B */
    private final AbstractC89244h f174193B;

    /* renamed from: C */
    private final AbstractC89244h f174194C;

    /* renamed from: D */
    private final AbstractC89244h f174195D;

    /* renamed from: E */
    private final float f174196E;

    /* renamed from: F */
    private final int f174197F;

    /* renamed from: G */
    private final AbstractC89244h f174198G;

    /* renamed from: H */
    private final float f174199H;

    /* renamed from: I */
    private final int f174200I;

    /* renamed from: J */
    private final AbstractC89244h f174201J;

    /* renamed from: a */
    public boolean f174202a;

    /* renamed from: b */
    public float f174203b;

    /* renamed from: c */
    public long f174204c;

    /* renamed from: d */
    public final float f174205d;

    /* renamed from: e */
    public float f174206e;

    /* renamed from: f */
    public final float f174207f;

    /* renamed from: g */
    public final float f174208g;

    /* renamed from: h */
    public final float f174209h;

    /* renamed from: j */
    private AbstractC77674c f174210j;

    /* renamed from: k */
    private EnumC77673b f174211k;

    /* renamed from: l */
    private EnumC77676e f174212l;

    /* renamed from: m */
    private EnumC77675d f174213m;

    /* renamed from: n */
    private long f174214n;

    /* renamed from: o */
    private float f174215o;

    /* renamed from: p */
    private float f174216p;

    /* renamed from: q */
    private float f174217q;

    /* renamed from: r */
    private long f174218r;

    /* renamed from: s */
    private final int f174219s;

    /* renamed from: t */
    private final Runnable f174220t;

    /* renamed from: u */
    private final float f174221u;

    /* renamed from: v */
    private final float f174222v;

    /* renamed from: w */
    private final AbstractC89244h f174223w;

    /* renamed from: x */
    private final AbstractC89244h f174224x;

    /* renamed from: y */
    private final AbstractC89244h f174225y;

    /* renamed from: z */
    private final AbstractC89244h f174226z;

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$b */
    public enum EnumC77673b {
        RECORD_LAYOUT_MODE_1,
        RECORD_LAYOUT_MODE_2;

        static {
            Covode.recordClassIndex(90715);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$c */
    public interface AbstractC77674c {
        static {
            Covode.recordClassIndex(90716);
        }

        /* renamed from: a */
        void mo121143a();

        /* renamed from: a */
        void mo121144a(float f, float f2);

        /* renamed from: b */
        void mo121145b();

        /* renamed from: c */
        void mo121146c();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$d */
    public enum EnumC77675d {
        CLICK_RECORDING,
        LONG_PRESS_RECORDING;

        static {
            Covode.recordClassIndex(90717);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$e */
    public enum EnumC77676e {
        IDLE,
        RECORDING;

        static {
            Covode.recordClassIndex(90718);
        }
    }

    static {
        Covode.recordClassIndex(90713);
    }

    public StoryRecordLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private static double m135661a(double d) {
        double d2 = 1.0d - d;
        double d3 = d * d;
        double d4 = d2 * d2;
        return (d4 * d2 * 0.0d) + (d4 * 3.0d * d * 0.0d) + (d2 * 3.0d * d3 * 1.0d) + (d3 * d * 1.0d);
    }

    private final Paint getIDleInnerPaint() {
        return (Paint) this.f174224x.getValue();
    }

    private final Paint getIDleOuterPaint() {
        return (Paint) this.f174225y.getValue();
    }

    private final Paint getLockCirclePaint() {
        return (Paint) this.f174194C.getValue();
    }

    private final Paint getProgressPaint() {
        return (Paint) this.f174226z.getValue();
    }

    private final Paint getRecordingOuterCirclePaint() {
        return (Paint) this.f174192A.getValue();
    }

    private final RectF getRecordingProgressOvalRectF() {
        return (RectF) this.f174201J.getValue();
    }

    private final Paint getRecordingRoundRectPaint() {
        return (Paint) this.f174195D.getValue();
    }

    private final Paint getWhitePaint() {
        return (Paint) this.f174193B.getValue();
    }

    public final LinearGradient getBaseCircleGradient() {
        return (LinearGradient) this.f174223w.getValue();
    }

    public final float getRecordingOuterCircleWidth() {
        return ((Number) this.f174198G.getValue()).floatValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$a */
    public static final class C77672a {
        static {
            Covode.recordClassIndex(90714);
        }

        private C77672a() {
        }

        public /* synthetic */ C77672a(byte b) {
            this();
        }
    }

    public final AbstractC77674c getListener() {
        return this.f174210j;
    }

    public final EnumC77675d getRecordingMode() {
        return this.f174213m;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$l */
    static final class C77683l extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ StoryRecordLayout f174236a;

        static {
            Covode.recordClassIndex(90725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77683l(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.f174236a = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(this.f174236a.f174205d * this.f174236a.f174209h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$q */
    static final class C77688q extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        public static final C77688q f174241a = new C77688q();

        static {
            Covode.recordClassIndex(90730);
        }

        C77688q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* renamed from: a */
    private final void m135662a() {
        this.f174202a = false;
        AbstractC77674c cVar = this.f174210j;
        if (cVar != null) {
            cVar.mo121145b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$g */
    static final class C77678g extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        final /* synthetic */ StoryRecordLayout f174231a;

        static {
            Covode.recordClassIndex(90720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77678g(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.f174231a = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setShader(this.f174231a.getBaseCircleGradient());
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$h */
    static final class C77679h extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        final /* synthetic */ StoryRecordLayout f174232a;

        static {
            Covode.recordClassIndex(90721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77679h(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.f174232a = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#8020D5EC"));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f174232a.f174207f);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$i */
    static final class C77680i extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        public static final C77680i f174233a = new C77680i();

        static {
            Covode.recordClassIndex(90722);
        }

        C77680i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#33FFFFFF"));
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$k */
    static final class C77682k extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        public static final C77682k f174235a = new C77682k();

        static {
            Covode.recordClassIndex(90724);
        }

        C77682k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#4CFFFFFF"));
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$n */
    static final class C77685n extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        public static final C77685n f174238a = new C77685n();

        static {
            Covode.recordClassIndex(90727);
        }

        C77685n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#20D5EC"));
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$o */
    static final class RunnableC77686o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StoryRecordLayout f174239a;

        static {
            Covode.recordClassIndex(90728);
        }

        RunnableC77686o(StoryRecordLayout storyRecordLayout) {
            this.f174239a = storyRecordLayout;
        }

        public final void run() {
            this.f174239a.f174204c = SystemClock.uptimeMillis();
            AbstractC77674c listener = this.f174239a.getListener();
            if (listener != null) {
                listener.mo121143a();
            }
            this.f174239a.setStateInternal(EnumC77676e.RECORDING);
            this.f174239a.f174202a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$j */
    static final class C77681j extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        final /* synthetic */ StoryRecordLayout f174234a;

        static {
            Covode.recordClassIndex(90723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77681j(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.f174234a = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(Color.parseColor("#20D5EC"));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f174234a.f174208g);
            paint.setAntiAlias(true);
            paint.setStrokeCap(Paint.Cap.SQUARE);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$f */
    static final class C77677f extends AbstractC89220m implements AbstractC89171a<LinearGradient> {

        /* renamed from: a */
        final /* synthetic */ StoryRecordLayout f174230a;

        static {
            Covode.recordClassIndex(90719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77677f(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.f174230a = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearGradient invoke() {
            return new LinearGradient((((float) this.f174230a.getWidth()) / 2.0f) - this.f174230a.f174206e, (((float) this.f174230a.getHeight()) / 2.0f) - this.f174230a.f174206e, (((float) this.f174230a.getWidth()) / 2.0f) + this.f174230a.f174206e, (((float) this.f174230a.getHeight()) / 2.0f) + this.f174230a.f174206e, new int[]{Color.parseColor("#10B7FF"), Color.parseColor("#20D5EC"), Color.parseColor("#17E9B6")}, new float[]{0.14f, 0.5f, 0.86f}, Shader.TileMode.CLAMP);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$m */
    static final class C77684m extends AbstractC89220m implements AbstractC89171a<RectF> {

        /* renamed from: a */
        final /* synthetic */ StoryRecordLayout f174237a;

        static {
            Covode.recordClassIndex(90726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77684m(StoryRecordLayout storyRecordLayout) {
            super(0);
            this.f174237a = storyRecordLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RectF invoke() {
            return new RectF(-((this.f174237a.getRecordingOuterCircleWidth() - ((float) (this.f174237a.getWidth() / 2))) - (this.f174237a.f174208g / 2.0f)), -((this.f174237a.getRecordingOuterCircleWidth() - ((float) (this.f174237a.getWidth() / 2))) - (this.f174237a.f174208g / 2.0f)), ((((float) this.f174237a.getWidth()) + this.f174237a.getRecordingOuterCircleWidth()) - ((float) (this.f174237a.getWidth() / 2))) - (this.f174237a.f174208g / 2.0f), ((((float) this.f174237a.getWidth()) + this.f174237a.getRecordingOuterCircleWidth()) - ((float) (this.f174237a.getWidth() / 2))) - (this.f174237a.f174208g / 2.0f));
        }
    }

    public final void setListener(AbstractC77674c cVar) {
        this.f174210j = cVar;
    }

    public final void setStateInternal(EnumC77676e eVar) {
        this.f174212l = eVar;
        invalidate();
    }

    public final void setRecordingMode(EnumC77675d dVar) {
        C89219l.m154721d(dVar, "");
        this.f174213m = dVar;
        invalidate();
    }

    public final void setState(EnumC77676e eVar) {
        C89219l.m154721d(eVar, "");
        setStateInternal(eVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.widget.StoryRecordLayout$p */
    static final class C77687p implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StoryRecordLayout f174240a;

        static {
            Covode.recordClassIndex(90729);
        }

        C77687p(StoryRecordLayout storyRecordLayout) {
            this.f174240a = storyRecordLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            StoryRecordLayout storyRecordLayout = this.f174240a;
            float f = storyRecordLayout.f174205d;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            storyRecordLayout.f174206e = f * ((Float) animatedValue).floatValue();
            this.f174240a.invalidate();
        }
    }

    public final void setMode(EnumC77673b bVar) {
        long j;
        C89219l.m154721d(bVar, "");
        this.f174211k = bVar;
        int i = C77689a.f174246a[bVar.ordinal()];
        if (i == 1) {
            j = 150;
        } else if (i == 2) {
            j = 0;
        } else {
            throw new C89376n();
        }
        this.f174214n = j;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        float a;
        float recordingOuterCircleWidth;
        if (canvas != null) {
            int i = C77689a.f174247b[this.f174212l.ordinal()];
            if (i == 1) {
                canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.f174206e, getIDleInnerPaint());
                float f = this.f174207f;
                canvas.drawOval(new RectF(f / 2.0f, f / 2.0f, ((float) getWidth()) - (this.f174207f / 2.0f), ((float) getHeight()) - (this.f174207f / 2.0f)), getIDleOuterPaint());
            } else if (i == 2) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.f174204c;
                float f2 = ((float) uptimeMillis) / ((float) this.f174197F);
                if (f2 > 1.0f) {
                    a = f2;
                } else {
                    a = (float) m135661a((double) f2);
                }
                if (a < 1.0f) {
                    recordingOuterCircleWidth = this.f174206e * (((this.f174209h - 1.0f) * a) + 1.0f);
                } else {
                    recordingOuterCircleWidth = getRecordingOuterCircleWidth();
                }
                canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), recordingOuterCircleWidth, getRecordingOuterCirclePaint());
                if (uptimeMillis <= ((long) this.f174197F)) {
                    float f3 = this.f174206e;
                    float f4 = (((this.f174221u / 2.0f) - f3) * a) + f3;
                    float f5 = f3 + (a * (this.f174222v - f3));
                    canvas.drawRoundRect(new RectF(((float) (getWidth() / 2)) - f4, ((float) (getHeight() / 2)) - f4, ((float) (getWidth() / 2)) + f4, ((float) (getHeight() / 2)) + f4), f5, f5, getIDleInnerPaint());
                } else if (this.f174213m == EnumC77675d.LONG_PRESS_RECORDING) {
                    int i2 = this.f174197F;
                    if (uptimeMillis <= ((long) (i2 * 2))) {
                        float f6 = this.f174222v;
                        float a2 = f6 + (((float) m135661a((double) (((float) (uptimeMillis - ((long) i2))) / ((float) i2)))) * (this.f174199H - f6));
                        canvas.drawRoundRect(new RectF(((float) (getWidth() / 2)) - this.f174199H, ((float) (getHeight() / 2)) - this.f174199H, ((float) (getWidth() / 2)) + this.f174199H, ((float) (getHeight() / 2)) + this.f174199H), a2, a2, getWhitePaint());
                    } else {
                        canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.f174199H, getWhitePaint());
                    }
                } else {
                    RectF rectF = new RectF(((float) (getWidth() / 2)) - (this.f174221u / 2.0f), ((float) (getHeight() / 2)) - (this.f174221u / 2.0f), ((float) (getWidth() / 2)) + (this.f174221u / 2.0f), ((float) (getHeight() / 2)) + (this.f174221u / 2.0f));
                    float f7 = this.f174222v;
                    canvas.drawRoundRect(rectF, f7, f7, getRecordingRoundRectPaint());
                }
                if (f2 >= 1.0f) {
                    canvas.drawArc(getRecordingProgressOvalRectF(), -90.0f, (this.f174203b / 100.0f) * 360.0f, false, getProgressPaint());
                } else {
                    invalidate();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.record.widget.StoryRecordLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private /* synthetic */ StoryRecordLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryRecordLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4750);
        this.f174211k = EnumC77673b.RECORD_LAYOUT_MODE_2;
        this.f174212l = EnumC77676e.IDLE;
        this.f174213m = EnumC77675d.LONG_PRESS_RECORDING;
        this.f174219s = 300;
        this.f174220t = new RunnableC77686o(this);
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        this.f174221u = C84912r.m145930a(context2, 36.0f);
        Context context3 = getContext();
        C89219l.m154716b(context3, "");
        this.f174222v = C84912r.m145930a(context3, 4.0f);
        this.f174223w = C89250i.m154773a((AbstractC89171a) new C77677f(this));
        this.f174224x = C89250i.m154773a((AbstractC89171a) new C77678g(this));
        float a = (float) C71812ep.m126783a(32.0d, C63247i.f143610a);
        this.f174205d = a;
        this.f174206e = a;
        this.f174207f = (float) C71812ep.m126783a(6.0d, C63247i.f143610a);
        this.f174225y = C89250i.m154773a((AbstractC89171a) new C77679h(this));
        this.f174208g = (float) C71812ep.m126783a(6.0d, C63247i.f143610a);
        this.f174226z = C89250i.m154773a((AbstractC89171a) new C77681j(this));
        this.f174192A = C89250i.m154773a((AbstractC89171a) C77682k.f174235a);
        this.f174193B = C89250i.m154773a((AbstractC89171a) C77688q.f174241a);
        this.f174194C = C89250i.m154773a((AbstractC89171a) C77680i.f174233a);
        this.f174195D = C89250i.m154773a((AbstractC89171a) C77685n.f174238a);
        this.f174209h = 1.8125f;
        this.f174196E = 1.3125f;
        this.f174197F = 350;
        this.f174198G = C89250i.m154773a((AbstractC89171a) new C77683l(this));
        this.f174199H = (float) C71812ep.m126783a(18.0d, C63247i.f143610a);
        this.f174200I = C71812ep.m126783a(5.0d, C63247i.f143610a);
        this.f174201J = C89250i.m154773a((AbstractC89171a) new C77684m(this));
        MethodCollector.m26664o(4750);
    }
}
