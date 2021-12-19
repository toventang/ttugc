package com.p2082ss.android.ugc.aweme.common;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.common.r */
public class C39162r {

    /* renamed from: a */
    private static ExecutorService f92374a;

    static {
        Covode.recordClassIndex(46785);
    }

    /* renamed from: a */
    public static void m79461a(String str, JSONObject jSONObject) {
        try {
            C29819a.m60077a(str, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m79460a(String str, Map<String, String> map) {
        try {
            C39161q.m79451a(str, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m79462a(String str, C89378p<Object, String>... pVarArr) {
        String obj;
        int length = pVarArr.length;
        HashMap hashMap = new HashMap(length);
        for (C89378p<Object, String> pVar : pVarArr) {
            String second = pVar.getSecond();
            if (second != null) {
                Object first = pVar.getFirst();
                if (first == null) {
                    obj = "";
                } else {
                    obj = first.toString();
                }
                hashMap.put(second, obj);
            }
        }
        m79460a(str, hashMap);
    }

    /* renamed from: a */
    public static ExecutorService m79452a() {
        MethodCollector.m26663i(1115);
        if (f92374a == null) {
            synchronized (C39162r.class) {
                try {
                    if (f92374a == null) {
                        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
                        a.f95504b = "EventUpload";
                        f92374a = C40780g.m82242a(a.mo70028a());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1115);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f92374a;
        MethodCollector.m26664o(1115);
        return executorService;
    }

    public static void onEventV3(String str) {
        try {
            C29819a.m60077a(str, new JSONObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void onEvent(MobClick mobClick) {
        if (!TextUtils.isEmpty(mobClick.getExtValueStr())) {
            m79458a(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), Long.parseLong(mobClick.getExtValueStr()), mobClick.getExtJson());
        } else {
            m79458a(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), mobClick.getExtValueLong(), mobClick.getExtJson());
        }
        mobClick.recycle();
    }

    /* renamed from: a */
    public static void m79453a(String str, Bundle bundle) {
        try {
            C29819a.m60076a(str, bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m79463b(String str, JSONObject jSONObject) {
        try {
            C29819a.m60077a(str, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m79454a(String str, String str2, long j) {
        try {
            C39161q.m79448a(C17867d.m33078a(), str, str2, j, 0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m79455a(String str, String str2, String str3, long j) {
        try {
            C39161q.m79448a(C17867d.m33078a(), str, str2, Long.parseLong(str3), j);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m79457a(String str, String str2, String str3, String str4) {
        try {
            C39161q.m79448a(C17867d.m33078a(), str, str2, Long.parseLong(str3), Long.parseLong(str4));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m79456a(String str, String str2, String str3, long j, JSONObject jSONObject) {
        try {
            C39161q.m79449a(C17867d.m33078a(), str, str2, Long.parseLong(str3), j, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m79459a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        try {
            C39161q.m79449a(C17867d.m33078a(), str, str2, Long.parseLong(str3), Long.parseLong(str4), jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m79458a(String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        try {
            C39161q.m79450a(C17867d.m33078a(), str, str2, str3, Long.parseLong(str4), j, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
