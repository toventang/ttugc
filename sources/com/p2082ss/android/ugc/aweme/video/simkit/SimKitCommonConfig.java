package com.p2082ss.android.ugc.aweme.video.simkit;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34852c;
import com.p2082ss.android.ugc.aweme.player.C62890a;
import com.p2082ss.android.ugc.aweme.player.C62933c;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74602a;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74604c;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74606e;
import com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.p2082ss.android.ugc.aweme.simkit.impl.p3910a.C74621b;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.p2082ss.android.ugc.aweme.simkit.model.p3913b.C74676a;
import com.p2082ss.android.ugc.aweme.simkit.model.p3913b.C74677b;
import com.p2082ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p2082ss.android.ugc.aweme.video.p4208b.AbstractC80684j;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80703w;
import com.p2082ss.android.ugc.aweme.video.p4211e.C80721a;
import com.p2082ss.android.ugc.aweme.video.p4211e.C80722b;
import com.p2082ss.android.ugc.aweme.video.p4211e.C80723c;
import com.p2082ss.android.ugc.aweme.video.preload.C80860b;
import com.p2082ss.android.ugc.aweme.video.simcommon.C80942a;
import com.p2082ss.android.ugc.aweme.video.simcommon.p4218a.C80946c;
import com.p2082ss.android.ugc.aweme.video.util.C81076b;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.simkit.SimKitCommonConfig */
public class SimKitCommonConfig implements ICommonConfig {
    private static C74676a superResolutionStrategyExperimentValue;
    public static boolean superResolutionStrategyExperimentValueInited;
    private AbstractC74602a mSrListener = new AbstractC74602a() {
        /* class com.p2082ss.android.ugc.aweme.video.simkit.SimKitCommonConfig.C809511 */

        static {
            Covode.recordClassIndex(94259);
        }

        @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74602a
        /* renamed from: a */
        public final boolean mo117324a(C84241i iVar) {
            boolean a;
            if (C62890a.f142627a) {
                a = ((Boolean) C62933c.f142851i.getValue()).booleanValue();
            } else {
                a = C16048b.m29633a().mo25421a(true, "enable_force_close_self_publish_video_sr", false);
            }
            if (a) {
                if (!TextUtils.isEmpty(LocalVideoPlayerManager.m140055a().mo123959a(C80942a.m140472a(iVar)))) {
                    return true;
                }
            }
            return false;
        }
    };

    static {
        Covode.recordClassIndex(94258);
    }

    /* renamed from: com_ss_android_ugc_aweme_video_simkit_SimKitCommonConfig_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m140496xad732025(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public List getColdBootVideoUrlHooks() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public int getDefaultCDNTimeoutTime() {
        return 2400000;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public C74677b getSuperResolutionStrategyConfigV2() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public AbstractC34852c getAutoBitrateSetStrategy() {
        return C80946c.f180983a;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public AbstractC74602a getForceSuperResolutionListener() {
        return this.mSrListener;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public AbstractC74605d getSuperResolutionStrategy() {
        return C74621b.C74622a.f167762a;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public AbstractC74604c getCommonParamsProcessor() {
        return new AbstractC74604c() {
            /* class com.p2082ss.android.ugc.aweme.video.simkit.SimKitCommonConfig.C809533 */

            static {
                Covode.recordClassIndex(94261);
            }

            @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74604c
            /* renamed from: a */
            public final String mo117327a(String str) {
                return C81076b.m140767b(str).mo52126a();
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public RateSettingsResponse getRateSettingsResponse() {
        return VideoBitRateABManager.f180314a.f180316b;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public C74676a getSuperResolutionStrategyConfig() {
        return getSuperResolutionStrategyExperimentValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public AbstractC74606e getVideoUrlHookHook() {
        return new AbstractC74606e() {
            /* class com.p2082ss.android.ugc.aweme.video.simkit.SimKitCommonConfig.C809522 */

            static {
                Covode.recordClassIndex(94260);
            }

            @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74606e
            /* renamed from: a */
            public final String mo117331a(C84241i iVar) {
                if (iVar == null) {
                    return null;
                }
                String a = C80860b.m140276a(iVar.getSourceId());
                if (C80860b.m140277b(a)) {
                    return a;
                }
                return null;
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public int getBitrateBusinessType() {
        return C16048b.m29633a().mo25412a(true, "bitrate_modularization_experiment", 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public double getBitrateSwitchThreshold() {
        return C16048b.m29633a().mo25409a(true, "bitrate_switch_threshold", 0.75d);
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public RateSettingsResponse getDefaultRateSettingsResponse() {
        VideoBitRateABManager videoBitRateABManager = VideoBitRateABManager.f180314a;
        if (videoBitRateABManager.f180319e == null) {
            videoBitRateABManager.mo123827b();
        }
        return videoBitRateABManager.f180319e;
    }

    public double getSpeedInBitPerSec() {
        return C84116g.m144636e().mo124230d();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean isUseLastNetworkSpeed() {
        return C16048b.m29633a().mo25421a(true, "is_record_last_network_speed_enabled", true);
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public int getLastNetworkSpeed() {
        return SharePrefCache.inst().getLastUsableNetworkSpeed().mo59941c().intValue();
    }

    public int getPreloaderType() {
        if (C16048b.m29633a().mo25412a(true, "preloader_type", 2) == C80703w.f180426a) {
            return 0;
        }
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public List<AbstractC84278n> getVideoUrlHooks() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C80722b());
        arrayList.add(new C80723c());
        arrayList.add(C80721a.f180466a);
        return arrayList;
    }

    public static C74676a getSuperResolutionStrategyExperimentValue() {
        if (C62890a.f142627a) {
            if (!superResolutionStrategyExperimentValueInited) {
                try {
                    superResolutionStrategyExperimentValue = (C74676a) C16048b.m29633a().mo25415a(true, "super_resolution_strategy", C74676a.class);
                } catch (Throwable unused) {
                    superResolutionStrategyExperimentValue = null;
                }
                superResolutionStrategyExperimentValueInited = true;
            }
            return superResolutionStrategyExperimentValue;
        }
        try {
            return (C74676a) C16048b.m29633a().mo25415a(true, "super_resolution_strategy", C74676a.class);
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void setInitialSpeed(double d) {
        C84116g.m144636e().mo124224a(d);
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean isSkipSelectBitrate(C84241i iVar) {
        if (!AbstractC80684j.f180386a || iVar == null || !C80860b.m140277b(C80860b.m140276a(iVar.getSourceId()))) {
            return false;
        }
        m140496xad732025("FeedCacheLoader", "SimKitCommonConfig->isSkipSelectBitrate->hitLocal");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean onPreGetProperBitrate(C84241i iVar) {
        if (!TextUtils.isEmpty(C17975i.m33458a(iVar.getSourceId()))) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean checkIsBytevc1InCache(C84241i iVar) {
        if (iVar == null) {
            return false;
        }
        m140496xad732025("FeedCacheLoader", "SimKitCommonConfig->codecType->" + iVar.isBytevc1() + "->urlModel->" + iVar);
        return iVar.isBytevc1();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig
    public String getLocalVideoPath(C84241i iVar) {
        if (!AbstractC80684j.f180386a || iVar == null) {
            return null;
        }
        String a = C80860b.m140276a(iVar.getSourceId());
        if (!C80860b.m140277b(a)) {
            return null;
        }
        m140496xad732025("FeedCacheLoader", "SimKitCommonConfig->getLocalVideoPath->hitLocal->path->".concat(String.valueOf(a)));
        return a;
    }
}
