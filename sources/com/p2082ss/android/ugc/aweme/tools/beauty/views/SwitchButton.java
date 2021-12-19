package com.p2082ss.android.ugc.aweme.tools.beauty.views;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.CompoundButton;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4096h.C77980c;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.SwitchButton */
public class SwitchButton extends CompoundButton {

    /* renamed from: c */
    private static final int[] f175266c = {16842912, 16842910, 16842919};

    /* renamed from: d */
    private static final int[] f175267d = {-16842912, 16842910, 16842919};

    /* renamed from: A */
    private RectF f175268A;

    /* renamed from: B */
    private RectF f175269B;

    /* renamed from: C */
    private RectF f175270C;

    /* renamed from: D */
    private RectF f175271D;

    /* renamed from: E */
    private Paint f175272E = new Paint(1);

    /* renamed from: F */
    private boolean f175273F;

    /* renamed from: G */
    private boolean f175274G;

    /* renamed from: H */
    private ValueAnimator f175275H;

    /* renamed from: I */
    private float f175276I;

    /* renamed from: J */
    private RectF f175277J;

    /* renamed from: K */
    private float f175278K;

    /* renamed from: L */
    private float f175279L;

    /* renamed from: M */
    private float f175280M;

    /* renamed from: N */
    private int f175281N = ViewConfiguration.get(getContext()).getScaledTouchSlop();

    /* renamed from: O */
    private int f175282O = (ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout());

    /* renamed from: P */
    private Paint f175283P;

    /* renamed from: Q */
    private CharSequence f175284Q;

    /* renamed from: R */
    private CharSequence f175285R;

    /* renamed from: S */
    private TextPaint f175286S;

    /* renamed from: T */
    private Layout f175287T;

    /* renamed from: U */
    private Layout f175288U;

    /* renamed from: V */
    private float f175289V;

    /* renamed from: W */
    private float f175290W;

    /* renamed from: a */
    public boolean f175291a;

    /* renamed from: aa */
    private int f175292aa;

    /* renamed from: ab */
    private int f175293ab;

    /* renamed from: ac */
    private int f175294ac;

    /* renamed from: ad */
    private boolean f175295ad;

    /* renamed from: ae */
    private boolean f175296ae;

    /* renamed from: af */
    private boolean f175297af;

    /* renamed from: ag */
    private RunnableC78084a f175298ag;

    /* renamed from: ah */
    private CompoundButton.OnCheckedChangeListener f175299ah;

    /* renamed from: b */
    public boolean f175300b;

    /* renamed from: e */
    private Drawable f175301e;

    /* renamed from: f */
    private Drawable f175302f;

    /* renamed from: g */
    private ColorStateList f175303g;

    /* renamed from: h */
    private ColorStateList f175304h;

    /* renamed from: i */
    private float f175305i;

    /* renamed from: j */
    private float f175306j;

    /* renamed from: k */
    private RectF f175307k;

    /* renamed from: l */
    private float f175308l;

    /* renamed from: m */
    private long f175309m;

    /* renamed from: n */
    private int f175310n;

    /* renamed from: o */
    private int f175311o;

    /* renamed from: p */
    private int f175312p;

    /* renamed from: q */
    private int f175313q;

    /* renamed from: r */
    private int f175314r;

    /* renamed from: s */
    private int f175315s;

    /* renamed from: t */
    private int f175316t;

    /* renamed from: u */
    private int f175317u;

    /* renamed from: v */
    private int f175318v;

    /* renamed from: w */
    private int f175319w;

    /* renamed from: x */
    private Drawable f175320x;

    /* renamed from: y */
    private Drawable f175321y;

    /* renamed from: z */
    private RectF f175322z;

    public float getThumbHeight() {
        return (float) this.f175312p;
    }

    public float getThumbWidth() {
        return (float) this.f175311o;
    }

    private float getProgress() {
        return this.f175276I;
    }

    public long getAnimationDuration() {
        return this.f175309m;
    }

