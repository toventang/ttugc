package com.p1795d.p1796a.p1797a.p1798a.p1804e;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.e.b */
public final class C23798b {

    /* renamed from: a */
    public static WindowManager f56299a;

    /* renamed from: b */
    public static float f56300b = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: c */
    private static String[] f56301c = {"x", "y", "width", "height"};

    /* renamed from: com.d.a.a.a.e.b$a */
    static class C23799a {

        /* renamed from: a */
        final float f56302a;

        /* renamed from: b */
        final float f56303b;

        static {
            Covode.recordClassIndex(27907);
        }

        C23799a(float f, float f2) {
            this.f56302a = f;
            this.f56303b = f2;
        }
    }

    static {
        Covode.recordClassIndex(27906);
    }

    /* renamed from: a */
    public static void m44984a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException unused) {
            C23800c.m44990b("Error with setting ad session id");
        }
    }

    /* renamed from: a */
    public static void m44985a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            C23800c.m44990b("JSONException during JSONObject.put for name [" + str + "]");
        }
    }

    /* renamed from: a */
    public static void m44986a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m44987a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: a */
    public static Object m44981a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4877);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(4877);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static JSONObject m44982a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) (((float) i) / f56300b));
            jSONObject.put("y", (double) (((float) i2) / f56300b));
            jSONObject.put("width", (double) (((float) i3) / f56300b));
            jSONObject.put("height", (double) (((float) i4) / f56300b));
        } catch (JSONException unused) {
            C23800c.m44990b("Error with creating viewStateObject");
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m44983a(JSONObject jSONObject) {
        float f;
        int i = Build.VERSION.SDK_INT;
        float f2 = 0.0f;
        if (f56299a != null) {
            Point point = new Point(0, 0);
            f56299a.getDefaultDisplay().getRealSize(point);
            f2 = ((float) point.x) / f56300b;
            f = ((float) point.y) / f56300b;
        } else {
            f = 0.0f;
        }
        C23799a aVar = new C23799a(f2, f);
        try {
            jSONObject.put("width", (double) aVar.f56302a);
            jSONObject.put("height", (double) aVar.f56303b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static boolean m44988b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f56301c;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (m44987a(optJSONArray, optJSONArray2)) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= optJSONArray.length()) {
                                    break;
                                } else if (!optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (!(optJSONArray3 == null && optJSONArray4 == null)) {
                        if (m44987a(optJSONArray3, optJSONArray4)) {
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                if (m44988b(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
