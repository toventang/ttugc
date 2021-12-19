package com.p2082ss.android.ugc.aweme.tux.business.story;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tux.business.story.StoryBrandView */
public final class StoryBrandView extends FrameLayout {

    /* renamed from: a */
    public AbstractC89172b<? super Float, C89391z> f178380a;

    /* renamed from: b */
    ValueAnimator f178381b;

    /* renamed from: c */
    public float f178382c;

    /* renamed from: d */
    private float f178383d;

    /* renamed from: e */
    private final int f178384e;

    /* renamed from: f */
    private final int f178385f;

    /* renamed from: g */
    private final int f178386g;

    /* renamed from: h */
    private AbstractC88412b f178387h;

    /* renamed from: i */
    private final Paint f178388i;

    /* renamed from: j */
    private EnumC79476b f178389j;

    /* renamed from: k */
    private float f178390k;

    /* renamed from: l */
    private EnumC79475a f178391l;

    /* renamed from: m */
    private RectF f178392m;

    /* renamed from: n */
    private RectF f178393n;

    /* renamed from: o */
    private float f178394o;

    /* renamed from: p */
    private LinearGradient f178395p;

    /* renamed from: q */
    private LinearGradient f178396q;

    /* renamed from: r */
    private final int f178397r;

    /* renamed from: s */
    private final int f178398s;

    /* renamed from: t */
    private final int f178399t;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tux.business.story.StoryBrandView$c */
    public static final class C79473c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C79473c f178403a = new C79473c();

        static {
            Covode.recordClassIndex(92673);
        }

