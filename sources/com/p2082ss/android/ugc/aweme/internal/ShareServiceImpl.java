package com.p2082ss.android.ugc.aweme.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.C68863ah;

/* renamed from: com.ss.android.ugc.aweme.internal.ShareServiceImpl */
public final class ShareServiceImpl implements IShareService {
    static {
        Covode.recordClassIndex(66685);
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IShareService
    /* renamed from: a */
    public final String mo93977a(int i) {
        if (i == 2) {
            return "instagram";
        }
        if (i == 3) {
            return "instagram_story";
        }
        if (i == 101) {
            return "twitter";
        }
        switch (i) {
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "whatsapp";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "facebook";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "messenger";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "snapchat";
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return "vk";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return "zalo";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return "line";
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return "kakaotalk";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return "sms";
            case ABRConfig.ABR_SELECT_SCENE:
                return "whatsapp_status";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static IShareService m103039a() {
        MethodCollector.m26663i(6800);
        Object a = C81908b.m141854a(IShareService.class, false);
        if (a != null) {
            IShareService iShareService = (IShareService) a;
            MethodCollector.m26664o(6800);
            return iShareService;
        }
        if (C81908b.f183208bK == null) {
            synchronized (IShareService.class) {
                try {
                    if (C81908b.f183208bK == null) {
                        C81908b.f183208bK = new ShareServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6800);
                    throw th;
                }
            }
        }
        ShareServiceImpl shareServiceImpl = (ShareServiceImpl) C81908b.f183208bK;
        MethodCollector.m26664o(6800);
        return shareServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.internal.IShareService
    /* renamed from: a */
    public final void mo93978a(int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("publish_private_status", i);
        bundle.putBoolean("music_prevent_download", z);
        C68863ah.f154028b.mo109362a("ug_publish_share_show", (Aweme) null, bundle);
    }
}
