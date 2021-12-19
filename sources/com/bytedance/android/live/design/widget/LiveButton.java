package com.bytedance.android.live.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.C0792v;
import androidx.core.widget.C0823h;
import com.bytedance.android.live.design.C4080c;
import com.bytedance.android.live.design.widget.p235b.C4124b;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class LiveButton extends ShapeControllableConstraintLayout {

    /* renamed from: A */
    private Drawable f11477A;

    /* renamed from: B */
    private boolean f11478B;

    /* renamed from: C */
    private boolean f11479C;

    /* renamed from: D */
    private int f11480D;

    /* renamed from: E */
    private C4124b f11481E;

    /* renamed from: F */
    private int f11482F;

    /* renamed from: g */
    public LiveTextView f11483g;

    /* renamed from: h */
    public ValueAnimator f11484h;

    /* renamed from: i */
    public boolean f11485i;

    /* renamed from: j */
    public View f11486j;

    /* renamed from: k */
    public int f11487k;

    /* renamed from: l */
    public int f11488l;

    /* renamed from: m */
    private int f11489m;

    /* renamed from: n */
    private int f11490n;

    /* renamed from: o */
    private int f11491o;

    /* renamed from: p */
    private int f11492p;

    /* renamed from: q */
    private CharSequence f11493q;

    /* renamed from: r */
    private Drawable f11494r;

    /* renamed from: s */
    private Drawable f11495s;

    /* renamed from: t */
    private ColorStateList f11496t;

    /* renamed from: u */
    private TextView.BufferType f11497u;

    /* renamed from: v */
    private int f11498v;

    /* renamed from: w */
    private TextPaint f11499w;

    /* renamed from: x */
    private Paint f11500x;

    /* renamed from: y */
    private int f11501y;

    /* renamed from: z */
    private boolean f11502z;

    static {
        Covode.recordClassIndex(4673);
    }

    public CharSequence getText() {
        return this.f11493q;
    }

    /* renamed from: d */
    private void m10005d() {
        Drawable drawable = this.f11495s;
        if (drawable != null) {
            C0705a.m2500a(drawable, this.f11479C);
            this.f11495s.invalidateSelf();
        }
    }

    private int getIconExtra() {
        if (this.f11495s == null) {
            return 0;
        }
        return this.f11489m + this.f11498v;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11484h.cancel();
    }

    /* renamed from: b */
    public final void mo9139b() {
        if (this.f11485i) {
            this.f11486j.setVisibility(this.f11487k);
            this.f11483g.setVisibility(this.f11488l);
            this.f11485i = false;
            this.f11484h.cancel();
            invalidate();
        }
    }

    @Override // com.bytedance.android.live.design.widget.tintable.C4134c
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11477A;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            this.f11477A.invalidateSelf();
        }
        invalidate();
    }

    /* renamed from: c */
    private void m10004c() {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f11483g.getLayoutParams();
        if (this.f11495s == null) {
            i = 0;
        } else {
            i = this.f11489m + this.f11498v;
        }
        int maxWidth = ((((getMaxWidth() - getPaddingLeft()) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) - i;
        this.f11480D = maxWidth;
        this.f11483g.setMaxWidth(maxWidth);
    }

    /* renamed from: e */
    private void m10006e() {
        int i;
        this.f11483g.setText(this.f11493q, this.f11497u);
        if (TextUtils.isEmpty(this.f11493q)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f11485i) {
            if (i == 8) {
                this.f11483g.setVisibility(8);
            }
            this.f11488l = i;
        } else {
            this.f11483g.setVisibility(i);
        }
        requestLayout();
    }

    public LiveButton(Context context) {
        this(context, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        m10004c();
    }

    public void setText(CharSequence charSequence) {
        this.f11493q = charSequence;
        m10006e();
    }

    @Override // com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableConstraintLayout
    public void draw(Canvas canvas) {
        boolean a = this.f11481E.mo9630a(canvas);
        super.draw(canvas);
        C4124b.m10013a(canvas, a);
    }

    public void setIcon(int i) {
        setIcon(C0196a.m619b(getContext(), i));
    }

    public void setIconAutoMirrored(boolean z) {
        if (this.f11479C != z) {
            this.f11479C = z;
            m10005d();
        }
    }

    public void setIconSize(int i) {
        if (i != this.f11489m) {
            this.f11489m = i;
            ViewGroup.LayoutParams layoutParams = this.f11486j.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.f11486j.setLayoutParams(layoutParams);
            m10004c();
            requestLayout();
        }
    }

    public void setText(int i) {
        this.f11493q = getContext().getResources().getText(i);
        m10006e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f11485i && this.f11477A != null) {
            C0792v.m2772g(this);
            canvas.save();
            canvas.translate(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f);
            canvas.rotate(((Float) this.f11484h.getAnimatedValue()).floatValue());
            this.f11477A.draw(canvas);
            canvas.restore();
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f11494r != drawable) {
            this.f11494r = drawable;
            int i = 0;
            if (drawable != null) {
                if (!drawable.isStateful()) {
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{-16842910}, drawable);
                    stateListDrawable.addState(StateSet.WILD_CARD, drawable);
                    this.f11495s = stateListDrawable;
                } else {
                    this.f11495s = drawable;
                }
                m10005d();
                C0792v.m2746a(this.f11486j, this.f11495s);
            } else {
                this.f11495s = null;
                C0792v.m2746a(this.f11486j, (Drawable) null);
                i = 8;
            }
            if (this.f11485i) {
                if (i == 8) {
                    this.f11486j.setVisibility(8);
                }
                this.f11487k = i;
            } else {
                this.f11486j.setVisibility(i);
            }
            m10004c();
            requestLayout();
        }
    }

    /* renamed from: b */
    public final void mo9603b(int i) {
        if (this.f11482F != i) {
            this.f11482F = i;
            mo9815d(i);
            mo9640c(i);
            this.f11481E.mo9629a(i);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, new int[]{16842766, 16842804, 16842884, 16842904, 16842964, 16842966, 16842968, 16843039, 16843071, 16843072, 16843087, R.attr.iq, R.attr.ir, R.attr.it, R.attr.vu, R.attr.vv, R.attr.w1, R.attr.w4, R.attr.a3i});
            m10000a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m10000a(TypedArray typedArray) {
        setMaxWidth(Integer.MAX_VALUE);
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == 4) {
                Drawable drawable = typedArray.getDrawable(4);
                if (drawable != null) {
                    C0792v.m2746a(this, drawable);
                }
            } else if (index == 5) {
                setPadding(typedArray.getDimensionPixelSize(index, 0), getPaddingTop(), getPaddingRight(), getPaddingBottom());
                m10004c();
            } else if (index == 6) {
                setPadding(getPaddingLeft(), getPaddingTop(), typedArray.getDimensionPixelSize(index, 0), getPaddingBottom());
                m10004c();
            } else if (index == 1) {
                int resourceId = typedArray.getResourceId(index, 0);
                if (resourceId != 0) {
                    C0823h.m2907a(this.f11483g, resourceId);
                }
            } else if (index == 10) {
                setText(typedArray.getText(index));
            } else if (index == 3) {
                ColorStateList a = C4080c.m9890a(getContext(), typedArray, index);
                if (a != null) {
                    this.f11483g.setTextColor(a);
                }
            } else if (index == 0) {
                setEnabled(typedArray.getBoolean(index, isEnabled()));
            } else if (index == 14) {
                int resourceId2 = typedArray.getResourceId(index, 0);
                if (resourceId2 != 0) {
                    setIcon(C0196a.m619b(getContext(), resourceId2));
                } else {
                    setIcon((Drawable) null);
                }
            } else if (index == 17) {
                ColorStateList a2 = C4080c.m9890a(getContext(), typedArray, index);
                this.f11496t = a2;
                if (a2 != null) {
                    C0792v.m2743a(this.f11486j, a2);
                    Drawable drawable2 = this.f11477A;
                    if (drawable2 != null) {
                        C0705a.m2496a(drawable2, this.f11496t);
                    }
                }
            } else if (index == 16) {
                setIconSize(typedArray.getDimensionPixelSize(index, 0));
            } else if (index == 9) {
                setMinHeight(typedArray.getDimensionPixelSize(index, 0));
            } else if (index == 8) {
                setMinWidth(typedArray.getDimensionPixelSize(index, 0));
            } else if (index == 7) {
                setMaxWidth(typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE));
            } else if (index == 12) {
                this.f11490n = typedArray.getDimensionPixelSize(12, 0);
            } else if (index == 11) {
                this.f11491o = typedArray.getDimensionPixelSize(11, 0);
            } else if (index == 13) {
                this.f11492p = typedArray.getDimensionPixelSize(13, 0);
            } else if (index == 18) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(18, 0);
                this.f11501y = dimensionPixelSize;
                this.f11477A.setBounds((-dimensionPixelSize) / 2, (-dimensionPixelSize) / 2, dimensionPixelSize / 2, dimensionPixelSize / 2);
            } else if (index == 15) {
                setIconAutoMirrored(typedArray.getBoolean(15, true));
            }
        }
    }

    public LiveButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private StaticLayout m9999a(CharSequence charSequence, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return m10002b(charSequence, i);
        }
        return m10003c(charSequence, i);
    }

    /* renamed from: a */
    private static boolean m10001a(Layout layout, CharSequence charSequence) {
        if (layout.getLineCount() == 1 && layout.getLineEnd(layout.getLineCount() - 1) == charSequence.length()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private StaticLayout m10003c(CharSequence charSequence, int i) {
        return new StaticLayout(charSequence, this.f11499w, i, Layout.Alignment.ALIGN_NORMAL, this.f11483g.getLineSpacingMultiplier(), this.f11483g.getLineSpacingExtra(), this.f11483g.getIncludeFontPadding());
    }

    /* renamed from: b */
    private StaticLayout m10002b(CharSequence charSequence, int i) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f11499w, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(this.f11483g.getLineSpacingExtra(), this.f11483g.getLineSpacingMultiplier()).setIncludePad(this.f11483g.getIncludeFontPadding()).setBreakStrategy(this.f11483g.getBreakStrategy()).setHyphenationFrequency(this.f11483g.getHyphenationFrequency()).setMaxLines(this.f11483g.getMaxLines()).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c1, code lost:
        if (r1 != 1) goto L_0x00c3;
     */
    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 558
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.widget.LiveButton.onMeasure(int, int):void");
    }

    private LiveButton(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.f11490n = -1;
        this.f11491o = -1;
        this.f11492p = -1;
        this.f11497u = TextView.BufferType.NORMAL;
        this.f11479C = true;
        this.f11480D = Integer.MAX_VALUE;
        this.f11498v = context.getResources().getDimensionPixelSize(R.dimen.u_);
        inflate(context, R.layout.baj, this);
        this.f11486j = findViewById(R.id.eos);
        this.f11483g = (LiveTextView) findViewById(R.id.epy);
        Drawable b2 = C0196a.m619b(getContext(), R.drawable.c1u);
        if (b2 != null) {
            Drawable e = C0705a.m2506e(b2);
            this.f11477A = e;
            e.mutate();
            this.f11477A.setState(getDrawableState());
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f11484h = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.f11484h.setDuration(1000L);
        this.f11484h.setInterpolator(new LinearInterpolator());
        this.f11484h.addUpdateListener(new C4122b(this));
        C4124b bVar = new C4124b(this);
        this.f11481E = bVar;
        bVar.mo9537a(attributeSet, 0, 0);
        if (attributeSet != null) {
            this.f11482F = attributeSet.getAttributeResourceValue(null, "style", 0);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16842804, 16842884, 16842904, 16842964, 16842966, 16842968, 16843039, 16843071, 16843072, 16843087, R.attr.iq, R.attr.ir, R.attr.it, R.attr.vu, R.attr.vv, R.attr.w1, R.attr.w4, R.attr.a3i}, 0, 0);
        m10000a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
