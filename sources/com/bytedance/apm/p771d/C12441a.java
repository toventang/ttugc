package com.bytedance.apm.p771d;

import android.text.TextUtils;
import com.bytedance.apm.p771d.C12442b;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p841k.C13113a;
import com.p2082ss.android.common.util.C29843f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.d.a */
public final class C12441a {

    /* renamed from: a */
    private static AtomicInteger f30211a = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(14251);
    }

    /* renamed from: a */
    public static void m22403a(byte[] bArr) {
        List<JSONObject> d = m22406d(bArr);
        if (d != null) {
            for (JSONObject jSONObject : d) {
                m22402a(jSONObject, "DATA_SEND_BEGIN");
            }
        }
    }

    /* renamed from: c */
    public static void m22405c(byte[] bArr) {
        for (JSONObject jSONObject : m22406d(bArr)) {
            m22402a(jSONObject, "DATA_SEND_FAIL");
            m22402a(jSONObject, "DATA_SEND_END");
        }
    }

    /* renamed from: b */
    public static void m22404b(byte[] bArr) {
        for (JSONObject jSONObject : m22406d(bArr)) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("DATA_DOCTOR");
                if (jSONObject2 != null) {
                    jSONObject2.put("DATA_SEND_RESULT", 200);
                }
            } catch (Exception unused) {
            }
            m22402a(jSONObject, "DATA_SEND_SUCCESS");
            m22402a(jSONObject, "DATA_SEND_END");
        }
    }

    /* renamed from: d */
    private static List<JSONObject> m22406d(byte[] bArr) {
        JSONArray optJSONArray;
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("list")) {
                JSONArray optJSONArray2 = jSONObject.optJSONArray("list");
                if (optJSONArray2 == null) {
                    return null;
                }
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                    if (!(jSONObject2 == null || (optJSONArray = jSONObject2.optJSONArray("data")) == null)) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            arrayList.add(optJSONArray.getJSONObject(i2));
                        }
                    }
                }
            } else {
                JSONArray optJSONArray3 = jSONObject.optJSONArray("data");
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    arrayList.add(optJSONArray3.getJSONObject(i3));
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m22402a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                C12442b.C12445a.f30223a.mo20276a(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m22401a(String str, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("DATA_ID", f30211a.incrementAndGet());
            jSONObject2.put("DATA_PROCESS", C29843f.m60132b(C13113a.f31955g));
            jSONObject2.put("DATA_TYPE", str);
            jSONObject2.put("DATA_SAMPLE", z);
            jSONObject2.put("DATA_SAVE_DB_IMMEDIATE", false);
            jSONObject2.put("DATA_UPLOAD_IMMEDIATE", false);
            jSONObject.put("DATA_DOCTOR", jSONObject2);
            JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
            C12442b.C12445a.f30223a.mo20276a("DATA_RECEIVE", jSONObject3);
            C12442b.C12445a.f30223a.mo20276a("DATA_CACHE", jSONObject3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