    public ColorStateList getBackColor() {
        return this.f175303g;
    }

    public Drawable getBackDrawable() {
        return this.f175302f;
    }

    public float getBackRadius() {
        return this.f175306j;
    }

    public CharSequence getTextOff() {
        return this.f175285R;
    }

    public CharSequence getTextOn() {
        return this.f175284Q;
    }

    public ColorStateList getThumbColor() {
        return this.f175304h;
    }

    public Drawable getThumbDrawable() {
        return this.f175301e;
    }

    public RectF getThumbMargin() {
        return this.f175307k;
    }

    public float getThumbRadius() {
        return this.f175305i;
    }

    public float getThumbRangeRatio() {
        return this.f175308l;
    }

    public int getTintColor() {
        return this.f175310n;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.SwitchButton$a */
    final class RunnableC78084a implements Runnable {
        static {
            Covode.recordClassIndex(91182);
        }

        public final void run() {
            SwitchButton.this.setPressed(false);
        }

        private RunnableC78084a() {
        }

        /* synthetic */ RunnableC78084a(SwitchButton switchButton, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.SwitchButton$SavedState */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.tools.beauty.views.SwitchButton.SavedState.C780831 */

            static {
                Covode.recordClassIndex(91181);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }
        };

        /* renamed from: a */
        CharSequence f175323a;

        /* renamed from: b */
        CharSequence f175324b;

        static {
            Covode.recordClassIndex(91180);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f175323a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f175324b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f175323a, parcel, i);
            TextUtils.writeToParcel(this.f175324b, parcel, i);
        }
    }

    private boolean getStatusBasedOnPos() {
        if (getProgress() > 0.5f) {
            return true;
        }
        return false;
    }

    public PointF getBackSizeF() {
        return new PointF(this.f175268A.width(), this.f175268A.height());
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f175323a = this.f175284Q;
        savedState.f175324b = this.f175285R;
        return savedState;
    }

