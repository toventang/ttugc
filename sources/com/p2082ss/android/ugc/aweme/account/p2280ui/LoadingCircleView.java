package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingCircleView */
public final class LoadingCircleView extends View {

    /* renamed from: a */
    public static final C32982a f78484a = new C32982a((byte) 0);

    /* renamed from: b */
    private int f78485b;

    /* renamed from: c */
    private float f78486c;

    /* renamed from: d */
    private float f78487d;

    /* renamed from: e */
    private boolean f78488e;

    /* renamed from: f */
    private boolean f78489f;

    /* renamed from: g */
    private Paint f78490g;

    /* renamed from: h */
    private RectF f78491h;

    /* renamed from: i */
    private final AbstractC89244h f78492i;

    static {
        Covode.recordClassIndex(39782);
    }

    public LoadingCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final RotateAnimation getRotateAnim() {
        return (RotateAnimation) this.f78492i.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingCircleView$a */
    public static final class C32982a {
        static {
            Covode.recordClassIndex(39783);
        }

        private C32982a() {
        }

        public /* synthetic */ C32982a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo58784b() {
        this.f78489f = false;
        clearAnimation();
    }

    /* renamed from: d */
    private final void m67615d() {
        if (!m67614c()) {
            startAnimation(getRotateAnim());
        }
    }

    /* renamed from: a */
    public final void mo58783a() {
        this.f78489f = true;
        if (this.f78488e) {
            m67615d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f78488e = true;
        if (this.f78489f) {
            m67615d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f78488e = false;
        clearAnimation();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingCircleView$b */
    static final class C32983b extends AbstractC89220m implements AbstractC89171a<RotateAnimation> {

        /* renamed from: a */
        public static final C32983b f78493a = new C32983b();

        static {
            Covode.recordClassIndex(39784);
        }

        C32983b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RotateAnimation invoke() {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(1000);
            return rotateAnimation;
        }
    }

    /* renamed from: c */
    private boolean m67614c() {
        if (!getRotateAnim().hasStarted() || getRotateAnim().hasEnded()) {
            return false;
        }
        return true;
    }

    public final void setLineWidth(float f) {
        this.f78490g.setStrokeWidth(f);
    }

    public final void setLoadingColor(int i) {
        this.f78490g.setColor(i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.f78491h == null) {
            float f = this.f78486c / 2.0f;
            this.f78491h = new RectF(((float) C0792v.m2770f(this)) + f, ((float) getPaddingTop()) + f, ((float) (getWidth() - C0792v.m2772g(this))) - f, ((float) (getHeight() - getPaddingBottom())) - f);
        }
        if (canvas != null) {
            RectF rectF = this.f78491h;
            if (rectF == null) {
                C89219l.m154715b();
            }
            canvas.drawArc(rectF, 0.0f, this.f78487d, false, this.f78490g);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadingCircleView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LoadingCircleView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9937);
        this.f78490g = new Paint();
        this.f78492i = C89250i.m154773a((AbstractC89171a) C32983b.f78493a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.na, R.attr.a2i, R.attr.ag1});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f78485b = obtainStyledAttributes.getColor(0, -16777216);
        this.f78486c = (float) obtainStyledAttributes.getDimensionPixelSize(1, C34728n.m70946a(5.0d));
        this.f78487d = obtainStyledAttributes.getFloat(2, 300.0f);
        obtainStyledAttributes.recycle();
        this.f78490g.setAntiAlias(true);
        this.f78490g.setStyle(Paint.Style.STROKE);
        this.f78490g.setStrokeCap(Paint.Cap.ROUND);
        setLoadingColor(this.f78485b);
        setLineWidth(this.f78486c);
        MethodCollector.m26664o(9937);
    }
}
