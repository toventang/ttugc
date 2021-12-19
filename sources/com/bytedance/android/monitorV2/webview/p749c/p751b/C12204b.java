package com.bytedance.android.monitorV2.webview.p749c.p751b;

import android.webkit.WebView;
import com.bytedance.android.monitorV2.p731d.C12090i;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.webview.C12230n;
import com.bytedance.covode.number.Covode;
import java.lang.ref.SoftReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.c.b.b */
public final class C12204b extends C12090i {

    /* renamed from: k */
    public SoftReference<WebView> f29346k;

    /* renamed from: l */
    public String f29347l;

    /* renamed from: m */
    public long f29348m;

    /* renamed from: n */
    public String f29349n = "web";

    /* renamed from: o */
    public JSONObject f29350o = new JSONObject();

    /* renamed from: p */
    public JSONObject f29351p = new JSONObject();

    static {
        Covode.recordClassIndex(13935);
    }

    @Override // com.bytedance.android.monitorV2.p731d.C12090i, com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final void mo19417a(JSONObject jSONObject) {
        super.mo19417a(jSONObject);
        C12130f.m21652a(jSONObject, "js_dependency_version", "2.2.1");
        C12130f.m21652a(jSONObject, "native_page", this.f29347l);
        C12130f.m21652a(jSONObject, "webview_type", this.f29349n);
        C12130f.m21653a(jSONObject, this.f29350o);
        C12130f.m21653a(jSONObject, this.f29351p);
        JSONObject optJSONObject = jSONObject.optJSONObject("debug_context");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            C12130f.m21651a(jSONObject, "debug_context", optJSONObject);
        }
        C12130f.m21652a(optJSONObject, "is_ttweb_enable", String.valueOf(((C12230n) C12230n.f29448a).mo19674c()));
    }
}