    static {
        Covode.recordClassIndex(91179);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        int[] iArr;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.f175273F || (colorStateList2 = this.f175304h) == null) {
            setDrawableState(this.f175301e);
        } else {
            this.f175315s = colorStateList2.getColorForState(getDrawableState(), this.f175315s);
        }
        if (isChecked()) {
            iArr = f175267d;
        } else {
            iArr = f175266c;
        }
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.f175318v = textColors.getColorForState(f175266c, defaultColor);
            this.f175319w = textColors.getColorForState(f175267d, defaultColor);
        }
        if (this.f175274G || (colorStateList = this.f175303g) == null) {
            Drawable drawable = this.f175302f;
            if (!(drawable instanceof StateListDrawable) || !this.f175291a) {
                this.f175321y = null;
            } else {
                drawable.setState(iArr);
                this.f175321y = this.f175302f.getCurrent().mutate();
            }
            setDrawableState(this.f175302f);
            Drawable drawable2 = this.f175302f;
            if (drawable2 != null) {
                this.f175320x = drawable2.getCurrent().mutate();
                return;
            }
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), this.f175316t);
        this.f175316t = colorForState;
        this.f175317u = this.f175303g.getColorForState(iArr, colorForState);
    }

    /* renamed from: a */
    private void m136496a() {
        int i;
        float paddingTop;
        float paddingLeft;
        int i2 = this.f175311o;
        if (i2 != 0 && (i = this.f175312p) != 0 && this.f175313q != 0 && this.f175314r != 0) {
            if (this.f175305i == -1.0f) {
                this.f175305i = ((float) Math.min(i2, i)) / 2.0f;
            }
            if (this.f175306j == -1.0f) {
                this.f175306j = ((float) Math.min(this.f175313q, this.f175314r)) / 2.0f;
            }
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int ceil = (int) Math.ceil((double) ((((float) this.f175313q) - Math.min(0.0f, this.f175307k.left)) - Math.min(0.0f, this.f175307k.right)));
            int ceil2 = (int) Math.ceil((double) ((((float) this.f175314r) - Math.min(0.0f, this.f175307k.top)) - Math.min(0.0f, this.f175307k.bottom)));
            if (measuredHeight <= ceil2) {
                paddingTop = ((float) getPaddingTop()) + Math.max(0.0f, this.f175307k.top);
            } else {
                paddingTop = (((float) ((measuredHeight - ceil2) + 1)) / 2.0f) + ((float) getPaddingTop()) + Math.max(0.0f, this.f175307k.top);
            }
            if (measuredWidth <= this.f175313q) {
                paddingLeft = ((float) getPaddingLeft()) + Math.max(0.0f, this.f175307k.left);
            } else {
                paddingLeft = (((float) ((measuredWidth - ceil) + 1)) / 2.0f) + ((float) getPaddingLeft()) + Math.max(0.0f, this.f175307k.left);
            }
            this.f175322z.set(paddingLeft, paddingTop, ((float) this.f175311o) + paddingLeft, ((float) this.f175312p) + paddingTop);
            float f = this.f175322z.left - this.f175307k.left;
            this.f175268A.set(f, this.f175322z.top - this.f175307k.top, ((float) this.f175313q) + f, (this.f175322z.top - this.f175307k.top) + ((float) this.f175314r));
            this.f175269B.set(this.f175322z.left, 0.0f, (this.f175268A.right - this.f175307k.right) - this.f175322z.width(), 0.0f);
            this.f175306j = Math.min(Math.min(this.f175268A.width(), this.f175268A.height()) / 2.0f, this.f175306j);
            Drawable drawable = this.f175302f;
            if (drawable != null) {
                drawable.setBounds((int) this.f175268A.left, (int) this.f175268A.top, (int) Math.ceil((double) this.f175268A.right), (int) Math.ceil((double) this.f175268A.bottom));
            }
            if (this.f175287T != null) {
                float width = (this.f175268A.left + (((((this.f175268A.width() + ((float) this.f175292aa)) - ((float) this.f175311o)) - this.f175307k.right) - ((float) this.f175287T.getWidth())) / 2.0f)) - ((float) this.f175294ac);
                float height = this.f175268A.top + ((this.f175268A.height() - ((float) this.f175287T.getHeight())) / 2.0f);
                this.f175270C.set(width, height, ((float) this.f175287T.getWidth()) + width, ((float) this.f175287T.getHeight()) + height);
            }
            if (this.f175288U != null) {
                float width2 = ((this.f175268A.right - (((((this.f175268A.width() + ((float) this.f175292aa)) - ((float) this.f175311o)) - this.f175307k.left) - ((float) this.f175288U.getWidth())) / 2.0f)) - ((float) this.f175288U.getWidth())) + ((float) this.f175294ac);
                float height2 = this.f175268A.top + ((this.f175268A.height() - ((float) this.f175288U.getHeight())) / 2.0f);
                this.f175271D.set(width2, height2, ((float) this.f175288U.getWidth()) + width2, ((float) this.f175288U.getHeight()) + height2);
            }
            this.f175296ae = true;
        }
    }

    public void setAnimationDuration(long j) {
        this.f175309m = j;
    }

    public void setFadeBack(boolean z) {
        this.f175291a = z;
    }

    public void setDrawDebugRect(boolean z) {
        this.f175300b = z;
        invalidate();
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f175299ah = onCheckedChangeListener;
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.f175303g = colorStateList;
        if (colorStateList != null) {
            setBackDrawable(null);
        }
        invalidate();
    }

    public void setBackColorRes(int i) {
        setBackColor(C0643b.m2374b(getContext(), i));
    }

    public void setBackDrawableRes(int i) {
        setBackDrawable(C0643b.m2369a(getContext(), i));
    }

    public void setBackRadius(float f) {
        this.f175306j = f;
        if (!this.f175274G) {
            invalidate();
        }
    }

    public void setTextAdjust(int i) {
        this.f175294ac = i;
        this.f175296ae = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i) {
        this.f175293ab = i;
        this.f175296ae = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i) {
        this.f175292aa = i;
        this.f175296ae = false;
        requestLayout();
        invalidate();
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.f175304h = colorStateList;
        if (colorStateList != null) {
            setThumbDrawable(null);
        }
        invalidate();
    }

    public void setThumbColorRes(int i) {
        setThumbColor(C0643b.m2374b(getContext(), i));
    }

    public void setThumbDrawableRes(int i) {
        setThumbDrawable(C0643b.m2369a(getContext(), i));
    }

    public void setThumbRadius(float f) {
        this.f175305i = f;
        if (!this.f175273F) {
            invalidate();
        }
    }

    public void setThumbRangeRatio(float f) {
        this.f175308l = f;
        this.f175296ae = false;
        requestLayout();
    }

    public void setBackDrawable(Drawable drawable) {
        boolean z;
        this.f175302f = drawable;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        this.f175274G = z;
        refreshDrawableState();
        this.f175296ae = false;
        requestLayout();
        invalidate();
    }

    public void setChecked(boolean z) {
        if (isChecked() != z) {
            m136498a(z);
        }
        if (this.f175295ad) {
            setCheckedImmediatelyNoEvent(z);
        } else {
            super.setChecked(z);
        }
    }

    public void setCheckedImmediately(boolean z) {
        float f;
        super.setChecked(z);
        ValueAnimator valueAnimator = this.f175275H;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f175275H.cancel();
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        setProgress(f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z) {
        if (this.f175299ah == null) {
            setCheckedImmediately(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z);
        super.setOnCheckedChangeListener(this.f175299ah);
    }

    public void setCheckedNoEvent(boolean z) {
        if (this.f175299ah == null) {
            setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.f175299ah);
    }

    /* access modifiers changed from: package-private */
    public void setProgress(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.f175276I = f;
        invalidate();
    }

    public void setThumbDrawable(Drawable drawable) {
        boolean z;
        this.f175301e = drawable;
        if (drawable != null) {
            z = true;
        } else {
            z = false;
        }
        this.f175273F = z;
        refreshDrawableState();
        this.f175296ae = false;
        requestLayout();
        invalidate();
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            m136497a(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            m136497a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setTintColor(int i) {
        this.f175310n = i;
        this.f175304h = C77980c.m136238a(i);
        this.f175303g = C77980c.m136239b(this.f175310n);
        this.f175274G = false;
        this.f175273F = false;
        refreshDrawableState();
        invalidate();
    }

    /* renamed from: a */
    private Layout m136495a(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT <= 23) {
            return null;
        }
        int length = charSequence.length();
        TextPaint textPaint = this.f175286S;
        return StaticLayout.Builder.obtain(charSequence, 0, length, textPaint, (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint))).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(1.1f, 0.0f).setIncludePad(false).build();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        CharSequence charSequence = savedState.f175323a;
        CharSequence charSequence2 = savedState.f175324b;
        this.f175284Q = charSequence;
        this.f175285R = charSequence2;
        this.f175287T = null;
        this.f175288U = null;
        this.f175296ae = false;
        requestLayout();
        invalidate();
        this.f175295ad = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f175295ad = false;
    }

    /* renamed from: a */
    private void m136498a(boolean z) {
        ValueAnimator valueAnimator = this.f175275H;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                this.f175275H.cancel();
            }
            this.f175275H.setDuration(this.f175309m);
            if (z) {
                this.f175275H.setFloatValues(this.f175276I, 1.0f);
            } else {
                this.f175275H.setFloatValues(this.f175276I, 0.0f);
            }
            this.f175275H.start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r1 != 3) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.beauty.views.SwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        Layout layout;
        RectF rectF;
        RectF rectF2;
        float f;
        int i3;
        Drawable drawable;
        Drawable drawable2;
        MethodCollector.m26663i(9024);
        super.onDraw(canvas);
        if (!this.f175296ae) {
            m136496a();
        }
        if (!this.f175296ae) {
            MethodCollector.m26664o(9024);
            return;
        }
        if (this.f175274G) {
            if (!this.f175291a || this.f175320x == null || this.f175321y == null) {
                this.f175302f.setAlpha(255);
                this.f175302f.draw(canvas);
            } else {
                if (isChecked()) {
                    drawable = this.f175320x;
                } else {
                    drawable = this.f175321y;
                }
                if (isChecked()) {
                    drawable2 = this.f175321y;
                } else {
                    drawable2 = this.f175320x;
                }
                int progress = (int) (getProgress() * 255.0f);
                drawable.setAlpha(progress);
                drawable.draw(canvas);
                drawable2.setAlpha(255 - progress);
                drawable2.draw(canvas);
            }
        } else if (this.f175291a) {
            if (isChecked()) {
                i = this.f175316t;
            } else {
                i = this.f175317u;
            }
            if (isChecked()) {
                i2 = this.f175317u;
            } else {
                i2 = this.f175316t;
            }
            int progress2 = (int) (getProgress() * 255.0f);
            this.f175272E.setARGB((Color.alpha(i) * progress2) / 255, Color.red(i), Color.green(i), Color.blue(i));
            RectF rectF3 = this.f175268A;
            float f2 = this.f175306j;
            canvas.drawRoundRect(rectF3, f2, f2, this.f175272E);
            int alpha = Color.alpha(i2);
            this.f175272E.setARGB((alpha * (255 - progress2)) / 255, Color.red(i2), Color.green(i2), Color.blue(i2));
            RectF rectF4 = this.f175268A;
            float f3 = this.f175306j;
            canvas.drawRoundRect(rectF4, f3, f3, this.f175272E);
            this.f175272E.setAlpha(255);
        } else {
            this.f175272E.setColor(this.f175316t);
            RectF rectF5 = this.f175268A;
            float f4 = this.f175306j;
            canvas.drawRoundRect(rectF5, f4, f4, this.f175272E);
        }
        if (((double) getProgress()) > 0.5d) {
            layout = this.f175287T;
        } else {
            layout = this.f175288U;
        }
        if (((double) getProgress()) > 0.5d) {
            rectF = this.f175270C;
        } else {
            rectF = this.f175271D;
        }
        if (!(layout == null || rectF == null)) {
            if (((double) getProgress()) < 0.25d) {
                f = 1.0f - (getProgress() * 4.0f);
            } else {
                f = 0.0f;
            }
            if (((double) getProgress()) >= 0.75d) {
                f = (getProgress() * 4.0f) - 3.0f;
            }
            int i4 = (int) (f * 255.0f);
            if (((double) getProgress()) > 0.5d) {
                i3 = this.f175318v;
            } else {
                i3 = this.f175319w;
            }
            layout.getPaint().setARGB((Color.alpha(i3) * i4) / 255, Color.red(i3), Color.green(i3), Color.blue(i3));
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            layout.draw(canvas);
            canvas.restore();
        }
        this.f175277J.set(this.f175322z);
        this.f175277J.offset(this.f175276I * this.f175269B.width(), 0.0f);
        if (this.f175273F) {
            this.f175301e.setBounds((int) this.f175277J.left, (int) this.f175277J.top, (int) Math.ceil((double) this.f175277J.right), (int) Math.ceil((double) this.f175277J.bottom));
            this.f175301e.draw(canvas);
        } else {
            this.f175272E.setColor(this.f175315s);
            RectF rectF6 = this.f175277J;
            float f5 = this.f175305i;
            canvas.drawRoundRect(rectF6, f5, f5, this.f175272E);
        }
        if (this.f175300b) {
            this.f175283P.setColor(Color.parseColor("#AA0000"));
            canvas.drawRect(this.f175268A, this.f175283P);
            this.f175283P.setColor(Color.parseColor("#0000FF"));
            canvas.drawRect(this.f175277J, this.f175283P);
            this.f175283P.setColor(Color.parseColor("#000000"));
            canvas.drawLine(this.f175269B.left, this.f175322z.top, this.f175269B.right, this.f175322z.top, this.f175283P);
            this.f175283P.setColor(Color.parseColor("#00CC00"));
            if (((double) getProgress()) > 0.5d) {
                rectF2 = this.f175270C;
            } else {
                rectF2 = this.f175271D;
            }
            canvas.drawRect(rectF2, this.f175283P);
        }
        MethodCollector.m26664o(9024);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchButton(android.content.Context r26, android.util.AttributeSet r27) {
        /*
        // Method dump skipped, instructions count: 716
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.beauty.views.SwitchButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.f175287T == null && !TextUtils.isEmpty(this.f175284Q)) {
            this.f175287T = m136495a(this.f175284Q);
        }
        if (this.f175288U == null && !TextUtils.isEmpty(this.f175285R)) {
            this.f175288U = m136495a(this.f175285R);
        }
        Layout layout = this.f175287T;
        if (layout != null) {
            f = (float) layout.getWidth();
        } else {
            f = 0.0f;
        }
        Layout layout2 = this.f175288U;
        if (layout2 != null) {
            f2 = (float) layout2.getWidth();
        } else {
            f2 = 0.0f;
        }
        if (f == 0.0f && f2 == 0.0f) {
            this.f175289V = 0.0f;
        } else {
            this.f175289V = Math.max(f, f2);
        }
        Layout layout3 = this.f175287T;
        if (layout3 != null) {
            f3 = (float) layout3.getHeight();
        } else {
            f3 = 0.0f;
        }
        Layout layout4 = this.f175288U;
        if (layout4 != null) {
            f4 = (float) layout4.getHeight();
        } else {
            f4 = 0.0f;
        }
        if (f3 == 0.0f && f4 == 0.0f) {
            this.f175290W = 0.0f;
        } else {
            this.f175290W = Math.max(f3, f4);
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (this.f175311o == 0 && this.f175273F) {
            this.f175311o = this.f175301e.getIntrinsicWidth();
        }
        int ceil = (int) Math.ceil((double) this.f175289V);
        if (this.f175308l == 0.0f) {
            this.f175308l = 1.8f;
        }
        if (mode == 1073741824) {
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i3 = this.f175311o;
            if (i3 != 0) {
                int ceil2 = (int) Math.ceil((double) (((float) i3) * this.f175308l));
                int ceil3 = (this.f175293ab + ceil) - ((ceil2 - this.f175311o) + ((int) Math.ceil((double) Math.max(this.f175307k.left, this.f175307k.right))));
                float f5 = (float) ceil2;
                int ceil4 = (int) Math.ceil((double) (this.f175307k.left + f5 + this.f175307k.right + ((float) Math.max(ceil3, 0))));
                this.f175313q = ceil4;
                if (ceil4 < 0) {
                    this.f175311o = 0;
                }
                if (f5 + Math.max(this.f175307k.left, 0.0f) + Math.max(this.f175307k.right, 0.0f) + ((float) Math.max(ceil3, 0)) > ((float) paddingLeft)) {
                    this.f175311o = 0;
                }
            }
            int ceil5 = (int) Math.ceil((double) ((((float) ((size - getPaddingLeft()) - getPaddingRight())) - Math.max(this.f175307k.left, 0.0f)) - Math.max(this.f175307k.right, 0.0f)));
            if (ceil5 < 0) {
                this.f175311o = 0;
                this.f175313q = 0;
            } else {
                float f6 = (float) ceil5;
                this.f175311o = (int) Math.ceil((double) (f6 / this.f175308l));
                int ceil6 = (int) Math.ceil((double) (f6 + this.f175307k.left + this.f175307k.right));
                this.f175313q = ceil6;
                if (ceil6 < 0) {
                    this.f175311o = 0;
                    this.f175313q = 0;
                } else {
                    int ceil7 = (ceil + this.f175293ab) - ((ceil5 - this.f175311o) + ((int) Math.ceil((double) Math.max(this.f175307k.left, this.f175307k.right))));
                    if (ceil7 > 0) {
                        this.f175311o -= ceil7;
                    }
                    if (this.f175311o < 0) {
                        this.f175311o = 0;
                        this.f175313q = 0;
                    }
                }
            }
        } else {
            if (this.f175311o == 0) {
                this.f175311o = (int) Math.ceil((double) (getResources().getDisplayMetrics().density * 20.0f));
            }
            if (this.f175308l == 0.0f) {
                this.f175308l = 1.8f;
            }
            int ceil8 = (int) Math.ceil((double) (((float) this.f175311o) * this.f175308l));
            int ceil9 = (int) Math.ceil((double) (((float) (ceil + this.f175293ab)) - ((((float) (ceil8 - this.f175311o)) + Math.max(this.f175307k.left, this.f175307k.right)) + ((float) this.f175292aa))));
            float f7 = (float) ceil8;
            int ceil10 = (int) Math.ceil((double) (this.f175307k.left + f7 + this.f175307k.right + ((float) Math.max(0, ceil9))));
            this.f175313q = ceil10;
            if (ceil10 < 0) {
                this.f175311o = 0;
                this.f175313q = 0;
            } else {
                int ceil11 = (int) Math.ceil((double) (f7 + Math.max(0.0f, this.f175307k.left) + Math.max(0.0f, this.f175307k.right) + ((float) Math.max(0, ceil9))));
                size = Math.max(ceil11, getPaddingLeft() + ceil11 + getPaddingRight());
            }
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.f175312p == 0 && this.f175273F) {
            this.f175312p = this.f175301e.getIntrinsicHeight();
        }
        if (mode2 == 1073741824) {
            int i4 = this.f175312p;
            if (i4 != 0) {
                int ceil12 = (int) Math.ceil((double) (((float) i4) + this.f175307k.top + this.f175307k.bottom));
                this.f175314r = ceil12;
                int ceil13 = (int) Math.ceil((double) Math.max((float) ceil12, this.f175290W));
                this.f175314r = ceil13;
                if ((((float) ((ceil13 + getPaddingTop()) + getPaddingBottom())) - Math.min(0.0f, this.f175307k.top)) - Math.min(0.0f, this.f175307k.bottom) > ((float) size2)) {
                    this.f175312p = 0;
                }
            }
            int ceil14 = (int) Math.ceil((double) (((float) ((size2 - getPaddingTop()) - getPaddingBottom())) + Math.min(0.0f, this.f175307k.top) + Math.min(0.0f, this.f175307k.bottom)));
            this.f175314r = ceil14;
            if (ceil14 < 0) {
                this.f175314r = 0;
                this.f175312p = 0;
            } else {
                int ceil15 = (int) Math.ceil((double) ((((float) ceil14) - this.f175307k.top) - this.f175307k.bottom));
                this.f175312p = ceil15;
                if (ceil15 < 0) {
                    this.f175314r = 0;
                    this.f175312p = 0;
                }
            }
        } else {
            if (this.f175312p == 0) {
                this.f175312p = (int) Math.ceil((double) (getResources().getDisplayMetrics().density * 20.0f));
            }
            int ceil16 = (int) Math.ceil((double) (((float) this.f175312p) + this.f175307k.top + this.f175307k.bottom));
            this.f175314r = ceil16;
            if (ceil16 < 0) {
                this.f175314r = 0;
                this.f175312p = 0;
            } else {
                int ceil17 = (int) Math.ceil((double) (this.f175290W - ((float) ceil16)));
                if (ceil17 > 0) {
                    this.f175314r += ceil17;
                    this.f175312p += ceil17;
                }
                int max = Math.max(this.f175312p, this.f175314r);
                size2 = Math.max(Math.max(max, getPaddingTop() + max + getPaddingBottom()), getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: a */
    private void m136497a(float f, float f2, float f3, float f4) {
        this.f175307k.set(f, f2, f3, f4);
        this.f175296ae = false;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m136496a();
        }
    }
}
