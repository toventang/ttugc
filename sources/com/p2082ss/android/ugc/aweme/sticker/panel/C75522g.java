package com.p2082ss.android.ugc.aweme.sticker.panel;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3043g.animationInterpolatorC52819a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.g */
public final class C75522g {

    /* renamed from: a */
    public AbstractC89172b<? super ViewGroup, ? extends C89378p<? extends View, ? extends View>> f169731a;

    /* renamed from: b */
    public AbstractC89172b<? super ViewPager, C89391z> f169732b;

    /* renamed from: c */
    public AbstractC89172b<? super TabLayout, C89391z> f169733c;

    /* renamed from: d */
    public Interpolator f169734d;

    static {
        Covode.recordClassIndex(88444);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75522g)) {
            return false;
        }
        C75522g gVar = (C75522g) obj;
        return C89219l.m154714a(this.f169731a, gVar.f169731a) && C89219l.m154714a(this.f169732b, gVar.f169732b) && C89219l.m154714a(this.f169733c, gVar.f169733c) && C89219l.m154714a(this.f169734d, gVar.f169734d);
    }

    public final int hashCode() {
        AbstractC89172b<? super ViewGroup, ? extends C89378p<? extends View, ? extends View>> bVar = this.f169731a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        AbstractC89172b<? super ViewPager, C89391z> bVar2 = this.f169732b;
        int hashCode2 = (hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        AbstractC89172b<? super TabLayout, C89391z> bVar3 = this.f169733c;
        int hashCode3 = (hashCode2 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
        Interpolator interpolator = this.f169734d;
        if (interpolator != null) {
            i = interpolator.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "StickerContentViewConfig(emptyRetryView=" + this.f169731a + ", viewPagerConfig=" + this.f169732b + ", tabLayoutConfig=" + this.f169733c + ", interpolator=" + this.f169734d + ")";
    }

    public /* synthetic */ C75522g() {
        this(new animationInterpolatorC52819a());
    }

    private C75522g(Interpolator interpolator) {
        C89219l.m154721d(interpolator, "");
        this.f169731a = null;
        this.f169732b = null;
        this.f169733c = null;
        this.f169734d = interpolator;
    }
}
