package com.p2082ss.android.ugc.aweme.qna;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.a */
public final class C65883a implements ViewPager.AbstractC1579e {

    /* renamed from: a */
    public final C66015b f148452a;

    static {
        Covode.recordClassIndex(77388);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageSelected(int i) {
        this.f148452a.mo105076b(i);
    }

    public C65883a(C66015b bVar) {
        C89219l.m154721d(bVar, "");
        this.f148452a = bVar;
    }
}
