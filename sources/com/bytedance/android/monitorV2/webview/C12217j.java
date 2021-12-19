package com.bytedance.android.monitorV2.webview;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.j */
public final class C12217j {

    /* renamed from: a */
    private Map<Object, List<Object>> f29403a = new WeakHashMap();

    /* renamed from: b */
    private Map<String, List<JSONObject>> f29404b = new WeakHashMap();

    /* renamed from: c */
    private Map<String, Map<String, JSONObject>> f29405c = new HashMap();

    static {
        Covode.recordClassIndex(13948);
    }

    /* renamed from: a */
    public final List<JSONObject> mo19641a(String str) {
        List<JSONObject> remove;
        MethodCollector.m26663i(11542);
        synchronized (this) {
            try {
                remove = this.f29404b.remove(str);
            } finally {
                MethodCollector.m26664o(11542);
            }
        }
        return remove;
    }

    /* renamed from: b */
    public final Map<String, JSONObject> mo19644b(String str) {
        Map<String, JSONObject> remove;
        MethodCollector.m26663i(11544);
        synchronized (this) {
            try {
                remove = this.f29405c.remove(str);
            } finally {
                MethodCollector.m26664o(11544);
            }
        }
        return remove;
    }

    /* renamed from: a */
    public final void mo19643a(String str, JSONObject jSONObject) {
        MethodCollector.m26663i(11541);
        if (jSONObject == null) {
            MethodCollector.m26664o(11541);
            return;
        }
        List<JSONObject> list = this.f29404b.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        synchronized (list) {
            try {
                list.add(jSONObject);
            } catch (Throwable th) {
                MethodCollector.m26664o(11541);
                throw th;
            }
        }
        this.f29404b.put(str, list);
        MethodCollector.m26664o(11541);
    }

    /* renamed from: a */
    public final void mo19642a(String str, String str2, JSONObject jSONObject) {
        MethodCollector.m26663i(11543);
        if (jSONObject == null) {
            MethodCollector.m26664o(11543);
            return;
        }
        Map<String, JSONObject> map = this.f29405c.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        synchronized (map) {
            try {
                map.put(str2, jSONObject);
            } catch (Throwable th) {
                MethodCollector.m26664o(11543);
                throw th;
            }
        }
        this.f29405c.put(str, map);
        MethodCollector.m26664o(11543);
    }
}
