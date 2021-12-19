package com.bytedance.android.livesdk.p425aa.p426a;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.aa.a.a */
public class C6499a {

    /* renamed from: a */
    public static final C6555i f16154a = C6555i.m14021b();

    /* renamed from: b */
    private static volatile C6499a f16155b;

    /* renamed from: a */
    public final Map<String, String> mo12638a(View view, String str) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(StringSet.type, "action");
            hashMap.put("action", str);
            if (view == null) {
                return hashMap;
            }
            hashMap.put("class_name", view.toString());
            StringBuffer stringBuffer = new StringBuffer();
            boolean z = true;
            String str2 = (String) view.getTag(-16777215);
            if (str2 != null) {
                stringBuffer.append("page_name:").append(str2);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (parent.getParent() == null || !(parent instanceof View) || !TextUtils.isEmpty(str2)) {
                    break;
                }
                View view2 = (View) parent;
                if (view2.getTag(-16777215) != null) {
                    stringBuffer.append("page_name:").append((String) view2.getTag(-16777215));
                    break;
                }
                parent = parent.getParent();
            }
            JSONObject jSONObject = new JSONObject();
            String a = m13908a(view);
            if (!TextUtils.isEmpty(a)) {
                hashMap.put("id", a);
                stringBuffer.append("|id:").append(a);
                z = false;
            }
            if (view.getParent() != null) {
                if (view.getParent() instanceof RecyclerView) {
                    int indexOfChild = ((RecyclerView) view.getParent()).indexOfChild(view);
                    stringBuffer.append("|RecyclerView|position:").append(indexOfChild);
                    m13913a(jSONObject, "position", indexOfChild);
                    if (view instanceof ViewGroup) {
                        m13914a(jSONObject, "children_info", m13907a(0, (ViewGroup) view));
                    }
                } else if (view.getParent() instanceof ListView) {
                    int indexOfChild2 = ((ListView) view.getParent()).indexOfChild(view);
                    stringBuffer.append("|ListView|position:").append(indexOfChild2);
                    m13913a(jSONObject, "position", indexOfChild2);
                    if (view instanceof ViewGroup) {
                        m13914a(jSONObject, "children_info", m13907a(0, (ViewGroup) view));
                    }
                }
            }
            String b = m13915b(view);
            if (!TextUtils.isEmpty(b)) {
                m13914a(jSONObject, "text", b);
                stringBuffer.append("|text:").append(b);
                z = false;
            }
            String c = m13916c(view);
            if (!TextUtils.isEmpty(c)) {
                m13914a(jSONObject, "tag", c);
                stringBuffer.append("|tag:").append(c);
                z = false;
            }
            String d = m13917d(view);
            if (!TextUtils.isEmpty(d)) {
                m13914a(jSONObject, "description", d);
                stringBuffer.append("|description:").append(d);
                z = false;
            }
            if (jSONObject.length() > 0) {
                z = false;
            }
            if (z && (view instanceof ViewGroup)) {
                m13914a(jSONObject, "children_info", m13907a(0, (ViewGroup) view));
            }
            hashMap.put("params", jSONObject.toString());
            hashMap.put("path", stringBuffer.toString());
            return hashMap;
        } catch (Throwable unused) {
        }
    }

    static {
        Covode.recordClassIndex(7235);
    }

    /* renamed from: a */
    public static C6499a m13906a() {
        MethodCollector.m26663i(11096);
        if (f16155b == null) {
            synchronized (C6499a.class) {
                try {
                    if (f16155b == null) {
                        f16155b = new C6499a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11096);
                    throw th;
                }
            }
        }
        C6499a aVar = f16155b;
        MethodCollector.m26664o(11096);
        return aVar;
    }

    /* renamed from: a */
    private static JSONObject m13909a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static String m13917d(View view) {
        if (view != null) {
            return (String) view.getContentDescription();
        }
        return "";
    }

    /* renamed from: b */
    private static String m13915b(View view) {
        if (view instanceof TextView) {
            return ((TextView) view).getText().toString();
        }
        return "";
    }

    /* renamed from: c */
    private static String m13916c(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag();
            if (obj == null) {
                return "";
            }
        } else {
            obj = "";
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    private static String m13908a(View view) {
        String str = "";
        if (view == null || view.getId() <= 0 || view.getContext() == null) {
            return str;
        }
        try {
            str = "R.id." + view.getContext().getResources().getResourceEntryName(view.getId());
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static JSONObject m13910a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private String m13907a(int i, ViewGroup viewGroup) {
        StringBuffer stringBuffer = new StringBuffer();
        if (viewGroup == null) {
            return stringBuffer.toString();
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            stringBuffer.append("|index:").append(i).append(i2);
            String b = m13915b(childAt);
            if (!TextUtils.isEmpty(b)) {
                stringBuffer.append("|text:").append(b);
            }
            if (!TextUtils.isEmpty(m13916c(childAt))) {
                stringBuffer.append("|tag:").append(b);
            }
            String d = m13917d(childAt);
            if (!TextUtils.isEmpty(d)) {
                stringBuffer.append("|description:").append(d);
            }
            if (childAt instanceof ViewGroup) {
                stringBuffer.append(m13907a(i2, (ViewGroup) childAt));
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static void m13912a(String str, String str2, Map map) {
        m13911a(str, str2, 1, m13910a(map));
    }

    /* renamed from: a */
    public static void m13913a(JSONObject jSONObject, String str, int i) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, i);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m13914a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m13911a(String str, String str2, int i, JSONObject jSONObject) {
        JSONObject a;
        if (jSONObject != null && (a = m13909a(jSONObject.toString())) != null) {
            m13914a(a, "service", str2);
            m13913a(a, "status_code", i);
            f16154a.mo9218b(str, a);
        }
    }
}
