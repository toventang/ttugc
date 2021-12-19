package com.p2082ss.android.ugc.aweme.simkit;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.player.sdk.C62960a;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.p2082ss.android.ugc.aweme.simkit.config.C74612b;
import com.p2082ss.android.ugc.aweme.simkit.config.C74614c;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74646b;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74657j;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74672w;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74674x;
import com.p2082ss.android.ugc.aweme.simreporter.api.C74683b;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75218c;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80920j;
import com.p2082ss.android.ugc.aweme.video.preload.C80933o;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.aweme.video.preload.api.p4214a.C80842n;
import com.p2082ss.android.ugc.aweme.video.preload.p4216c.C80870b;
import com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService$$CC;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g;
import com.p2082ss.android.ugc.playerkit.exp.PlayerSettingService;
import com.p2082ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4327b.AbstractC84257b;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84266c;

/* renamed from: com.ss.android.ugc.aweme.simkit.SimKitService */
public class SimKitService implements AbstractC74608c {

    /* renamed from: a */
    public ISimKitConfig f167743a;

    /* renamed from: b */
    private AbstractC74607b f167744b = new C74617e();

    /* renamed from: c */
    private AbstractC84266c f167745c = new AbstractC84266c() {
        /* class com.p2082ss.android.ugc.aweme.simkit.SimKitService.C745991 */

        static {
            Covode.recordClassIndex(87415);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84266c
        /* renamed from: a */
        public final EnumC63056b mo117297a(String str, AbstractC63057c cVar) {
            return C74672w.C74673a.f167835a.mo117325a(str, cVar);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84266c
        /* renamed from: a */
        public final AbstractC81964c mo117298a(C84241i iVar, boolean z) {
            return C74672w.C74673a.f167835a.mo117326a(iVar, z);
        }
    };

    /* renamed from: d */
    private AbstractC84257b f167746d;

    /* renamed from: e */
    private ISpeedCalculator f167747e;

    static {
        Covode.recordClassIndex(87414);
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c
    /* renamed from: c */
    public final AbstractC84266c mo117291c() {
        return this.f167745c;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c
    /* renamed from: g */
    public final int mo117295g() {
        return C74646b.f167790a;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c
    /* renamed from: h */
    public final AbstractC74607b mo117296h() {
        return this.f167744b;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c
    /* renamed from: b */
    public final ISimKitConfig mo117290b() {
        ISimKitConfig iSimKitConfig = this.f167743a;
        if (iSimKitConfig == null) {
            return (ISimKitConfig) InjectedConfigManager.getConfig(ISimKitConfig.class);
        }
        return iSimKitConfig;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c
    /* renamed from: e */
    public final int mo117293e() {
        return mo117294f().mo118398c();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c
    /* renamed from: d */
    public final AbstractC81981g mo117292d() {
        if (this.f167746d == null) {
            IDimensionBitrateCurveConfig dimensionBitrateCurveConfig = AbstractC74616d.m131036a().mo117290b().getDimensionBitrateCurveConfig();
            if (dimensionBitrateCurveConfig == null || !dimensionBitrateCurveConfig.mo117320a()) {
                this.f167746d = new C74674x();
            } else {
                this.f167746d = new C74657j();
            }
        }
        return this.f167746d.mo117463a();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c
    /* renamed from: f */
    public final synchronized ISpeedCalculator mo117294f() {
        ISpeedCalculator iSpeedCalculator;
        ISpeedCalculatorConfig speedCalculatorConfig;
        MethodCollector.m26663i(9990);
        if (this.f167747e == null && (speedCalculatorConfig = AbstractC74616d.m131036a().mo117290b().getSpeedCalculatorConfig()) != null) {
            ISpeedCalculator a = AbstractC75218c.m131982a(speedCalculatorConfig.getCalculatorType()).mo118401a();
            this.f167747e = a;
            a.mo118394a(speedCalculatorConfig);
        }
        iSpeedCalculator = this.f167747e;
        MethodCollector.m26664o(9990);
        return iSpeedCalculator;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c
    /* renamed from: a */
    public final void mo117288a() {
        if (this.f167743a == null) {
            this.f167743a = (ISimKitConfig) InjectedConfigManager.getConfig(ISimKitConfig.class);
        }
        ISimPlayerService$$CC.get$$STATIC$$().mo124399a(new ISimPlayerService.AbstractC80989a() {
            /* class com.p2082ss.android.ugc.aweme.simkit.SimKitService.C746002 */

            static {
                Covode.recordClassIndex(87416);
            }

            @Override // com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService.AbstractC80989a
            /* renamed from: a */
            public final void mo117299a(String str) {
                SimKitService.this.f167743a.getALog().mo124331d(str);
            }
        });
        C80870b.f180816a = C74619f.f167755a;
        if (this.f167743a.getSimPlayerExperiment().PlayeAbEnableCustomizeThreadPoolExp() == 1) {
            ISimPlayerService$$CC.get$$STATIC$$().mo124400a(C84231a.f188310b);
        }
        C62960a.f142907a = this.f167743a.getAppConfig().isDebug();
        C74601a.f167750a = this.f167743a.getAppConfig().isDebug();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c
    /* renamed from: a */
    public final void mo117289a(Context context, ISimKitConfig iSimKitConfig) {
        MethodCollector.m26663i(9987);
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C84231a.m144835a((Application) applicationContext);
        this.f167743a = iSimKitConfig;
        C84231a.f188312d = iSimKitConfig.getAppConfig();
        C84231a.f188313e = iSimKitConfig.getMonitor();
        C84231a.f188314f = iSimKitConfig.getEvent();
        C84231a.f188315g = iSimKitConfig.getALog();
        C80716a aVar = C80716a.C80717a.f180462a;
        aVar.f180460a = iSimKitConfig.getSimPlayerExperiment();
        aVar.f180461b = new C74612b(iSimKitConfig.getSimPlayerConfig());
        PlayerSettingService.init(iSimKitConfig.PlayerSettingService(), iSimKitConfig.getAppConfig().isDebug());
        C80933o.f180960a = new C80842n(new C74614c(iSimKitConfig.getVideoPreloaderManagerConfig()));
        synchronized (C80937s.f180970a) {
            try {
                C80937s.f180971b = AbstractC80920j.m140447a();
                if (C80937s.f180972c != null) {
                    C80937s.f180971b.mo124067a(C80937s.f180972c);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(9987);
                throw th;
            }
        }
        C84199c.f187979a.f187980b = iSimKitConfig.getPlayerGlobalConfig();
        C74683b.f167874a = iSimKitConfig.getSimReporterConfig();
        mo117288a();
        MethodCollector.m26664o(9987);
    }
}
