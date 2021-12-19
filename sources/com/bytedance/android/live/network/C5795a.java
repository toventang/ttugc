package com.bytedance.android.live.network;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.AbstractC5799b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.other.FakeRegionsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMtTikcastSwitcherParamSetting;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.android.livesdk.util.C11120d;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14657f;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14658g;
import com.bytedance.ttnet.TTNetInit;
import com.p2082ss.android.ugc.p4314h.C84116g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.network.a */
public final class C5795a implements AbstractC5799b {

    /* renamed from: a */
    private final String[] f14638a = {"CN", "MR", "SA", "FR", "AE"};

    static {
        Covode.recordClassIndex(6395);
    }

    @Override // com.bytedance.android.live.network.AbstractC5799b
    /* renamed from: a */
    public final AbstractC5799b.C5800a mo11566a(AbstractC5799b.C5800a aVar) {
        String str = aVar.f14640a;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(str);
            m12702a(sb);
            aVar.f14640a = sb.toString();
        }
        return aVar;
    }

    /* renamed from: a */
    private void m12702a(StringBuilder sb) {
        if (sb.toString().indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mo11567a(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        sb.append(AbstractC5802c.m12712a(arrayList, "UTF-8"));
    }

    /* renamed from: b */
    private static void m12703b(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            C14657f networkQuality = TTNetInit.getNetworkQuality();
            jSONObject.put("tcp_rtt", networkQuality.f35574a);
            jSONObject.put("quic_rtt", networkQuality.f35574a);
            jSONObject.put("http_rtt", networkQuality.f35575b);
            jSONObject.put("downstream_throughput_kbps", networkQuality.f35576c);
            C14658g packetLossRateMetrics = TTNetInit.getPacketLossRateMetrics(1);
            jSONObject.put("quic_send_loss_rate", packetLossRateMetrics.f35578b);
            jSONObject.put("quic_receive_loss_rate", packetLossRateMetrics.f35580d);
            jSONObject.put("net_effective_connection_type", TTNetInit.getEffectiveConnectionType());
            jSONObject.put("video_download_speed", C84116g.m144637f());
        } catch (Exception e) {
            C3854a.m9458a("GetNetworkParams", e);
        }
        map.put("current_network_quality_info", jSONObject.toString());
    }

    @Override // com.bytedance.android.live.network.AbstractC5799b
    /* renamed from: a */
    public final void mo11567a(Map<String, String> map) {
        Locale locale;
        String str;
        map.put("webcast_sdk_version", "2150");
        if (C6193a.m13435a(IHostContext.class) != null) {
            locale = ((IHostContext) C6193a.m13435a(IHostContext.class)).currentLocale();
        } else {
            locale = null;
        }
        map.put("webcast_language", C11120d.m19751a(locale));
        map.put("webcast_locale", Resources.getSystem().getConfiguration().locale.toString());
        if (C6802e.f16867b) {
            int value = FakeRegionsSetting.INSTANCE.getValue();
            if (value >= 0) {
                String[] strArr = this.f14638a;
                if (value < strArr.length) {
                    str = strArr[value];
                    map.put("fake_region", str);
                }
            }
            str = "";
            map.put("fake_region", str);
        }
        if (C6193a.m13435a(IHostContext.class) != null && ((IHostContext) C6193a.m13435a(IHostContext.class)).isLocalTest() && LiveMtTikcastSwitcherParamSetting.INSTANCE.getValue() == 1) {
            map.put("tikcast", "1");
        }
        m12703b(map);
    }
}
