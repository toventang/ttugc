package com.p2082ss.android.common.p2132c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.analytics.page.C2602f;
import com.bytedance.analytics.page.C2603g;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.HandlerThreadC29808t;
import com.p2082ss.android.p2152i.C29944a;
import com.p2082ss.android.p2152i.C29946b;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLDataCenterService;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.common.c.a */
public class C29819a {
    static {
        Covode.recordClassIndex(36224);
    }

    /* renamed from: a */
    public static void m60075a() {
        C29822b.f71163a = false;
        C29822b.f71165c = 0;
    }

    /* renamed from: a */
    private static JSONObject m60074a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        if (keys == null) {
            return null;
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static void m60076a(final String str, final Bundle bundle) {
        final long currentTimeMillis = System.currentTimeMillis();
        HandlerThreadC29808t.m60042a().mo52080a(new Runnable() {
            /* class com.p2082ss.android.common.p2132c.C29819a.RunnableC298212 */

            static {
                Covode.recordClassIndex(36226);
            }

            public final void run() {
                if (!C13627m.m24498a(str)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("_event_v3", 1);
                        jSONObject.put("event_v3_reserved_field_time_stamp", currentTimeMillis);
                        Bundle bundle = bundle;
                        if (bundle != null) {
                            for (String str : bundle.keySet()) {
                                jSONObject.put(str, m60078a(bundle, str));
                            }
                        }
                        String abSDKVersion = AppLog.getAbSDKVersion();
                        if (!TextUtils.isEmpty(abSDKVersion)) {
                            jSONObject.put("ab_sdk_version", abSDKVersion);
                        }
                    } catch (Throwable unused) {
                    }
                    AppLog.onEvent((Context) null, "event_v3", str, (String) null, 0, 0, jSONObject);
                }
            }

            /* renamed from: a */
            private static Object m60078a(Bundle bundle, String str) {
                try {
                    return bundle.get(str);
                } catch (Exception | OutOfMemoryError unused) {
                    return null;
                }
            }
        });
    }

    /* renamed from: a */
    public static void m60077a(final String str, JSONObject jSONObject) {
        String str2;
        String str3;
        C2602f fVar;
        String str4;
        boolean z;
        int value;
        if (C29944a.m60344a() && !C89361p.m154872a("btm_page_show", str, true)) {
            String str5 = null;
            if (jSONObject != null) {
                str2 = jSONObject.optString("enter_from");
            } else {
                str2 = null;
            }
            C2602f fVar2 = C2603g.f7843b;
            if (fVar2 == null) {
                str3 = null;
            } else {
                str3 = fVar2.f7836p;
            }
            Object obj = "";
            if (str3 == null) {
                str3 = obj;
            }
            if (jSONObject != null) {
                jSONObject.put("btm", str3);
            }
            C2602f fVar3 = C2603g.f7843b;
            if (!(fVar3 == null || (fVar = fVar3.f7823c) == null || (str4 = fVar.f7836p) == null)) {
                obj = str4;
            }
            if (jSONObject != null) {
                jSONObject.put("pre_btm", obj);
            }
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && str3.length() != 0) {
                C2602f fVar4 = C2603g.f7843b;
                if (fVar4 != null) {
                    str5 = fVar4.f7822b;
                }
                if (C89361p.m154872a(str2, str5, true)) {
                    value = C29946b.EnumC29947a.SAME.getValue();
                } else {
                    value = C29946b.EnumC29947a.DIFF.getValue();
                }
                jSONObject.put("btm_compare_enter_from", value);
            } else if (jSONObject != null) {
                jSONObject.put("btm_compare_enter_from", C29946b.EnumC29947a.NULL.getValue());
            }
        }
        final JSONObject a = m60074a(jSONObject);
        final long currentTimeMillis = System.currentTimeMillis();
        HandlerThreadC29808t.m60042a().mo52080a(new Runnable() {
            /* class com.p2082ss.android.common.p2132c.C29819a.RunnableC298201 */

            static {
                Covode.recordClassIndex(36225);
            }

            public final void run() {
                while (C29822b.f71163a) {
                    C29822b.m60079a();
                }
                if (!C13627m.m24498a(str)) {
                    JSONObject jSONObject = a;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        jSONObject.put("_event_v3", 1);
                        jSONObject.put("event_v3_reserved_field_time_stamp", currentTimeMillis);
                        String abSDKVersion = AppLog.getAbSDKVersion();
                        if (!TextUtils.isEmpty(abSDKVersion)) {
                            jSONObject.put("ab_sdk_version", abSDKVersion);
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    AppLog.onEvent((Context) null, "event_v3", str, (String) null, 0, 0, jSONObject);
                }
            }
        });
        MLDataCenterService.instance().traceMobClickEvent(str, jSONObject);
    }
}
