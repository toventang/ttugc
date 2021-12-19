package com.bytedance.sdk.p1665b.p1676f;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1665b.C22518a;
import com.bytedance.sdk.p1665b.p1667b.C22533d;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.b.f.a */
public final class C22584a {
    static {
        Covode.recordClassIndex(26400);
    }

    /* renamed from: c */
    public static JSONObject m42611c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errDesc", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m42605a(InputStream inputStream) {
        MethodCollector.m26663i(3201);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        try {
            char[] cArr = new char[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = inputStreamReader.read(cArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            return sb.toString();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            inputStreamReader.close();
            MethodCollector.m26664o(3201);
        }
    }

    /* renamed from: b */
    public static String m42610b(String str) {
        Map<String, List<String>> map;
        C22533d i = C22518a.m42485i();
        if (!(i == null || (map = i.f53271a) == null)) {
            for (String str2 : map.keySet()) {
                if (map.get(str2).contains(str)) {
                    return str2;
                }
            }
        }
        return "unknown";
    }

    /* renamed from: a */
    public static String m42606a(String str) {
        String h = C22518a.m42484h();
        if (!TextUtils.isEmpty(h)) {
            return "https://" + h + str;
        }
        C22539a.m42536d("host is null, please check host config");
        return null;
    }

    /* renamed from: a */
    public static String m42607a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey()).append("=").append(entry.getValue());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m42609a(Context context, String str) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            if (context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C22539a.m42536d(e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public static JSONObject m42608a(int i, String str, String str2, String str3, String str4, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
            jSONObject.put("platform", str);
            jSONObject.put("host", str2);
            jSONObject.put("path", str3);
            jSONObject.put("url", str4);
            jSONObject.put("errCode", i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
