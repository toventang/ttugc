package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import dmt.viewpager.DmtRtlViewPager;
import dmt.viewpager.DmtViewPager;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gx */
public class C73751gx extends LinearLayout implements ViewPager.AbstractC1578d, ViewPager.AbstractC1579e, DmtViewPager.AbstractC88328e {

    /* renamed from: a */
    public ViewPager f165592a;

    /* renamed from: b */
    public DmtRtlViewPager f165593b;

    /* renamed from: c */
    int f165594c;

    /* renamed from: d */
    int f165595d;

    /* renamed from: e */
    int f165596e;

    /* renamed from: f */
    int f165597f;

    /* renamed from: g */
    int f165598g;

    /* renamed from: h */
    int f165599h;

    /* renamed from: i */
    DataSetObserver f165600i;

    /* renamed from: j */
    private C73753b[] f165601j;

    static {
        Covode.recordClassIndex(86489);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public void onPageSelected(int i) {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gx$a */
    class C73752a extends DataSetObserver {

        /* renamed from: a */
        PagerAdapter f165602a;

        /* renamed from: b */
        C73751gx f165603b;

        static {
            Covode.recordClassIndex(86490);
        }

        public final void onChanged() {
            if (C73751gx.this.f165592a != null) {
                C73751gx.this.f165592a.requestLayout();
            }
            if (C73751gx.this.f165593b != null) {
                C73751gx.this.f165593b.requestLayout();
            }
            this.f165603b.setUpViews(this.f165602a);
        }

        public final void onInvalidated() {
            if (C73751gx.this.f165592a != null) {
                C73751gx.this.f165592a.requestLayout();
            }
            if (C73751gx.this.f165593b != null) {
                C73751gx.this.f165593b.requestLayout();
            }
            this.f165603b.setUpViews(this.f165602a);
        }

        C73752a(C73751gx gxVar, PagerAdapter pagerAdapter) {
            this.f165602a = pagerAdapter;
            this.f165603b = gxVar;
        }
    }

    public int getCount() {
        PagerAdapter adapter;
        ViewPager viewPager = this.f165592a;
        if (viewPager != null) {
            PagerAdapter adapter2 = viewPager.getAdapter();
            if (adapter2 == null) {
                return 0;
            }
            if (adapter2 instanceof C73788q) {
                return ((C73788q) adapter2).f165656b.getCount();
            }
            return adapter2.getCount();
        }
        DmtRtlViewPager dmtRtlViewPager = this.f165593b;
        if (dmtRtlViewPager == null || (adapter = dmtRtlViewPager.getAdapter()) == null) {
            return 0;
        }
        if (adapter instanceof C73788q) {
            return ((C73788q) adapter).f165656b.getCount();
        }
        return adapter.getCount();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gx$b */
    public static class C73753b extends View {

        /* renamed from: a */
        Paint f165605a;

        /* renamed from: b */
        Paint f165606b;

        /* renamed from: c */
        int f165607c;

        /* renamed from: d */
        int f165608d;

        /* renamed from: e */
        int f165609e;

        static {
            Covode.recordClassIndex(86491);
        }

        public final void setFillAlpha(int i) {
            this.f165607c = i;
            invalidate();
        }

        public final void setStrokeAlpha(int i) {
            this.f165608d = i;
            invalidate();
        }

        public final void setSolidColor(int i) {
            this.f165605a.setColor(i);
            invalidate();
        }

        public final void setStrokeColor(int i) {
            this.f165606b.setColor(i);
            invalidate();
        }

        public final void setStrokeWidth(int i) {
            this.f165609e = i;
            this.f165606b.setStrokeWidth((float) i);
            invalidate();
        }

        public C73753b(Context context) {
            super(context);
            MethodCollector.m26663i(10297);
            Paint paint = new Paint();
            this.f165605a = paint;
            paint.setAntiAlias(true);
            this.f165605a.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            this.f165606b = paint2;
            paint2.setAntiAlias(true);
            this.f165606b.setStyle(Paint.Style.STROKE);
            MethodCollector.m26664o(10297);
        }

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            int width = getWidth() / 2;
            this.f165605a.setAlpha(this.f165607c);
            float f = (float) width;
            canvas.drawCircle(f, f, f, this.f165605a);
            this.f165606b.setAlpha(this.f165608d);
            canvas.drawCircle(f, f, (float) (width - (this.f165609e / 2)), this.f165606b);
        }
    }

    public void setOrientation(int i) {
        super.setOrientation(i);
        if (i == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    public void setUpViewPager(ViewPager viewPager) {
        Objects.requireNonNull(viewPager, "viewPager == null.");
        if (this.f165592a != null) {
            viewPager.removeOnPageChangeListener(this);
            viewPager.removeOnAdapterChangeListener(this);
        }
        this.f165592a = viewPager;
        PagerAdapter adapter = viewPager.getAdapter();
        viewPager.addOnPageChangeListener(this);
        viewPager.addOnAdapterChangeListener(this);
        if (adapter != null) {
            DataSetObserver dataSetObserver = this.f165600i;
            if (dataSetObserver != null) {
                adapter.unregisterDataSetObserver(dataSetObserver);
            }
            C73752a aVar = new C73752a(this, adapter);
            this.f165600i = aVar;
            adapter.registerDataSetObserver(aVar);
            setUpViews(adapter);
        }
    }

    public void setUpViewPager(DmtRtlViewPager dmtRtlViewPager) {
        Objects.requireNonNull(dmtRtlViewPager, "viewPager == null.");
        if (this.f165593b != null) {
            dmtRtlViewPager.mo61358b((ViewPager.AbstractC1579e) this);
            if (dmtRtlViewPager.f200496l != null) {
                dmtRtlViewPager.f200496l.remove(this);
            }
        }
        this.f165593b = dmtRtlViewPager;
        PagerAdapter adapter = dmtRtlViewPager.getAdapter();
        dmtRtlViewPager.mo61356a((ViewPager.AbstractC1579e) this);
        if (dmtRtlViewPager.f200496l == null) {
            dmtRtlViewPager.f200496l = new ArrayList();
        }
        dmtRtlViewPager.f200496l.add(this);
        if (adapter != null) {
            DataSetObserver dataSetObserver = this.f165600i;
            if (dataSetObserver != null) {
                adapter.unregisterDataSetObserver(dataSetObserver);
            }
            C73752a aVar = new C73752a(this, adapter);
            this.f165600i = aVar;
            adapter.registerDataSetObserver(aVar);
            setUpViews(adapter);
        }
    }

    public void setUpViews(PagerAdapter pagerAdapter) {
        int count;
        if (pagerAdapter instanceof C73788q) {
            count = ((C73788q) pagerAdapter).f165656b.getCount();
        } else {
            count = pagerAdapter.getCount();
        }
        removeAllViews();
        this.f165601j = new C73753b[count];
        int i = this.f165598g / 2;
        for (int i2 = 0; i2 < count; i2++) {
            C73753b bVar = new C73753b(getContext());
            bVar.setSolidColor(this.f165595d);
            bVar.setStrokeColor(this.f165596e);
            int i3 = this.f165594c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            if (getOrientation() == 1) {
                layoutParams.setMargins(0, i, 0, i);
            } else {
                layoutParams.setMargins(i, 0, i, 0);
            }
            addView(bVar, layoutParams);
            this.f165601j[i2] = bVar;
        }
    }

    public C73751gx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // dmt.viewpager.DmtViewPager.AbstractC88328e
    /* renamed from: a */
    public final void mo116221a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        DataSetObserver dataSetObserver;
        if (!(pagerAdapter == null || (dataSetObserver = this.f165600i) == null)) {
            pagerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
        if (pagerAdapter2 != null) {
            C73752a aVar = new C73752a(this, pagerAdapter2);
            this.f165600i = aVar;
            pagerAdapter2.registerDataSetObserver(aVar);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1578d
    /* renamed from: a */
    public final void mo5326a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        DataSetObserver dataSetObserver;
        if (!(pagerAdapter == null || (dataSetObserver = this.f165600i) == null)) {
            pagerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
        if (pagerAdapter2 != null) {
            C73752a aVar = new C73752a(this, pagerAdapter2);
            this.f165600i = aVar;
            pagerAdapter2.registerDataSetObserver(aVar);
        }
    }

    public C73751gx(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(11812);
        this.f165601j = new C73753b[0];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.wn, R.attr.wo, R.attr.wp, R.attr.wq, R.attr.wr, R.attr.wt}, 0, 0);
        this.f165595d = obtainStyledAttributes.getColor(1, -1);
        this.f165596e = obtainStyledAttributes.getColor(3, -1);
        this.f165594c = obtainStyledAttributes.getDimensionPixelSize(0, (int) C13628n.m24520b(context, 4.0f));
        this.f165597f = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        float f = 0.5f;
        float f2 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f2 > 0.0f && f2 <= 1.0f) {
            f = f2;
        }
        this.f165599h = (int) (f * 255.0f);
        this.f165598g = obtainStyledAttributes.getDimensionPixelSize(2, (int) C13628n.m24520b(context, 4.0f));
        obtainStyledAttributes.recycle();
        if (getOrientation() == 0) {
            setGravity(16);
            MethodCollector.m26664o(11812);
            return;
        }
        setGravity(1);
        MethodCollector.m26664o(11812);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public void onPageScrolled(int i, float f, int i2) {
        int count = getCount();
        if (count != 0) {
            if (count != this.f165601j.length) {
                ViewPager viewPager = this.f165592a;
                if (viewPager != null) {
                    setUpViews(viewPager.getAdapter());
                }
                DmtRtlViewPager dmtRtlViewPager = this.f165593b;
                if (dmtRtlViewPager != null) {
                    setUpViews(dmtRtlViewPager.getAdapter());
                }
            }
            int i3 = i % count;
            C73753b bVar = this.f165601j[i3];
            bVar.setStrokeAlpha(0);
            double d = (double) (1.0f - f);
            Double.isNaN(d);
            double d2 = (double) this.f165599h;
            Double.isNaN(d2);
            bVar.setFillAlpha((int) (((Math.sin((d * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d) + d2));
            int i4 = (i3 + 1) % count;
            C73753b bVar2 = this.f165601j[i4];
            bVar2.setStrokeAlpha(0);
            double d3 = (double) f;
            Double.isNaN(d3);
            double d4 = (double) this.f165599h;
            Double.isNaN(d4);
            bVar2.setFillAlpha((int) (((Math.sin((d3 * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d) + d4));
            for (int i5 = 0; i5 < count; i5++) {
                if (!(i5 == i3 || i5 == i4)) {
                    C73753b bVar3 = this.f165601j[i5];
                    bVar3.setStrokeAlpha(0);
                    bVar3.setFillAlpha(this.f165599h);
                }
            }
        }
    }
}
