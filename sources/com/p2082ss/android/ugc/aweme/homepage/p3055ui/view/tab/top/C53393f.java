package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.C53305b;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.FlippableViewPagerExt;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.f */
public final class C53393f implements AbstractC53383b, AbstractC53384c {

    /* renamed from: a */
    public final AbstractC53383b f122599a;

    /* renamed from: b */
    public final FlippableViewPagerExt f122600b;

    static {
        Covode.recordClassIndex(62956);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53384c
    /* renamed from: a */
    public final int mo89966a() {
        return this.f122600b.getCurrentItemCompat();
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53383b
    /* renamed from: k */
    public final boolean mo89965k() {
        return this.f122599a.mo89965k();
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53384c
    /* renamed from: b */
    public final Fragment mo89969b() {
        PagerAdapter adapter = this.f122600b.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.ui.MainPagerAdapter");
        return ((C53305b) adapter).mo89711a();
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53383b
    /* renamed from: b */
    public final void mo89964b(int i) {
        this.f122599a.mo89964b(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53383b
    /* renamed from: a */
    public final void mo89961a(int i) {
        this.f122599a.mo89961a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53384c
    /* renamed from: a */
    public final void mo89968a(boolean z) {
        this.f122600b.f122369a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53383b
    /* renamed from: a */
    public final boolean mo89962a(String str) {
        C89219l.m154721d(str, "");
        return this.f122599a.mo89962a(str);
    }

    public C53393f(AbstractC53383b bVar, FlippableViewPagerExt flippableViewPagerExt) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(flippableViewPagerExt, "");
        this.f122599a = bVar;
        this.f122600b = flippableViewPagerExt;
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53384c
    /* renamed from: a */
    public final void mo89967a(int i, boolean z) {
        this.f122600b.mo61355a(i, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.AbstractC53383b
    /* renamed from: a */
    public final boolean mo89963a(boolean z, String str) {
        C89219l.m154721d(str, "");
        return this.f122599a.mo89963a(z, str);
    }
}
