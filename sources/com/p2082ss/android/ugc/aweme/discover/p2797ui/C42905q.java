package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.q */
public final class C42905q implements ViewPager.AbstractC1579e {

    /* renamed from: a */
    public final C42906r f100049a;

    static {
        Covode.recordClassIndex(51010);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C42905q(C42906r rVar) {
        C89219l.m154721d(rVar, "");
        this.f100049a = rVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageSelected(int i) {
        boolean z;
        int i2 = 0;
        for (T t : this.f100049a.f100051a) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            if (i2 != i) {
                z = true;
            } else {
                z = false;
            }
            t2.mo73058a(z, false);
            i2 = i3;
        }
        this.f100049a.mo73133c(i);
        AbstractC42874l b = this.f100049a.mo73131b(i);
        if (b != null) {
            this.f100049a.mo73130a(b, false);
        }
    }
}
