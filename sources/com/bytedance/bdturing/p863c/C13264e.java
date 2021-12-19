package com.bytedance.bdturing.p863c;

import android.text.TextUtils;
import com.bytedance.bdturing.AbstractC13248b;
import com.bytedance.bdturing.C13241a;
import com.bytedance.bdturing.C13270e;
import com.bytedance.bdturing.C13285g;
import com.bytedance.bdturing.C13290j;
import com.bytedance.bdturing.C13301m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4622m.C89338d;

/* renamed from: com.bytedance.bdturing.c.e */
public class C13264e implements AbstractC13255a {
    static {
        Covode.recordClassIndex(15226);
    }

    /* renamed from: a */
    public void mo21432a() {
    }

    /* renamed from: a */
    public void mo21433a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo21434a(int i, String str, String str2) {
    }

    /* renamed from: a */
    public void mo21435a(C13261c cVar) {
    }

    /* renamed from: a */
    public void mo21436a(String str, AbstractC13248b bVar) {
    }

    /* renamed from: b */
    public void mo21437b() {
    }

    /* renamed from: c */
    private void m23835c(final C13261c cVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject(cVar.f32434c);
            final String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("method");
            JSONObject optJSONObject = jSONObject.optJSONObject("query");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            final String str2 = null;
            if (optJSONObject != null) {
                StringBuilder append = new StringBuilder(string).append("?");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (optJSONObject.get(next) != null) {
                        str = optJSONObject.get(next).toString();
                    } else {
                        str = null;
                    }
                    append.append("&" + next + "=").append(str);
                }
                string = append.toString();
            }
            if (optJSONObject2 != null) {
                str2 = optJSONObject2.toString().replaceAll("\\\\/", "/");
            }
            if (C13285g.m23902a()) {
                C13285g.m23905d(string);
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json; charset=utf-8");
            if (string2.equals(UGCMonitor.TYPE_POST)) {
                C13301m.C13302a.f32548a.mo21472a(new Runnable() {
                    /* class com.bytedance.bdturing.p863c.C13264e.RunnableC132662 */

                    static {
                        Covode.recordClassIndex(15228);
                    }

                    public final void run() {
                        C13264e.m23834a(cVar, new String(C13241a.C13243a.f32360a.f32353a.f32395v.post(string, hashMap, str2.getBytes()), C89338d.f202990a));
                    }
                });
            } else {
                C13301m.C13302a.f32548a.mo21472a(new Runnable() {
                    /* class com.bytedance.bdturing.p863c.C13264e.RunnableC132673 */

                    static {
                        Covode.recordClassIndex(15229);
                    }

                    public final void run() {
                        C13264e.m23834a(cVar, new String(C13241a.C13243a.f32360a.f32353a.f32395v.get(string, hashMap), C89338d.f202990a));
                    }
                });
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.bdturing.p863c.AbstractC13255a
    /* renamed from: b */
    public final void mo21422b(final C13261c cVar) {
        String str;
        try {
            String str2 = cVar.f32433b;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1759249244:
                    if (str2.equals("bytedcert.verifyResult")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1628743486:
                    if (str2.equals("bytedcert.h5_state_changed")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1563440329:
                    if (str2.equals("bytedcert.getTouch")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1534238297:
                    if (str2.equals("bytedcert.verify")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1471628194:
                    if (str2.equals("bytedcert.pageEnd")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1366167938:
                    if (str2.equals("bytedcert.refreshVerifyViewFinish")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1028963129:
                    if (str2.equals("bytedcert.preLoadVerifyFinish")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -514719849:
                    if (str2.equals("bytedcert.dialogSize")) {
                        c = 0;
                        break;
                    }
                    break;
                case 428780843:
                    if (str2.equals("bytedcert.getSettings")) {
                        c = 7;
                        break;
                    }
                    break;
                case 491779646:
                    if (str2.equals("bytedcert.eventToNative")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1154510586:
                    if (str2.equals("bytedcert.readyView")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1176627553:
                    if (str2.equals("bytedcert.network.request")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    JSONObject jSONObject = new JSONObject(cVar.f32434c);
                    mo21433a(jSONObject.getInt("w"), jSONObject.getInt("h"));
                    return;
                case 1:
                    C13301m.C13302a.f32548a.mo21471a(2, cVar);
                    return;
                case 2:
                    mo21432a();
                    return;
                case 3:
                    JSONObject jSONObject2 = new JSONObject(cVar.f32434c);
                    int optInt = jSONObject2.optInt("result");
                    jSONObject2.optString("mode");
                    jSONObject2.optString(StringSet.type);
                    mo21434a(optInt, jSONObject2.optString("token"), jSONObject2.optString("mobile"));
                    return;
                case 4:
                    JSONObject jSONObject3 = new JSONObject(cVar.f32434c);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = jSONObject3.opt(next);
                        if (opt != null) {
                            str = opt.toString();
                        } else {
                            str = null;
                        }
                        hashMap.put(next, str);
                    }
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    JSONObject jSONObject4 = new JSONObject(cVar.f32434c);
                    C13270e.m23849a(jSONObject4.optString("event"), jSONObject4);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    m23835c(cVar);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    mo21435a(cVar);
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    mo21436a(new JSONObject(cVar.f32434c).getString("params"), new AbstractC13248b() {
                        /* class com.bytedance.bdturing.p863c.C13264e.C132651 */

                        static {
                            Covode.recordClassIndex(15227);
                        }

                        @Override // com.bytedance.bdturing.AbstractC13248b
                        /* renamed from: b */
                        public final void mo21412b(int i) {
                            mo21411a(i);
                        }

                        @Override // com.bytedance.bdturing.AbstractC13248b
                        /* renamed from: a */
                        public final void mo21411a(int i) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("result", i);
                                cVar.mo21430a(1, jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                    });
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    mo21437b();
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    C13290j.C13291a.f32506a.f32505d = true;
                    long currentTimeMillis = System.currentTimeMillis() - C13290j.C13291a.f32506a.f32503b;
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("duration", currentTimeMillis);
                        jSONObject5.put("key", "pre_create_success");
                        C13270e.m23849a("turing_verify_sdk", jSONObject5);
                        return;
                    } catch (JSONException e) {
                        C13285g.m23900a(e);
                        return;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    long currentTimeMillis2 = System.currentTimeMillis() - C13290j.C13291a.f32506a.f32504c;
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("duration", currentTimeMillis2);
                        jSONObject6.put("key", "pre_create_load_success");
                        C13270e.m23849a("turing_verify_sdk", jSONObject6);
                        return;
                    } catch (JSONException e2) {
                        C13285g.m23900a(e2);
                        return;
                    }
                default:
                    return;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m23834a(C13261c cVar, String str) {
        if (C13285g.m23902a()) {
            C13285g.m23905d(str);
        }
        int i = !TextUtils.isEmpty(str) ? 1 : 0;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", str);
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            i = 0;
        }
        cVar.mo21430a(i, jSONObject);
    }
}
