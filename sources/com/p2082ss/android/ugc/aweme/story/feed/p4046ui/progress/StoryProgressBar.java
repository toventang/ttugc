package com.p2082ss.android.ugc.aweme.story.feed.p4046ui.progress;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryProgressBar */
public final class StoryProgressBar extends View {

    /* renamed from: a */
    public static final C77256a f173307a = new C77256a((byte) 0);

    /* renamed from: b */
    private final RectF f173308b;

    /* renamed from: c */
    private final Path f173309c;

    /* renamed from: d */
    private final float[] f173310d;
    private float drawPercentProgress;

    /* renamed from: e */
    private int f173311e;

    /* renamed from: f */
    private int f173312f;

    /* renamed from: g */
    private int f173313g;

    /* renamed from: h */
    private int f173314h;

    /* renamed from: i */
    private float f173315i;

    /* renamed from: j */
    private long f173316j;

    /* renamed from: k */
    private ValueAnimator f173317k;

    /* renamed from: l */
    private float f173318l;

    /* renamed from: m */
    private float f173319m;

    /* renamed from: n */
    private final Paint f173320n;

    /* renamed from: o */
    private final Paint f173321o;

    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryProgressBar$b */
    enum EnumC77257b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT;

        static {
            Covode.recordClassIndex(90274);
        }
    }

    static {
        Covode.recordClassIndex(90272);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryProgressBar$a */
    public static final class C77256a {
        static {
            Covode.recordClassIndex(90273);
        }

        private C77256a() {
        }

        public /* synthetic */ C77256a(byte b) {
            this();
        }
    }

    public final float getDrawPercentProgress() {
        return this.drawPercentProgress;
    }

    public final int getOrientation() {
        return this.f173311e;
    }

    /* renamed from: a */
    private final void m135026a() {
        Arrays.fill(this.f173310d, 0.0f);
    }

    public final void setAnimationInterval(long j) {
        this.f173316j = j;
    }

    public final void setOrientation(int i) {
        this.f173311e = i;
    }

    public final void setDrawPercentProgress(float f) {
        this.drawPercentProgress = f;
        invalidate();
    }

    public final void setProgressBarConfig(C77258a aVar) {
        if (aVar != null) {
            if (aVar.f173327a > 0.0f) {
                this.f173315i = aVar.f173327a;
            }
            if (aVar.f173328b > 0) {
                this.f173313g = aVar.f173328b;
            }
            if (aVar.f173329c > 0) {
                this.f173314h = aVar.f173329c;
            }
            if (aVar.f173330d > 0.0f) {
                this.f173318l = aVar.f173330d;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryProgressBar(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        int i = 0;
        MethodCollector.m26663i(3792);
        this.f173308b = new RectF();
        this.f173309c = new Path();
        this.f173310d = new float[8];
        this.f173312f = -1;
        Integer a = C23155d.m43641a(context, R.attr.ae);
        this.f173313g = a != null ? a.intValue() : i;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f173315i = TypedValue.applyDimension(1, 1.5f, system.getDisplayMetrics());
        this.f173316j = 300;
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        this.f173318l = TypedValue.applyDimension(1, 7.0f, system2.getDisplayMetrics());
        Resources system3 = Resources.getSystem();
        C89219l.m154709a((Object) system3, "");
        this.f173319m = TypedValue.applyDimension(1, 3.0f, system3.getDisplayMetrics());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.f173312f);
        paint.setStyle(Paint.Style.FILL);
        this.f173320n = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(this.f173313g);
        paint2.setStyle(Paint.Style.FILL);
        this.f173321o = paint2;
        MethodCollector.m26664o(3792);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.m26663i(3638);
        super.onDraw(canvas);
        if (canvas != null) {
            if (getOrientation() == 0) {
                this.f173308b.set(0.0f, this.f173318l, (float) getWidth(), this.f173318l + this.f173319m);
            } else {
                this.f173308b.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            }
            int i = this.f173314h;
            if (i != 0) {
                this.f173321o.setColor(i);
                RectF rectF = this.f173308b;
                float f = this.f173315i;
                canvas.drawRoundRect(rectF, f, f, this.f173321o);
            }
            this.f173321o.setColor(this.f173313g);
            RectF rectF2 = this.f173308b;
            float f2 = this.f173315i;
            canvas.drawRoundRect(rectF2, f2, f2, this.f173321o);
            this.f173309c.reset();
            m135026a();
            if (getOrientation() == 0) {
                float width = ((float) getWidth()) * this.drawPercentProgress;
                if (((float) getWidth()) <= this.f173315i) {
                    m135027a(EnumC77257b.TOP_LEFT, this.f173315i);
                    m135027a(EnumC77257b.BOTTOM_LEFT, this.f173315i);
                    m135027a(EnumC77257b.TOP_RIGHT, this.f173315i);
                    m135027a(EnumC77257b.BOTTOM_RIGHT, this.f173315i);
                    RectF rectF3 = this.f173308b;
                    float f3 = this.f173318l;
                    rectF3.set(0.0f, f3, width, this.f173319m + f3);
                    this.f173309c.addRoundRect(this.f173308b, this.f173310d, Path.Direction.CW);
                    canvas.drawPath(this.f173309c, this.f173320n);
                    MethodCollector.m26664o(3638);
                } else if (this.drawPercentProgress == 0.0f) {
                    RectF rectF4 = this.f173308b;
                    float f4 = this.f173318l;
                    rectF4.set(0.0f, f4, width, this.f173319m + f4);
                    this.f173309c.addRoundRect(this.f173308b, this.f173310d, Path.Direction.CW);
                    canvas.drawPath(this.f173309c, this.f173320n);
                    MethodCollector.m26664o(3638);
                } else {
                    Context context = getContext();
                    C89219l.m154716b(context, "");
                    if (C23163i.m43663a(context)) {
                        this.f173308b.set(((float) getWidth()) - (this.f173315i * 2.0f), this.f173318l, (float) getWidth(), this.f173318l + this.f173319m);
                    } else {
                        RectF rectF5 = this.f173308b;
                        float f5 = this.f173318l;
                        rectF5.set(0.0f, f5, this.f173315i * 2.0f, this.f173319m + f5);
                    }
                    RectF rectF6 = this.f173308b;
                    float f6 = this.f173315i;
                    canvas.drawRoundRect(rectF6, f6, f6, this.f173320n);
                    m135026a();
                    Context context2 = getContext();
                    C89219l.m154716b(context2, "");
                    if (C23163i.m43663a(context2)) {
                        m135027a(EnumC77257b.TOP_LEFT, this.f173315i);
                        m135027a(EnumC77257b.BOTTOM_LEFT, this.f173315i);
                    }
                    m135027a(EnumC77257b.TOP_RIGHT, this.f173315i);
                    m135027a(EnumC77257b.BOTTOM_RIGHT, this.f173315i);
                    Context context3 = getContext();
                    C89219l.m154716b(context3, "");
                    if (C23163i.m43663a(context3)) {
                        this.f173308b.set(((float) getWidth()) - width, this.f173318l, (float) getWidth(), this.f173318l + this.f173319m);
                    } else {
                        RectF rectF7 = this.f173308b;
                        float f7 = this.f173315i;
                        float f8 = this.f173318l;
                        rectF7.set(f7, f8, width, this.f173319m + f8);
                    }
                    this.f173309c.addRoundRect(this.f173308b, this.f173310d, Path.Direction.CW);
                    canvas.drawPath(this.f173309c, this.f173320n);
                    MethodCollector.m26664o(3638);
                }
            } else {
                float height = ((float) getHeight()) * this.drawPercentProgress;
                if (((float) getHeight()) <= this.f173315i) {
                    m135027a(EnumC77257b.TOP_LEFT, this.f173315i);
                    m135027a(EnumC77257b.BOTTOM_LEFT, this.f173315i);
                    m135027a(EnumC77257b.TOP_RIGHT, this.f173315i);
                    m135027a(EnumC77257b.BOTTOM_RIGHT, this.f173315i);
                    this.f173308b.set(0.0f, 0.0f, (float) getWidth(), height);
                    this.f173309c.addRoundRect(this.f173308b, this.f173310d, Path.Direction.CW);
                    canvas.drawPath(this.f173309c, this.f173320n);
                    MethodCollector.m26664o(3638);
                } else if (this.drawPercentProgress == 0.0f) {
                    this.f173308b.set(0.0f, 0.0f, (float) getWidth(), height);
                    this.f173309c.addRoundRect(this.f173308b, this.f173310d, Path.Direction.CW);
                    canvas.drawPath(this.f173309c, this.f173320n);
                    MethodCollector.m26664o(3638);
                } else {
                    this.f173308b.set(0.0f, 0.0f, (float) getWidth(), this.f173315i);
                    RectF rectF8 = this.f173308b;
                    float f9 = this.f173315i;
                    canvas.drawRoundRect(rectF8, f9, f9, this.f173320n);
                    m135026a();
                    m135027a(EnumC77257b.BOTTOM_LEFT, this.f173315i);
                    m135027a(EnumC77257b.BOTTOM_RIGHT, this.f173315i);
                    this.f173308b.set(0.0f, this.f173315i / 2.0f, (float) getWidth(), height);
                    this.f173309c.addRoundRect(this.f173308b, this.f173310d, Path.Direction.CW);
                    canvas.drawPath(this.f173309c, this.f173320n);
                    MethodCollector.m26664o(3638);
                }
            }
        } else {
            MethodCollector.m26664o(3638);
        }
    }

    public /* synthetic */ StoryProgressBar(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    private final void m135027a(EnumC77257b bVar, float f) {
        int i = C77259b.f173331a[bVar.ordinal()];
        if (i == 1) {
            float[] fArr = this.f173310d;
            fArr[0] = f;
            fArr[1] = f;
        } else if (i == 2) {
            float[] fArr2 = this.f173310d;
            fArr2[2] = f;
            fArr2[3] = f;
        } else if (i == 3) {
            float[] fArr3 = this.f173310d;
            fArr3[4] = f;
            fArr3[5] = f;
        } else if (i == 4) {
            float[] fArr4 = this.f173310d;
            fArr4[6] = f;
            fArr4[7] = f;
        }
    }

    /* renamed from: a */
    public final void mo120862a(float f, boolean z) {
        boolean z2;
        float f2 = this.drawPercentProgress;
        if (f <= 0.0f || f > f2) {
            if (getWidth() <= 0 || getHeight() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z || !z2 || f <= f2 || f >= 1.0f) {
                ValueAnimator valueAnimator = this.f173317k;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                setDrawPercentProgress(f);
                return;
            }
            clearAnimation();
            ValueAnimator valueAnimator2 = this.f173317k;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "drawPercentProgress", f2, f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(this.f173316j);
            int i = Build.VERSION.SDK_INT;
            ofFloat.setAutoCancel(true);
            this.f173317k = ofFloat;
            ofFloat.start();
            return;
        }
        setDrawPercentProgress(f);
    }
}
