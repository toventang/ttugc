package com.p1795d.p1796a.p1797a.p1798a.p1806g;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23766a;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23773d;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23780k;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23781l;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a.C23768b;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23788d;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23789e;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23797a;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23798b;
import com.p1795d.p1796a.p1797a.p1798a.p1805f.C23804b;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.g.a */
public abstract class AbstractC23805a {

    /* renamed from: a */
    public C23804b f56304a = new C23804b(null);

    /* renamed from: b */
    public C23766a f56305b;

    /* renamed from: c */
    public C23768b f56306c;

    /* renamed from: d */
    public EnumC23806a f56307d;

    /* renamed from: e */
    public long f56308e;

    /* renamed from: com.d.a.a.a.g.a$a */
    public enum EnumC23806a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE;

        static {
            Covode.recordClassIndex(27914);
        }
    }

    static {
        Covode.recordClassIndex(27913);
    }

    public AbstractC23805a() {
        mo39273d();
    }

    /* renamed from: a */
    public void mo39264a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39266a(WebView webView) {
        this.f56304a = new C23804b(webView);
    }

    /* renamed from: a */
    public void mo39267a(C23781l lVar, C23773d dVar) {
        mo39268a(lVar, dVar, null);
    }

    /* renamed from: b */
    public void mo39271b() {
        this.f56304a.clear();
    }

    /* renamed from: c */
    public final WebView mo39272c() {
        return (WebView) this.f56304a.get();
    }

    /* renamed from: a */
    private static Context m45000a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39268a(C23781l lVar, C23773d dVar, JSONObject jSONObject) {
        String str = lVar.f56263f;
        JSONObject jSONObject2 = new JSONObject();
        C23798b.m44985a(jSONObject2, "environment", "app");
        C23798b.m44985a(jSONObject2, "adSessionType", dVar.f56242h);
        C23798b.m44985a(jSONObject2, "deviceInfo", C23797a.m44980a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C23798b.m44985a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C23798b.m44985a(jSONObject3, "partnerName", dVar.f56235a.f56252a);
        C23798b.m44985a(jSONObject3, "partnerVersion", dVar.f56235a.f56253b);
        C23798b.m44985a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C23798b.m44985a(jSONObject4, "libraryVersion", "1.3.0-Bytedance");
        C23798b.m44985a(jSONObject4, "appId", m45000a(C23788d.f56283a.f56284b).getPackageName());
        C23798b.m44985a(jSONObject2, "app", jSONObject4);
        if (dVar.f56241g != null) {
            C23798b.m44985a(jSONObject2, "contentUrl", dVar.f56241g);
        }
        if (dVar.f56240f != null) {
            C23798b.m44985a(jSONObject2, "customReferenceData", dVar.f56240f);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (C23780k kVar : Collections.unmodifiableList(dVar.f56237c)) {
            C23798b.m44985a(jSONObject5, kVar.f56254a, kVar.f56256c);
        }
        C23789e.f56285a.mo39256a(mo39272c(), str, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public final void mo39269a(String str) {
        C23789e.f56285a.mo39255a(mo39272c(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo39270a(String str, JSONObject jSONObject) {
        C23789e.f56285a.mo39255a(mo39272c(), str, jSONObject);
    }

    /* renamed from: a */
    public final void mo39265a(float f) {
        C23789e.f56285a.mo39254a(mo39272c(), f);
    }

    /* renamed from: d */
    public final void mo39273d() {
        this.f56308e = System.nanoTime();
        this.f56307d = EnumC23806a.AD_STATE_IDLE;
    }
}
