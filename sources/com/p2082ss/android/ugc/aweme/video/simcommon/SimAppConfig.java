package com.p2082ss.android.ugc.aweme.video.simcommon;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.player.C62932b;
import com.p2082ss.android.ugc.playerkit.simapicommon.IAppConfig;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.simcommon.SimAppConfig */
public class SimAppConfig implements IAppConfig {
    static {
        Covode.recordClassIndex(94245);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String defaultHost() {
        return "tiktokv.com";
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.IAppConfig
    public boolean isDebug() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.IAppConfig
    public int getAppID() {
        return C17867d.f42590n;
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getChannel() {
        return C17867d.f42595s;
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.IAppConfig
    public List<String> redirectHosts() {
        return C62932b.f142840a;
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getAppName() {
        return C17867d.m33081b();
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getAppVersion() {
        return C17867d.m33088i();
    }

    public String getNetworkTypeDetail(Context context) {
        return m140465x97073cd9(C17867d.m33078a());
    }

    /* renamed from: com_ss_android_ugc_aweme_video_simcommon_SimAppConfig_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkTypeDetail */
    public static String m140465x97073cd9(Context context) {
        if (!TextUtils.isEmpty(C58029j.f132250b) && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132250b;
        }
        String e = C13624l.m24489e(context);
        C58029j.f132250b = e;
        return e;
    }
}
