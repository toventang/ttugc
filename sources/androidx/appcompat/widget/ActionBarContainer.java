package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f1197a;

    /* renamed from: b */
    Drawable f1198b;

    /* renamed from: c */
    Drawable f1199c;

    /* renamed from: d */
    boolean f1200d;

    /* renamed from: e */
    boolean f1201e;

    /* renamed from: f */
    private boolean f1202f;

    /* renamed from: g */
    private View f1203g;

    /* renamed from: h */
    private View f1204h;

    /* renamed from: i */
    private View f1205i;

    /* renamed from: j */
    private int f1206j;

    static {
        Covode.recordClassIndex(367);
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public View getTabContainer() {
        return this.f1203g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1197a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1198b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1199c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1204h = findViewById(R.id.bx);
        this.f1205i = findViewById(R.id.c7);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1197a;
        if (drawable != null && drawable.isStateful()) {
            this.f1197a.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1198b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1198b.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1199c;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1199c.setState(getDrawableState());
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1202f || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f1202f = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    /* renamed from: a */
    private static boolean m1245a(View view) {
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static int m1246b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public void setTabContainer(C0395af afVar) {
        View view = this.f1203g;
        if (view != null) {
            removeView(view);
        }
        this.f1203g = afVar;
        if (afVar != null) {
            addView(afVar);
            ViewGroup.LayoutParams layoutParams = afVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            afVar.setAllowCollapse(false);
        }
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f1197a;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1198b;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1199c;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f1197a && !this.f1200d) {
            return true;
        }
        if (drawable == this.f1198b && this.f1201e) {
            return true;
        }
        if ((drawable != this.f1199c || !this.f1200d) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1197a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1197a);
        }
        this.f1197a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1204h;
            if (view != null) {
                this.f1197a.setBounds(view.getLeft(), this.f1204h.getTop(), this.f1204h.getRight(), this.f1204h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1200d ? !(this.f1197a == null && this.f1198b == null) : this.f1199c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1199c;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1199c);
        }
        this.f1199c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1200d && (drawable2 = this.f1199c) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1200d ? this.f1197a == null && this.f1198b == null : this.f1199c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1198b;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1198b);
        }
        this.f1198b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1201e && (drawable2 = this.f1198b) != null) {
                drawable2.setBounds(this.f1203g.getLeft(), this.f1203g.getTop(), this.f1203g.getRight(), this.f1203g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1200d ? !(this.f1197a == null && this.f1198b == null) : this.f1199c != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f1204h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.f1206j) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1204h != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f1203g;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m1245a(this.f1204h)) {
                    i3 = m1246b(this.f1204h);
                } else if (!m1245a(this.f1205i)) {
                    i3 = m1246b(this.f1205i);
                } else {
                    i3 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i4 = View.MeasureSpec.getSize(i2);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m1246b(this.f1203g), i4));
            }
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0792v.m2746a(this, new C0417b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ja, R.attr.jd, R.attr.je, R.attr.pj, R.attr.pk, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.qr, R.attr.re, R.attr.rg, R.attr.sf, R.attr.v_, R.attr.vg, R.attr.vq, R.attr.vr, R.attr.vu, R.attr.wm, R.attr.y1, R.attr.a3p, R.attr.a67, R.attr.a7j, R.attr.a7v, R.attr.a7w, R.attr.afv, R.attr.afy, R.attr.aiw, R.attr.aj9});
        boolean z = false;
        this.f1197a = obtainStyledAttributes.getDrawable(0);
        this.f1198b = obtainStyledAttributes.getDrawable(2);
        this.f1206j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.e5e) {
            this.f1200d = true;
            this.f1199c = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1200d ? this.f1197a == null && this.f1198b == null : this.f1199c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c0, code lost:
        if (r6 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }
}
