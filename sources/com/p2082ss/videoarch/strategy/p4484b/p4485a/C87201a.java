package com.p2082ss.videoarch.strategy.p4484b.p4485a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.strategy.b.a.a */
public class C87201a {

    /* renamed from: a */
    public int f197447a = -1;

    /* renamed from: b */
    public int f197448b = -1;

    /* renamed from: c */
    public int f197449c = 300;

    /* renamed from: d */
    public boolean f197450d;

    /* renamed from: e */
    public JSONArray f197451e;

    /* renamed from: f */
    public String f197452f;

    /* renamed from: g */
    public String f197453g;

    /* renamed from: h */
    public Map<String, Integer> f197454h = new HashMap();

    /* renamed from: i */
    private JSONObject f197455i;

    /* renamed from: j */
    private JSONObject f197456j;

    static {
        Covode.recordClassIndex(103004);
    }

    /* renamed from: a */
    public final Set<String> mo141068a() {
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = this.f197451e;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < this.f197451e.length(); i++) {
                JSONObject optJSONObject = this.f197451e.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.has("DomainName")) {
                    String optString = optJSONObject.optString("DomainName");
                    hashSet.add(optString);
                    this.f197454h.put(optString, Integer.valueOf(optJSONObject.optInt("DomainParseType")));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final JSONArray mo141069a(String str) {
        JSONObject jSONObject = this.f197456j;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return this.f197456j.getJSONArray(str);
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final JSONObject mo141070b(String str) {
        JSONObject jSONObject = this.f197455i;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has("Settings")) {
                JSONObject jSONObject2 = this.f197455i.getJSONObject("Settings");
                if (jSONObject2.has("BatchSettingsParams")) {
                    String optString = jSONObject2.getJSONObject("BatchSettingsParams").getJSONObject("live_stream_strategy_engine").optString(str);
                    if (optString != null && optString.startsWith("﻿")) {
                        optString = optString.substring(1);
                    }
                    return new JSONObject(optString);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public C87201a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ResponseMetadata") && (optJSONObject = jSONObject.optJSONObject("ResponseMetadata")) != null && optJSONObject.has("RequestId")) {
                    this.f197452f = optJSONObject.optString("RequestId");
                }
                if (jSONObject.has("Result")) {
                    this.f197455i = jSONObject.optJSONObject("Result");
                }
                JSONObject jSONObject2 = this.f197455i;
                if (jSONObject2 != null) {
                    if (jSONObject2.has("DomainInfos")) {
                        this.f197451e = this.f197455i.optJSONArray("DomainInfos");
                    }
                    if (this.f197455i.has("NodeInfos")) {
                        this.f197456j = this.f197455i.optJSONObject("NodeInfos");
                    }
                    if (this.f197455i.has("DnsTTL")) {
                        this.f197449c = this.f197455i.optInt("DnsTTL");
                    }
                    if (this.f197455i.has("EnableSelectNode")) {
                        this.f197450d = this.f197455i.optBoolean("EnableSelectNode");
                    }
                    if (this.f197455i.has("Settings")) {
                        JSONObject jSONObject3 = this.f197455i.getJSONObject("Settings");
                        if (jSONObject3.has("BatchSettingsParams")) {
                            String optString = jSONObject3.getJSONObject("BatchSettingsParams").getJSONObject("live_stream_strategy_engine").optString("2");
                            if (optString != null && optString.startsWith("﻿")) {
                                optString = optString.substring(1);
                            }
                            JSONObject jSONObject4 = new JSONObject(optString);
                            if (jSONObject4.has("DnsTTL")) {
                                this.f197449c = jSONObject4.optInt("DnsTTL");
                            }
                            if (jSONObject4.has("isNeedIPV6")) {
                                this.f197447a = jSONObject4.optInt("isNeedIPV6");
                            }
                            if (jSONObject4.has("httpDnsEnable")) {
                                this.f197448b = jSONObject4.optInt("httpDnsEnable");
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final Object mo141067a(String str, String str2) {
        JSONObject jSONObject = this.f197455i;
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has("Settings")) {
                JSONObject jSONObject2 = this.f197455i.getJSONObject("Settings");
                if (jSONObject2.has("BatchSettingsParams")) {
                    String optString = jSONObject2.getJSONObject("BatchSettingsParams").getJSONObject("live_stream_strategy_engine").optString(str);
                    if (optString != null && optString.startsWith("﻿")) {
                        optString = optString.substring(1);
                    }
                    JSONObject jSONObject3 = new JSONObject(optString);
                    if (jSONObject3.has(str2)) {
                        return jSONObject3.get(str2);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
