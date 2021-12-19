package com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.indicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import dmt.viewpager.DmtRtlViewPager;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.view.indicator.NumberIndicator */
public class NumberIndicator extends TuxTextView {

    /* renamed from: a */
    public DmtRtlViewPager f103928a;

    /* renamed from: b */
    public int f103929b;

    /* renamed from: e */
    private final ViewPager.AbstractC1579e f103930e;

    static {
        Covode.recordClassIndex(52888);
    }

    public int getCurrentItem() {
        DmtRtlViewPager dmtRtlViewPager = this.f103928a;
        if (dmtRtlViewPager != null) {
            return dmtRtlViewPager.getCurrentItem() % this.f103929b;
        }
        return -1;
    }

    public void setRealSize(int i) {
        if (i > 0) {
            this.f103929b = i;
        }
    }

    public void setViewPager(DmtRtlViewPager dmtRtlViewPager) {
        if (dmtRtlViewPager != null && dmtRtlViewPager.getAdapter() != null) {
            this.f103928a = dmtRtlViewPager;
            dmtRtlViewPager.mo61358b(this.f103930e);
            this.f103928a.mo61356a(this.f103930e);
            this.f103930e.onPageSelected(this.f103928a.getCurrentItem());
        }
    }

    public NumberIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NumberIndicator(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.f103930e = new ViewPager.AbstractC1579e() {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.indicator.NumberIndicator.C445381 */

            static {
                Covode.recordClassIndex(52889);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageSelected(int i) {
                if (NumberIndicator.this.f103928a.getAdapter() != null && NumberIndicator.this.f103929b > 0) {
                    NumberIndicator.this.setText(C1764a.m5929a(Locale.getDefault(), "%s/%s", new Object[]{Integer.valueOf((i % NumberIndicator.this.f103929b) + 1), Integer.valueOf(NumberIndicator.this.f103929b)}));
                }
            }
        };
        setTextColor(C0643b.m2378c(getContext(), R.color.a_));
        setTuxFont(33);
    }
}
