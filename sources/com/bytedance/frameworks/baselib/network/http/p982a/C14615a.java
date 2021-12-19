package com.bytedance.frameworks.baselib.network.http.p982a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.a.a */
public final class C14615a {

    /* renamed from: a */
    public volatile boolean f35384a;

    /* renamed from: b */
    public volatile boolean f35385b;

    /* renamed from: c */
    public CopyOnWriteArraySet<String> f35386c;

    /* renamed from: d */
    public CopyOnWriteArraySet<String> f35387d;

    /* renamed from: e */
    public CopyOnWriteArraySet<String> f35388e;

    /* renamed from: f */
    public CopyOnWriteArraySet<Pattern> f35389f;

    /* renamed from: g */
    public CopyOnWriteArraySet<String> f35390g;

    /* renamed from: h */
    public CopyOnWriteArraySet<String> f35391h;

    /* renamed from: i */
    public CopyOnWriteArraySet<Pattern> f35392i;

    /* renamed from: j */
    public CopyOnWriteArraySet<String> f35393j;

    /* renamed from: k */
    private volatile String f35394k;

    static {
        Covode.recordClassIndex(16706);
    }

    /* renamed from: a */
    public final void mo23499a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.f35394k) || !this.f35394k.equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.f35394k = str;
                    m26720b(jSONObject.optJSONArray("host_group"), this.f35386c);
                    m26720b(jSONObject.optJSONArray("min_params_exclude"), this.f35393j);
                    JSONObject optJSONObject = jSONObject.optJSONObject("L0_path");
                    if (optJSONObject != null) {
                        m26720b(optJSONObject.optJSONArray("equal_group"), this.f35387d);
                        m26720b(optJSONObject.optJSONArray("prefix_group"), this.f35388e);
                        m26719a(optJSONObject.optJSONArray("pattern_group"), this.f35389f);
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("L1_path");
                    if (optJSONObject2 != null) {
                        m26720b(optJSONObject2.optJSONArray("equal_group"), this.f35390g);
                        m26720b(optJSONObject2.optJSONArray("prefix_group"), this.f35391h);
                        m26719a(optJSONObject2.optJSONArray("pattern_group"), this.f35392i);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private static void m26720b(JSONArray jSONArray, Set<String> set) {
        if (!(jSONArray == null || set == null)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    set.add(jSONArray.getString(i));
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m26719a(JSONArray jSONArray, Set<Pattern> set) {
        if (!(jSONArray == null || set == null)) {
            HashSet hashSet = new HashSet();
            for (Pattern pattern : set) {
                hashSet.add(pattern.toString());
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string) && !hashSet.contains(string)) {
                        set.add(Pattern.compile(string, 2));
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }
}
