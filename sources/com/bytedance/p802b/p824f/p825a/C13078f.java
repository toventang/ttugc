package com.bytedance.p802b.p824f.p825a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p806b.p807a.C12969e;
import com.bytedance.p802b.p806b.p807a.p808a.AbstractC12929b;
import com.bytedance.p802b.p806b.p807a.p808a.C12928a;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p821e.p823b.C13041b;
import com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b;
import com.bytedance.p802b.p824f.p825a.p826a.C13065a;
import com.bytedance.p802b.p841k.C13130f;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.f.a.f */
public final class C13078f implements AbstractC12929b {

    /* renamed from: a */
    String f31878a = "report_setting";

    /* renamed from: b */
    String f31879b = "enable_encrypt";

    /* renamed from: c */
    String f31880c = "hosts";

    /* renamed from: d */
    String f31881d = "apm6_once_max_size_kb";

    /* renamed from: e */
    String f31882e = "apm6_uploading_interval";

    /* renamed from: f */
    String f31883f = "enable_report_internal_exception";

    /* renamed from: g */
    String f31884g = "log_reserve_days";

    /* renamed from: h */
    String f31885h = "log_max_size_mb";

    /* renamed from: i */
    volatile C12928a f31886i;

    static {
        Covode.recordClassIndex(14914);
    }

    @Override // com.bytedance.p802b.p806b.p807a.p808a.AbstractC12929b
    /* renamed from: a */
    public final C12928a mo20778a() {
        return this.f31886i;
    }

    public C13078f() {
        C13065a.m23491a().mo20920b();
        C13065a.m23491a().mo20918a(new AbstractC13069b() {
            /* class com.bytedance.p802b.p824f.p825a.C13078f.C130791 */

            static {
                Covode.recordClassIndex(14915);
            }

            @Override // com.bytedance.p802b.p824f.p825a.p826a.AbstractC13069b
            /* renamed from: a */
            public final void mo20917a(JSONObject jSONObject) {
                JSONObject optJSONObject;
                JSONObject optJSONObject2;
                String str;
                JSONObject optJSONObject3;
                C13078f fVar = C13078f.this;
                if (jSONObject != null) {
                    String str2 = fVar.f31878a;
                    String str3 = null;
                    JSONObject optJSONObject4 = jSONObject.optJSONObject("general");
                    if (!(optJSONObject4 == null || (optJSONObject = optJSONObject4.optJSONObject("slardar_api_settings")) == null || (optJSONObject2 = optJSONObject.optJSONObject(str2)) == null)) {
                        List<String> a = C13078f.m23504a(optJSONObject2.optJSONArray(fVar.f31880c));
                        ArrayList arrayList = new ArrayList();
                        if (!C13130f.m23608a(a)) {
                            str = null;
                            for (String str4 : a) {
                                arrayList.add("https://" + str4 + "/monitor/collect/batch/");
                                if (str3 == null) {
                                    str3 = "https://" + str4 + "/monitor/collect/c/exception";
                                }
                                if (str == null) {
                                    str = "https://" + str4 + "/monitor/collect/c/trace_collect";
                                }
                            }
                        } else {
                            str = null;
                        }
                        boolean z = true;
                        boolean optBoolean = optJSONObject2.optBoolean(fVar.f31879b, true);
                        long optLong = optJSONObject2.optLong(fVar.f31881d, -1) * 1024;
                        long optLong2 = optJSONObject2.optLong(fVar.f31882e, -1) * 1000;
                        String str5 = fVar.f31883f;
                        JSONObject optJSONObject5 = jSONObject.optJSONObject("general");
                        if (optJSONObject5 == null || optJSONObject5.optInt(str5, 0) != 1) {
                            z = false;
                        }
                        C12928a aVar = new C12928a();
                        if (!C13130f.m23608a(arrayList)) {
                            aVar.f31459b = arrayList;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            aVar.f31460c = new ArrayList();
                            aVar.f31460c.add(str3);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            aVar.f31461d = new ArrayList();
                            aVar.f31461d.add(str);
                        }
                        aVar.f31458a = optLong;
                        aVar.f31462e = optBoolean;
                        aVar.f31464g = optLong2;
                        aVar.f31463f = z;
                        JSONObject optJSONObject6 = jSONObject.optJSONObject("general");
                        if (!(optJSONObject6 == null || (optJSONObject3 = optJSONObject6.optJSONObject("cleanup")) == null)) {
                            aVar.f31465h = optJSONObject3.optInt(fVar.f31885h, 80);
                            aVar.f31466i = optJSONObject3.optInt(fVar.f31884g, 5);
                        }
                        fVar.f31886i = aVar;
                        if (C13037a.m23579r()) {
                            C12928a aVar2 = fVar.f31886i;
                        }
                        C13041b.f31834a = z;
                        if (!TextUtils.isEmpty(str3)) {
                            C13041b.f31835b = str3;
                        }
                        C12969e.f31592a.mo20825a(fVar.f31886i);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    static List<String> m23504a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList(2);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String host = new URL(jSONArray.getString(i)).getHost();
                        if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                            arrayList.add(host);
                        }
                    }
                    return arrayList;
                }
            } catch (JSONException e) {
                C13118b.m23587a("APM-Setting", "parse setting host json exception", e);
            } catch (MalformedURLException e2) {
                C13118b.m23587a("APM-Setting", "parse setting host malformedurl exception", e2);
            }
        }
        return Collections.emptyList();
    }
}
