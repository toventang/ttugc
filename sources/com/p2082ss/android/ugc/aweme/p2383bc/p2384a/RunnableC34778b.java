package com.p2082ss.android.ugc.aweme.p2383bc.p2384a;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46939fp;
import com.p2082ss.android.ugc.aweme.experiment.C47029j;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58420ae;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitPushTask;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bc.a.b */
public final class RunnableC34778b implements Runnable {
    static {
        Covode.recordClassIndex(41774);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bc.a.b$a */
    public static final class RunnableC34779a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InitAVModule f82116a;

        static {
            Covode.recordClassIndex(41775);
        }

        RunnableC34779a(InitAVModule initAVModule) {
            this.f82116a = initAVModule;
        }

        public final void run() {
            InitAVModule.m105770c();
        }
    }

    public final void run() {
        C58945a.C58947b.f134185a.mo96425a("method_ensure_duration", false);
        if (!C58152b.m105089g()) {
            C58945a.C58947b.f134185a.mo96425a("method_fresco_ensure_duration", false);
            AbstractC58264w c = C58420ae.m106835c();
            C89219l.m154716b(c, "");
            C58221f.m105147a(c);
            C58945a.C58947b.f134185a.mo96429b("method_fresco_ensure_duration", false);
        }
        C58945a.C58947b.f134185a.mo96425a("method_business_tools_ensure_duration", false);
        AbstractC58264w g = C58420ae.m106839g();
        C89219l.m154716b(g, "");
        C58221f.m105147a(g);
        C58945a.C58947b.f134185a.mo96429b("method_business_tools_ensure_duration", false);
        C58945a.C58947b.f134185a.mo96425a("method_absdk_ensure_duration", false);
        AbstractC58264w d = C58420ae.m106836d();
        C89219l.m154716b(d, "");
        C58221f.m105147a(d);
        C58945a.C58947b.f134185a.mo96429b("method_absdk_ensure_duration", false);
        C58945a.C58947b.f134185a.mo96425a("method_init_module_ensure_duration", false);
        AbstractC58264w b = C58420ae.m106834b();
        C89219l.m154716b(b, "");
        C58221f.m105147a(b);
        C58945a.C58947b.f134185a.mo96429b("method_init_module_ensure_duration", false);
        if (!C58195d.m105111d()) {
            C58945a.C58947b.f134185a.mo96425a("method_cancel_notification_ensure_duration", false);
            AbstractC58264w h = C58420ae.m106840h();
            C89219l.m154716b(h, "");
            C58221f.m105147a(h);
            C58945a.C58947b.f134185a.mo96429b("method_cancel_notification_ensure_duration", false);
        }
        if (C67214a.m119153c()) {
            C58945a.C58947b.f134185a.mo96425a("method_router_ensure_duration", false);
            AbstractC58264w j = C58420ae.m106842j();
            C89219l.m154716b(j, "");
            C58221f.m105147a(j);
            C58945a.C58947b.f134185a.mo96429b("method_router_ensure_duration", false);
        }
        if (!C46939fp.m90233c() && C67214a.m119154d()) {
            C58945a.C58947b.f134185a.mo96425a("method_init_push_early_ensure_duration", false);
            AbstractC58264w e = C58420ae.m106837e();
            C89219l.m154716b(e, "");
            C58221f.m105147a(e);
            C58945a.C58947b.f134185a.mo96429b("method_init_push_early_ensure_duration", false);
        }
        if (C67214a.m119155e()) {
            C58945a.C58947b.f134185a.mo96425a("method_init_avmodule_ensure_duration", false);
            AbstractC58264w m = C58420ae.m106845m();
            Objects.requireNonNull(m, "null cannot be cast to non-null type com.ss.android.ugc.aweme.legoImp.task.InitAVModule");
            InitAVModule initAVModule = (InitAVModule) m;
            C58221f.m105147a((AbstractC58264w) initAVModule);
            if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
                InitAVModule.m105770c();
            } else {
                C58254p.m105190a().post(new RunnableC34779a(initAVModule));
            }
            C58945a.C58947b.f134185a.mo96429b("method_init_avmodule_ensure_duration", false);
        }
        if (!C46939fp.m90233c() && InitPushTask.m105898c()) {
            C58945a.C58947b.f134185a.mo96425a("method_init_push_async_ensure_duration", false);
            AbstractC58264w e2 = C58420ae.m106837e();
            C89219l.m154716b(e2, "");
            C58221f.m105147a(e2);
            C58945a.C58947b.f134185a.mo96429b("method_init_push_async_ensure_duration", false);
        }
        C58945a.C58947b.f134185a.mo96425a("method_power_page_ensure_duration", false);
        AbstractC58264w i = C58420ae.m106841i();
        C89219l.m154716b(i, "");
        C58221f.m105147a(i);
        C58945a.C58947b.f134185a.mo96429b("method_power_page_ensure_duration", false);
        C58945a.C58947b.f134185a.mo96425a("method_init_foundation_ensure_duration", false);
        AbstractC58264w k = C58420ae.m106843k();
        C89219l.m154716b(k, "");
        C58221f.m105147a(k);
        C58945a.C58947b.f134185a.mo96429b("method_init_foundation_ensure_duration", false);
        C58945a.C58947b.f134185a.mo96425a("method_init_ui_ensure_duration", false);
        AbstractC58264w l = C58420ae.m106844l();
        C89219l.m154716b(l, "");
        C58221f.m105147a(l);
        C58945a.C58947b.f134185a.mo96429b("method_init_ui_ensure_duration", false);
        if (!C67214a.m119158h()) {
            C58945a.C58947b.f134185a.mo96425a("method_int_player_kit_ensure_duration", false);
            AbstractC58264w a = C58420ae.m106833a();
            C89219l.m154716b(a, "");
            C58221f.m105147a(a);
            C58945a.C58947b.f134185a.mo96429b("method_int_player_kit_ensure_duration", false);
        }
        if (C47029j.m90292b()) {
            C58945a.C58947b.f134185a.mo96425a("method_int_appflyer_ensure_duration", false);
            AbstractC58264w p = C58420ae.m106848p();
            C89219l.m154716b(p, "");
            C58221f.m105147a(p);
            C58945a.C58947b.f134185a.mo96429b("method_int_appflyer_ensure_duration", false);
        }
        C58945a.C58947b.f134185a.mo96429b("method_ensure_duration", false);
    }
}
