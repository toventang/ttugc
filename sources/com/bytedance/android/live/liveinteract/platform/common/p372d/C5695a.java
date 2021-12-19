package com.bytedance.android.live.liveinteract.platform.common.p372d;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5698a;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5699b;
import com.bytedance.android.live.liveinteract.platform.common.p373e.p374a.C5700c;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.livesetting.linkmic.InteractSeiUidEnableSetting;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.utils.C11218ah;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.d.a */
public final class C5695a {

    /* renamed from: a */
    private long f14424a;

    /* renamed from: b */
    private long f14425b;

    /* renamed from: c */
    private AbstractC5696a f14426c;

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.d.a$a */
    public interface AbstractC5696a {
        static {
            Covode.recordClassIndex(6294);
        }

        /* renamed from: a */
        void mo10544a(C5698a aVar);

        /* renamed from: b */
        boolean mo10547b(int i);
    }

    static {
        Covode.recordClassIndex(6293);
    }

    public C5695a(AbstractC5696a aVar) {
        this.f14426c = aVar;
    }

    /* renamed from: a */
    private static C5699b m12435a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C5699b bVar = new C5699b();
        bVar.f14436c = jSONObject.optInt("width");
        bVar.f14435b = jSONObject.optInt("height");
        bVar.f14434a = jSONObject.optString("background");
        return bVar;
    }

    /* renamed from: b */
    public final void mo11465b(String str) {
        C5698a c;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("app_data") && (c = m12438c(jSONObject.getString("app_data").replaceAll("\\\\", ""))) != null) {
                    this.f14426c.mo10544a(c);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: c */
    private C5698a m12438c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        long optLong = jSONObject.optLong("timestamp");
        if (optLong == this.f14424a || !jSONObject.has("ver")) {
            return null;
        }
        int optInt = jSONObject.optInt("ver");
        if (!this.f14426c.mo10547b(optInt)) {
            return null;
        }
        this.f14424a = optLong;
        C5698a aVar = new C5698a();
        aVar.f14430c = optLong;
        aVar.f14429b = optInt;
        aVar.f14428a = jSONObject.optString("vendor");
        aVar.f14431d = jSONObject.optString("channel_id");
        aVar.f14432e = m12436a(new JSONArray(jSONObject.optString("grids")));
        aVar.f14433f = m12435a(jSONObject.optJSONObject("canvas"));
        return aVar;
    }

    /* renamed from: a */
    private static List<C5700c> m12436a(JSONArray jSONArray) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
            C5700c cVar = new C5700c();
            cVar.f14437a = jSONObject.optInt(StringSet.type);
            if (jSONObject.has("x")) {
                cVar.f14442f = jSONObject.optDouble("x");
            }
            if (jSONObject.has("y")) {
                cVar.f14443g = jSONObject.optDouble("y");
            }
            if (jSONObject.has("w")) {
                cVar.f14440d = jSONObject.optDouble("w");
            }
            if (jSONObject.has("h")) {
                cVar.f14441e = jSONObject.optDouble("h");
            }
            try {
                cVar.f14438b = jSONObject.optLong("account");
            } catch (Exception unused) {
                cVar.f14438b = 0;
            }
            if (jSONObject.has("uid")) {
                cVar.f14446j = jSONObject.opt("uid").toString();
            }
            if (jSONObject.has("uid_str")) {
                cVar.f14447k = jSONObject.optString("uid_str");
            }
            if (jSONObject.has("talk")) {
                cVar.f14448l = jSONObject.optInt("talk");
            }
            if (jSONObject.has("mute_audio")) {
                cVar.f14449m = jSONObject.optInt("mute_audio");
            }
            boolean z2 = true;
            if (jSONObject.has("mute_a")) {
                if (jSONObject.optInt("mute_a") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                cVar.f14451o = z;
            }
            if (jSONObject.has("mute_v")) {
                if (jSONObject.optInt("mute_v") != 1) {
                    z2 = false;
                }
                cVar.f14452p = z2;
            }
            if (jSONObject.has("p")) {
                cVar.f14450n = jSONObject.optInt("p");
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final long mo11464a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("app_data")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString("app_data").replaceAll("\\\\", ""));
                    if (jSONObject2.optLong("timestamp") > 0 && jSONObject2.has("ver")) {
                        this.f14425b = System.currentTimeMillis();
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (this.f14425b == 0) {
            return 0;
        }
        return System.currentTimeMillis() - this.f14425b;
    }

    /* renamed from: a */
    public static FrameLayout.LayoutParams m12434a(int i, int i2, int i3, int i4, C5700c cVar) {
        int i5;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        float f = (float) i;
        float f2 = (float) i3;
        float f3 = (float) i2;
        float f4 = (float) i4;
        float max = Math.max(f / f2, f3 / f4);
        float f5 = f2 * max;
        float f6 = f4 * max;
        double d = (double) f5;
        double d2 = cVar.f14442f;
        Double.isNaN(d);
        double d3 = (double) ((f5 - f) / 2.0f);
        Double.isNaN(d3);
        int i6 = (int) (((d2 * d) + 0.5d) - d3);
        double d4 = (double) f6;
        double d5 = cVar.f14443g;
        Double.isNaN(d4);
        double d6 = (double) ((f6 - f3) / 2.0f);
        Double.isNaN(d6);
        double d7 = cVar.f14440d;
        Double.isNaN(d);
        double d8 = cVar.f14441e;
        Double.isNaN(d4);
        layoutParams.width = (int) ((d * d7) + 0.5d);
        layoutParams.height = (int) ((d4 * d8) + 0.5d);
        layoutParams.leftMargin = i6;
        layoutParams.topMargin = (int) (((d5 * d4) + 0.5d) - d6);
        if (C6229a.m13521a(C3966y.m9669e())) {
            i5 = 8388613;
        } else {
            i5 = 8388611;
        }
        layoutParams.gravity = i5;
        return layoutParams;
    }

    /* renamed from: a */
    public static JSONObject m12437a(LiveCore.InteractConfig interactConfig, List<Region> list, int i, int i2, Map<String, Integer> map, boolean z) {
        int i3;
        int i4;
        int i5;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ver", interactConfig.getSeiVersion());
            jSONObject.put("timestamp", System.currentTimeMillis());
            if (!interactConfig.getRtcExtInfo().equals("")) {
                JSONObject optJSONObject = new JSONObject(interactConfig.getRtcExtInfo()).optJSONObject("live_rtc_engine_config");
                jSONObject.put("vendor", optJSONObject.optString("rtc_vendor"));
                jSONObject.put("channel_id", optJSONObject.optString("rtc_channel_id"));
            }
            JSONArray jSONArray = new JSONArray();
            for (Region region : list) {
                if (region.needWriteToSei()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(StringSet.type, region.getMediaType());
                    int i6 = 1;
                    jSONObject2.put("alpha", 1);
                    jSONObject2.put("w", region.getWidth());
                    jSONObject2.put("h", region.getHeight());
                    jSONObject2.put("x", region.getX());
                    jSONObject2.put("y", region.getY());
                    if (InteractSeiUidEnableSetting.INSTANCE.getValue()) {
                        jSONObject2.put("account", region.getUserId());
                    } else {
                        jSONObject2.put("account", 0);
                    }
                    jSONObject2.put("uid", C11218ah.m19872a(region.getInteractId()));
                    jSONObject2.put("uid_str", region.getInteractId());
                    jSONObject2.put("zorder", 0);
                    if (region.isTalking()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    jSONObject2.put("talk", i3);
                    if (region.isMuteAudio()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    jSONObject2.put("mute_audio", i4);
                    if (region.isMuteAudio()) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jSONObject2.put("mute_a", i5);
                    if (region.getInteractId().equals(C6894d.m14753a().f17260e)) {
                        if (!z) {
                            i6 = 0;
                        }
                        jSONObject2.put("mute_v", i6);
                    } else {
                        if (!region.isMuteVideo()) {
                            i6 = 0;
                        }
                        jSONObject2.put("mute_v", i6);
                    }
                    if (map != null && map.containsKey(region.getInteractId())) {
                        jSONObject2.put("p", map.get(region.getInteractId()));
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("grids", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", i);
            jSONObject3.put("height", i2);
            jSONObject3.put("background", "#303342");
            jSONObject.put("canvas", jSONObject3);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
