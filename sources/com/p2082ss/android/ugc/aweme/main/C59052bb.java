package com.p2082ss.android.ugc.aweme.main;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.p122a.C2541b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34700p;
import com.p2082ss.android.ugc.aweme.base.p2379ui.ScrollableViewPager;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.profile.C63810k;

/* renamed from: com.ss.android.ugc.aweme.main.bb */
public class C59052bb implements AbstractC59108o {

    /* renamed from: a */
    private Context f134427a;

    /* renamed from: b */
    private ScrollableViewPager f134428b;

    /* renamed from: c */
    private C34700p f134429c;

    /* renamed from: d */
    private ScrollSwitchStateManager f134430d;

    /* renamed from: e */
    private HomePageDataViewModel f134431e;

    static {
        Covode.recordClassIndex(69397);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59108o
    /* renamed from: a */
    public final void mo96579a() {
        mo96583b();
    }

    /* renamed from: c */
    private boolean m108529c() {
        boolean z;
        boolean b = this.f134430d.mo89350b("page_feed");
        boolean z2 = this.f134430d.mo89354d("page_feed") instanceof MainPageFragment;
        if (this.f134429c == null || !z2) {
            z = false;
        } else {
            z = true;
        }
        if (!b || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo96583b() {
        if (this.f134428b == null) {
            return false;
        }
        if (!this.f134430d.mo89350b("page_feed")) {
            this.f134430d.mo89341a("page_feed");
            return true;
        } else if (!m108529c()) {
            return this.f134430d.mo89354d("page_feed") instanceof MainPageFragment;
        } else {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59108o
    /* renamed from: a */
    public final void mo96580a(ViewPager.AbstractC1579e eVar) {
        ScrollableViewPager scrollableViewPager = this.f134428b;
        if (scrollableViewPager != null) {
            scrollableViewPager.mo61356a(eVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59108o
    /* renamed from: a */
    public final void mo96582a(String str) {
        if (this.f134428b != null) {
            C34685e d = this.f134430d.mo89354d("page_profile");
            if (d instanceof C63810k) {
                ((C63810k) d).mo102381b(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59108o
    /* renamed from: a */
    public final void mo96581a(Aweme aweme, String str) {
        if (this.f134428b != null) {
            C51423a.m95791b(4, "FeedAvatarView", "toProfilePage() called with: mViewPager = [" + this.f134428b + "], aweme = [" + aweme + "], enterMethod = [" + str + "]viewPageSize" + this.f134428b.getItemCount() + " pageType page_profile");
            this.f134431e.f121746l = true;
            C34685e d = this.f134430d.mo89354d("page_profile");
            if (d instanceof C63810k) {
                C63810k kVar = (C63810k) d;
                kVar.mo102377a(str);
                kVar.mo102379b(this.f134431e.f121746l);
            }
            this.f134430d.mo89342a("page_profile", true);
        } else {
            C51423a.m95791b(4, "FeedAvatarView", "mViewPager is null");
        }
        C2541b.m7439c("feed", "hot");
    }

    public C59052bb(Context context, ScrollableViewPager scrollableViewPager, C34700p pVar) {
        if (context instanceof ActivityC0945e) {
            ActivityC0945e eVar = (ActivityC0945e) context;
            this.f134430d = ScrollSwitchStateManager.C52950a.m97811a(eVar);
            this.f134431e = HomePageDataViewModel.C52942a.m97777a(eVar);
        }
        this.f134427a = context;
        this.f134428b = scrollableViewPager;
        this.f134429c = pVar;
    }
}
