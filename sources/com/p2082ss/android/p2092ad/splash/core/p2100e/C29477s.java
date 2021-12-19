package com.p2082ss.android.p2092ad.splash.core.p2100e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.e.s */
public final class C29477s {

    /* renamed from: a */
    public Map<String, int[][]> f70134a = new HashMap();

    static {
        Covode.recordClassIndex(35871);
    }

    private C29477s() {
    }

    /* renamed from: a */
    public static C29477s m59062a(String str) {
        JSONObject jSONObject;
        C29477s sVar = new C29477s();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            sVar.f70134a = m59063a(jSONObject);
        }
        return sVar;
    }

    /* renamed from: a */
    private static Map<String, int[][]> m59063a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next) && (optJSONArray = jSONObject.optJSONArray(next)) != null) {
                hashMap.put(next, m59064a(optJSONArray));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static int[][] m59064a(JSONArray jSONArray) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, 0, 0);
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            int[] iArr2 = new int[2];
            iArr2[1] = 2;
            iArr2[0] = length;
            iArr = (int[][]) Array.newInstance(int.class, iArr2);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray optJSONArray = jSONArray.optJSONArray(i);
                if (optJSONArray != null && optJSONArray.length() >= 2) {
                    int i2 = 0;
                    do {
                        iArr[i][i2] = optJSONArray.optInt(i2);
                        i2++;
                    } while (i2 < 2);
                }
            }
        }
        return iArr;
    }
}
