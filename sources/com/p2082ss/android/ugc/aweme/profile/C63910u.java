package com.p2082ss.android.ugc.aweme.profile;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37830a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64149b;
import com.p2082ss.android.ugc.aweme.profile.service.C63866a;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.profile.u */
final /* synthetic */ class C63910u implements AbstractC1214u {

    /* renamed from: a */
    private final C63810k f144896a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f144897b;

    static {
        Covode.recordClassIndex(75341);
    }

    C63910u(C63810k kVar, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.f144896a = kVar;
        this.f144897b = scrollSwitchStateManager;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C63810k kVar = this.f144896a;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f144897b;
        Integer num = (Integer) obj;
        if (kVar.f144644o) {
            kVar.f144644o = false;
            kVar.f144641l = kVar.mo102374a(kVar.f144641l, 0);
        }
        if (num.intValue() == 1) {
            kVar.f144642m = "slide";
            if (kVar.f144638e != null && C63810k.m115414b(kVar.f144638e) && C76706a.m134281g(kVar.f144638e) && !(kVar.f144636c instanceof AbstractC64149b)) {
                if (kVar.f144635b == null) {
                    kVar.f144635b = kVar.mo102373a();
                }
                kVar.mo102375a((Fragment) kVar.f144635b, "tag_fragment_page_my");
            }
        }
        Context context = kVar.getContext();
        if (num.intValue() == 0 && scrollSwitchStateManager.mo89350b("page_profile") && context != null && kVar.f144638e != null && !C37699a.m76230aB(kVar.f144638e)) {
            C63866a.f144791a.openProfilePopUpWebPage(context, kVar.f144638e.getAwemeRawAd(), kVar.f144638e.getAid());
        }
        if (num.intValue() == 0 && scrollSwitchStateManager.mo89350b("page_feed") && context != null && kVar.f144638e != null && kVar.f144638e.isAd() && kVar.f144638e.getAwemeRawAd().getGetAdStatus() == 1 && C63866a.f144791a.shouldShowAdBrowser(kVar.f144638e)) {
            C63866a.f144791a.onProfileWebPageHide(kVar.getContext(), kVar.f144638e, kVar.f144642m);
        }
        if (num.intValue() == 0 && scrollSwitchStateManager.mo89350b("page_feed")) {
            AbstractC81915c.m141874a(new C37830a(0));
        }
    }
}
