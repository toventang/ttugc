package com.p2082ss.android.ugc.aweme.main.bottomobserver;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a;
import com.p2082ss.android.ugc.aweme.main.C59014ae;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.main.p3435h.C59101a;
import com.p2082ss.android.ugc.aweme.metrics.C59247l;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2294c.C33215a;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79646c;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.main.bottomobserver.a */
public final class View$OnClickListenerC59058a implements View.OnClickListener {

    /* renamed from: a */
    public final ActivityC0945e f134446a;

    /* renamed from: b */
    public final Context f134447b;

    static {
        Covode.recordClassIndex(69404);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.bottomobserver.a$a */
    static final class CallableC59059a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC59059a f134448a = new CallableC59059a();

        static {
            Covode.recordClassIndex(69405);
        }

        CallableC59059a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C29823c.m60080a(C17867d.m33078a(), "homepage", "show");
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.bottomobserver.a$d */
    static final class CallableC59062d<V> implements Callable {

        /* renamed from: a */
        public static final CallableC59062d f134453a = new CallableC59062d();

        static {
            Covode.recordClassIndex(69408);
        }

        CallableC59062d() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C29823c.m60080a(C17867d.m33078a(), "homepage", "click");
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.bottomobserver.a$c */
    static final class CallableC59061c<V> implements Callable {

        /* renamed from: a */
        public static final CallableC59061c f134452a = new CallableC59061c();

        static {
            Covode.recordClassIndex(69407);
        }

        CallableC59061c() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C39162r.m79460a("homepage_hot_click", new C33744d().mo59983a("click_method", "enter").f79943a);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.bottomobserver.a$b */
    static final class CallableC59060b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ HomePageDataViewModel f134449a;

        /* renamed from: b */
        final /* synthetic */ String f134450b;

        /* renamed from: c */
        final /* synthetic */ String f134451c;

        static {
            Covode.recordClassIndex(69406);
        }

        CallableC59060b(HomePageDataViewModel homePageDataViewModel, String str, String str2) {
            this.f134449a = homePageDataViewModel;
            this.f134450b = str;
            this.f134451c = str2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            if (this.f134449a.f121747m == 0) {
                str = "enter_homepage_follow";
            } else {
                str = "enter_homepage_hot";
            }
            C59247l lVar = new C59247l(str);
            lVar.f135247a = "click_button_icon";
            C59247l a = lVar.mo96816a(this.f134450b);
            a.f135248b = this.f134451c;
            if (this.f134449a.f121745k != null) {
                a.mo96817f(this.f134449a.f121745k);
            }
            a.mo96792f();
            return null;
        }
    }

    public View$OnClickListenerC59058a(Context context) {
        C89219l.m154721d(context, "");
        this.f134447b = context;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f134446a = (ActivityC0945e) context;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AVExternalServiceImpl.m113114a().enterFromService().setEnterFrom("HOME");
        HomePageDataViewModel a = HomePageDataViewModel.C52942a.m97777a(this.f134446a);
        TabChangeManager a2 = TabChangeManager.C59002a.m108439a(this.f134446a);
        ScrollSwitchStateManager a3 = ScrollSwitchStateManager.C52950a.m97811a(this.f134446a);
        C61542b.m111463a(false);
        a3.mo89345a(true);
        ActivityC0945e eVar = this.f134446a;
        MainActivity mainActivity = null;
        if (!(eVar instanceof MainActivity)) {
            eVar = null;
        }
        MainActivity mainActivity2 = (MainActivity) eVar;
        if (mainActivity2 != null) {
            mainActivity2.refreshSlideSwitchCanScrollRight();
        }
        ActivityC0945e eVar2 = this.f134446a;
        if (eVar2 instanceof MainActivity) {
            mainActivity = eVar2;
        }
        MainActivity mainActivity3 = mainActivity;
        if (mainActivity3 != null) {
            mainActivity3.setAdScrollRightControl();
        }
        C68909c.f154156d = a.f121745k;
        String str = a2.f134312d;
        if (TextUtils.equals("HOME", a2.f134312d)) {
            AbstractC53316a aVar = (AbstractC53316a) HomeTabViewModel.C53309a.m98315a(this.f134446a).mo89739b("HOME");
            if (aVar != null) {
                aVar.mo89758g();
            }
            Fragment a4 = a2.mo96530a("HOME");
            if (a4 instanceof C59014ae) {
                ((C59014ae) a4).mo89963a(true, "homepage_refresh");
                AbstractC81915c.m141874a(new C79646c(1));
                AbstractC81915c.m141874a(new C33215a());
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(C34792be.f82123b, C34792be.f82125d);
            Hox.C15490a.m28529a(this.f134446a).mo25211b("HOME", bundle);
            Fragment b = a2.mo96536b();
            C1731i.m5640b(CallableC59059a.f134448a, C39162r.m79452a());
            if (b instanceof C59014ae) {
                C59014ae aeVar = (C59014ae) b;
                if (aeVar.f134383y == null || aeVar.f134366c == null || aeVar.f134383y.mo89712b(aeVar.f134366c.getCurrentItemCompat()) == 1) {
                    AVExternalServiceImpl.m113114a().shoutOutsService().setInFollowingTab(true);
                    C59101a.m108577a(this.f134446a);
                }
                C1731i.m5640b(new CallableC59060b(a, str, aeVar.mo96558q()), C39162r.m79452a());
                if (aeVar.mo96547l() instanceof C50041af) {
                    C1731i.m5640b(CallableC59061c.f134452a, C39162r.m79452a());
                }
            }
        }
        C1731i.m5640b(CallableC59062d.f134453a, C39162r.m79452a());
    }
}
