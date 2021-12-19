package com.p2082ss.android.ugc.aweme.push.downgrade.notice;

import android.content.Intent;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.notice.MainProcessWsChannelService */
public class MainProcessWsChannelService extends WsChannelService {
    static {
        Covode.recordClassIndex(77217);
    }

    @Override // com.bytedance.common.wschannel.server.WsChannelService
    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }
}
