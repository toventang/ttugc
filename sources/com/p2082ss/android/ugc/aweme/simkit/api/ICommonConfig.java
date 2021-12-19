package com.p2082ss.android.ugc.aweme.simkit.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34852c;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.p2082ss.android.ugc.aweme.simkit.model.p3913b.C74676a;
import com.p2082ss.android.ugc.aweme.simkit.model.p3913b.C74677b;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84278n;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.simkit.api.ICommonConfig */
public interface ICommonConfig {
    static {
        Covode.recordClassIndex(87418);
    }

    boolean checkIsBytevc1InCache(C84241i iVar);

    AbstractC34852c getAutoBitrateSetStrategy();

    int getBitrateBusinessType();

    double getBitrateSwitchThreshold();

    List<AbstractC84278n> getColdBootVideoUrlHooks();

    AbstractC74604c getCommonParamsProcessor();

    int getDefaultCDNTimeoutTime();

    RateSettingsResponse getDefaultRateSettingsResponse();

    AbstractC74602a getForceSuperResolutionListener();

    int getLastNetworkSpeed();

    String getLocalVideoPath(C84241i iVar);

    RateSettingsResponse getRateSettingsResponse();

    AbstractC74605d getSuperResolutionStrategy();

    C74676a getSuperResolutionStrategyConfig();

    C74677b getSuperResolutionStrategyConfigV2();

    AbstractC74606e getVideoUrlHookHook();

    List<AbstractC84278n> getVideoUrlHooks();

    boolean isSkipSelectBitrate(C84241i iVar);

    boolean isUseLastNetworkSpeed();

    boolean onPreGetProperBitrate(C84241i iVar);
}
