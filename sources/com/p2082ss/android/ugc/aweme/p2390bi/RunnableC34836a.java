package com.p2082ss.android.ugc.aweme.p2390bi;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.experiment.C46722ay;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.BaseOptFirstFrameTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.StorageClearTask;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.power.PowerModeTask;
import com.p2082ss.android.ugc.aweme.recommend.RecommendUserDialogTask;
import com.p2082ss.android.ugc.aweme.requesttask.background.PreCreatePlayerTask;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bi.a */
public final class RunnableC34836a implements Runnable {

    /* renamed from: com.ss.android.ugc.aweme.bi.a$c */
    static final class C34840c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C34840c f82294a = new C34840c();

        static {
            Covode.recordClassIndex(41848);
        }

        C34840c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(41844);
    }

    public final void run() {
        AbstractC88979t<C17873f.C17874a> i = C17873f.f42625a.mo143294e().mo143189i();
        C89219l.m154716b(i, "");
        i.mo143289d(C34837a.f82290a);
        C17873f.m33092a().mo143268a(C34841b.f82295a).mo143254a(new C34838b(this), C34840c.f82294a);
    }

    /* renamed from: com.ss.android.ugc.aweme.bi.a$a */
    static final class C34837a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C34837a f82290a = new C34837a();

        static {
            Covode.recordClassIndex(41845);
        }

        C34837a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Activity activity = ((C17873f.C17874a) obj).f42643a;
            if (activity != null) {
                AbstractC79622e h = UgCommonServiceImpl.m138290j().mo123110h();
                Application application = activity.getApplication();
                String str = "";
                C89219l.m154716b(application, str);
                String canonicalName = activity.getClass().getCanonicalName();
                if (canonicalName != null) {
                    str = canonicalName;
                }
                h.mo123165a(application, str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bi.a$b */
    static final class C34838b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ RunnableC34836a f82291a;

        static {
            Covode.recordClassIndex(41846);
        }

        C34838b(RunnableC34836a aVar) {
            this.f82291a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C17873f.C17874a aVar = (C17873f.C17874a) obj;
            C58945a.C58947b.f134185a.mo96425a("method_append_lifecycle_init_runnable", false);
            if (C46722ay.f108895b || C46722ay.f108896c) {
                C40780g.m82245b().execute(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.p2390bi.RunnableC34836a.C34838b.RunnableC348391 */

                    /* renamed from: a */
                    final /* synthetic */ C34838b f82292a;

                    static {
                        Covode.recordClassIndex(41847);
                    }

                    {
                        this.f82292a = r1;
                    }

                    public final void run() {
                        RunnableC34836a.m71174a(aVar.f42644b);
                    }
                });
            } else {
                RunnableC34836a.m71174a(aVar.f42644b);
            }
            C58945a.C58947b.f134185a.mo96429b("method_append_lifecycle_init_runnable", false);
        }
    }

    /* renamed from: a */
    public static void m71174a(Bundle bundle) {
        C58221f.C58225d e = C58221f.m105153e();
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        C89219l.m154716b(createIMainServicebyMonsterPlugin, "");
        AbstractC58259r anchorListRequest = createIMainServicebyMonsterPlugin.getAnchorListRequest();
        C89219l.m154716b(anchorListRequest, "");
        C58221f.C58225d a = e.mo95704a(anchorListRequest);
        IMainService createIMainServicebyMonsterPlugin2 = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        C89219l.m154716b(createIMainServicebyMonsterPlugin2, "");
        AbstractC58264w legoRequestTask = createIMainServicebyMonsterPlugin2.getLegoRequestTask();
        C89219l.m154716b(legoRequestTask, "");
        C58221f.C58225d a2 = a.mo95704a(legoRequestTask);
        IMainService createIMainServicebyMonsterPlugin3 = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        C89219l.m154716b(createIMainServicebyMonsterPlugin3, "");
        AbstractC58264w shareCacheRegisterTask = createIMainServicebyMonsterPlugin3.getShareCacheRegisterTask();
        C89219l.m154716b(shareCacheRegisterTask, "");
        C58221f.C58225d a3 = a2.mo95704a(shareCacheRegisterTask).mo95704a(MSAdaptionService.m97895c().mo89367a("MainActivity", bundle));
        IMainService createIMainServicebyMonsterPlugin4 = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        C89219l.m154716b(createIMainServicebyMonsterPlugin4, "");
        AbstractC58264w registerStorageTask = createIMainServicebyMonsterPlugin4.getRegisterStorageTask();
        C89219l.m154716b(registerStorageTask, "");
        C58221f.C58225d a4 = a3.mo95704a(registerStorageTask).mo95704a(IMUnder16ProxyImpl.m102047n().mo93028j()).mo95704a(new RecommendUserDialogTask());
        IMainService createIMainServicebyMonsterPlugin5 = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        C89219l.m154716b(createIMainServicebyMonsterPlugin5, "");
        AbstractC58264w cookieMonitorTask = createIMainServicebyMonsterPlugin5.getCookieMonitorTask();
        C89219l.m154716b(cookieMonitorTask, "");
        a4.mo95704a(cookieMonitorTask).mo95704a(new StorageClearTask()).mo95704a(new PowerModeTask());
        AbstractC58264w c = CommentServiceImpl.m73664e().mo63305c();
        if (c != null) {
            e.mo95704a(c);
        }
        e.mo95704a(new BaseOptFirstFrameTask());
        e.mo95704a(new PreCreatePlayerTask());
        IMainService createIMainServicebyMonsterPlugin6 = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        C89219l.m154716b(createIMainServicebyMonsterPlugin6, "");
        AbstractC58264w fetchImUnder16RequestTask = createIMainServicebyMonsterPlugin6.getFetchImUnder16RequestTask();
        C89219l.m154716b(fetchImUnder16RequestTask, "");
        e.mo95704a(fetchImUnder16RequestTask);
        e.mo95706a();
    }
}
