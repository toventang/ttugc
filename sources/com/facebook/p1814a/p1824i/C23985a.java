package com.facebook.p1814a.p1824i;

import android.util.Patterns;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.i.a */
final class C23985a {

    /* renamed from: a */
    static Map<String, String> f56767a;

    /* renamed from: b */
    static Map<String, String> f56768b;

    /* renamed from: c */
    static Map<String, String> f56769c;

    /* renamed from: d */
    static JSONObject f56770d;

    /* renamed from: e */
    static boolean f56771e;

    static {
        Covode.recordClassIndex(28106);
    }

    C23985a() {
    }

    /* renamed from: a */
    static float[] m45355a(JSONObject jSONObject, String str) {
        if (C24677a.m47209a(C23985a.class)) {
            return null;
        }
        try {
            if (!f56771e) {
                return null;
            }
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            try {
                String lowerCase = str.toLowerCase();
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String optString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                m45352a(jSONObject2, jSONArray);
                m45348a(fArr, m45354a(jSONObject2));
                JSONObject c = m45358c(jSONObject2);
                if (c == null) {
                    return null;
                }
                m45348a(fArr, m45356a(c, jSONArray, optString, jSONObject2.toString(), lowerCase));
                return fArr;
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            C24677a.m47208a(th, C23985a.class);
            return null;
        }
    }

    /* renamed from: a */
    private static float[] m45354a(JSONObject jSONObject) {
        if (C24677a.m47209a(C23985a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String lowerCase = jSONObject.optString("text").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject.optString("classname").toLowerCase();
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m45353a(new String[]{"$", "amount", "price", "total"}, strArr)) {
                double d = (double) fArr[0];
                Double.isNaN(d);
                fArr[0] = (float) (d + 1.0d);
            }
            if (m45353a(new String[]{"password", "pwd"}, strArr)) {
                double d2 = (double) fArr[1];
                Double.isNaN(d2);
                fArr[1] = (float) (d2 + 1.0d);
            }
            if (m45353a(new String[]{"tel", "phone"}, strArr)) {
                double d3 = (double) fArr[2];
                Double.isNaN(d3);
                fArr[2] = (float) (d3 + 1.0d);
            }
            if (m45353a(new String[]{"search"}, strArr)) {
                double d4 = (double) fArr[4];
                Double.isNaN(d4);
                fArr[4] = (float) (d4 + 1.0d);
            }
            if (optInt >= 0) {
                double d5 = (double) fArr[5];
                Double.isNaN(d5);
                fArr[5] = (float) (d5 + 1.0d);
            }
            if (optInt == 3 || optInt == 2) {
                double d6 = (double) fArr[6];
                Double.isNaN(d6);
                fArr[6] = (float) (d6 + 1.0d);
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                double d7 = (double) fArr[7];
                Double.isNaN(d7);
                fArr[7] = (float) (d7 + 1.0d);
            }
            if (lowerCase3.contains("checkbox")) {
                double d8 = (double) fArr[8];
                Double.isNaN(d8);
                fArr[8] = (float) (d8 + 1.0d);
            }
            if (m45353a(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                double d9 = (double) fArr[10];
                Double.isNaN(d9);
                fArr[10] = (float) (d9 + 1.0d);
            }
            if (lowerCase3.contains("radio") && lowerCase3.contains("button")) {
                double d10 = (double) fArr[12];
                Double.isNaN(d10);
                fArr[12] = (float) (d10 + 1.0d);
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    m45348a(fArr, m45354a(optJSONArray.getJSONObject(i)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23985a.class);
            return null;
        }
    }

    /* renamed from: a */
    private static float[] m45356a(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        if (C24677a.m47209a(C23985a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            int length = jSONArray.length();
            fArr[3] = (float) (length > 1 ? length - 1 : 0);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (m45357b(jSONArray.getJSONObject(i))) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                } catch (JSONException unused) {
                }
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            m45347a(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            fArr[15] = m45351a("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[16] = m45351a("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = m45351a("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
            fArr[18] = str2.contains("password") ? 1.0f : 0.0f;
            fArr[19] = m45350a("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = m45350a("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = m45350a("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = m45351a("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[24] = m45351a("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = m45350a("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
            fArr[27] = m45350a("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = m45351a("ENGLISH", "LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[29] = m45351a("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23985a.class);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m45353a(String[] strArr, String[] strArr2) {
        if (C24677a.m47209a(C23985a.class)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (str2.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23985a.class);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m45349a() {
        if (C24677a.m47209a(C23985a.class)) {
            return false;
        }
        try {
            return f56771e;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23985a.class);
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m45357b(JSONObject jSONObject) {
        if (C24677a.m47209a(C23985a.class)) {
            return false;
        }
        try {
            if ((jSONObject.optInt("classtypebitmask") & 32) > 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23985a.class);
            return false;
        }
    }

    /* renamed from: c */
    private static JSONObject m45358c(JSONObject jSONObject) {
        if (C24677a.m47209a(C23985a.class)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject c = m45358c(optJSONArray.getJSONObject(i));
                if (c != null) {
                    return c;
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C24677a.m47208a(th, C23985a.class);
        }
    }

    /* renamed from: a */
    private static void m45348a(float[] fArr, float[] fArr2) {
        if (!C24677a.m47209a(C23985a.class)) {
            int i = 0;
            while (true) {
                try {
                    fArr[i] = fArr[i] + fArr2[i];
                    i++;
                    if (i >= 30) {
                        return;
                    }
                } catch (Throwable th) {
                    C24677a.m47208a(th, C23985a.class);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m45350a(String str, String str2) {
        if (C24677a.m47209a(C23985a.class)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            C24677a.m47208a(th, C23985a.class);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m45352a(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        boolean z2;
        if (C24677a.m47209a(C23985a.class)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    z = false;
                    z2 = false;
                    break;
                } else if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    jSONArray.put(optJSONArray.getJSONObject(i2));
                }
            } else {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    if (m45352a(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23985a.class);
            return false;
        }
    }

    /* renamed from: a */
    static String m45346a(String str, String str2, String str3) {
        if (C24677a.m47209a(C23985a.class)) {
            return null;
        }
        try {
            return (str3 + " | " + str2 + ", " + str).toLowerCase();
        } catch (Throwable th) {
            C24677a.m47208a(th, C23985a.class);
            return null;
        }
    }

    /* renamed from: a */
    private static void m45347a(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (!C24677a.m47209a(C23985a.class)) {
            try {
                String lowerCase = jSONObject.optString("text", "").toLowerCase();
                String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
                if (!lowerCase.isEmpty()) {
                    sb.append(lowerCase).append(" ");
                }
                if (!lowerCase2.isEmpty()) {
                    sb2.append(lowerCase2).append(" ");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        try {
                            m45347a(optJSONArray.getJSONObject(i), sb, sb2);
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23985a.class);
            }
        }
    }

    /* renamed from: a */
    private static boolean m45351a(String str, String str2, String str3, String str4) {
        if (C24677a.m47209a(C23985a.class)) {
            return false;
        }
        try {
            return m45350a(f56770d.optJSONObject("rulesForLanguage").optJSONObject(f56767a.get(str)).optJSONObject("rulesForEvent").optJSONObject(f56768b.get(str2)).optJSONObject("positiveRules").optString(f56769c.get(str3)), str4);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23985a.class);
            return false;
        }
    }
}
