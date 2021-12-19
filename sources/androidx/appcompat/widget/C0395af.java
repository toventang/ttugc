package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0211a;
import androidx.appcompat.view.C0273a;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.appcompat.widget.af */
public class C0395af extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: i */
    private static final Interpolator f1528i = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f1529a;

    /* renamed from: b */
    LinearLayoutCompat f1530b;

    /* renamed from: c */
    int f1531c;

    /* renamed from: d */
    int f1532d;

    /* renamed from: e */
    int f1533e;

    /* renamed from: f */
    private Spinner f1534f;

    /* renamed from: g */
    private boolean f1535g;

    /* renamed from: h */
    private int f1536h;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* renamed from: androidx.appcompat.widget.af$a */
    class C0397a extends BaseAdapter {
        static {
            Covode.recordClassIndex(462);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            return C0395af.this.f1530b.getChildCount();
        }

        C0397a() {
        }

        public final Object getItem(int i) {
            return ((C0398b) C0395af.this.f1530b.getChildAt(i)).f1540a;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0395af afVar = C0395af.this;
                C0398b bVar = new C0398b(afVar.getContext(), (AbstractC0211a.AbstractC0213b) getItem(i));
                bVar.setBackgroundDrawable(null);
                bVar.setLayoutParams(new AbsListView.LayoutParams(-1, afVar.f1533e));
                return bVar;
            }
            C0398b bVar2 = (C0398b) view;
            bVar2.f1540a = (AbstractC0211a.AbstractC0213b) getItem(i);
            bVar2.mo1802a();
            return view;
        }
    }

    static {
        Covode.recordClassIndex(460);
    }

    /* renamed from: a */
    private boolean m1437a() {
        Spinner spinner = this.f1534f;
        if (spinner == null || spinner.getParent() != this) {
            return false;
        }
        return true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1529a;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1529a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* renamed from: b */
    private boolean m1438b() {
        if (!m1437a()) {
            return false;
        }
        removeView(this.f1534f);
        addView(this.f1530b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1534f.getSelectedItemPosition());
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.af$b */
    public class C0398b extends LinearLayout {

        /* renamed from: a */
        AbstractC0211a.AbstractC0213b f1540a;

        /* renamed from: c */
        private final int[] f1542c;

        /* renamed from: d */
        private TextView f1543d;

        /* renamed from: e */
        private ImageView f1544e;

        /* renamed from: f */
        private View f1545f;

        static {
            Covode.recordClassIndex(463);
        }

        /* renamed from: a */
        public final void mo1802a() {
            AbstractC0211a.AbstractC0213b bVar = this.f1540a;
            View c = bVar.mo433c();
            CharSequence charSequence = null;
            if (c != null) {
                ViewParent parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c);
                    }
                    addView(c);
                }
                this.f1545f = c;
                TextView textView = this.f1543d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1544e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1544e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1545f;
            if (view != null) {
                removeView(view);
                this.f1545f = null;
            }
            Drawable a = bVar.mo431a();
            CharSequence b = bVar.mo432b();
            if (a != null) {
                if (this.f1544e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1544e = appCompatImageView;
                }
                this.f1544e.setImageDrawable(a);
                this.f1544e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1544e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1544e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(b);
            if (z) {
                if (this.f1543d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.h3);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1543d = appCompatTextView;
                }
                this.f1543d.setText(b);
                this.f1543d.setVisibility(0);
            } else {
                TextView textView2 = this.f1543d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1543d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1544e;
            if (imageView3 != null) {
                imageView3.setContentDescription(bVar.mo434d());
            }
            if (!z) {
                charSequence = bVar.mo434d();
            }
            C0409an.m1520a(this, charSequence);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC0211a.AbstractC0213b.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(AbstractC0211a.AbstractC0213b.class.getName());
        }

        public final void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0395af.this.f1531c > 0 && getMeasuredWidth() > C0395af.this.f1531c) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(C0395af.this.f1531c, 1073741824), i2);
            }
        }

        public C0398b(Context context, AbstractC0211a.AbstractC0213b bVar) {
            super(context, null, R.attr.h2);
            int[] iArr = {16842964};
            this.f1542c = iArr;
            this.f1540a = bVar;
            C0405al a = C0405al.m1466a(context, null, iArr, R.attr.h2, 0);
            if (a.mo1837f(0)) {
                setBackgroundDrawable(a.mo1826a(0));
            }
            a.f1585a.recycle();
            setGravity(8388627);
            mo1802a();
        }
    }

    public void setAllowCollapse(boolean z) {
        this.f1535g = z;
    }

    public void setContentHeight(int i) {
        this.f1533e = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        boolean z;
        this.f1536h = i;
        int childCount = this.f1530b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f1530b.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.f1530b.getChildAt(i);
                Runnable runnable = this.f1529a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                RunnableC03961 r0 = new Runnable() {
                    /* class androidx.appcompat.widget.C0395af.RunnableC03961 */

                    static {
                        Covode.recordClassIndex(461);
                    }

                    public final void run() {
                        C0395af.this.smoothScrollTo(childAt2.getLeft() - ((C0395af.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        C0395af.this.f1529a = null;
                    }
                };
                this.f1529a = r0;
                post(r0);
            }
        }
        Spinner spinner = this.f1534f;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0273a a = C0273a.m938a(getContext());
        TypedArray obtainStyledAttributes = a.f891a.obtainStyledAttributes(null, new int[]{R.attr.ja, R.attr.jd, R.attr.je, R.attr.pj, R.attr.pk, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.qr, R.attr.re, R.attr.rg, R.attr.sf, R.attr.v_, R.attr.vg, R.attr.vq, R.attr.vr, R.attr.vu, R.attr.wm, R.attr.y1, R.attr.a3p, R.attr.a67, R.attr.a7j, R.attr.a7v, R.attr.a7w, R.attr.afv, R.attr.afy, R.attr.aiw, R.attr.aj9}, R.attr.h0, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = a.f891a.getResources();
        if (!a.mo739b()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.m));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f1532d = a.f891a.getResources().getDimensionPixelSize(R.dimen.n);
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.f1530b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1531c = -1;
        } else {
            if (childCount > 2) {
                this.f1531c = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1531c = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1531c = Math.min(this.f1531c, this.f1532d);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1533e, 1073741824);
        if (z || !this.f1535g) {
            m1438b();
        } else {
            this.f1530b.measure(0, makeMeasureSpec);
            if (this.f1530b.getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                m1438b();
            } else if (!m1437a()) {
                if (this.f1534f == null) {
                    C0443r rVar = new C0443r(getContext(), null, R.attr.h7);
                    rVar.setLayoutParams(new LinearLayoutCompat.C0352a(-2, -1));
                    rVar.setOnItemSelectedListener(this);
                    this.f1534f = rVar;
                }
                removeView(this.f1530b);
                addView(this.f1534f, new ViewGroup.LayoutParams(-2, -1));
                if (this.f1534f.getAdapter() == null) {
                    this.f1534f.setAdapter((SpinnerAdapter) new C0397a());
                }
                Runnable runnable = this.f1529a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                    this.f1529a = null;
                }
                this.f1534f.setSelection(this.f1536h);
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1536h);
        }
    }
}
