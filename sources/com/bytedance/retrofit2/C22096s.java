package com.bytedance.retrofit2;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.retrofit2.s */
public class C22096s {

    /* renamed from: A */
    public long f52158A = -1;

    /* renamed from: B */
    public long f52159B = -1;

    /* renamed from: C */
    public long f52160C = -1;

    /* renamed from: D */
    public long f52161D = -1;

    /* renamed from: E */
    public long f52162E = -1;

    /* renamed from: F */
    public long f52163F = -1;

    /* renamed from: G */
    public long f52164G = -1;

    /* renamed from: H */
    public long f52165H = -1;

    /* renamed from: I */
    public long f52166I = -1;

    /* renamed from: J */
    public long f52167J = -1;

    /* renamed from: K */
    public long f52168K = -1;

    /* renamed from: L */
    public long f52169L = -1;

    /* renamed from: M */
    public Map<String, Long> f52170M = new HashMap();

    /* renamed from: N */
    public String f52171N = "";

    /* renamed from: O */
    public JSONArray f52172O;

    /* renamed from: P */
    public Map<String, Long> f52173P = new ConcurrentHashMap();

    /* renamed from: a */
    public int f52174a = -1;

    /* renamed from: b */
    public String f52175b = "";

    /* renamed from: c */
    public List<JSONObject> f52176c;

    /* renamed from: d */
    public String f52177d;

    /* renamed from: e */
    public boolean f52178e;

    /* renamed from: f */
    public long f52179f;

    /* renamed from: g */
    public long f52180g;

    /* renamed from: h */
    public long f52181h;

    /* renamed from: i */
    public long f52182i;

    /* renamed from: j */
    public long f52183j;

    /* renamed from: k */
    public long f52184k;

    /* renamed from: l */
    public long f52185l;

    /* renamed from: m */
    public long f52186m;

    /* renamed from: n */
    public long f52187n;

    /* renamed from: o */
    public long f52188o;

    /* renamed from: p */
    public long f52189p;

    /* renamed from: q */
    public long f52190q;

    /* renamed from: r */
    public long f52191r;

    /* renamed from: s */
    public long f52192s;

    /* renamed from: t */
    public long f52193t;

    /* renamed from: u */
    public long f52194u;

    /* renamed from: v */
    public long f52195v;

    /* renamed from: w */
    public long f52196w;

    /* renamed from: x */
    public Map<String, Long> f52197x = new HashMap();

    /* renamed from: y */
    public Map<String, Long> f52198y = new HashMap();

    /* renamed from: z */
    public long f52199z = -1;

    static {
        Covode.recordClassIndex(25796);
    }

    /* renamed from: b */
    private static JSONObject m41499b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("model", Build.MODEL);
            String str = "";
            if (Build.VERSION.SDK_INT < 21) {
                str = Build.CPU_ABI;
            } else {
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr != null && strArr.length > 0) {
                    str = Arrays.asList(strArr).toString();
                }
            }
            jSONObject.put("abis", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: d */
    private JSONObject m41501d() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Long> entry : this.f52173P.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public C22096s() {
    }

    /* renamed from: e */
    private JSONObject m41502e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("filterUrl", this.f52199z);
            jSONObject.put("addCommonParam", this.f52158A);
            jSONObject.put("requestVerify", this.f52159B);
            jSONObject.put("encryptRequest", this.f52161D);
            jSONObject.put("genReqTicket", this.f52162E);
            jSONObject.put("checkReqTicket", this.f52163F);
            jSONObject.put("preCdnVerify", this.f52164G);
            jSONObject.put("postCdnVerify", this.f52167J);
            jSONObject.put("addClientKey", this.f52165H);
            jSONObject.put("updateClientKey", this.f52166I);
            jSONObject.put("commandListener", this.f52168K);
            jSONObject.put("filterDupQuery", this.f52160C);
            jSONObject.put("queryFilter", this.f52169L);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: f */
    private JSONObject m41503f() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f52197x.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Long> entry : this.f52197x.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("request", jSONObject2);
            }
            if (!this.f52198y.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Long> entry2 : this.f52198y.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("response", jSONObject3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final String mo35895a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f52174a != -1) {
                jSONObject.put("model", m41499b());
            }
            List<JSONObject> list = this.f52176c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (JSONObject jSONObject2 : this.f52176c) {
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("connectionAttempts", jSONArray);
            }
            jSONObject.put("concurrent", this.f52178e);
            jSONObject.put("base", m41500c());
            jSONObject.put("callback", m41502e());
            jSONObject.put("interceptor", m41503f());
            jSONObject.put("ttnetVersion", this.f52171N);
            JSONArray jSONArray2 = this.f52172O;
            if (jSONArray2 != null) {
                jSONObject.put("actionInfo", jSONArray2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    private JSONObject m41500c() {
        boolean a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallback", this.f52174a);
            if (!TextUtils.isEmpty(this.f52175b)) {
                jSONObject.put("fallbackMessage", this.f52175b);
            }
            jSONObject.put("createRetrofitTime", this.f52179f);
            jSONObject.put("appRequestStartTime", this.f52180g);
            jSONObject.put("beforeAllInterceptTime", this.f52181h);
            jSONObject.put("callServerInterceptTime", this.f52182i);
            jSONObject.put("callExecuteStartTime", this.f52183j);
            jSONObject.put("reportTime", this.f52184k);
            jSONObject.put("delayWait", this.f52189p);
            jSONObject.put("injectInterceptorTime", m41501d());
            if (!TextUtils.isEmpty(this.f52177d)) {
                jSONObject.put("transactionId", this.f52177d);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        boolean a2 = m41498a(jSONObject, "loadServiceMethod", this.f52185l, this.f52186m, true);
        long j = this.f52187n;
        if (j > 0) {
            a = m41498a(jSONObject, "enqueueWait", j, this.f52190q, a2);
        } else {
            a = m41498a(jSONObject, "executeWait", this.f52188o, this.f52190q, a2);
        }
        m41498a(jSONObject, "responseParse", this.f52195v, this.f52196w, m41498a(jSONObject, "requestParse", this.f52191r, this.f52192s, m41498a(jSONObject, "executeCall", this.f52193t, this.f52194u, a)));
        return jSONObject;
    }

    public C22096s(long j, long j2) {
        this.f52180g = j;
        this.f52181h = j2;
    }

    /* renamed from: a */
    private static boolean m41498a(JSONObject jSONObject, String str, long j, long j2, boolean z) {
        if (!z || j > j2) {
            jSONObject.put(str, -1);
            return false;
        }
        try {
            jSONObject.put(str, j2 - j);
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
