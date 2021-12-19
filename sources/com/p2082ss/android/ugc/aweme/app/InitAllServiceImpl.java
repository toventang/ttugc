package com.p2082ss.android.ugc.aweme.app;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17993j;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.launcher.InstrumentationC58076a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitAbTest;
import com.p2082ss.android.ugc.aweme.legoImp.task.InstallEventBus;
import com.p2082ss.android.ugc.aweme.legoImp.task.RegisterLifecycle;
import com.p2082ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask;

/* renamed from: com.ss.android.ugc.aweme.app.InitAllServiceImpl */
public class InitAllServiceImpl extends AbstractC33837p {

    /* renamed from: a */
    boolean f79694a;

    static {
        Covode.recordClassIndex(40434);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: l */
    public final AbstractC58264w mo59721l() {
        return new InitAbTest();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: m */
    public final AbstractC58264w mo59722m() {
        return new RegisterLifecycle();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: n */
    public final void mo59723n() {
        C53438a.m98620a(null);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: o */
    public final AbstractC58264w mo59724o() {
        return new YoutubeRefreshTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: p */
    public final AbstractC58264w mo59725p() {
        return new InstallEventBus();
    }

    /* renamed from: q */
    public static IInitAllService m68762q() {
        MethodCollector.m26663i(6006);
        Object a = C81908b.m141854a(IInitAllService.class, false);
        if (a != null) {
            IInitAllService iInitAllService = (IInitAllService) a;
            MethodCollector.m26664o(6006);
            return iInitAllService;
        }
        if (C81908b.f183128K == null) {
            synchronized (IInitAllService.class) {
                try {
                    if (C81908b.f183128K == null) {
                        C81908b.f183128K = new InitAllServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6006);
                    throw th;
                }
            }
        }
        AbstractC33837p pVar = (AbstractC33837p) C81908b.f183128K;
        MethodCollector.m26664o(6006);
        return pVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService, com.p2082ss.android.ugc.aweme.app.AbstractC33837p
    /* renamed from: a */
    public final void mo59708a(Context context) {
        if (C49907s.m93685a().booleanValue()) {
            InstrumentationC58076a.m104926a(new C33890y(this));
        } else if (C17993j.m33510d()) {
            InstrumentationC58076a.m104926a(new C33891z(this, context));
        }
    }
}
