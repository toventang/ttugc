package com.p2082ss.android.ugc.aweme.homepage;

import android.view.View;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1213t;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34687g;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.MainBottomTabView;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.main.TabAlphaController;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.b */
public final class C52957b {

    /* renamed from: a */
    public FragmentTabHost f121785a;

    /* renamed from: b */
    public TabChangeManager f121786b;

    /* renamed from: c */
    public ScrollSwitchStateManager f121787c;

    static {
        Covode.recordClassIndex(62486);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.b$b */
    public static final class C52959b extends C1213t<Fragment> {

        /* renamed from: a */
        final /* synthetic */ C52957b f121789a;

        static {
            Covode.recordClassIndex(62488);
        }

        @Override // androidx.lifecycle.LiveData
        public final /* synthetic */ Object getValue() {
            TabChangeManager tabChangeManager = this.f121789a.f121786b;
            if (tabChangeManager != null) {
                return tabChangeManager.mo96536b();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52959b(C52957b bVar) {
            this.f121789a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.b$d */
    public static final class RunnableC52961d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC18234b f121791a;

        static {
            Covode.recordClassIndex(62490);
        }

        RunnableC52961d(AbstractC18234b bVar) {
            this.f121791a = bVar;
        }

        public final void run() {
            HomePageUIFrameServiceImpl.m108627e().runInTabHostRunnable(this.f121791a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.b$a */
    public static final class C52958a implements C33403c.AbstractC33408d {

        /* renamed from: a */
        final /* synthetic */ MainBottomTabView f121788a;

        static {
            Covode.recordClassIndex(62487);
        }

        C52958a(MainBottomTabView mainBottomTabView) {
            this.f121788a = mainBottomTabView;
        }

        @Override // com.p2082ss.android.ugc.aweme.adaptation.C33403c.AbstractC33408d
        /* renamed from: a */
        public final void mo59484a() {
            MainBottomTabView mainBottomTabView = this.f121788a;
            if (mainBottomTabView != null) {
                C89219l.m154716b(C33403c.C33406b.f79409a, "");
                if (!C33403c.f79374d) {
                    return;
                }
                if (C33403c.f79373c == C33403c.f79372b) {
                    mainBottomTabView.mo89742a((int) C13628n.m24520b(mainBottomTabView.getContext(), 0.0f), (int) C13628n.m24520b(mainBottomTabView.getContext(), 1.5f));
                } else {
                    mainBottomTabView.mo89742a((int) C13628n.m24520b(mainBottomTabView.getContext(), 4.0f), (int) C13628n.m24520b(mainBottomTabView.getContext(), 6.0f));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.b$c */
    public static final class C52960c implements TabChangeManager.AbstractC59004b {

        /* renamed from: a */
        final /* synthetic */ C52957b f121790a;

        static {
            Covode.recordClassIndex(62489);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52960c(C52957b bVar) {
            this.f121790a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.main.TabChangeManager.AbstractC59004b
        /* renamed from: a */
        public final void mo89405a(String str) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f121790a.f121787c;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f121768j = str;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.b$e */
    public static final class C52962e extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC18234b f121792a;

        static {
            Covode.recordClassIndex(62491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52962e(AbstractC18234b bVar) {
            super(1);
            this.f121792a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f121792a, C529631.f121793a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo89404a(AbstractC18234b bVar, View view) {
        MainBottomTabView mainBottomTabView;
        TabWidget tabWidget;
        C89219l.m154721d(bVar, "");
        bVar.getLifecycle().mo4012a(TabAlphaController.m108430a());
        FragmentTabHost fragmentTabHost = this.f121785a;
        if (fragmentTabHost != null) {
            fragmentTabHost.mo29213a(bVar.getActivity(), bVar.getChildFragmentManager());
        }
        FragmentTabHost fragmentTabHost2 = this.f121785a;
        if (!(fragmentTabHost2 == null || (tabWidget = fragmentTabHost2.getTabWidget()) == null)) {
            tabWidget.setVisibility(8);
        }
        FragmentTabHost fragmentTabHost3 = this.f121785a;
        if (fragmentTabHost3 != null) {
            fragmentTabHost3.setOnTabSwitchListener((FragmentTabHost.AbstractC18281b) bVar);
        }
        TabChangeManager a = TabChangeManager.C59002a.m108439a(bVar.getActivity());
        this.f121786b = a;
        if (a != null) {
            FragmentTabHost fragmentTabHost4 = this.f121785a;
            a.f134313e = true;
            a.f134309a = fragmentTabHost4;
        }
        TabChangeManager tabChangeManager = this.f121786b;
        if (tabChangeManager != null) {
            tabChangeManager.f134314f = bVar.getChildFragmentManager();
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.f121787c;
        if (scrollSwitchStateManager != null) {
            C52959b bVar2 = new C52959b(this);
            C89219l.m154721d(bVar2, "");
            scrollSwitchStateManager.f121767i = bVar2;
        }
        TabChangeManager tabChangeManager2 = this.f121786b;
        if (tabChangeManager2 != null) {
            tabChangeManager2.f134315g = new C52960c(this);
        }
        TabChangeManager tabChangeManager3 = this.f121786b;
        if (tabChangeManager3 != null) {
            tabChangeManager3.mo96531a((AbstractC34687g) bVar);
        }
        C58945a.C58947b.f134185a.mo96425a("method_main_page_add_tab_duration", false);
        C58945a.C58947b.f134185a.mo96429b("method_main_page_add_tab_duration", false);
        FragmentTabHost fragmentTabHost5 = this.f121785a;
        if (fragmentTabHost5 != null) {
            fragmentTabHost5.post(new RunnableC52961d(bVar));
        }
        View view2 = null;
        if (view != null) {
            mainBottomTabView = (MainBottomTabView) view.findViewById(R.id.ci0);
            view2 = view.findViewById(R.id.vf);
        } else {
            mainBottomTabView = null;
        }
        if (bVar.af_()) {
            C33403c.m68505a(1, mainBottomTabView, view2, null, true, new C52958a(mainBottomTabView));
        }
        if (Keva.getRepo("repo_story_cold_start").getInt("key_setting", 0) > 0) {
            C12780d.m23005a(bVar, new C52962e(bVar));
        }
    }
}