        C79473c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(92669);
    }

    public StoryBrandView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public StoryBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final EnumC79475a getMode() {
        return this.f178391l;
    }

    public final Paint getPaint() {
        return this.f178388i;
    }

    public final float getProgress() {
        return this.f178390k;
    }

    public final float getRadius() {
        return this.f178394o;
    }

    public final float getRingWidth() {
        return this.f178383d;
    }

    public final EnumC79476b getThemeType() {
        return this.f178389j;
    }

    private final int getGray() {
        if (this.f178389j == EnumC79476b.CONST) {
            return this.f178398s;
        }
        return this.f178397r;
    }

    public final void setRadius(float f) {
        this.f178394o = f;
        invalidate();
    }

    public final void setThemeType(EnumC79476b bVar) {
        C89219l.m154721d(bVar, "");
        this.f178389j = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tux.business.story.StoryBrandView$a */
    public static final class C79470a<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ StoryBrandView f178400a;

        static {
            Covode.recordClassIndex(92670);
        }

        C79470a(StoryBrandView storyBrandView) {
            this.f178400a = storyBrandView;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<Float> vVar) {
            C89219l.m154721d(vVar, "");
            this.f178400a.f178380a = new AbstractC89172b<Float, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView.C79470a.C794711 */

                static {
                    Covode.recordClassIndex(92671);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Float f) {
                    float floatValue = f.floatValue();
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.mo143031a(Float.valueOf(floatValue));
                    }
                    return C89391z.f203057a;
                }
            };
        }
    }

    public final void setRingWidth(float f) {
        this.f178383d = f;
        this.f178388i.setStrokeWidth(f);
        m138195a(getWidth(), getHeight());
        invalidate();
    }

    /* renamed from: com.ss.android.ugc.aweme.tux.business.story.StoryBrandView$d */
    public static final class C79474d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StoryBrandView f178404a;

        /* renamed from: b */
        final /* synthetic */ float f178405b;

        static {
            Covode.recordClassIndex(92674);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            float f;
            StoryBrandView storyBrandView = this.f178404a;
            Float f2 = null;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj instanceof Float) {
                f2 = obj;
            }
            Float f3 = f2;
            if (f3 != null) {
                f = f3.floatValue();
            } else {
                f = this.f178405b;
            }
            storyBrandView.f178382c = f;
            this.f178404a.invalidate();
        }

        C79474d(StoryBrandView storyBrandView, float f) {
            this.f178404a = storyBrandView;
            this.f178405b = f;
        }
    }

    public final void setProgress(float f) {
        this.f178390k = f;
        if (this.f178391l == EnumC79475a.PRORGRESS) {
            float f2 = this.f178390k;
            if (f2 < this.f178382c) {
                ValueAnimator valueAnimator = this.f178381b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.f178381b;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = this.f178381b;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllListeners();
                }
                float f3 = this.f178390k;
                if (f3 == 0.0f) {
                    this.f178382c = f3;
                    invalidate();
                    return;
                }
                return;
            }
            AbstractC89172b<? super Float, C89391z> bVar = this.f178380a;
            if (bVar != null) {
                bVar.invoke(Float.valueOf(f2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tux.business.story.StoryBrandView$b */
    public static final class C79472b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ StoryBrandView f178402a;

        static {
            Covode.recordClassIndex(92672);
        }

        C79472b(StoryBrandView storyBrandView) {
            this.f178402a = storyBrandView;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ValueAnimator valueAnimator;
            Float f = (Float) obj;
            StoryBrandView storyBrandView = this.f178402a;
            C89219l.m154716b(f, "");
            float floatValue = f.floatValue();
            if (floatValue != storyBrandView.f178382c) {
                ValueAnimator valueAnimator2 = storyBrandView.f178381b;
                if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = storyBrandView.f178381b) == null)) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator3 = storyBrandView.f178381b;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllListeners();
                }
                ValueAnimator valueAnimator4 = storyBrandView.f178381b;
                if (valueAnimator4 != null) {
                    valueAnimator4.removeAllUpdateListeners();
                }
                storyBrandView.f178381b = ValueAnimator.ofFloat(storyBrandView.f178382c, floatValue);
                ValueAnimator valueAnimator5 = storyBrandView.f178381b;
                if (valueAnimator5 != null) {
                    valueAnimator5.addUpdateListener(new C79474d(storyBrandView, floatValue));
                }
                ValueAnimator valueAnimator6 = storyBrandView.f178381b;
                if (valueAnimator6 != null) {
                    valueAnimator6.setDuration((long) (Math.abs(floatValue - storyBrandView.f178382c) * 2000.0f));
                }
                ValueAnimator valueAnimator7 = storyBrandView.f178381b;
                if (valueAnimator7 != null) {
                    valueAnimator7.setInterpolator(new LinearInterpolator());
                }
                ValueAnimator valueAnimator8 = storyBrandView.f178381b;
                if (valueAnimator8 != null) {
                    valueAnimator8.start();
                }
            }
        }
    }

    public final void setMode(EnumC79475a aVar) {
        C89219l.m154721d(aVar, "");
        if (this.f178391l != aVar) {
            this.f178391l = aVar;
            AbstractC88412b bVar = this.f178387h;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f178387h = null;
            this.f178380a = null;
            if (this.f178391l == EnumC79475a.PRORGRESS) {
                setProgress(0.0f);
                AbstractC88979t d = AbstractC88979t.m154294a(new C79470a(this)).mo143291d(300, TimeUnit.MILLISECONDS);
                C89219l.m154716b(d, "");
                this.f178387h = d.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C79472b(this), C79473c.f178403a);
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        int height;
        if (canvas != null) {
            switch (C79477c.f178408a[this.f178391l.ordinal()]) {
                case 1:
                    this.f178388i.setStyle(Paint.Style.STROKE);
                    this.f178388i.setShader(null);
                    this.f178388i.setColor(getGray());
                    canvas.drawArc(this.f178392m, 0.0f, 360.0f, false, this.f178388i);
                    this.f178388i.setShader(this.f178395p);
                    this.f178388i.setColor(-16777216);
                    canvas.drawArc(this.f178392m, -90.0f, this.f178382c * 360.0f, false, this.f178388i);
                    break;
                case 2:
                    this.f178388i.setShader(this.f178395p);
                    this.f178388i.setStyle(Paint.Style.STROKE);
                    this.f178388i.setColor(-16777216);
                    canvas.drawArc(this.f178392m, -90.0f, 360.0f, false, this.f178388i);
                    break;
                case 3:
                    this.f178388i.setShader(this.f178395p);
                    this.f178388i.setStyle(Paint.Style.FILL);
                    this.f178388i.setColor(-16777216);
                    if (getWidth() < getHeight()) {
                        height = getWidth();
                    } else {
                        height = getHeight();
                    }
                    canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) height) / 2.0f, this.f178388i);
                    break;
                case 4:
                    this.f178388i.setStyle(Paint.Style.STROKE);
                    this.f178388i.setShader(null);
                    this.f178388i.setColor(getGray());
                    canvas.drawArc(this.f178392m, -90.0f, 360.0f, false, this.f178388i);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    this.f178388i.setStyle(Paint.Style.STROKE);
                    this.f178388i.setShader(null);
                    this.f178388i.setColor(this.f178399t);
                    canvas.drawArc(this.f178392m, -90.0f, 360.0f, false, this.f178388i);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    this.f178388i.setShader(this.f178395p);
                    this.f178388i.setStyle(Paint.Style.FILL);
                    this.f178388i.setColor(-16777216);
                    RectF rectF = this.f178393n;
                    float f = this.f178394o;
                    canvas.drawRoundRect(rectF, f, f, this.f178388i);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    this.f178388i.setShader(this.f178396q);
                    this.f178388i.setStyle(Paint.Style.FILL);
                    this.f178388i.setColor(-16777216);
                    RectF rectF2 = this.f178393n;
                    float f2 = this.f178394o;
                    canvas.drawRoundRect(rectF2, f2, f2, this.f178388i);
                    this.f178388i.setShader(null);
                    this.f178388i.setColor(Color.parseColor("#33000000"));
                    RectF rectF3 = this.f178393n;
                    float f3 = this.f178394o;
                    canvas.drawRoundRect(rectF3, f3, f3, this.f178388i);
                    break;
            }
            super.dispatchDraw(canvas);
        }
    }

    /* renamed from: a */
    private final void m138195a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            RectF rectF = this.f178392m;
            rectF.left = this.f178383d / 2.0f;
            rectF.top = (this.f178383d / 2.0f) + 0.0f;
            float f = (float) i;
            rectF.right = f - (this.f178383d / 2.0f);
            float f2 = (float) i2;
            rectF.bottom = f2 - (this.f178383d / 2.0f);
            RectF rectF2 = this.f178393n;
            rectF2.left = 0.0f;
            rectF2.top = 0.0f;
            rectF2.right = f;
            rectF2.bottom = f2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ StoryBrandView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryBrandView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        int i;
        EnumC79475a aVar;
        EnumC79476b bVar;
        C89219l.m154721d(context, "");
        int i2 = 0;
        MethodCollector.m26663i(18);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f178383d = TypedValue.applyDimension(1, 1.5f, system.getDisplayMetrics());
        this.f178384e = Color.parseColor("#10B7FF");
        this.f178385f = Color.parseColor("#20D5EC");
        this.f178386g = Color.parseColor("#17E9B6");
        Paint paint = new Paint();
        paint.setStrokeWidth(this.f178383d);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f178388i = paint;
        this.f178389j = EnumC79476b.LIGHT;
        this.f178391l = EnumC79475a.BRAND_RING;
        this.f178392m = new RectF();
        this.f178393n = new RectF();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ld, R.attr.a8n, R.attr.a_8, R.attr.aij}, 0, 0);
            C89219l.m154716b(obtainStyledAttributes, "");
            setRadius((float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
            switch (obtainStyledAttributes.getInt(0, 1)) {
                case 0:
                    aVar = EnumC79475a.PRORGRESS;
                    break;
                case 1:
                    aVar = EnumC79475a.BRAND_RING;
                    break;
                case 2:
                    aVar = EnumC79475a.GRAY_RING;
                    break;
                case 3:
                    aVar = EnumC79475a.RED_RING;
                    break;
                case 4:
                    aVar = EnumC79475a.BRAND_FILL_CIRCLE;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    aVar = EnumC79475a.BRAND_BACKGROUND;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    aVar = EnumC79475a.GUIDE_BACKGROUND;
                    break;
                default:
                    aVar = EnumC79475a.BRAND_RING;
                    break;
            }
            setMode(aVar);
            int i3 = obtainStyledAttributes.getInt(3, 0);
            if (i3 == 0) {
                bVar = EnumC79476b.LIGHT;
            } else if (i3 == 1) {
                bVar = EnumC79476b.DARK;
            } else if (i3 != 2) {
                bVar = EnumC79476b.LIGHT;
            } else {
                bVar = EnumC79476b.CONST;
            }
            this.f178389j = bVar;
            float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(2, 0);
            if (dimensionPixelSize <= 0.0f) {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                dimensionPixelSize = TypedValue.applyDimension(1, 1.5f, system2.getDisplayMetrics());
            }
            setRingWidth(dimensionPixelSize);
            obtainStyledAttributes.recycle();
        }
        Integer a = C23155d.m43641a(context, R.attr.an);
        if (a != null) {
            i = a.intValue();
        } else {
            i = 0;
        }
        this.f178397r = i;
        Integer a2 = C23155d.m43641a(context, R.attr.a9);
        this.f178398s = a2 != null ? a2.intValue() : i2;
        this.f178399t = Color.parseColor("#FF4C3A");
        MethodCollector.m26664o(18);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m138195a(i, i2);
        if (i > 0 && i2 > 0) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int[] iArr = new int[3];
            int i5 = 0;
            int i6 = 0;
            loop0:
            while (true) {
                int i7 = this.f178384e;
                while (true) {
                    iArr[i6] = i7;
                    i6++;
                    if (i6 >= 3) {
                        break loop0;
                    } else if (i6 != 0) {
                        if (i6 != 1) {
                            i7 = this.f178386g;
                        } else {
                            i7 = this.f178385f;
                        }
                    }
                }
            }
            float[] fArr = new float[3];
            int i8 = 0;
            loop2:
            while (true) {
                float f = 0.0f;
                while (true) {
                    fArr[i8] = f;
                    i8++;
                    f = 1.0f;
                    if (i8 >= 3) {
                        break loop2;
                    } else if (i8 != 0) {
                        if (i8 == 1) {
                            f = 0.5f;
                        }
                    }
                }
            }
            this.f178395p = new LinearGradient(0.0f, 0.0f, width, height, iArr, fArr, Shader.TileMode.CLAMP);
            float width2 = (float) getWidth();
            float height2 = (float) getHeight();
            int[] iArr2 = new int[3];
            int i9 = 0;
            loop4:
            while (true) {
                int i10 = this.f178384e;
                while (true) {
                    iArr2[i9] = i10;
                    i9++;
                    if (i9 >= 3) {
                        break loop4;
                    } else if (i9 != 0) {
                        if (i9 != 1) {
                            i10 = this.f178386g;
                        } else {
                            i10 = this.f178385f;
                        }
                    }
                }
            }
            float[] fArr2 = new float[3];
            while (true) {
                float f2 = 0.0f;
                while (true) {
                    fArr2[i5] = f2;
                    i5++;
                    if (i5 >= 3) {
                        this.f178396q = new LinearGradient(0.0f, 0.0f, width2, height2, iArr2, fArr2, Shader.TileMode.CLAMP);
                        return;
                    } else if (i5 != 0) {
                        if (i5 != 1) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.53f;
                        }
                    }
                }
            }
        }
    }
}
