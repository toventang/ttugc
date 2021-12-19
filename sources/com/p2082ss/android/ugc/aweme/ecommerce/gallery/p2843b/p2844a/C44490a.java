package com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2843b.p2844a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce.sdk.p2517b.p2518a.AbstractC37530a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.indicator.NumberIndicator;
import dmt.viewpager.DmtRtlViewPager;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.b.a.a */
public final class C44490a {

    /* renamed from: a */
    public View f103707a;

    /* renamed from: b */
    public NumberIndicator f103708b;

    /* renamed from: c */
    public AbstractC37530a f103709c;

    static {
        Covode.recordClassIndex(52838);
    }

    /* renamed from: a */
    public final void mo75488a() {
        View view = this.f103707a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo75489a(int i) {
        View view = this.f103707a;
        if (view != null) {
            view.setAlpha(((float) i) / 255.0f);
        }
    }

    /* renamed from: a */
    public final void mo75490a(DmtRtlViewPager dmtRtlViewPager) {
        View view = this.f103707a;
        if (view != null) {
            view.setVisibility(0);
            int i = this.f103709c.getTransferConfig().f103765u;
            this.f103708b.setRealSize(i);
            this.f103708b.setViewPager(dmtRtlViewPager);
            if (i <= 1) {
                this.f103708b.setVisibility(8);
            } else {
                this.f103708b.setVisibility(0);
            }
        }
    }
}
