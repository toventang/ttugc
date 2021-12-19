package com.p2082ss.android.ugc.aweme.app;

import android.app.Application;
import android.content.Context;
import com.bytedance.business.base.IBusinessToolsService;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.C16099b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17988h;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.C17993j;
import com.bytedance.ies.uikit.p1279a.C18236d;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer;
import com.p2082ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider;
import com.p2082ss.android.ugc.aweme.commerce.p2514c.C37487a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService;
import com.p2082ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37657a;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37661aa;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37662ab;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37676i;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37677j;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37678k;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37679l;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37680m;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37681n;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37682o;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37684q;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37685r;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37686s;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37688u;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37689v;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37694x;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37697z;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.splash.C38489a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitLiveServiceTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitRouter;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadInstanceTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SettingsReaderInitTask;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33111a;
import com.p2082ss.android.ugc.aweme.p2729dd.C40958a;
import com.p2082ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.p2082ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.p2082ss.android.ugc.aweme.service.IBusinessToolsUtilService;
import com.p2082ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.p2082ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.p2082ss.android.ugc.aweme.util.C80127e;
import com.p2082ss.android.ugc.aweme.utils.C80282bx;
import com.weekend.recorder.api.C87932a;
import com.weekend.recorder.api.p4510a.AbstractC87934a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.p */
public abstract class AbstractC33837p implements IInitAllService {
    static {
        Covode.recordClassIndex(40737);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: a */
    public void mo59708a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: i */
    public final void mo59718i() {
        C33836o.m69201a();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: c */
    public final AbstractC58264w mo59711c() {
        return new GeckoHighPriorityCheckInRequest();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: d */
    public final AbstractC58264w mo59713d() {
        return new GeckoCheckInRequest();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: f */
    public final AbstractC58264w mo59715f() {
        return new SettingsReaderInitTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: g */
    public final AbstractC58264w mo59716g() {
        return new PreloadInstanceTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: j */
    public final AbstractC58264w mo59719j() {
        return new InitRouter();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: k */
    public final AbstractC58264w mo59720k() {
        return new InitLiveServiceTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: e */
    public final void mo59714e() {
        C18236d.f43454b = AwemeAppData.m60956a();
        C18236d.f43456d = AwemeAppData.m60956a();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: a */
    public final void mo59706a() {
        if (!C58195d.m105113f() && C40958a.f95791a == null) {
            try {
                C40958a.f95791a = new C40958a();
            } catch (Exception unused) {
            }
            Logger.debug();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: b */
    public final void mo59709b() {
        if (C58939a.m108263a()) {
            C87932a.f199693b.init(String.valueOf(C17867d.f42590n), C17867d.f42595s, new C37487a(), new AbstractC87934a() {
                /* class com.p2082ss.android.ugc.aweme.app.AbstractC33837p.C338381 */

                static {
                    Covode.recordClassIndex(40738);
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: h */
    public final void mo59717h() {
        new C58221f.C58224c().mo95703b((AbstractC58264w) new BaseInitAllService$2(this)).mo95706a();
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: b */
    public final void mo59710b(Application application) {
        try {
            Context applicationContext = application.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            C80282bx.m139181a(applicationContext);
        } catch (Exception unused) {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: c */
    public final void mo59712c(Application application) {
        IBusinessToolsUtilService iBusinessToolsUtilService;
        if (C80127e.m138894b() && C29843f.m60129a(application)) {
            IBusinessToolsService a = C80127e.m138893a();
            if (C80127e.m138894b() && a != null && (iBusinessToolsUtilService = (IBusinessToolsUtilService) ServiceManager.get().getService(IBusinessToolsUtilService.class)) != null) {
                iBusinessToolsUtilService.initBusinessToolsLogic(application);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.app.IInitAllService
    /* renamed from: a */
    public final void mo59707a(Application application) {
        C16099b bVar = new C16099b();
        C37677j jVar = new C37677j();
        C89219l.m154719c(jVar, "");
        bVar.f38773b = jVar;
        C37676i iVar = new C37676i();
        C89219l.m154719c(iVar, "");
        bVar.f38778g = iVar;
        C37661aa aaVar = new C37661aa();
        C89219l.m154719c(aaVar, "");
        bVar.f38775d = aaVar;
        C37688u uVar = new C37688u();
        C89219l.m154719c(uVar, "");
        bVar.f38774c = uVar;
        C37684q qVar = new C37684q();
        C89219l.m154719c(qVar, "");
        bVar.f38772a = qVar;
        C37685r rVar = new C37685r();
        C89219l.m154719c(rVar, "");
        bVar.f38779h = rVar;
        C37686s sVar = new C37686s();
        C89219l.m154719c(sVar, "");
        bVar.f38777f = sVar;
        C37689v vVar = new C37689v();
        C89219l.m154719c(vVar, "");
        bVar.f38776e = vVar;
        C37694x xVar = new C37694x();
        C89219l.m154719c(xVar, "");
        bVar.f38780i = xVar;
        C37662ab abVar = new C37662ab();
        C89219l.m154719c(abVar, "");
        bVar.f38782k = abVar;
        C16091a.f38745e.mo25542a(bVar);
        if (!((Boolean) C17988h.f42836a.getValue()).booleanValue()) {
            ISplashAdService i = SplashAdServiceImpl.m33397i();
            if (i != null) {
                i.mo28710a(new C38489a());
            }
            C37663b bVar2 = C37663b.f89031b;
            bVar2.f89033a.mo123715a(new C37657a());
            C33111a.f78701a.mo123715a(C33561a.f79716a);
            ICommercializeAdService a = CommercializeAdServiceImpl.m79243a();
            if (a != null) {
                a.mo67722a(application, C33840r.f80097a, !C17993j.m33511e());
            }
            if (!C17993j.m33511e()) {
                C33561a.f79716a.mo58968a();
                C33561a.f79716a.mo58970c();
                C33561a.f79716a.mo58969b();
                C33840r.m69217a();
            }
            ICommerceEggService c = CommerceEggServiceImpl.m76488c();
            if (c != null) {
                c.mo65836a(new C37680m());
            }
            ICommerceMediaService f = CommerceMediaServiceImpl.m77578f();
            if (f != null) {
                f.mo66509a(new C37681n());
            }
            ICommerceChallengeService e = CommerceChallengeServiceImpl.m75741e();
            if (e != null) {
                e.mo65382a(new C37679l());
            }
            ICommerceStickerService c2 = CommerceStickerServiceImpl.m75788c();
            if (c2 != null) {
                c2.mo65421a(new C37682o());
            }
            IChallengeDetailProvider b = ChallengeDetailProvicer.m72635b();
            if (b != null) {
                b.mo62522a(new C37678k());
            }
            ITcmService j = TcmServiceImpl.m135859j();
            if (j != null) {
                j.mo121253a(new C37697z());
            }
        }
    }
}
