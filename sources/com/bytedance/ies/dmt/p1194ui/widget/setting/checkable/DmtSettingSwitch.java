package com.bytedance.ies.dmt.p1194ui.widget.setting.checkable;

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

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch */
public class DmtSettingSwitch extends View {

    /* renamed from: d */
    private static final int[] f41433d = {R.attr.ag7};

    /* renamed from: l */
    private static final Property<DmtSettingSwitch, Float> f41434l = new Property<DmtSettingSwitch, Float>(Float.class, "thumbPos") {
        /* class com.bytedance.ies.dmt.p1194ui.widget.setting.checkable.DmtSettingSwitch.C172841 */

        static {
            Covode.recordClassIndex(19765);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(DmtSettingSwitch dmtSettingSwitch) {
            return Float.valueOf(dmtSettingSwitch.f41435a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(DmtSettingSwitch dmtSettingSwitch, Float f) {
            dmtSettingSwitch.setThumbPosition(f.floatValue());
        }
    };

    /* renamed from: a */
    public float f41435a;

    /* renamed from: b */
    public boolean f41436b;

    /* renamed from: c */
    ObjectAnimator f41437c;

    /* renamed from: e */
    private Drawable f41438e;

    /* renamed from: f */
    private int f41439f;

    /* renamed from: g */
    private int f41440g;

    /* renamed from: h */
    private int f41441h;

    /* renamed from: i */
    private Rect f41442i;

    /* renamed from: j */
    private RectF f41443j;

    /* renamed from: k */
    private ColorStateList f41444k;

    /* renamed from: m */
    private Paint f41445m;

    /* renamed from: n */
    private int f41446n;

    /* renamed from: o */
    private AbstractC17285a f41447o;

    /* renamed from: p */
    private int f41448p;

    /* renamed from: q */
    private VelocityTracker f41449q;

    /* renamed from: r */
    private int f41450r;

    /* renamed from: s */
    private float f41451s;

    /* renamed from: t */
    private float f41452t;

    /* renamed from: u */
    private boolean f41453u;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch$a */
    public interface AbstractC17285a {
        static {
            Covode.recordClassIndex(19766);
        }

        /* renamed from: a */
        void mo27515a(boolean z);
    }

    public Drawable getThumbDrawable() {
        return this.f41438e;
    }

    public Rect getThumbRect() {
        return this.f41442i;
    }

    public int getTrackPadding() {
        return this.f41440g;
    }

    public int getTrackRadius() {
        return this.f41441h;
    }

    public ColorStateList getTrackTintList() {
        return this.f41444k;
    }

    private int getThumbScrollRange() {
        return getMeasuredWidth() - this.f41439f;
    }

    private boolean getTargetCheckedState() {
        if (this.f41435a > 0.5f) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(19764);
    }

    private int getThumbOffset() {
        float f;
        if (C0792v.m2768e(this) == 1) {
            f = 1.0f - this.f41435a;
        } else {
            f = this.f41435a;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    public void setEnableTouch(boolean z) {
        this.f41453u = z;
    }

    public void setOnCheckedChangeListener(AbstractC17285a aVar) {
        this.f41447o = aVar;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f41438e = drawable;
    }

    public void setThumbRect(Rect rect) {
        this.f41442i = rect;
    }

    public void setTrackPadding(int i) {
        this.f41440g = i;
    }

    public void setTrackRadius(int i) {
        this.f41441h = i;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f41444k = colorStateList;
    }

    public DmtSettingSwitch(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f41435a = f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f41436b) {
            mergeDrawableStates(onCreateDrawableState, f41433d);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(7533);
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        ColorStateList colorStateList = this.f41444k;
        if (colorStateList != null) {
            this.f41445m.setColor(colorStateList.getColorForState(drawableState, -65536));
        }
        this.f41443j.left = 0.0f;
        this.f41443j.right = (float) getMeasuredWidth();
        this.f41443j.top = (float) this.f41440g;
        this.f41443j.bottom = (float) (getMeasuredHeight() - this.f41440g);
        RectF rectF = this.f41443j;
        int i = this.f41441h;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f41445m);
        this.f41442i.left = getThumbOffset();
        Rect rect = this.f41442i;
        rect.right = rect.left + this.f41439f;
        Drawable drawable = this.f41438e;
        if (drawable != null) {
            drawable.setBounds(this.f41442i);
            this.f41438e.setState(drawableState);
            this.f41438e.draw(canvas);
        }
        MethodCollector.m26664o(7533);
    }

    public void setChecked(boolean z) {
        if (this.f41436b != z) {
            this.f41436b = z;
            AbstractC17285a aVar = this.f41447o;
            if (aVar != null) {
                aVar.mo27515a(z);
            }
        }
        refreshDrawableState();
        float f = 1.0f;
        if (getWindowToken() == null || !C0792v.m2788v(this)) {
            ObjectAnimator objectAnimator = this.f41437c;
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
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f41434l, f);
        this.f41437c = ofFloat;
        ofFloat.setDuration(250L);
        int i = Build.VERSION.SDK_INT;
        this.f41437c.setAutoCancel(true);
        this.f41437c.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != 3) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p1194ui.widget.setting.checkable.DmtSettingSwitch.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public DmtSettingSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(7531);
        Drawable drawable = this.f41438e;
        if (drawable == null) {
            super.onMeasure(i, i2);
            MethodCollector.m26664o(7531);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = this.f41438e.getIntrinsicHeight();
        this.f41442i.left = 0;
        this.f41442i.top = 0;
        this.f41442i.right = intrinsicWidth;
        this.f41439f = intrinsicWidth;
        this.f41442i.bottom = intrinsicHeight;
        this.f41438e.setBounds(this.f41442i);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            setMeasuredDimension(size, intrinsicHeight);
            MethodCollector.m26664o(7531);
            return;
        }
        setMeasuredDimension(intrinsicWidth * 2, intrinsicHeight);
        MethodCollector.m26664o(7531);
    }

    private DmtSettingSwitch(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(7368);
        this.f41445m = new Paint();
        this.f41449q = VelocityTracker.obtain();
        this.f41453u = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ail, R.attr.ak1, R.attr.ak2, R.attr.ak3});
        this.f41438e = obtainStyledAttributes.getDrawable(0);
        this.f41444k = obtainStyledAttributes.getColorStateList(3);
        this.f41440g = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f41441h = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        obtainStyledAttributes.recycle();
        this.f41445m.setAntiAlias(true);
        this.f41442i = new Rect();
        this.f41443j = new RectF();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f41446n = viewConfiguration.getScaledTouchSlop();
        this.f41448p = viewConfiguration.getScaledMinimumFlingVelocity();
        MethodCollector.m26664o(7368);
    }
}
