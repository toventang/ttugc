package com.bytedance.android.livesdk.p455ar;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.msg.p4470a.AbstractC87076a;

/* renamed from: com.bytedance.android.livesdk.ar.d */
public final class C6838d implements AbstractC87076a {
    static {
        Covode.recordClassIndex(7576);
    }

    @Override // com.p2082ss.ugc.live.sdk.msg.p4470a.AbstractC87076a
    /* renamed from: b */
    public final boolean mo13091b() {
        return LiveUplinkStrategySetting.INSTANCE.supportWSUplink();
    }

    @Override // com.p2082ss.ugc.live.sdk.msg.p4470a.AbstractC87076a
    /* renamed from: c */
    public final boolean mo13092c() {
        return LiveUplinkStrategySetting.INSTANCE.supportHttpUplink();
    }

    @Override // com.p2082ss.ugc.live.sdk.msg.p4470a.AbstractC87076a
    /* renamed from: d */
    public final long mo13093d() {
        return LiveUplinkStrategySetting.INSTANCE.getWsUplinkWaitTimeout();
    }

    @Override // com.p2082ss.ugc.live.sdk.msg.p4470a.AbstractC87076a
    /* renamed from: a */
    public final String mo13090a() {
        return "https://" + ((IHostNetwork) C6193a.m13435a(IHostNetwork.class)).getHostDomain() + "/webcast/im/gw/uplink/message/";
    }
}
