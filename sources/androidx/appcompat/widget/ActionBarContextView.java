package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.AbstractC0274b;
import androidx.appcompat.view.menu.C0302h;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.C0807z;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class ActionBarContextView extends AbstractC0379a {

    /* renamed from: g */
    public boolean f1207g;

    /* renamed from: h */
    private CharSequence f1208h;

    /* renamed from: i */
    private CharSequence f1209i;

    /* renamed from: j */
    private View f1210j;

    /* renamed from: k */
    private View f1211k;

    /* renamed from: l */
    private LinearLayout f1212l;

    /* renamed from: m */
    private TextView f1213m;

    /* renamed from: n */
    private TextView f1214n;

    /* renamed from: o */
    private int f1215o;

    /* renamed from: p */
    private int f1216p;

    /* renamed from: q */
    private int f1217q;

    static {
        Covode.recordClassIndex(368);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public CharSequence getSubtitle() {
        return this.f1209i;
    }

    public CharSequence getTitle() {
        return this.f1208h;
    }

    /* renamed from: b */
    public final void mo1203b() {
        if (this.f1210j == null) {
            mo1204c();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // androidx.appcompat.widget.AbstractC0379a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0379a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // androidx.appcompat.widget.AbstractC0379a
    /* renamed from: a */
    public final boolean mo1202a() {
        if (this.f1461d != null) {
            return this.f1461d.mo1278e();
        }
        return false;
    }

    /* renamed from: c */
    public final void mo1204c() {
        removeAllViews();
        this.f1211k = null;
        this.f1460c = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1461d != null) {
            this.f1461d.mo1279g();
            this.f1461d.mo1281i();
        }
    }

    /* renamed from: d */
    private void m1247d() {
        int i;
        if (this.f1212l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.a2, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1212l = linearLayout;
            this.f1213m = (TextView) linearLayout.findViewById(R.id.c3);
            this.f1214n = (TextView) this.f1212l.findViewById(R.id.c2);
            if (this.f1215o != 0) {
                this.f1213m.setTextAppearance(getContext(), this.f1215o);
            }
            if (this.f1216p != 0) {
                this.f1214n.setTextAppearance(getContext(), this.f1216p);
            }
        }
        this.f1213m.setText(this.f1208h);
        this.f1214n.setText(this.f1209i);
        boolean z = !TextUtils.isEmpty(this.f1208h);
        boolean z2 = !TextUtils.isEmpty(this.f1209i);
        TextView textView = this.f1214n;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout2 = this.f1212l;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f1212l.getParent() == null) {
            addView(this.f1212l);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0379a
    public void setContentHeight(int i) {
        this.f1462e = i;
    }

    @Override // androidx.appcompat.widget.AbstractC0379a
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AbstractC0379a
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0379a
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1209i = charSequence;
        m1247d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1208h = charSequence;
        m1247d();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1207g) {
            requestLayout();
        }
        this.f1207g = z;
    }

    public void setCustomView(View view) {
        View view2 = this.f1211k;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1211k = view;
        if (view != null) {
            LinearLayout linearLayout = this.f1212l;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.f1212l = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1208h);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: a */
    public final void mo1201a(final AbstractC0274b bVar) {
        View view = this.f1210j;
        if (view == null) {
            View a = C1764a.m5927a(LayoutInflater.from(getContext()), this.f1217q, this, false);
            this.f1210j = a;
            addView(a);
        } else if (view.getParent() == null) {
            addView(this.f1210j);
        }
        this.f1210j.findViewById(R.id.cf).setOnClickListener(new View.OnClickListener() {
            /* class androidx.appcompat.widget.ActionBarContextView.View$OnClickListenerC03301 */

            static {
                Covode.recordClassIndex(369);
            }

            public final void onClick(View view) {
                bVar.mo621c();
            }
        });
        C0302h hVar = (C0302h) bVar.mo618b();
        if (this.f1461d != null) {
            this.f1461d.mo1280h();
        }
        this.f1461d = new ActionMenuPresenter(getContext());
        this.f1461d.mo1277d();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        hVar.mo955a(this.f1461d, this.f1459b);
        this.f1460c = (ActionMenuView) this.f1461d.mo890a(this);
        C0792v.m2746a(this.f1460c, (Drawable) null);
        addView(this.f1460c, layoutParams);
    }

    @Override // androidx.appcompat.widget.AbstractC0379a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0807z mo1200a(int i, long j) {
        return super.mo1200a(i, j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size;
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size2 = View.MeasureSpec.getSize(i);
            if (this.f1462e > 0) {
                size = this.f1462e;
            } else {
                size = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size2 - getPaddingLeft()) - getPaddingRight();
            int i6 = size - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            View view = this.f1210j;
            if (view != null) {
                int a = m1395a(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1210j.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f1460c != null && this.f1460c.getParent() == this) {
                paddingLeft = m1395a(this.f1460c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f1212l;
            if (linearLayout != null && this.f1211k == null) {
                if (this.f1207g) {
                    this.f1212l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1212l.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                        paddingLeft -= measuredWidth;
                    } else {
                        z = false;
                    }
                    LinearLayout linearLayout2 = this.f1212l;
                    if (z) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    linearLayout2.setVisibility(i4);
                } else {
                    paddingLeft = m1395a(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f1211k;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams.width != -2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i5 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i6 = Math.min(layoutParams.height, i6);
                }
                this.f1211k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i6, i5));
            }
            if (this.f1462e <= 0) {
                int childCount = getChildCount();
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i7) {
                        i7 = measuredHeight;
                    }
                }
                setMeasuredDimension(size2, i7);
                return;
            }
            setMeasuredDimension(size2, size);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    private ActionBarContextView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.hl);
        C0405al a = C0405al.m1466a(context, attributeSet, new int[]{R.attr.ja, R.attr.jd, R.attr.o4, R.attr.v_, R.attr.afy, R.attr.aj9}, R.attr.hl, 0);
        C0792v.m2746a(this, a.mo1826a(0));
        this.f1215o = a.mo1838g(5, 0);
        this.f1216p = a.mo1838g(4, 0);
        this.f1462e = a.mo1836f(3, 0);
        this.f1217q = a.mo1838g(2, R.layout.a7);
        a.f1585a.recycle();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean a = C0415ar.m1540a(this);
        if (a) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1210j;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1210j.getLayoutParams();
            if (a) {
                i5 = marginLayoutParams.rightMargin;
                i6 = marginLayoutParams.leftMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
                i6 = marginLayoutParams.rightMargin;
            }
            int a2 = m1394a(paddingLeft, i5, a);
            paddingLeft = m1394a(a2 + m1396a(this.f1210j, a2, paddingTop, paddingTop2, a), i6, a);
        }
        LinearLayout linearLayout = this.f1212l;
        if (!(linearLayout == null || this.f1211k != null || linearLayout.getVisibility() == 8)) {
            paddingLeft += m1396a(this.f1212l, paddingLeft, paddingTop, paddingTop2, a);
        }
        View view2 = this.f1211k;
        if (view2 != null) {
            m1396a(view2, paddingLeft, paddingTop, paddingTop2, a);
        }
        if (a) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        if (this.f1460c != null) {
            m1396a(this.f1460c, paddingRight, paddingTop, paddingTop2, !a);
        }
    }
}
