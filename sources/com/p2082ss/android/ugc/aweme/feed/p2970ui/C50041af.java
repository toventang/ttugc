package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hox.Hox;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1247a.AbstractC17886b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1247a.AbstractC17887c;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1247a.C17885a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.router.SmartRouter;
import com.google.p1998c.p2001c.C27404ap;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.C34792be;
import com.p2082ss.android.ugc.aweme.UgAllServiceImpl;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.C34567d;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39106g;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39107h;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39108i;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41128a;
import com.p2082ss.android.ugc.aweme.experiment.C46871ea;
import com.p2082ss.android.ugc.aweme.experiment.C47010hf;
import com.p2082ss.android.ugc.aweme.experiment.C47011hg;
import com.p2082ss.android.ugc.aweme.experiment.C47012hh;
import com.p2082ss.android.ugc.aweme.experiment.C47013hi;
import com.p2082ss.android.ugc.aweme.experiment.C47018hm;
import com.p2082ss.android.ugc.aweme.experiment.RunnableC47019hn;
import com.p2082ss.android.ugc.aweme.feed.AbstractC48019aa;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.C49930t;
import com.p2082ss.android.ugc.aweme.feed.C50479v;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48151ak;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48152al;
import com.p2082ss.android.ugc.aweme.feed.background.C49286c;
import com.p2082ss.android.ugc.aweme.feed.cache.C49316f;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49509b;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49522n;
import com.p2082ss.android.ugc.aweme.feed.helper.C49621g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2946g.C49567b;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49685m;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49698y;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49699z;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49744a;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49746c;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49749f;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49772a;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49783b;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.C49806f;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a.AbstractC49787b;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.p2962a.C49788c;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a;
import com.p2082ss.android.ugc.aweme.feed.p2963q.C49860aw;
import com.p2082ss.android.ugc.aweme.feed.p2968t.C49935d;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49968d;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49976l;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50079as;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram.C50308a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram.C50313b;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram.C50315d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.p2971a.C50035a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50457d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2976c.C50454a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.homepage.api.data.C52948a;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53446g;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.logger.C58949c;
import com.p2082ss.android.ugc.aweme.main.AbstractC59102i;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.C59250o;
import com.p2082ss.android.ugc.aweme.net.p3501k.C61412a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2294c.C33215a;
import com.p2082ss.android.ugc.aweme.p2340at.C33956a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.aweme.p3682s.C67261e;
import com.p2082ss.android.ugc.aweme.p3682s.C67274g;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79646c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.service.IFeedDebugService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80456ft;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.af */
public class C50041af extends AbstractC50300f<C49976l> implements AbstractC15497d, AbstractC48019aa, AbstractC48152al, AbstractC49744a, AbstractC49749f<Aweme>, AbstractC59102i, AbstractC59102i, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    AbstractC49787b f115508A = null;

    /* renamed from: B */
    C49621g f115509B;

    /* renamed from: C */
    private boolean f115510C = false;

    /* renamed from: D */
    private boolean f115511D = false;

    /* renamed from: E */
    private DataCenter f115512E;

    /* renamed from: F */
    private SwipeRefreshLayout.AbstractC34634b f115513F;

    /* renamed from: G */
    private List<Aweme> f115514G = null;

    /* renamed from: H */
    private int f115515H = 0;

    /* renamed from: I */
    private volatile boolean f115516I = false;

    /* renamed from: J */
    private AbstractC88412b f115517J;

    /* renamed from: m */
    public int f115518m;

    /* renamed from: n */
    public final C49860aw f115519n = new C49860aw("homepage_hot");

    /* renamed from: o */
    public C50479v f115520o;

    /* renamed from: p */
    public int f115521p = -1;

    /* renamed from: q */
    public int f115522q = 0;

    /* renamed from: r */
    public AdHomePageDataVM f115523r;

    /* renamed from: z */
    AbstractC17886b f115524z = null;

    static {
        Covode.recordClassIndex(59167);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(192, new RunnableC90250g(C50041af.class, "onFeedFetchEvent", C49685m.class, ThreadMode.POSTING, 0, false));
        hashMap.put(240, new RunnableC90250g(C50041af.class, "showInsDialog", C50035a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(170, new RunnableC90250g(C50041af.class, "onVideoPublishEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(241, new RunnableC90250g(C50041af.class, "onPlayerControllerRenderFirstFrameEvent", C50457d.class, ThreadMode.MAIN, 0, false));
        hashMap.put(12, new RunnableC90250g(C50041af.class, "onAwesomeSplashEvent", C18017a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(242, new RunnableC90250g(C50041af.class, "onEvent", C49699z.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.AbstractC59102i
    /* renamed from: u */
    public final String mo85175u() {
        return "FeedRecommendFragment";
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.AbstractC48019aa
    /* renamed from: b */
    public final AbstractC49815a mo80042b() {
        return this.f115519n;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    /* renamed from: a */
    public final boolean mo85156a(boolean z) {
        if (!af_() || this.f116140j == null) {
            return false;
        }
        boolean z2 = ((C49976l) this.f116140j).f115289c;
        if (!super.mo85156a(z) && !z2) {
            return false;
        }
        C49976l lVar = (C49976l) this.f116140j;
        ((C49968d) lVar.f92286h).f115243a = z;
        lVar.f115287a = z;
        if (z2) {
            this.f116141k.setRefreshing(false);
            AbstractC81915c.m141874a(new C49698y());
            return true;
        }
        mo85161e();
        if (!this.f115510C && this.f115511D) {
            m93949s();
        }
        if (mo85160d()) {
            if (z) {
                mo85157b("click");
            } else if (!TextUtils.isEmpty(this.f116589y)) {
                mo85157b(this.f116589y);
                if ("press_back".equals(this.f116589y)) {
                    return ((C49976l) this.f116140j).mo85023b(1, 0, 1, Boolean.valueOf(this.f115520o.mo85722a()));
                }
            }
            return this.f116140j.mo57616a(1, 0, 1, Boolean.valueOf(this.f115520o.mo85722a()));
        }
        return this.f116140j.mo57616a(2, 0, 3);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.common.e.b' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f
    /* renamed from: h */
    public final /* synthetic */ C49976l mo85163h() {
        return new C49976l(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f, com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49746c
    /* renamed from: k */
    public final boolean mo70693k() {
        mo85161e();
        return super.mo70693k();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f
    /* renamed from: m */
    public final void mo85166m() {
        this.f115519n.mo84732bG();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48152al
    /* renamed from: o */
    public final boolean mo80291o() {
        return this.f115519n.mo84763bp();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50083at
    /* renamed from: p */
    public final AbstractC48149ai mo85172p() {
        return this.f115519n.mo81108aC();
    }

    /* renamed from: n */
    private static boolean m93947n() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: r */
    private int m93948r() {
        C49860aw awVar = this.f115519n;
        if (awVar != null) {
            return awVar.mo84729bD();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    /* renamed from: G */
    public final SparseArray<AbstractC81911c> mo61042G() {
        SparseArray<AbstractC81911c> G = super.mo61042G();
        G.append(C34567d.C34568a.f81607c, this.f115519n);
        return G;
    }

    /* renamed from: e */
    public final void mo85161e() {
        if (this.f116140j != null) {
            ((C49976l) this.f116140j).f115291e = m93948r();
        }
    }

    /* renamed from: d */
    public final boolean mo85160d() {
        if (this.f116140j.f92286h == null || this.f116140j.f92286h.mData == null || !this.f116140j.f92286h.mData.isRefreshClear()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f
    /* renamed from: l */
    public final boolean mo85165l() {
        if (super.mo85165l()) {
            C49976l lVar = (C49976l) this.f116140j;
            if (lVar.f92286h == null || ((C49968d) lVar.f92286h).f115247e) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    public void onStop() {
        super.onStop();
        UgAllServiceImpl.m65444c().mo57256b();
        C33956a.m69543c();
        C33956a.m69547e();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    /* renamed from: q */
    public final void mo85173q() {
        this.f116137c.setRefreshing(true);
        mo85156a(false);
        AbstractC81915c.m141874a(new C33215a());
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f
    /* renamed from: i */
    public final boolean mo85164i() {
        boolean z = true;
        ((C49976l) this.f116140j).f115289c = true;
        C39101b bVar = this.f116140j;
        Object[] objArr = new Object[4];
        objArr[0] = 4;
        objArr[1] = Integer.valueOf(this.f116586u);
        objArr[2] = 2;
        if (!C49286c.m92321a() || !C49509b.m92744b()) {
            z = false;
        }
        objArr[3] = Boolean.valueOf(z);
        return bVar.mo57616a(objArr);
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public void onStart() {
        super.onStart();
        ActivityC0945e activity = getActivity();
        if (activity instanceof AbstractC59103j) {
            Fragment curFragment = ((AbstractC59103j) activity).getCurFragment();
            if ((curFragment instanceof AbstractC59105l) && (((AbstractC59105l) curFragment).mo96547l() instanceof C50041af)) {
                C53446g.C53447a.f122670a.mo90012a(getActivity());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49744a
    /* renamed from: c */
    public final boolean mo84303c() {
        ((C49976l) this.f116140j).f115289c = true;
        C39101b bVar = this.f116140j;
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = 4;
        objArr[1] = Integer.valueOf(this.f116586u);
        objArr[2] = 2;
        if (C49286c.m92321a() && C49509b.m92744b()) {
            z = true;
        }
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = true;
        return bVar.mo57616a(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if (r1.booleanValue() != false) goto L_0x001b;
     */
    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r4 = this;
            super.onPause()
            com.ss.android.ugc.aweme.feed.q.aw r0 = r4.f115519n
            boolean r0 = r0.mo84763bp()
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            com.ss.android.ugc.aweme.commercialize.utils.az r1 = com.p2082ss.android.ugc.aweme.commercialize.C38000g.m77053d()
            androidx.fragment.app.i r0 = r4.getFragmentManager()
            boolean r0 = r1.mo67205a(r0)
            if (r0 == 0) goto L_0x0020
        L_0x001b:
            com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i.f42807g = r3
            com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i.f42802b = r2
            return
        L_0x0020:
            androidx.fragment.app.e r1 = r4.getActivity()
            if (r1 != 0) goto L_0x003b
        L_0x0026:
            com.ss.android.ugc.aweme.feed.q.aw r0 = r4.f115519n
            com.ss.android.ugc.aweme.feed.adapter.ai r0 = r0.mo81108aC()
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.q.aw r0 = r4.f115519n
            com.ss.android.ugc.aweme.feed.adapter.ai r0 = r0.mo81108aC()
            boolean r0 = r0.mo80102Q()
            if (r0 == 0) goto L_0x0058
            goto L_0x001b
        L_0x003b:
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl.m73664e()
            com.ss.android.ugc.aweme.comment.api.CommentViewModel r0 = r0.mo63277a(r1)
            androidx.lifecycle.LiveData r0 = r0.mo63315a()
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0026
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L_0x001b
            goto L_0x0026
        L_0x0058:
            r3 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af.onPause():void");
    }

    /* renamed from: s */
    private void m93949s() {
        C50313b bVar;
        if (C31575b.m65865g().isLogin()) {
            C49860aw awVar = this.f115519n;
            if ((awVar == null || awVar.mo81109aD() == null || !this.f115519n.mo81109aD().isAd()) && getActivity() != null && getUserVisibleHint() && isResumed() && !this.f115510C) {
                C50315d a = C50308a.C50309a.m94414a();
                User curUser = C31575b.m65865g().getCurUser();
                if (a != null && TextUtils.isEmpty(curUser.getBindPhone()) && TextUtils.isEmpty(curUser.getEmail())) {
                    if ("instagram".equals(a.f116186a)) {
                        bVar = new C50313b("ins");
                    } else {
                        bVar = new C50313b(a.f116186a);
                    }
                    if (new C50308a(a, bVar, getActivity(), "homepage_hot", "feed_popup").mo85483a()) {
                        this.f115510C = true;
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48151ak
    /* renamed from: a */
    public final void mo70521a() {
        C51423a.m95784a(4, "FeedFetchModel", "feedRecommendFragment called onLoadMore()");
        mo85161e();
        this.f116140j.mo57616a(4, 0, 2);
        if (C49783b.m93234a()) {
            C49772a.m93222b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo85162g() {
        C49860aw awVar;
        List<Aweme> e;
        if (getActivity() != null) {
            String a = m93944a(getActivity().getIntent(), "gids");
            if (!TextUtils.isEmpty(a) && !a.contains(",") && (awVar = this.f115519n) != null && (e = awVar.f114768W.mo80288e()) != null) {
                for (Aweme aweme : e) {
                    if (TextUtils.equals(aweme.getAid(), a)) {
                        SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/".concat(String.valueOf(a))).withParam(m93943a(getActivity().getIntent())).open();
                        return;
                    }
                }
            }
            ActivityC0945e activity = getActivity();
            C89219l.m154721d(activity, "");
            C89219l.m154721d(this, "");
            String a2 = C50079as.m94014a(activity.getIntent(), "gids");
            boolean booleanExtra = activity.getIntent().getBooleanExtra("onNewIntent", false);
            String a3 = C50079as.m94014a(activity.getIntent(), "push_params");
            String a4 = C50079as.m94014a(activity.getIntent(), "refer");
            if (!TextUtils.isEmpty(a2) && booleanExtra) {
                C1731i.m5640b(new C50079as.CallableC50081b(a2, a3, a4), C1731i.f5562a).mo5538b(new C50079as.C50082c(this), C1731i.f5564c);
                activity.getIntent().removeExtra("gids");
                activity.getIntent().removeExtra("onNewIntent");
                if (this.f116137c != null) {
                    this.f116137c.setOnRefreshListener(null);
                    this.f116137c.setRefreshing(true);
                }
                m93946c(a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    public void onDestroyView() {
        if (this.f116140j != null) {
            AbstractC39100a aVar = (AbstractC39100a) this.f116140j.f92286h;
            C50479v vVar = this.f115520o;
            if (!(aVar == null || vVar == null || !C17873f.f42636l)) {
                T t = aVar.mData;
                List items = aVar.getItems();
                int i = vVar.f116591a + 1;
                if (items != null && i < items.size()) {
                    if (i < items.size()) {
                        items.subList(0, i).clear();
                    }
                    int intValue = ((Number) C67274g.f150756c.getValue()).intValue();
                    if (items.size() > 0 && items.size() > intValue) {
                        items.subList(intValue, items.size()).clear();
                    }
                    if (t != null) {
                        t.isFromUnusedFeed = true;
                        C49935d.f115106a.mo84986a(4).mo84982a(t);
                    }
                    if (!C84892d.m145850a(items) && ((!C67274g.m119193a() || NetworkUtils.isWifi(C17879g.m33104a())) && ((Boolean) C67274g.f150754a.getValue()).booleanValue())) {
                        for (Aweme aweme : new ArrayList(items)) {
                            C40780g.m82241a().execute(new RunnableC47019hn(aweme));
                        }
                    }
                    C47018hm.m90286a(items);
                }
            }
        }
        super.onDestroyView();
        this.f115519n.mo70413r();
        if (this.f116140j != null) {
            this.f116140j.ck_();
        }
        AbstractC49787b bVar = this.f115508A;
        if (bVar != null) {
            bVar.mo84326a();
        }
        C49930t.f115092a = 0;
        AbstractC88412b bVar2 = this.f115517J;
        if (bVar2 != null) {
            bVar2.dispose();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    public void onResume() {
        boolean z;
        C58945a.C58947b.f134185a.mo96425a("cold_boot_feed_recommend_fragment_onresume", false);
        super.onResume();
        AbstractC17886b bVar = this.f115524z;
        if (bVar != null) {
            bVar.mo28470b();
        }
        if (getUserVisibleHint() && isResumed() && this.f116587v != null && !this.f116587v.isHidden() && C80456ft.m139463a()) {
            C1731i.m5640b(new CallableC50046ag(this), C39162r.m79452a());
            C49907s.m93686a(EnumC48310af.FEED);
        }
        UgAllServiceImpl.m65444c().mo57253a(getActivity(), this.f115519n.mo81109aD());
        if (!this.f115510C && C50308a.f116164g) {
            m93949s();
        }
        getActivity();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m93947n();
        }
        if (!C58029j.f132256h) {
            this.f115511D = true;
        }
        if (MSAdaptionService.m97895c().mo89377c(getContext())) {
            AwemeChangeCallBack.m108596a(getActivity(), this.f115519n.mo81109aD());
        }
        getActivity().getWindow().setBackgroundDrawableResource(R.color.a2);
        if (this.f116587v != null && !this.f116587v.isHidden()) {
            Aweme aD = this.f115519n.mo81109aD();
            ActivityC0945e requireActivity = requireActivity();
            C89219l.m154721d(requireActivity, "");
            Intent intent = requireActivity.getIntent();
            if (intent.getBooleanExtra("is_start_by_login", false) || intent.getBooleanExtra("from_new_user_journey", false) || intent.getBooleanExtra("is_start_by_switch_account", false)) {
                z = true;
            } else {
                z = false;
            }
            boolean b = C51648a.f118980a.mo87330j().mo87345b();
            if (!z && ((aD == null || !aD.isAd()) && !b)) {
                C51648a.f118980a.mo87304a(1, "homepage_hot", "auto", requireActivity);
            }
            C51648a.f118980a.mo87330j().mo87344a();
        }
        C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_recommend_fragment_onresume", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_feed_recommend_onresume_to_focus", false);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void showInsDialog(C50035a aVar) {
        m93949s();
    }

    /* renamed from: a */
    private static Bundle m93943a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @AbstractC90264r
    public void onFeedFetchEvent(C49685m mVar) {
        if (TextUtils.equals(mVar.f114352a, "from_full_recommend")) {
            mo85164i();
        }
    }

    @AbstractC90264r
    public void onAwesomeSplashEvent(C18017a aVar) {
        if ((aVar.f42891a == 1 || aVar.f42891a == 2) && this.f115519n.mo84763bp()) {
            this.f115519n.mo84764bq();
        }
    }

    /* renamed from: c */
    private void m93946c(String str) {
        if (C49621g.C49622a.m93070a(getActivity())) {
            if (this.f115509B == null) {
                this.f115509B = new C49621g();
            }
            this.f115509B.mo81414a(str, getActivity());
            SettingServiceImpl.m120782v().mo108864a(true, getFragmentManager());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f
    /* renamed from: a */
    public final DmtStatusView mo85153a(Context context) {
        if (!C67248d.m119181i()) {
            return DmtStatusViewInflate.m105275a(context, new View$OnClickListenerC50052am(this));
        }
        DmtStatusViewInflate dmtStatusViewInflate = (DmtStatusViewInflate) C58221f.m105142a(new DmtStatusViewInflate());
        View$OnClickListenerC50051al alVar = new View$OnClickListenerC50051al(this);
        if (dmtStatusViewInflate.f132736a == null) {
            return DmtStatusViewInflate.m105275a(context, alVar);
        }
        dmtStatusViewInflate.f132737b.f132738a = alVar;
        DmtStatusView dmtStatusView = dmtStatusViewInflate.f132736a;
        dmtStatusViewInflate.f132736a = null;
        dmtStatusViewInflate.f132737b = null;
        return dmtStatusView;
    }

    /* renamed from: b */
    public final void mo85157b(String str) {
        C39162r.m79460a("homepage_hot_click", new C33744d().mo59983a("click_method", "refresh").mo59983a("refresh_mode", str).mo59980a("last_play_cnt", this.f115520o.f116591a).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    /* renamed from: d */
    public final void mo85159d(boolean z) {
        AbstractC37879bc t;
        super.mo85159d(z);
        AbstractC81915c.m141874a(new C50454a(2, this.f115519n.mo81109aD(), this.f115519n));
        this.f115519n.mo84793n(z);
        C53446g.C53447a.f122670a.f122664b = false;
        AbstractC48149ai aC = this.f115519n.mo81108aC();
        if (!(aC == null || (t = aC.mo80229t()) == null)) {
            t.mo65989v();
        }
        C49806f.m93266a(false);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onPlayerControllerRenderFirstFrameEvent(C50457d dVar) {
        if (!this.f115516I) {
            List<Aweme> list = this.f115514G;
            if (list != null) {
                this.f115519n.mo84725b(list, this.f115515H);
                this.f115519n.mo84719b(this.f115515H, true);
                this.f115514G = null;
                this.f115515H = 0;
            } else {
                m93945a(this.f115519n.f114768W.mo80288e(), true);
            }
            this.f115516I = true;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onEvent(C49699z zVar) {
        mo85161e();
        if (zVar.f114374a) {
            ((C49976l) this.f116140j).f115289c = true;
            this.f116140j.mo57616a(4, 0, 2);
            return;
        }
        this.f116140j.mo57616a(1, 0, 1, false);
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: b */
    public final void mo25224b(Bundle bundle) {
        String string = bundle.getString(C34792be.f82123b, "");
        String d = Hox.C15490a.m28529a(getActivity()).mo25216d("For You");
        String d2 = Hox.C15490a.m28529a(getActivity()).mo25216d(d);
        String d3 = Hox.C15490a.m28529a(getActivity()).mo25216d(d2);
        if (string.equals(C34792be.f82126e) || bundle.getBoolean(d)) {
            this.f115519n.mo70492e(false);
            if (isResumed()) {
                C58945a.C58947b.f134185a.f134176c = false;
                C58945a.C58947b.f134185a.f134180g = false;
                C58949c.f134187a = false;
            }
            mo85159d(false);
        } else if (string.equals(C34792be.f82125d) || bundle.getBoolean(d2)) {
            mo85159d(true);
        } else if (string.equals(C34792be.f82124c) || bundle.getBoolean(d3)) {
            AbstractC48149ai aC = this.f115519n.mo81108aC();
            if (aC != null) {
                aC.mo80207b(1);
            }
            Aweme aweme = HomePageDataViewModel.C52942a.m97777a(getActivity()).f121745k;
            if (aweme != null) {
                C49567b.C49568a.f114022a.mo81321a(aweme.getAid());
            }
        }
        C33956a.m69543c();
        C33956a.m69547e();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    /* renamed from: c */
    public final void mo85158c(boolean z) {
        AbstractC37879bc t;
        ActivityC0945e activity = getActivity();
        if (activity instanceof AbstractC59103j) {
            Fragment curFragment = ((AbstractC59103j) activity).getCurFragment();
            if ((curFragment instanceof AbstractC59105l) && (((AbstractC59105l) curFragment).mo96547l() instanceof C50041af)) {
                C53446g.C53447a.f122670a.mo90012a(getActivity());
                UgAllServiceImpl.m65444c().mo57253a(getActivity(), this.f115519n.mo81109aD());
            }
        }
        C49806f.m93266a(true);
        if (getUserVisibleHint() && af_()) {
            super.mo85158c(z);
            AbstractC81915c.m141874a(new C50454a(1, this.f115519n.mo81109aD(), this.f115519n));
            if (!z) {
                this.f115519n.mo84772by();
            } else if (getActivity() != null) {
                DataCenter a = DataCenter.m69492a(C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null), this);
                a.mo60191a("tryShowGuideView", (Object) null);
                if (!((Boolean) a.mo60195b("lastTryShowGuideViewResult", (Object) false)).booleanValue()) {
                    this.f115519n.mo70436B();
                }
            }
            mo85721x();
            getActivity().getWindow().setBackgroundDrawableResource(R.color.a2);
            AbstractC48149ai aC = this.f115519n.mo81108aC();
            if (!(aC == null || (t = aC.mo80229t()) == null)) {
                t.mo65988u();
                t.mo65974g();
            }
            C49860aw awVar = this.f115519n;
            if (awVar != null) {
                C68909c.f154156d = awVar.mo81109aD();
            }
        }
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: a */
    public final void mo25223a(Bundle bundle) {
        String string = bundle.getString(C34792be.f82123b, "");
        String d = Hox.C15490a.m28529a(getActivity()).mo25216d("For You");
        String d2 = Hox.C15490a.m28529a(getActivity()).mo25216d(d);
        String d3 = Hox.C15490a.m28529a(getActivity()).mo25216d(d2);
        if (string.equals(C34792be.f82126e) || bundle.getBoolean(d)) {
            this.f115519n.mo70492e(true);
            if (isResumed() && this.f116587v != null && !this.f116587v.isHidden()) {
                C59250o oVar = new C59250o();
                oVar.f135279a = "homepage_hot";
                oVar.mo96792f();
                C49907s.m93686a(EnumC48310af.FEED);
            }
            if (!this.f115510C && C50308a.f116164g) {
                m93949s();
            }
            mo85158c(false);
        } else if (string.equals(C34792be.f82125d) || bundle.getBoolean(d2)) {
            this.f115519n.mo70492e(true);
            if (isResumed() && this.f116587v != null && !this.f116587v.isHidden()) {
                C59250o oVar2 = new C59250o();
                oVar2.f135279a = "homepage_hot";
                oVar2.mo96792f();
                C49907s.m93686a(EnumC48310af.FEED);
            }
            if (!this.f115510C && C50308a.f116164g) {
                m93949s();
            }
            mo85158c(true);
        } else if (string.equals(C34792be.f82124c) || bundle.getBoolean(d3)) {
            this.f115519n.mo70492e(true);
            if (isResumed() && this.f116587v != null && !this.f116587v.isHidden()) {
                C59250o oVar3 = new C59250o();
                oVar3.f135279a = "homepage_hot";
                oVar3.mo96792f();
                C49907s.m93686a(EnumC48310af.FEED);
            }
            if (!this.f115510C && C50308a.f116164g) {
                m93949s();
            }
            mo85158c(true);
            AbstractC48149ai aC = this.f115519n.mo81108aC();
            if (aC != null) {
                aC.mo80210c(1);
            }
        }
    }

    @AbstractC90264r
    public void onVideoPublishEvent(C49672ag agVar) {
        DmtStatusView b;
        Aweme a;
        Aweme a2;
        if (agVar.f114315a == 15 && C46871ea.m90184a()) {
            if (agVar.f114316b instanceof Aweme) {
                Aweme aweme = (Aweme) agVar.f114316b;
                if (C46871ea.m90185a(aweme)) {
                    if (C76706a.m134277c(aweme)) {
                        a2 = C76706a.m134283i((Aweme) agVar.f114316b);
                        C77260g.f173332a.mo120158f().mo120166a(a2);
                    } else {
                        a2 = AwemeService.m70060b().mo60677a(aweme);
                    }
                    if (a2 != null && !C80636z.m139819d(a2)) {
                        if (C76706a.m134277c(aweme)) {
                            ((C49976l) this.f116140j).mo85021a(C77260g.f173332a.mo120157e().mo120170a().getAuthorUid());
                            ((C49976l) this.f116140j).mo85022b(C77260g.f173332a.mo120157e().mo120170a());
                        } else {
                            ((C49976l) this.f116140j).mo85022b(a2);
                        }
                        DmtStatusView b2 = mo85467b(true);
                        if (b2 != null) {
                            b2.mo27382d();
                        }
                    }
                }
            } else if (agVar.f114316b instanceof List) {
                boolean z = false;
                for (Aweme aweme2 : C27404ap.m54810a((List) agVar.f114316b)) {
                    if (C46871ea.m90185a(aweme2)) {
                        if (C76706a.m134277c(aweme2)) {
                            a = C76706a.m134283i(aweme2);
                            C77260g.f173332a.mo120158f().mo120166a(a);
                        } else {
                            a = AwemeService.m70060b().mo60677a(aweme2);
                        }
                        if (a != null && !C80636z.m139819d(a)) {
                            if (C76706a.m134277c(aweme2)) {
                                ((C49976l) this.f116140j).mo85021a(C77260g.f173332a.mo120157e().mo120170a().getAuthorUid());
                                ((C49976l) this.f116140j).mo85022b(C77260g.f173332a.mo120157e().mo120170a());
                            } else {
                                ((C49976l) this.f116140j).mo85022b(a);
                            }
                            z = true;
                        }
                    }
                }
                if (z && (b = mo85467b(true)) != null) {
                    b.mo27382d();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49749f
    /* renamed from: a */
    public final void mo84305a(C39107h<Aweme> hVar) {
        C49976l lVar = (C49976l) this.f116140j;
        if (lVar.f92286h != null) {
            C49968d dVar = (C49968d) lVar.f92286h;
            List items = dVar.getItems();
            int i = hVar.f92301b;
            List<T> list = hVar.f92300a;
            if (C13603b.m24435a((Collection) items)) {
                items = new ArrayList();
            }
            if (i < 0 || i > items.size()) {
                throw new C39106g(i, items.size());
            }
            items.addAll(i, list);
            if (items.size() == 1) {
                dVar.setItems(items);
            }
            C39108i iVar = new C39108i(hVar, items);
            if (!(dVar.mNotifyListeners == null || dVar.mNotifyListeners.size() == 0)) {
                for (AbstractC39159o oVar : dVar.mNotifyListeners) {
                    if (oVar instanceof AbstractC39105f) {
                        AbstractC39105f fVar = (AbstractC39105f) oVar;
                        if (!fVar.mo59500a(iVar)) {
                            fVar.mo59499a(iVar.f92304e, iVar.f92301b);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo85154a(C41128a aVar) {
        if (aVar != null) {
            C49860aw awVar = this.f115519n;
            int aE = awVar.mo81110aE() + 1;
            List<Aweme> list = aVar.f96125a;
            if (list != null) {
                int size = list.size();
                List<Aweme> e = awVar.f114768W.mo80288e();
                for (int i = size - 1; i >= 0; i--) {
                    int i2 = 0;
                    while (true) {
                        if (i2 > aE + 2) {
                            break;
                        }
                        if (i2 < e.size() && list.get(i).getAid().equals(e.get(i2).getAid())) {
                            list.remove(i);
                            break;
                        }
                        i2++;
                    }
                }
                if (list.size() > 0) {
                    C49710k.m93123a(list, aVar.f96126b, 0);
                    m93945a(list, false);
                    if (this.f115516I) {
                        awVar.mo84725b(list, aE);
                        awVar.mo84719b(aE, true);
                    } else {
                        this.f115514G = list;
                        this.f115515H = aE;
                    }
                }
            }
        }
        if (this.f116137c != null) {
            this.f116137c.setRefreshing(false);
            this.f116137c.setOnRefreshListener(this.f115513F);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo85155a(Boolean bool) {
        if (bool.booleanValue() && this.f116140j != null) {
            AbstractC39100a aVar = (AbstractC39100a) this.f116140j.f92286h;
            C50479v vVar = this.f115520o;
            if (!C49316f.f113350b && !C49316f.f113349a && aVar != null && vVar != null && C49522n.m92758c() && C17873f.f42636l) {
                C49316f.f113349a = true;
                T t = aVar.mData;
                List items = aVar.getItems();
                int i = vVar.f116591a + 1;
                if (items == null || i >= items.size()) {
                    C49316f.f113349a = false;
                    return;
                }
                if (i < items.size()) {
                    items.subList(0, i).clear();
                }
                if (!items.isEmpty() && items.size() > 2) {
                    items.subList(2, items.size()).clear();
                }
                C89219l.m154716b(t, "");
                C49316f.m92389a(t, true);
            }
        }
    }

    /* renamed from: a */
    private static String m93944a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m93945a(List<Aweme> list, boolean z) {
        C49860aw awVar;
        if (this.f115509B != null && list != null && !list.isEmpty()) {
            Aweme aweme = null;
            Iterator<Aweme> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Aweme next = it.next();
                if (this.f115509B.mo81418b(next)) {
                    aweme = next;
                    break;
                }
            }
            if (!this.f115509B.mo81417a(aweme)) {
                this.f115509B.f114182f = new C50050ak(this);
            } else if (z && (awVar = this.f115519n) != null) {
                C49621g.m93064b(awVar.mo81108aC());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    public void onViewCreated(View view, Bundle bundle) {
        Message message;
        String str;
        String str2;
        String str3;
        Lock lock;
        boolean booleanValue;
        MethodCollector.m26663i(6917);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_feed_fragment_view_created", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_feed_fragment_super_on_view_created", false);
        super.onViewCreated(view, bundle);
        C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_fragment_super_on_view_created", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_feed_fragment_init_ad", false);
        IAdSceneService f = AdSceneServiceImpl.m33210f();
        if (f != null) {
            this.f115524z = f.mo28465b();
            C17885a aVar = new C17885a();
            C89219l.m154721d(this, "");
            aVar.f42654a = this;
            aVar.f42655b = new AbstractC17887c() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af.C500421 */

                static {
                    Covode.recordClassIndex(59168);
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1247a.AbstractC17887c
                /* renamed from: a */
                public final boolean mo28472a(Fragment fragment) {
                    return C38000g.m77053d().mo67204a(fragment);
                }

                @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1247a.AbstractC17887c
                /* renamed from: a */
                public final void mo28471a(boolean z, String str) {
                    if (z) {
                        C58945a.C58947b.f134185a.mo96425a(str, false);
                    } else {
                        C58945a.C58947b.f134185a.mo96429b(str, false);
                    }
                }
            };
            this.f115524z.mo28473a(aVar);
        }
        C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_fragment_init_ad", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_feed_fragment_full_feed_panel_view_create", false);
        this.f115519n.mo70393a(view, bundle);
        C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_fragment_full_feed_panel_view_create", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_feed_fragment_init_view", false);
        AbstractC56869p.C56870a.m103133a().mo94053a("onViewCreated");
        this.f115519n.mo84915a((AbstractC48151ak) this);
        this.f115519n.mo70471a((AbstractC49746c) this);
        this.f115519n.f114817as = this;
        this.f115519n.f114818at = this;
        this.f115519n.f114945t = this;
        this.f115513F = new SwipeRefreshLayout.AbstractC34634b() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af.C500432 */

            static {
                Covode.recordClassIndex(59169);
            }

            /* renamed from: b */
            private static boolean m93979b() {
                try {
                    return C34719f.C34720a.f82009a.mo61395c();
                } catch (Exception unused) {
                    return false;
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.AbstractC34634b
            /* renamed from: a */
            public final void mo59551a() {
                if (!(C50041af.this.getActivity() == null || C50041af.this.getActivity().getWindow() == null)) {
                    C50041af.this.getActivity().getWindow().getDecorView().setBackgroundColor(C0643b.m2378c(C50041af.this.getActivity(), R.color.a2));
                }
                C50041af.this.getActivity();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m93979b();
                }
                if (!C58029j.f132256h) {
                    new C79459a(C50041af.this.getActivity()).mo123050a(R.string.dcq).mo123053a();
                    C50041af.this.f116141k.setRefreshing(false);
                    return;
                }
                C50041af.this.mo85161e();
                if (C50041af.this.mo85160d()) {
                    C50041af.this.mo85157b("slide_down");
                    C50041af.this.f116140j.mo57616a(1, 0, 1, Boolean.valueOf(C50041af.this.f115520o.mo85722a()));
                } else {
                    C50041af.this.f116140j.mo57616a(2, 0, 3);
                }
                if (C49783b.m93234a()) {
                    C49772a.m93222b();
                }
                AbstractC81915c.m141874a(new C79646c(0));
            }
        };
        this.f116137c.setOnRefreshListener(this.f115513F);
        this.f115519n.mo84688a((ViewPager.AbstractC1579e) new ViewPager.AbstractC1579e() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af.C500443 */

            /* renamed from: a */
            int f115527a = -1;

            static {
                Covode.recordClassIndex(59170);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrollStateChanged(int i) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
                if (r18 == (r17.f115528b.f115519n.f114768W.getCount() - 1)) goto L_0x00d7;
             */
            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(final int r18) {
                /*
                // Method dump skipped, instructions count: 243
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2970ui.C50041af.C500443.onPageSelected(int):void");
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrolled(int i, float f, int i2) {
                if (C50041af.this.f115519n.mo81109aD() != null && C37699a.m76199B(C50041af.this.f115519n.mo81109aD()) && C37699a.m76308m(C50041af.this.f115519n.mo81109aD()).getSwipeUpType() == 5 && C50041af.this.f115523r.mo28555a()) {
                    C50041af.this.f115523r.f42663c.setValue(Float.valueOf((float) i2));
                }
                if (i == this.f115527a && f < 1.0E-10f) {
                    this.f115527a = -1;
                }
                if (C50041af.this.f115520o != null && f > 0.0f) {
                    int i3 = i + 1;
                    if (i3 > C50041af.this.f115520o.f116591a && C31575b.m65865g().isLogin()) {
                        if (C50041af.this.f115520o.f116591a > 1 && C50041af.this.f115522q < 2) {
                            C50041af.this.f115521p = C51648a.f118980a.mo87335o();
                            C50041af.this.f115522q++;
                        }
                        if (C50041af.this.f115521p >= 0 && !C50041af.this.f115520o.f116592b && C50041af.this.f115521p <= C50041af.this.f115520o.f116591a + 2) {
                            if (C50041af.this.f115521p == C50041af.this.f115520o.f116591a) {
                                C51648a.f118980a.mo87321c(true);
                            }
                            Aweme r = C50041af.this.f115519n.mo84854r(C50041af.this.f115519n.mo81109aD());
                            if (C50041af.this.f115521p <= C50041af.this.f115520o.f116591a + 2 && r != null && !r.isAd()) {
                                C51648a.f118980a.mo87303a(C51648a.f118980a.mo87293a("homepage_hot"), "homepage_hot", C50041af.this.getActivity());
                                C50041af.this.f115520o.f116592b = true;
                            }
                        }
                    }
                    C50479v vVar = C50041af.this.f115520o;
                    if (i3 > vVar.f116591a) {
                        vVar.f116591a = i3;
                    }
                }
            }
        });
        this.f116140j.mo67839a_(this.f115519n);
        ((C49976l) this.f116140j).f115290d = this.f115519n;
        ((C49976l) this.f116140j).f115288b = this.f115519n;
        this.f116140j.mo67838a((AbstractC39085b) new C49968d());
        this.f116140j.mo67865a((AbstractC39103d) this.f115519n);
        this.f115520o = new C50479v(this.f116140j);
        C61412a aVar2 = C61412a.C61413a.f139441a;
        ActivityC0945e activity = getActivity();
        if (C61412a.f139439b == null) {
            Boolean c = SharePrefCache.inst().getShowVideoBitrateInfo().mo59941c();
            if (c == null) {
                booleanValue = false;
            } else {
                booleanValue = c.booleanValue();
            }
            C61412a.f139439b = Boolean.valueOf(booleanValue);
        }
        if (C61412a.f139439b.booleanValue()) {
            aVar2.f139440a = new TextView(activity);
            aVar2.f139440a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            aVar2.f139440a.setPadding(10, (int) C13628n.m24520b(activity, 30.0f), 0, 0);
            aVar2.f139440a.setTextColor(-65536);
            ((FrameLayout) activity.findViewById(16908290)).addView(aVar2.f139440a);
        }
        mo85161e();
        C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_fragment_init_view", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_feed_recommend_fragment_send_request", false);
        C58945a.C58947b.f134185a.mo96425a("method_first_feed_request", false);
        if (getActivity() instanceof AbstractC59103j) {
            HomePageDataViewModel a = HomePageDataViewModel.C52942a.m97777a(getActivity());
            C52948a aVar3 = a.f121737c;
            str2 = aVar3.mo89329a();
            str3 = aVar3.mo89330b();
            str = aVar3.mo89331c();
            lock = a.f121738d;
            message = a.f121739e;
        } else {
            message = null;
            str = null;
            str2 = null;
            str3 = null;
            lock = null;
        }
        if (!((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).mo106968a().equals("")) {
            str3 = ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).mo106968a();
        }
        mo85161e();
        this.f116140j.mo57616a(1, 0, 0, str2, str3, str, lock, message);
        if (!TextUtils.isEmpty(str2)) {
            m93946c(str2);
        }
        C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_recommend_fragment_send_request", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_feed_recommend_startup_to_create_end", false);
        mo85721x();
        if (getActivity() instanceof AbstractC59103j) {
            ((AbstractC59103j) getActivity()).onFeedRecommendFragmentReady();
        }
        AbstractC17886b bVar = this.f115524z;
        if (bVar != null) {
            bVar.mo28469a();
        }
        if (this.f115508A == null && C49783b.m93234a()) {
            this.f115508A = C49788c.m93240a(getActivity(), this.f116136b);
        }
        C49806f.m93266a(true);
        if (!C49930t.f115093b) {
            C49930t.f115093b = true;
            AppLog.addSessionHook(new C49930t.C49931a((byte) 0));
        }
        C49930t.f115092a = SystemClock.uptimeMillis();
        this.f115512E = DataCenter.m69492a(C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null), this);
        this.f115523r = AdHomePageDataVM.C17902a.m33208a(getActivity());
        this.f115512E.mo60190a("onNewIntent", new C50047ah(this), true);
        ActivityC0945e activity2 = getActivity();
        if (activity2 instanceof AbstractC59103j) {
            ScrollSwitchStateManager a2 = ScrollSwitchStateManager.C52950a.m97811a(activity2);
            a2.mo89349b(getActivity(), new C50048ai(this, a2));
        }
        this.f115517J = C17873f.m33099g().mo143289d(new C50049aj(this));
        if (this.f116142l != null) {
            if (C47010hf.f109537a) {
                VerticalViewPager verticalViewPager = this.f116142l;
                int i = 5000;
                if (C47011hg.f109538a <= 5000) {
                    if (C47011hg.f109538a < 0) {
                        i = 0;
                    } else {
                        i = C47011hg.f109538a;
                    }
                }
                verticalViewPager.setEndScrollDelayTime(i);
            }
            if (C47012hh.f109539a) {
                VerticalViewPager verticalViewPager2 = this.f116142l;
                int i2 = 100;
                if (C47013hi.f109540a > 800) {
                    i2 = 800;
                } else if (C47013hi.f109540a >= 100) {
                    i2 = C47013hi.f109540a;
                }
                verticalViewPager2.setMaxSettleDuration(i2);
            }
        }
        C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_recommend_startup_to_create_end", false);
        C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_fragment_view_created", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_feed_view_created_to_focus", false);
        MethodCollector.m26664o(6917);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a;
        C58945a.C58947b.f134185a.mo96425a("cold_boot_feed_fragment_create_view", false);
        AbstractC56869p.C56870a.m103133a().mo94053a("onCreateView");
        if (C67261e.m119186d()) {
            a = C1870c.m6045a((Activity) getActivity(), (int) R.layout.s6);
        } else {
            a = C1870c.m6045a((Activity) getActivity(), (int) R.layout.s1);
        }
        C58945a.C58947b.f134185a.mo96429b("cold_boot_feed_fragment_create_view", false);
        return a;
    }
}
