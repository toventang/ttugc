package com.bytedance.frameworks.baselib.network.p981c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.c.d */
class C14611d extends AbstractC14608b {

    /* renamed from: c */
    private static final String f35342c = C14611d.class.getSimpleName();

    /* renamed from: d */
    private List<String> f35343d = new ArrayList();

    /* renamed from: e */
    private List<String> f35344e = new ArrayList();

    /* renamed from: f */
    private boolean f35345f = false;

    static {
        Covode.recordClassIndex(16702);
    }

    public C14611d(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.p981c.AbstractC14608b
    /* renamed from: a */
    public final void mo23489a(JSONObject jSONObject) {
        mo23493b(jSONObject);
        m26713a(jSONObject.optJSONArray("keep_list"), this.f35343d);
        m26713a(jSONObject.optJSONArray("remove_list"), this.f35344e);
        if (!this.f35343d.isEmpty() && !this.f35344e.isEmpty()) {
            this.f35345f = true;
        }
    }

    /* renamed from: a */
    private static void m26713a(JSONArray jSONArray, List<String> list) {
        if (!(jSONArray == null || list == null)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        list.add(string);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.p981c.AbstractC14608b
    /* renamed from: a */
    public final boolean mo23491a(Request request, Map<String, List<String>> map) {
        if (this.f35345f || !mo23490a(request)) {
            return false;
        }
        if (!this.f35343d.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f35343d) {
                if (map.containsKey(str)) {
                    linkedHashMap.put(str, map.get(str));
                }
            }
            map.clear();
            map.putAll(linkedHashMap);
            return true;
        } else if (this.f35344e.isEmpty()) {
            return true;
        } else {
            for (String str2 : this.f35344e) {
                map.remove(str2);
            }
            return true;
        }
    }
}
