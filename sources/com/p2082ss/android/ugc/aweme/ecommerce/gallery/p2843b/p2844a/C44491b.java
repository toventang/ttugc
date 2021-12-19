package com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2843b.p2844a;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.commerce.sdk.p2517b.p2518a.AbstractC37530a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44503d;
import dmt.viewpager.DmtRtlViewPager;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.b.a.b */
public final class C44491b {

    /* renamed from: a */
    public View f103710a;

    /* renamed from: b */
    public AbstractC37530a f103711b;

    /* renamed from: c */
    public TuxTextView f103712c;

    /* renamed from: d */
    public DmtRtlViewPager f103713d;

    /* renamed from: e */
    private final ViewPager.AbstractC1579e f103714e = new ViewPager.AbstractC1579e() {
        /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2843b.p2844a.C44491b.C444921 */

        static {
            Covode.recordClassIndex(52840);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            String str;
            if (C44491b.this.f103713d.getAdapter() != null) {
                C44503d transferConfig = C44491b.this.f103711b.getTransferConfig();
                if (C13603b.m24435a((Collection) transferConfig.f103756l) || i < 0 || i >= transferConfig.f103756l.size()) {
                    str = "";
                } else {
                    str = transferConfig.f103756l.get(i);
                }
                C44491b.this.f103712c.setText(str);
            }
        }
    };

    static {
        Covode.recordClassIndex(52839);
    }

    /* renamed from: a */
    public final void mo75491a() {
        View view = this.f103710a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo75492a(DmtRtlViewPager dmtRtlViewPager) {
        if (!(dmtRtlViewPager == null || dmtRtlViewPager.getAdapter() == null)) {
            this.f103713d = dmtRtlViewPager;
            dmtRtlViewPager.mo61358b(this.f103714e);
            this.f103713d.mo61356a(this.f103714e);
            this.f103714e.onPageSelected(this.f103713d.getCurrentItem());
        }
        this.f103710a.setVisibility(0);
    }
}
