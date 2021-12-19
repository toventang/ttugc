package com.bytedance.android.p126a.p136b.p141d.p144c;

import android.text.TextUtils;
import com.bytedance.android.p126a.p127a.C2628e;
import com.bytedance.android.p126a.p127a.p129b.AbstractC2617a;
import com.bytedance.android.p126a.p127a.p129b.C2618b;
import com.bytedance.android.p126a.p127a.p131d.C2626b;
import com.bytedance.android.p126a.p127a.p135h.C2640a;
import com.bytedance.android.p126a.p136b.p141d.AbstractC2674b;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.d.c.a */
public final class C2676a implements AbstractC2674b {

    /* renamed from: a */
    private AbstractC2617a f7990a = new C2618b(C2628e.m7607d().f7905b, "ad_tracker_c2s_store_v2_adym3");

    static {
        Covode.recordClassIndex(3064);
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: a */
    public final void mo7187a(int i) {
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: a */
    public final void mo7186a() {
        this.f7990a.mo7122b().mo7125c();
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: d */
    public final void mo7193d() {
        this.f7990a.mo7125c();
        this.f7990a = null;
    }

    public C2676a() {
        AbstractC2617a aVar = C2628e.m7607d().f7909f;
        if (aVar != null && aVar.mo7124c("sp_c2s_store_version") < 2) {
            aVar.mo7123b("sp_c2s_store_version").mo7125c();
        }
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: b */
    public final List<C2626b> mo7189b() {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        Map<String, ?> a = this.f7990a.mo7121a();
        for (String str : a.keySet()) {
            Object obj = a.get(str);
            if (obj instanceof String) {
                C2626b a2 = m7748a((String) obj);
                if (a2 != null) {
                    arrayList.add(a2);
                } else {
                    arrayList2.add(str);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str2 : arrayList2) {
                this.f7990a.mo7126d(str2);
            }
            this.f7990a.mo7125c();
        }
        return arrayList;
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: c */
    public final List<C2626b> mo7191c() {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        Map<String, ?> a = this.f7990a.mo7121a();
        for (String str : a.keySet()) {
            Object obj = a.get(str);
            if (obj instanceof String) {
                C2626b a2 = m7748a((String) obj);
                if (a2 == null) {
                    arrayList2.add(str);
                } else if (a2.f7888j > 0) {
                    arrayList.add(a2);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str2 : arrayList2) {
                this.f7990a.mo7126d(str2);
            }
            this.f7990a.mo7125c();
        }
        return arrayList;
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: c */
    public final void mo7192c(C2626b bVar) {
        mo7188a(bVar);
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: b */
    public final void mo7190b(C2626b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.f7879a)) {
            String str = bVar.f7879a;
            if (!TextUtils.isEmpty(str)) {
                this.f7990a.mo7126d(str).mo7125c();
            }
        }
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: a */
    public final List<C2626b> mo7185a(List<C2626b> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C2626b bVar : list) {
            if (!mo7188a(bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.p126a.p136b.p141d.AbstractC2674b
    /* renamed from: a */
    public final boolean mo7188a(C2626b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f7879a)) {
            return false;
        }
        String d = m7749d(bVar);
        if (TextUtils.isEmpty(d)) {
            return false;
        }
        this.f7990a.mo7119a(bVar.f7879a, d).mo7125c();
        return true;
    }

    /* renamed from: d */
    private static String m7749d(C2626b bVar) {
        if (bVar == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uuid", bVar.f7879a).put("tracker_key", bVar.f7880b).put("ad_id", bVar.f7881c).put("is_standard", bVar.f7882d).put("non_std_ad_id", bVar.f7883e);
            JSONArray jSONArray = new JSONArray();
            List<String> list = bVar.f7884f;
            if (list != null) {
                for (String str : list) {
                    jSONArray.put(str);
                }
            }
            jSONObject.put("urls", jSONArray);
            jSONObject.put("log_extra", bVar.f7885g).put("ad_extra_data", bVar.f7886h).put("create_timestamp", bVar.f7887i).put("track_label", bVar.f7889k).put("tried_count", bVar.f7888j).put("retry_when_network_available", bVar.f7891m).put("expire_seconds", bVar.f7892n);
            Map<String, String> map = bVar.f7890l;
            if (!(map == null || map.size() == 0)) {
                jSONObject.putOpt("context_macro_map", new JSONObject(map));
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static C2626b m7748a(String str) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("uuid");
            String optString2 = jSONObject.optString("tracker_key");
            long optLong = jSONObject.optLong("ad_id");
            boolean optBoolean = jSONObject.optBoolean("is_standard");
            long optLong2 = jSONObject.optLong("non_std_ad_id");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            String optString3 = jSONObject.optString("log_extra");
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            try {
                long optLong3 = jSONObject.optLong("create_timestamp");
                String optString4 = jSONObject.optString("track_label");
                if (TextUtils.isEmpty(optString4) && jSONObject.has("track_type")) {
                    switch (jSONObject.optInt("track_type")) {
                        case 0:
                            optString4 = "show";
                            break;
                        case 1:
                            optString4 = "play";
                            break;
                        case 2:
                            optString4 = "click";
                            break;
                        case 3:
                        default:
                            C2640a.m7643a("unknown c2s track type");
                            optString4 = "";
                            break;
                        case 4:
                            optString4 = "play_valid";
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            optString4 = "play_over";
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            optString4 = "play_25";
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            optString4 = "play_50";
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            optString4 = "play_75";
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            optString4 = "cpv_6s";
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            optString4 = "cpv_15s";
                            break;
                    }
                }
                int optInt = jSONObject.optInt("tried_count", 0);
                boolean optBoolean2 = jSONObject.optBoolean("retry_when_network_available");
                long optLong4 = jSONObject.optLong("expire_seconds", -1);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("context_macro_map");
                if (optJSONObject2 != null) {
                    Iterator<String> keys = optJSONObject2.keys();
                    hashMap = null;
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString5 = optJSONObject2.optString(next);
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(next, optString5);
                    }
                } else {
                    hashMap = null;
                }
                C2626b bVar = new C2626b(optString, optString2, optLong, arrayList, optString4, optBoolean, optLong2, optString3, optJSONObject, optInt, hashMap);
                bVar.f7887i = optLong3;
                bVar.f7891m = optBoolean2;
                bVar.f7892n = optLong4;
                return bVar;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
