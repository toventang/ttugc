package com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1777x.p1780c.C23697c;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.data.C56184a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.data.ImUnder16Manger;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88939d;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl */
public final class IMUnder16ProxyImpl implements IIMunder16Proxy {
    static {
        Covode.recordClassIndex(65971);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: a */
    public final boolean mo93019a() {
        return ImUnder16Manger.m102073d();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: c */
    public final boolean mo93021c() {
        return ImUnder16Manger.m102070c();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: d */
    public final boolean mo93022d() {
        return ImUnder16Manger.m102067b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: j */
    public final AbstractC58264w mo93028j() {
        return new IMUnder16InitTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: b */
    public final boolean mo93020b() {
        return ((Boolean) ImUnder16Manger.f128129c.mo59628a()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: e */
    public final String mo93023e() {
        return (String) ImUnder16Manger.f128130d.mo59628a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: f */
    public final String mo93024f() {
        return (String) ImUnder16Manger.f128131e.mo59628a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: g */
    public final String mo93025g() {
        return C17867d.m33078a().getString(R.string.f_h);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: m */
    public final long mo93031m() {
        return ((Number) ImUnder16Manger.f128132f.mo59628a()).longValue();
    }

    /* renamed from: n */
    public static IIMunder16Proxy m102047n() {
        MethodCollector.m26663i(4658);
        Object a = C81908b.m141854a(IIMunder16Proxy.class, false);
        if (a != null) {
            IIMunder16Proxy iIMunder16Proxy = (IIMunder16Proxy) a;
            MethodCollector.m26664o(4658);
            return iIMunder16Proxy;
        }
        if (C81908b.f183198bA == null) {
            synchronized (IIMunder16Proxy.class) {
                try {
                    if (C81908b.f183198bA == null) {
                        C81908b.f183198bA = new IMUnder16ProxyImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4658);
                    throw th;
                }
            }
        }
        IMUnder16ProxyImpl iMUnder16ProxyImpl = (IMUnder16ProxyImpl) C81908b.f183198bA;
        MethodCollector.m26664o(4658);
        return iMUnder16ProxyImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: h */
    public final void mo93026h() {
        if (!C23697c.m44781a(ImUnder16Manger.m102077f())) {
            SmartRouter.buildRoute(C17867d.m33078a(), "//webview").withParam("url", ImUnder16Manger.m102077f()).withParam("hide_nav_bar", true).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: i */
    public final void mo93027i() {
        if (!C23697c.m44781a(ImUnder16Manger.m102074e())) {
            SmartRouter.buildRoute(C17867d.m33078a(), "//webview").withParam("url", ImUnder16Manger.m102074e()).withParam("hide_nav_bar", true).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: k */
    public final void mo93029k() {
        if (!C80580in.m139687c()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                AbstractC88403ab<C56184a> a = ImUnder16Manger.f128127a.getUnder16Info().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a));
                C89219l.m154716b(a, "");
                C88939d.m154198a(a, ImUnder16Manger.C56174g.f128152a, ImUnder16Manger.C56173f.f128151a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy
    /* renamed from: l */
    public final void mo93030l() {
        ImUnder16Manger.f128133g.storeBoolean("is_chat_function_off", false);
        ImUnder16Manger.f128133g.storeBoolean("show_msg_privacy_entrance", true);
        ImUnder16Manger.f128133g.storeString("download_data_page_url", "");
        ImUnder16Manger.f128133g.storeString("msg_disappear_page_url", "");
        ImUnder16Manger.f128133g.storeString("alert_title", "");
        ImUnder16Manger.f128133g.storeString("alert_content", "");
        ImUnder16Manger.f128133g.storeString("chat_cell_title", "");
        ImUnder16Manger.f128133g.storeString("chat_cell_content", "");
        ImUnder16Manger.f128133g.storeBoolean("show_msg_disappear_chat_cell", false);
        ImUnder16Manger.f128133g.storeBoolean("clear_im_chatlist", false);
        ImUnder16Manger.f128133g.storeBoolean("redirect_to_msg_disappear_page", false);
        ImUnder16Manger.f128133g.storeLong("msg_disappear_chat_cell_server_time", Long.MAX_VALUE);
        ImUnder16Manger.f128128b = false;
        ImUnder16Manger.m102063a(false);
        ImUnder16Manger.m102066b(true);
        ImUnder16Manger.m102062a("");
        ImUnder16Manger.m102065b("");
        ImUnder16Manger.m102068c("");
        ImUnder16Manger.m102071d("");
        ImUnder16Manger.m102075e("");
        ImUnder16Manger.m102078f("");
        ImUnder16Manger.m102069c(false);
        ImUnder16Manger.m102076e(false);
        ImUnder16Manger.m102072d(false);
        ImUnder16Manger.m102079f(false);
        ImUnder16Manger.m102061a(Long.MAX_VALUE);
    }
}
