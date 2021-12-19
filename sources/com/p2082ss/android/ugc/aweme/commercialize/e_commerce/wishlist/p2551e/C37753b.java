package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2551e;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0976n;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.C17031d;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.C17275e;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.EnumC17270a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.C37764b;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2547a.AbstractC37735a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.views.C81437h;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.managers.C88113e;
import java.util.HashMap;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e.b */
public final class C37753b extends AbstractC37752a implements AbstractC37735a {

    /* renamed from: c */
    public static final C37754a f89153c = new C37754a((byte) 0);

    /* renamed from: a */
    public C37764b f89154a;

    /* renamed from: b */
    public C17031d f89155b;

    /* renamed from: d */
    private DmtStatusView f89156d;

    /* renamed from: e */
    private FrameLayout f89157e;

    /* renamed from: j */
    private boolean f89158j;

    /* renamed from: k */
    private AbstractC89171a<? extends Object> f89159k;

    /* renamed from: l */
    private HashMap f89160l;

    static {
        Covode.recordClassIndex(45196);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e.b$a */
    public static final class C37754a {
        static {
            Covode.recordClassIndex(45197);
        }

        private C37754a() {
        }

        public /* synthetic */ C37754a(byte b) {
            this();
        }
    }

    /* renamed from: e */
    private static boolean m76375e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final C37764b mo65774d() {
        C37764b bVar = this.f89154a;
        if (bVar == null) {
            C89219l.m154710a("wishListManager");
        }
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f89160l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            C39162r.onEventV3("ads_wishlist_tab_exit");
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            C39162r.onEventV3("ads_wishlist_tab_enter");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e.b$d */
    static final class C37757d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C37753b f89163a;

        static {
            Covode.recordClassIndex(45200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37757d(C37753b bVar) {
            super(0);
            this.f89163a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C37764b d = this.f89163a.mo65774d();
            C17031d dVar = this.f89163a.f89155b;
            if (dVar == null) {
                C89219l.m154710a("bulletContainerFragment");
            }
            d.mo65778a(dVar);
            return C89391z.f203057a;
        }
    }

    /* renamed from: g */
    private static boolean m76376g() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean e = m76375e();
        C58029j.f132253e = e;
        return e;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2547a.AbstractC37735a
    /* renamed from: a */
    public final void mo65750a() {
        DmtStatusView dmtStatusView = this.f89156d;
        if (dmtStatusView == null) {
            C89219l.m154710a("dmtStatusView");
        }
        dmtStatusView.mo27384f();
        FrameLayout frameLayout = this.f89157e;
        if (frameLayout == null) {
            C89219l.m154710a("wishListContentContainer");
        }
        frameLayout.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C37764b bVar = this.f89154a;
        if (bVar == null) {
            C89219l.m154710a("wishListManager");
        }
        bVar.f89176a.dispose();
        bVar.f89181f.mo59376a().mo59417c();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2547a.AbstractC37735a
    /* renamed from: b */
    public final void mo65751b() {
        getContext();
        if (m76376g()) {
            DmtStatusView dmtStatusView = this.f89156d;
            if (dmtStatusView == null) {
                C89219l.m154710a("dmtStatusView");
            }
            dmtStatusView.mo27387h();
        } else {
            DmtStatusView dmtStatusView2 = this.f89156d;
            if (dmtStatusView2 == null) {
                C89219l.m154710a("dmtStatusView");
            }
            dmtStatusView2.mo27388i();
        }
        FrameLayout frameLayout = this.f89157e;
        if (frameLayout == null) {
            C89219l.m154710a("wishListContentContainer");
        }
        frameLayout.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2547a.AbstractC37735a
    /* renamed from: c */
    public final void mo65752c() {
        getContext();
        if (m76376g()) {
            DmtStatusView dmtStatusView = this.f89156d;
            if (dmtStatusView == null) {
                C89219l.m154710a("dmtStatusView");
            }
            dmtStatusView.setVisibility(8);
            FrameLayout frameLayout = this.f89157e;
            if (frameLayout == null) {
                C89219l.m154710a("wishListContentContainer");
            }
            frameLayout.setVisibility(0);
            return;
        }
        DmtStatusView dmtStatusView2 = this.f89156d;
        if (dmtStatusView2 == null) {
            C89219l.m154710a("dmtStatusView");
        }
        dmtStatusView2.mo27388i();
        FrameLayout frameLayout2 = this.f89157e;
        if (frameLayout2 == null) {
            C89219l.m154710a("wishListContentContainer");
        }
        frameLayout2.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e.b$b */
    static final class View$OnClickListenerC37755b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37753b f89161a;

        static {
            Covode.recordClassIndex(45198);
        }

        View$OnClickListenerC37755b(C37753b bVar) {
            this.f89161a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f89161a.mo65774d().mo65777a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e.b$c */
    static final class View$OnClickListenerC37756c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37753b f89162a;

        static {
            Covode.recordClassIndex(45199);
        }

        View$OnClickListenerC37756c(C37753b bVar) {
            this.f89162a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f89162a.mo65774d().mo65777a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            if (this.f89154a == null || this.f89155b == null) {
                this.f89159k = new C37757d(this);
            } else {
                C37764b bVar = this.f89154a;
                if (bVar == null) {
                    C89219l.m154710a("wishListManager");
                }
                C17031d dVar = this.f89155b;
                if (dVar == null) {
                    C89219l.m154710a("bulletContainerFragment");
                }
                bVar.mo65778a(dVar);
            }
            this.f89158j = true;
            C39162r.onEventV3("ads_wishlist_tab_enter");
        } else if (this.f89158j) {
            C39162r.onEventV3("ads_wishlist_tab_exit");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.fjj);
        C89219l.m154716b(findViewById, "");
        this.f89156d = (DmtStatusView) findViewById;
        C17273d dVar = new C17273d.C17274a(getContext()).mo27457a(2131232650).mo27462b(R.string.hc1).mo27463b("").mo27459a(EnumC17270a.BORDER, R.string.hc3, new View$OnClickListenerC37755b(this)).f41365a;
        C17273d a = C81437h.m141212a(getContext(), new View$OnClickListenerC37756c(this));
        DmtStatusView dmtStatusView = this.f89156d;
        if (dmtStatusView == null) {
            C89219l.m154710a("dmtStatusView");
        }
        DmtStatusView.C17269a b = DmtStatusView.C17269a.m31905a(getContext()).mo27407b(dVar);
        C17275e eVar = new C17275e(b.f41298a);
        eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        eVar.setStatus(a);
        b.f41302e = eVar;
        dmtStatusView.setBuilder(b);
        View findViewById2 = view.findViewById(R.id.fji);
        C89219l.m154716b(findViewById2, "");
        this.f89157e = (FrameLayout) findViewById2;
        C17031d dVar2 = new C17031d();
        C17031d.C17032a a2 = new C17031d.C17032a(dVar2).mo26910a(BulletService.m71938f().mo61850a());
        Context a3 = C88113e.m153183a(view.getContext());
        Objects.requireNonNull(a3, "null cannot be cast to non-null type android.app.Activity");
        a2.mo26911a(new BulletActivityWrapper((Activity) a3)).mo26913a();
        this.f89155b = dVar2;
        AbstractC0976n a4 = getChildFragmentManager().mo3552a();
        C89219l.m154716b(a4, "");
        C17031d dVar3 = this.f89155b;
        if (dVar3 == null) {
            C89219l.m154710a("bulletContainerFragment");
        }
        a4.mo3469b(R.id.fji, dVar3).mo3467b();
        C37764b bVar = this.f89154a;
        if (bVar == null) {
            C89219l.m154710a("wishListManager");
        }
        C89219l.m154721d(this, "");
        AbstractC88412b a5 = bVar.f89177b.mo143283c().mo143268a(C37764b.C37769e.f89188a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C37764b.C37770f(bVar), C37764b.C37771g.f89190a);
        C89219l.m154716b(a5, "");
        C88934a.m154195a(a5, bVar.f89176a);
        AbstractC88412b a6 = AbstractC88979t.m154297a(bVar.f89177b.mo143283c(), bVar.f89181f.mo59376a().mo59414b(), bVar.f89178c.mo143283c()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C37764b.C37772h(this), C37764b.C37773i.f89192a);
        C89219l.m154716b(a6, "");
        C88934a.m154195a(a6, bVar.f89176a);
        C37764b bVar2 = this.f89154a;
        if (bVar2 == null) {
            C89219l.m154710a("wishListManager");
        }
        bVar2.mo65777a();
        AbstractC89171a<? extends Object> aVar = this.f89159k;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f89159k = null;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a1u, viewGroup, false);
    }
}
