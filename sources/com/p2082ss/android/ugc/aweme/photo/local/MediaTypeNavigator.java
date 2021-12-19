package com.p2082ss.android.ugc.aweme.photo.local;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.common.p1832d.C24091i;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator */
public class MediaTypeNavigator extends RelativeLayout {

    /* renamed from: a */
    public LinearLayout f142592a;

    /* renamed from: b */
    private LinearLayout f142593b;

    /* renamed from: c */
    private ImageView f142594c;

    /* renamed from: d */
    private View f142595d;

    /* renamed from: e */
    private int f142596e;

    /* renamed from: f */
    private TuxTextView f142597f;

    static {
        Covode.recordClassIndex(73707);
    }

    public View getDividerView() {
        return this.f142595d;
    }

    public ImageView getTabIndicator() {
        return this.f142594c;
    }

    public int getTabIndicatorWidth() {
        int i = this.f142596e;
        if (i > 0) {
            return i;
        }
        throw new IllegalStateException("tabWidth not initialized, can't get tab indicator width");
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f142592a = (LinearLayout) findViewById(R.id.cdh);
        this.f142593b = (LinearLayout) findViewById(R.id.edx);
        this.f142594c = (ImageView) findViewById(R.id.bwt);
        this.f142595d = findViewById(R.id.amc);
    }

    public void setPageSelected(int i) {
        TuxTextView tuxTextView = (TuxTextView) this.f142593b.getChildAt(i).findViewById(R.id.f5g);
        TuxTextView tuxTextView2 = this.f142597f;
        if (tuxTextView2 != null) {
            tuxTextView2.setSelected(false);
            this.f142597f.setTuxFont(42);
        }
        if (tuxTextView != null) {
            tuxTextView.setSelected(true);
            tuxTextView.setTuxFont(43);
            this.f142597f = tuxTextView;
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        boolean z;
        MethodCollector.m26663i(10045);
        C24091i.m45617a(viewPager);
        C24091i.m45617a(viewPager.getAdapter());
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter.getCount() == 2) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45617a(Boolean.valueOf(z));
        this.f142596e = C13628n.m24504a(getContext()) / adapter.getCount();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f142592a.getLayoutParams();
        layoutParams.width = this.f142596e;
        this.f142592a.setLayoutParams(layoutParams);
        this.f142593b.removeAllViews();
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            RelativeLayout relativeLayout = (RelativeLayout) C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bio, this.f142593b, false);
            TuxTextView tuxTextView = (TuxTextView) relativeLayout.findViewById(R.id.f5g);
            if (i == 0) {
                this.f142597f = tuxTextView;
                tuxTextView.setSelected(true);
                tuxTextView.setTuxFont(43);
            }
            CharSequence pageTitle = adapter.getPageTitle(i);
            if (pageTitle != null && !TextUtils.isEmpty(pageTitle)) {
                tuxTextView.setText(pageTitle);
            }
            relativeLayout.setOnClickListener(new View$OnClickListenerC62877a(viewPager, i));
            this.f142593b.addView(relativeLayout);
        }
        viewPager.addOnPageChangeListener(new ViewPager.AbstractC1579e() {
            /* class com.p2082ss.android.ugc.aweme.photo.local.MediaTypeNavigator.C628761 */

            static {
                Covode.recordClassIndex(73708);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageSelected(int i) {
                MediaTypeNavigator.this.setPageSelected(i);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrolled(int i, float f, int i2) {
                float tabIndicatorWidth = ((float) MediaTypeNavigator.this.getTabIndicatorWidth()) * (((float) i) + f);
                if (C78099c.m136517a(MediaTypeNavigator.this.getContext())) {
                    tabIndicatorWidth = -tabIndicatorWidth;
                }
                MediaTypeNavigator.this.f142592a.setTranslationX(tabIndicatorWidth);
            }
        });
        MethodCollector.m26664o(10045);
    }

    public MediaTypeNavigator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(9724);
        MethodCollector.m26664o(9724);
    }
}
