package com.bytedance.frameworks.baselib.network.p981c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.client.Request;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.c.b */
public abstract class AbstractC14608b {

    /* renamed from: c */
    private static final String f35328c = AbstractC14608b.class.getSimpleName();

    /* renamed from: a */
    public int f35329a;

    /* renamed from: b */
    public int f35330b;

    /* renamed from: d */
    private Set<String> f35331d = new HashSet();

    /* renamed from: e */
    private Set<String> f35332e = new HashSet();

    /* renamed from: f */
    private Set<String> f35333f = new HashSet();

    /* renamed from: g */
    private Set<Pattern> f35334g = new HashSet();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23489a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo23491a(Request request, Map<String, List<String>> map);

    static {
        Covode.recordClassIndex(16699);
    }

    /* renamed from: a */
    private static boolean m26700a(Set<?> set) {
        if (set == null || set.isEmpty()) {
            return true;
        }
        return false;
    }

    public AbstractC14608b(int i) {
        this.f35329a = i;
        this.f35330b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23493b(JSONObject jSONObject) {
        m26699a(jSONObject.optJSONArray("host_group"), this.f35331d);
        m26699a(jSONObject.optJSONArray("equal_group"), this.f35332e);
        m26699a(jSONObject.optJSONArray("prefix_group"), this.f35333f);
        JSONArray optJSONArray = jSONObject.optJSONArray("pattern_group");
        Set<Pattern> set = this.f35334g;
        if (!(optJSONArray == null || set == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    String string = optJSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            set.add(Pattern.compile(string, 2));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (JSONException unused2) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo23490a(Request request) {
        if (m26700a(this.f35331d)) {
            String path = request.getPath();
        } else {
            for (String str : this.f35331d) {
                if (C14759i.m27069a(request.getHost(), str)) {
                }
            }
            return false;
        }
        String path2 = request.getPath();
        if (TextUtils.isEmpty(path2)) {
            return false;
        }
        int length = path2.length();
        if (length > 1) {
            int i = length - 1;
            if (path2.substring(i).equals("/")) {
                path2 = path2.substring(0, i);
            }
        }
        if (!m26700a(this.f35332e) && this.f35332e.contains(path2)) {
            return true;
        }
        if (!m26700a(this.f35333f)) {
            for (String str2 : this.f35333f) {
                if (path2.startsWith(str2)) {
                    return true;
                }
            }
        }
        if (!m26700a(this.f35334g)) {
            for (Pattern pattern : this.f35334g) {
                if (pattern != null && pattern.matcher(path2).matches()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m26699a(JSONArray jSONArray, Set<String> set) {
        if (!(jSONArray == null || set == null)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        set.add(string);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo23492a(Request request, Map<String, List<String>> map, List<C14607a> list) {
        C14607a aVar = new C14607a();
        aVar.f35326c = SystemClock.uptimeMillis();
        boolean z = false;
        if (request.getQueryFilterPriority() <= this.f35329a && (z = mo23491a(request, map))) {
            request.setQueryFilterPriority(this.f35330b);
        }
        aVar.f35324a = z;
        aVar.f35325b = this.f35329a;
        aVar.f35327d = SystemClock.uptimeMillis();
        list.add(aVar);
        return z;
    }

    /* renamed from: a */
    protected static AbstractC14608b m26698a(String str, int i, int i2, JSONObject jSONObject) {
        if (!str.equals("rm")) {
            return null;
        }
        C14611d dVar = new C14611d(i);
        dVar.mo23489a(jSONObject);
        dVar.f35330b = i2;
        return dVar;
    }
}
