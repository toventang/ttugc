package com.bytedance.android.monitor.webview.p723c.p725b;

import android.webkit.WebView;
import com.bytedance.android.monitor.p706d.C11926i;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.c.b.b */
public final class C12028b extends C11926i {

    /* renamed from: l */
    public SoftReference<WebView> f28806l;

    /* renamed from: m */
    public String f28807m;

    /* renamed from: n */
    public long f28808n;

    /* renamed from: o */
    public JSONObject f28809o = new JSONObject();

    /* renamed from: p */
    private JSONObject f28810p = new JSONObject();

    static {
        Covode.recordClassIndex(13756);
    }

    /* renamed from: b */
    public final SoftReference<WebView> mo19267b() {
        SoftReference<WebView> softReference = this.f28806l;
        if (softReference != null) {
            return softReference;
        }
        return new SoftReference<>(null);
    }

    /* renamed from: b */
    public final void mo19268b(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            C11950d.m21100a(this.f28810p, next, C11950d.m21106d(jSONObject, next));
        }
    }

    @Override // com.bytedance.android.monitor.p706d.C11926i, com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public final void mo19117a(JSONObject jSONObject) {
        super.mo19117a(jSONObject);
        C11950d.m21101a(jSONObject, "js_dependency_version", "2.2.1");
        C11950d.m21101a(jSONObject, "native_page", this.f28807m);
        C11950d.m21101a(jSONObject, "webview_type", this.f28532d);
        C11950d.m21102a(jSONObject, this.f28810p);
        C11950d.m21102a(jSONObject, this.f28809o);
        JSONObject optJSONObject = jSONObject.optJSONObject("debug_context");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            C11950d.m21100a(jSONObject, "debug_context", optJSONObject);
        }
        C11950d.m21100a(optJSONObject, "is_ttweb_enable", (Object) Boolean.valueOf(((C12044i) C12044i.f28862a).mo19323c()));
    }
}
