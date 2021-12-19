package com.bytedance.android.live.broadcast.p195d;

import android.os.Build;
import com.bytedance.android.live.base.p178b.AbstractC2955a;
import com.bytedance.android.live.broadcast.stream.p205a.AbstractC3664a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.broadcast.CameraTypeSettingSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdkapi.AbstractC11748e;
import com.bytedance.android.livesdkapi.host.AbstractC11797b;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcast.d.e */
public final class C3224e implements AbstractC3664a {

    /* renamed from: a */
    private AbstractC11748e f9266a = ((AbstractC11797b) C6193a.m13435a(AbstractC11797b.class)).mo18859b();

    static {
        Covode.recordClassIndex(3705);
    }

    /* renamed from: a */
    private static int m8717a(List<FilterModel> list) {
        int intValue = AbstractC6804a.f16886O.mo13066a().intValue();
        if (intValue >= list.size() || intValue >= list.size() || intValue < 0) {
            return 0;
        }
        return intValue;
    }

    @Override // com.bytedance.android.live.broadcast.stream.p205a.AbstractC3664a
    /* renamed from: a */
    public final void mo8572a(String str, JSONObject jSONObject) {
        String filterPath;
        boolean z;
        if (!"live_client_monitor_log".equals(str)) {
            ((AbstractC2955a) C6193a.m13435a(AbstractC2955a.class)).mo7733a(str, jSONObject);
            return;
        }
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("mode");
                if ("live_client_monitor_log".equals(str) && "rtc".equals(string)) {
                    ((AbstractC2955a) C6193a.m13435a(AbstractC2955a.class)).mo7733a(str, jSONObject);
                    return;
                }
            } catch (Exception e) {
                C3854a.m9453a(6, "uploadLog", e.getMessage());
            }
        }
        try {
            int cameraType = CameraTypeSettingSetting.INSTANCE.getValue().getCameraType();
            if (Build.VERSION.SDK_INT >= 28) {
                cameraType = 2;
            }
            jSONObject.put("camera", cameraType);
            List<FilterModel> a = C4217d.m10317a().mo9890a();
            if (!C13617h.m24465a(a)) {
                if (a.isEmpty()) {
                    filterPath = "";
                } else {
                    filterPath = a.get(m8717a(a)).getFilterPath();
                }
                if (!C13627m.m24498a(filterPath)) {
                    z = true;
                } else {
                    z = false;
                }
                jSONObject.put("filter_opened", z);
                jSONObject.put("filter_name", a.get(m8717a(a)).getName());
            }
            jSONObject.put("beauty_white", (double) (LiveBeautyParamSetting.INSTANCE.getValue().f23101a.f23106a * AbstractC6804a.f16887P.mo13066a().floatValue()));
            jSONObject.put("beauty_skin", (double) (LiveBeautyParamSetting.INSTANCE.getValue().f23102b.f23106a * AbstractC6804a.f16888Q.mo13066a().floatValue()));
            jSONObject.put("beauty_eye", (double) (LiveBeautyParamSetting.INSTANCE.getValue().f23103c.f23106a * AbstractC6804a.f16889R.mo13066a().floatValue()));
            jSONObject.put("beauty_face", (double) (LiveBeautyParamSetting.INSTANCE.getValue().f23104d.f23106a * AbstractC6804a.f16890S.mo13066a().floatValue()));
        } catch (Throwable th) {
            C3854a.m9458a("StreamLog", th);
        }
        try {
            jSONObject.put("live_platform_version", 2150);
        } catch (Throwable th2) {
            C3854a.m9458a("StreamLog", th2);
        }
        ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayController().mo11529a(jSONObject, str);
    }
}
