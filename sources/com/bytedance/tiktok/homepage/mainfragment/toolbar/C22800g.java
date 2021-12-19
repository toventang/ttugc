package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.experiment.C46720aw;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.experiment.SpecialTopicEntry;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.g */
public final class C22800g extends AbstractC22773c {

    /* renamed from: a */
    public SingleWebView f53839a;

    /* renamed from: b */
    AbstractC22772b f53840b;

    /* renamed from: c */
    private AnimatedImageView f53841c;

    static {
        Covode.recordClassIndex(26696);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: c */
    public final int mo37087c() {
        return 8388629;
    }

    /* renamed from: g */
    private static SpecialTopicEntry m43017g() {
        try {
            return (SpecialTopicEntry) C16048b.m29633a().mo25415a(true, "special_event_entrypoint", SpecialTopicEntry.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    private static WebViewPreloadEntry m43018h() {
        WebViewPreloadEntry webViewPreloadEntry;
        try {
            webViewPreloadEntry = (WebViewPreloadEntry) C16048b.m29633a().mo25415a(true, "webview_preload_entry_ab", WebViewPreloadEntry.class);
            if (webViewPreloadEntry != null) {
                return webViewPreloadEntry;
            }
            try {
                return (WebViewPreloadEntry) SettingsManager.m29616a().mo25396a("webview_preload_entry", WebViewPreloadEntry.class);
            } catch (Throwable unused) {
                return webViewPreloadEntry;
            }
        } catch (Throwable unused2) {
            webViewPreloadEntry = null;
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final boolean mo37085a() {
        SpecialTopicEntry g = m43017g();
        if (g == null || !g.getEnable() || TextUtils.isEmpty(g.getLandingRoute()) || TextUtils.isEmpty(g.getIconUrl())) {
            return false;
        }
        if (!C80580in.m139687c() || g.getChildViewable()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo37111e() {
        AbstractC22772b bVar = this.f53840b;
        if (bVar == null || bVar.getActivity() == null || this.f53840b.getActivity().isFinishing()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (!this.f53840b.getActivity().isDestroyed()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo37112f() {
        SpecialTopicEntry g = m43017g();
        if (this.f53841c != null && g != null && g.getEnable() && !TextUtils.isEmpty(g.getLandingRoute()) && !TextUtils.isEmpty(g.getIconUrl())) {
            if (!C80580in.m139687c() || g.getChildViewable()) {
                String g2 = this.f53840b.mo37091g();
                if (C39223a.m79597k().mo68722f()) {
                    C39162r.m79460a("topic_entrance_show", new C33744d().mo59983a("enter_from", g2).mo59983a(StringSet.type, g.getEventName()).mo59983a("url", g.getLandingRoute()).f79943a);
                }
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: b */
    public final View mo37086b() {
        MethodCollector.m26663i(6694);
        SpecialTopicEntry g = m43017g();
        if (g == null) {
            MethodCollector.m26664o(6694);
            return null;
        }
        WebViewPreloadEntry h = m43018h();
        if (h != null && !TextUtils.isEmpty(h.getUrl())) {
            if (h.isBackground()) {
                C17873f.m33099g().mo143254a(new C22801h(this, h), C22802i.f53844a);
            } else {
                new C58221f.C58224c().mo95703b((AbstractC58264w) new SpecialEventIconGenerator$1(this, h)).mo95706a();
            }
        }
        if (C46720aw.m90103b()) {
            AnimatedImageView animatedImageView = (AnimatedImageView) HomePageUIFrameServiceImpl.m108627e().mo89400j(this.f53840b.getActivity());
            this.f53841c = animatedImageView;
            if (animatedImageView == null) {
                MethodCollector.m26664o(6694);
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) animatedImageView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f53841c);
            }
        } else {
            this.f53841c = (AnimatedImageView) HomePageUIFrameServiceImpl.m108627e().mo89401k(this.f53840b.getActivity());
        }
        C34577e.m70608b(this.f53841c, g.getIconUrl(), -1, -1);
        String g2 = this.f53840b.mo37091g();
        if (C39223a.m79597k().mo68722f()) {
            C39162r.m79460a("topic_entrance_show", new C33744d().mo59983a("enter_from", g2).mo59983a(StringSet.type, g.getEventName()).mo59983a("url", g.getLandingRoute()).f79943a);
        }
        AnimatedImageView animatedImageView2 = this.f53841c;
        MethodCollector.m26664o(6694);
        return animatedImageView2;
    }

    public C22800g(AbstractC22772b bVar) {
        this.f53840b = bVar;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final void mo37084a(View view) {
        SpecialTopicEntry g = m43017g();
        if (g != null) {
            SmartRouter.buildRoute(this.f53840b.getActivity(), g.getLandingRoute()).open();
            C39162r.m79460a("topic_entrance_click", new C33744d().mo59983a("enter_from", this.f53840b.mo37091g()).mo59983a(StringSet.type, g.getEventName()).mo59983a("url", g.getLandingRoute()).f79943a);
        }
    }

    /* renamed from: a */
    public final void mo37110a(String str, long j, boolean z) {
        if (this.f53840b.mo37093h() != null && mo37111e()) {
            this.f53840b.mo37093h().postDelayed(new RunnableC22803j(this, z, str), j);
        }
    }
}
