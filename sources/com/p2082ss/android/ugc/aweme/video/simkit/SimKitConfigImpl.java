package com.p2082ss.android.ugc.aweme.video.simkit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.p2082ss.android.ugc.aweme.simreporter.api.C74682a;
import com.p2082ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.p2082ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.p2082ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.p2082ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.p2082ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.p2082ss.android.ugc.aweme.video.simcommon.SimALog;
import com.p2082ss.android.ugc.aweme.video.simcommon.SimAppConfig;
import com.p2082ss.android.ugc.aweme.video.simcommon.SimMobEvent;
import com.p2082ss.android.ugc.aweme.video.simcommon.SimMonitor;
import com.p2082ss.android.ugc.aweme.video.simkit.p4219a.C80968a;
import com.p2082ss.android.ugc.aweme.video.simkit.p4219a.C80983b;
import com.p2082ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl;
import com.p2082ss.android.ugc.aweme.video.simplayer.PlayerExperimentImpl;
import com.p2082ss.android.ugc.aweme.video.simplayer.PlayerSettingServiceImpl;
import com.p2082ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl;
import com.p2082ss.android.ugc.playerkit.exp.PlayerSettingService;
import com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import com.p2082ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl */
public final class SimKitConfigImpl implements ISimKitConfig {
    private final AbstractC89244h mALog$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80954a.f180994a);
    private final AbstractC89244h mAppConfig$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80955b.f180995a);
    private final AbstractC89244h mCommonConfig$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80956c.f180996a);
    private final AbstractC89244h mDimensionBitrateCurveConfig$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80957d.f180997a);
    private final AbstractC89244h mDimensionBitrateFilterConfig$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80958e.f180998a);
    private final AbstractC89244h mEvent$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80959f.f180999a);
    private final AbstractC89244h mMonitor$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80960g.f181000a);
    private final AbstractC89244h mPlayerExperiment$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80961h.f181001a);
    private final AbstractC89244h mPlayerGlobalConfig$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80962i.f181002a);
    private final AbstractC89244h mPlayerSettingService$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80963j.f181003a);
    private final AbstractC89244h mPreloaderExperiment$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C80964k(this));
    private final AbstractC89244h mSimPlayerConfig$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80965l.f181005a);
    private final AbstractC89244h mSpeedCalculatorConfig$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80966m.f181006a);
    private final AbstractC89244h mVideoPreloaderManagerConfig$delegate = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80967n.f181007a);

    static {
        Covode.recordClassIndex(94262);
    }

    private final IALog getMALog() {
        return (IALog) this.mALog$delegate.getValue();
    }

    private final IAppConfig getMAppConfig() {
        return (IAppConfig) this.mAppConfig$delegate.getValue();
    }

    private final ICommonConfig getMCommonConfig() {
        return (ICommonConfig) this.mCommonConfig$delegate.getValue();
    }

    private final IDimensionBitrateCurveConfig getMDimensionBitrateCurveConfig() {
        return (IDimensionBitrateCurveConfig) this.mDimensionBitrateCurveConfig$delegate.getValue();
    }

    private final IDimensionBitrateFilterConfig getMDimensionBitrateFilterConfig() {
        return (IDimensionBitrateFilterConfig) this.mDimensionBitrateFilterConfig$delegate.getValue();
    }

    private final IEvent getMEvent() {
        return (IEvent) this.mEvent$delegate.getValue();
    }

    private final IMonitor getMMonitor() {
        return (IMonitor) this.mMonitor$delegate.getValue();
    }

    private final IPlayerExperiment getMPlayerExperiment() {
        return (IPlayerExperiment) this.mPlayerExperiment$delegate.getValue();
    }

    private final PlayerGlobalConfig getMPlayerGlobalConfig() {
        return (PlayerGlobalConfig) this.mPlayerGlobalConfig$delegate.getValue();
    }

    private final PlayerSettingService getMPlayerSettingService() {
        return (PlayerSettingService) this.mPlayerSettingService$delegate.getValue();
    }

    private final IPreloaderExperiment getMPreloaderExperiment() {
        return (IPreloaderExperiment) this.mPreloaderExperiment$delegate.getValue();
    }

    private final ISimPlayerConfig getMSimPlayerConfig() {
        return (ISimPlayerConfig) this.mSimPlayerConfig$delegate.getValue();
    }

    private final ISpeedCalculatorConfig getMSpeedCalculatorConfig() {
        return (ISpeedCalculatorConfig) this.mSpeedCalculatorConfig$delegate.getValue();
    }

    public final IVideoPreloadConfig getMVideoPreloaderManagerConfig() {
        return (IVideoPreloadConfig) this.mVideoPreloaderManagerConfig$delegate.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$a */
    static final class C80954a extends AbstractC89220m implements AbstractC89171a<SimALog> {

        /* renamed from: a */
        public static final C80954a f180994a = new C80954a();

        static {
            Covode.recordClassIndex(94263);
        }

        C80954a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SimALog invoke() {
            return new SimALog();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$b */
    static final class C80955b extends AbstractC89220m implements AbstractC89171a<SimAppConfig> {

        /* renamed from: a */
        public static final C80955b f180995a = new C80955b();

        static {
            Covode.recordClassIndex(94264);
        }

        C80955b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SimAppConfig invoke() {
            return new SimAppConfig();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$c */
    static final class C80956c extends AbstractC89220m implements AbstractC89171a<SimKitCommonConfig> {

        /* renamed from: a */
        public static final C80956c f180996a = new C80956c();

        static {
            Covode.recordClassIndex(94265);
        }

        C80956c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SimKitCommonConfig invoke() {
            return new SimKitCommonConfig();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$d */
    static final class C80957d extends AbstractC89220m implements AbstractC89171a<C80968a> {

        /* renamed from: a */
        public static final C80957d f180997a = new C80957d();

        static {
            Covode.recordClassIndex(94266);
        }

        C80957d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C80968a invoke() {
            return new C80968a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$e */
    static final class C80958e extends AbstractC89220m implements AbstractC89171a<C80983b> {

        /* renamed from: a */
        public static final C80958e f180998a = new C80958e();

        static {
            Covode.recordClassIndex(94267);
        }

        C80958e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C80983b invoke() {
            return new C80983b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$f */
    static final class C80959f extends AbstractC89220m implements AbstractC89171a<SimMobEvent> {

        /* renamed from: a */
        public static final C80959f f180999a = new C80959f();

        static {
            Covode.recordClassIndex(94268);
        }

        C80959f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SimMobEvent invoke() {
            return new SimMobEvent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$g */
    static final class C80960g extends AbstractC89220m implements AbstractC89171a<SimMonitor> {

        /* renamed from: a */
        public static final C80960g f181000a = new C80960g();

        static {
            Covode.recordClassIndex(94269);
        }

        C80960g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SimMonitor invoke() {
            return new SimMonitor();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$h */
    static final class C80961h extends AbstractC89220m implements AbstractC89171a<PlayerExperimentImpl> {

        /* renamed from: a */
        public static final C80961h f181001a = new C80961h();

        static {
            Covode.recordClassIndex(94270);
        }

        C80961h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PlayerExperimentImpl invoke() {
            return new PlayerExperimentImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$i */
    static final class C80962i extends AbstractC89220m implements AbstractC89171a<PlayerGlobalConfigImpl> {

        /* renamed from: a */
        public static final C80962i f181002a = new C80962i();

        static {
            Covode.recordClassIndex(94271);
        }

        C80962i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PlayerGlobalConfigImpl invoke() {
            return new PlayerGlobalConfigImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$j */
    static final class C80963j extends AbstractC89220m implements AbstractC89171a<PlayerSettingServiceImpl> {

        /* renamed from: a */
        public static final C80963j f181003a = new C80963j();

        static {
            Covode.recordClassIndex(94272);
        }

        C80963j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PlayerSettingServiceImpl invoke() {
            return new PlayerSettingServiceImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$l */
    static final class C80965l extends AbstractC89220m implements AbstractC89171a<PlayerConfigImpl> {

        /* renamed from: a */
        public static final C80965l f181005a = new C80965l();

        static {
            Covode.recordClassIndex(94274);
        }

        C80965l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PlayerConfigImpl invoke() {
            return new PlayerConfigImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$m */
    static final class C80966m extends AbstractC89220m implements AbstractC89171a<SpeedConfigImpl> {

        /* renamed from: a */
        public static final C80966m f181006a = new C80966m();

        static {
            Covode.recordClassIndex(94275);
        }

        C80966m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SpeedConfigImpl invoke() {
            return new SpeedConfigImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$n */
    static final class C80967n extends AbstractC89220m implements AbstractC89171a<VideoPreloadManagerConfigImpl> {

        /* renamed from: a */
        public static final C80967n f181007a = new C80967n();

        static {
            Covode.recordClassIndex(94276);
        }

        C80967n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoPreloadManagerConfigImpl invoke() {
            return new VideoPreloadManagerConfigImpl();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final PlayerSettingService PlayerSettingService() {
        return getMPlayerSettingService();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IALog getALog() {
        return getMALog();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IAppConfig getAppConfig() {
        return getMAppConfig();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final ICommonConfig getCommonConfig() {
        return getMCommonConfig();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IDimensionBitrateCurveConfig getDimensionBitrateCurveConfig() {
        return getMDimensionBitrateCurveConfig();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IDimensionBitrateFilterConfig getDimensionBitrateFilterConfig() {
        return getMDimensionBitrateFilterConfig();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IEvent getEvent() {
        return getMEvent();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IMonitor getMonitor() {
        return getMMonitor();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final PlayerGlobalConfig getPlayerGlobalConfig() {
        return getMPlayerGlobalConfig();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IPreloaderExperiment getPreloaderExperiment() {
        return getMPreloaderExperiment();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final ISimPlayerConfig getSimPlayerConfig() {
        return getMSimPlayerConfig();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IPlayerExperiment getSimPlayerExperiment() {
        return getMPlayerExperiment();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final ISimReporterConfig getSimReporterConfig() {
        return new C74682a();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final ISpeedCalculatorConfig getSpeedCalculatorConfig() {
        return getMSpeedCalculatorConfig();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig
    public final IVideoPreloadConfig getVideoPreloaderManagerConfig() {
        return getMVideoPreloaderManagerConfig();
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl$k */
    static final class C80964k extends AbstractC89220m implements AbstractC89171a<IPreloaderExperiment> {

        /* renamed from: a */
        final /* synthetic */ SimKitConfigImpl f181004a;

        static {
            Covode.recordClassIndex(94273);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80964k(SimKitConfigImpl simKitConfigImpl) {
            super(0);
            this.f181004a = simKitConfigImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IPreloaderExperiment invoke() {
            return this.f181004a.getMVideoPreloaderManagerConfig().getExperiment();
        }
    }
}
