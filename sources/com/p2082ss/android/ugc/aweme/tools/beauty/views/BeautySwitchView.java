package com.p2082ss.android.ugc.aweme.tools.beauty.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView */
public class BeautySwitchView extends View {

    /* renamed from: d */
    private static final int[] f175179d = {R.attr.ag7};

    /* renamed from: l */
    private static final Property<BeautySwitchView, Float> f175180l = new Property<BeautySwitchView, Float>(Float.class, "thumbPos") {
        /* class com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView.C780671 */

        static {
            Covode.recordClassIndex(91162);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(BeautySwitchView beautySwitchView) {
            return Float.valueOf(beautySwitchView.f175181a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(BeautySwitchView beautySwitchView, Float f) {
            beautySwitchView.setThumbPosition(f.floatValue());
        }
    };

    /* renamed from: a */
    public float f175181a;

    /* renamed from: b */
    public boolean f175182b;

    /* renamed from: c */
    ObjectAnimator f175183c;

    /* renamed from: e */
    private Drawable f175184e;

    /* renamed from: f */
    private int f175185f;

    /* renamed from: g */
    private int f175186g;

    /* renamed from: h */
    private int f175187h;

    /* renamed from: i */
    private Rect f175188i;

    /* renamed from: j */
    private RectF f175189j;

    /* renamed from: k */
    private ColorStateList f175190k;

    /* renamed from: m */
    private Paint f175191m;

    /* renamed from: n */
    private int f175192n;

    /* renamed from: o */
    private AbstractC78068a f175193o;

    /* renamed from: p */
    private int f175194p;

    /* renamed from: q */
    private VelocityTracker f175195q;

    /* renamed from: r */
    private int f175196r;

    /* renamed from: s */
    private float f175197s;

    /* renamed from: t */
    private float f175198t;

    /* renamed from: u */
    private boolean f175199u;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView$a */
    public interface AbstractC78068a {
        static {
            Covode.recordClassIndex(91163);
        }

        /* renamed from: a */
        void mo121725a(boolean z);
    }

    public Drawable getThumbDrawable() {
        return this.f175184e;
    }

    public Rect getThumbRect() {
        return this.f175188i;
    }

    public int getTrackPadding() {
        return this.f175186g;
    }

    public int getTrackRadius() {
        return this.f175187h;
    }

    public ColorStateList getTrackTintList() {
        return this.f175190k;
    }

    private int getThumbScrollRange() {
        return getMeasuredWidth() - this.f175185f;
    }

    private boolean getTargetCheckedState() {
        if (this.f175181a > 0.5f) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(91161);
    }

    private int getThumbOffset() {
        float f;
        if (C0792v.m2768e(this) == 1) {
            f = 1.0f - this.f175181a;
        } else {
            f = this.f175181a;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    public void setEnableTouch(boolean z) {
        this.f175199u = z;
    }

    public void setOnCheckedChangeListener(AbstractC78068a aVar) {
        this.f175193o = aVar;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f175184e = drawable;
    }

    public void setThumbRect(Rect rect) {
        this.f175188i = rect;
    }

    public void setTrackPadding(int i) {
        this.f175186g = i;
    }

    public void setTrackRadius(int i) {
        this.f175187h = i;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f175190k = colorStateList;
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f175181a = f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f175182b) {
            mergeDrawableStates(onCreateDrawableState, f175179d);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(9011);
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        ColorStateList colorStateList = this.f175190k;
        if (colorStateList != null) {
            this.f175191m.setColor(colorStateList.getColorForState(drawableState, -65536));
        }
        this.f175189j.left = 0.0f;
        this.f175189j.right = (float) getMeasuredWidth();
        this.f175189j.top = (float) this.f175186g;
        this.f175189j.bottom = (float) (getMeasuredHeight() - this.f175186g);
        RectF rectF = this.f175189j;
        int i = this.f175187h;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f175191m);
        this.f175188i.left = getThumbOffset();
        Rect rect = this.f175188i;
        rect.right = rect.left + this.f175185f;
        Drawable drawable = this.f175184e;
        if (drawable != null) {
            drawable.setBounds(this.f175188i);
            this.f175184e.setState(drawableState);
            this.f175184e.draw(canvas);
        }
        MethodCollector.m26664o(9011);
    }

    public void setChecked(boolean z) {
        if (this.f175182b != z) {
            this.f175182b = z;
            AbstractC78068a aVar = this.f175193o;
            if (aVar != null) {
                aVar.mo121725a(z);
            }
        }
        refreshDrawableState();
        float f = 1.0f;
        if (getWindowToken() == null || !C0792v.m2788v(this)) {
            ObjectAnimator objectAnimator = this.f175183c;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!z) {
                f = 0.0f;
            }
            setThumbPosition(f);
            return;
        }
        if (!z) {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f175180l, f);
        this.f175183c = ofFloat;
        ofFloat.setDuration(250L);
        int i = Build.VERSION.SDK_INT;
        this.f175183c.setAutoCancel(true);
        this.f175183c.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != 3) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public BeautySwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(8857);
        Drawable drawable = this.f175184e;
        if (drawable == null) {
            super.onMeasure(i, i2);
            MethodCollector.m26664o(8857);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = this.f175184e.getIntrinsicHeight();
        this.f175188i.left = 0;
        this.f175188i.top = 0;
        this.f175188i.right = intrinsicWidth;
        this.f175185f = intrinsicWidth;
        this.f175188i.bottom = intrinsicHeight;
        this.f175184e.setBounds(this.f175188i);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            setMeasuredDimension(size, intrinsicHeight);
            MethodCollector.m26664o(8857);
            return;
        }
        setMeasuredDimension(intrinsicWidth * 2, intrinsicHeight);
        MethodCollector.m26664o(8857);
    }

    private BeautySwitchView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(8712);
        this.f175191m = new Paint();
        this.f175195q = VelocityTracker.obtain();
        this.f175199u = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k1, R.attr.k2, R.attr.k3, R.attr.k4});
        this.f175184e = obtainStyledAttributes.getDrawable(0);
        this.f175190k = obtainStyledAttributes.getColorStateList(3);
        this.f175186g = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f175187h = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        obtainStyledAttributes.recycle();
        this.f175191m.setAntiAlias(true);
        this.f175188i = new Rect();
        this.f175189j = new RectF();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f175192n = viewConfiguration.getScaledTouchSlop();
        this.f175194p = viewConfiguration.getScaledMinimumFlingVelocity();
        MethodCollector.m26664o(8712);
    }
}
