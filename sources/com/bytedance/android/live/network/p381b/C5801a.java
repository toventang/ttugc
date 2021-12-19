package com.bytedance.android.live.network.p381b;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14657f;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14658g;
import com.bytedance.ttnet.TTNetInit;
import com.p2082ss.android.ugc.p4314h.C84116g;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.network.b.a */
public final class C5801a {

    /* renamed from: a */
    public static final C5801a f14642a = new C5801a();

    private C5801a() {
    }

    static {
        Covode.recordClassIndex(6401);
    }

    /* renamed from: a */
    public static final JSONObject m12710a() {
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC2953a a = C6193a.m13435a(IHostAction.class);
            C89219l.m154716b(a, "");
            IHostAction.C11788c videoOnDemandParams = ((IHostAction) a).getVideoOnDemandParams();
            jSONObject.put("network_speed_in_kbps", videoOnDemandParams.f28168b * 8);
            jSONObject.put("recommend_bitrate", videoOnDemandParams.f28167a);
            C14657f networkQuality = TTNetInit.getNetworkQuality();
            if (networkQuality != null) {
                jSONObject.put("tcp_rtt", networkQuality.f35574a);
                jSONObject.put("quic_rtt", networkQuality.f35574a);
                jSONObject.put("http_rtt", networkQuality.f35575b);
                jSONObject.put("downstream_throughput_kbps", networkQuality.f35576c);
            }
            C14658g packetLossRateMetrics = TTNetInit.getPacketLossRateMetrics(1);
            if (packetLossRateMetrics != null) {
                jSONObject.put("quic_send_loss_rate", packetLossRateMetrics.f35578b);
                jSONObject.put("quic_receive_loss_rate", packetLossRateMetrics.f35580d);
            }
            jSONObject.put("net_effective_connection_type", TTNetInit.getEffectiveConnectionType());
            jSONObject.put("video_download_speed", C84116g.m144637f());
        } catch (Exception e) {
            C3854a.m9458a("GetNetworkParams", e);
        }
        return jSONObject;
    }
}
