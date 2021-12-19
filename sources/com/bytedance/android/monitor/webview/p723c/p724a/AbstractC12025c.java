package com.bytedance.android.monitor.webview.p723c.p724a;

import com.bytedance.android.monitor.p704b.AbstractC11909c;
import com.bytedance.android.monitor.p704b.AbstractC11912f;
import com.bytedance.android.monitor.p706d.C11917a;
import com.bytedance.android.monitor.p706d.C11926i;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.android.monitor.webview.p723c.p725b.C12028b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.c.a.c */
public abstract class AbstractC12025c extends AbstractC11909c implements AbstractC12024b {

    /* renamed from: a */
    private String f28796a;

    /* renamed from: b */
    private String f28797b;

    /* renamed from: c */
    private String f28798c;

    /* renamed from: d */
    private JSONObject f28799d;

    /* renamed from: e */
    public C12028b f28800e;

    /* renamed from: f */
    public C11917a f28801f;

    /* renamed from: g */
    private JSONObject f28802g;

    static {
        Covode.recordClassIndex(13753);
    }

    @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12024b
    /* renamed from: a */
    public void mo19262a(JSONObject jSONObject) {
    }

    /* renamed from: k */
    public abstract AbstractC12023a mo19122e();

    @Override // com.bytedance.android.monitor.p704b.AbstractC11909c
    /* renamed from: a */
    public final C11926i mo19118a() {
        return this.f28800e;
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11913g, com.bytedance.android.monitor.p704b.AbstractC11909c
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC11912f mo19119b() {
        return this.f28800e;
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11913g
    /* renamed from: c */
    public final JSONObject mo19120c() {
        return this.f28802g;
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11913g
    /* renamed from: d */
    public final JSONObject mo19121d() {
        return this.f28799d;
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11913g
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ AbstractC11912f mo19124g() {
        return this.f28801f;
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11913g
    /* renamed from: h */
    public final String mo19125h() {
        return this.f28797b;
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11913g
    /* renamed from: i */
    public final String mo19126i() {
        return this.f28798c;
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11913g
    /* renamed from: j */
    public final String mo19127j() {
        return this.f28796a;
    }

    @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12024b
    /* renamed from: l */
    public boolean mo19263l() {
        if (mo19122e() != null) {
            return mo19122e().f28795c;
        }
        return true;
    }

    @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12024b
    /* renamed from: m */
    public void mo19264m() {
        if (mo19122e() != null) {
            mo19122e().mo19261b();
        }
    }

    /* renamed from: b */
    public final void mo19265b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f28799d = new JSONObject();
            this.f28802g = new JSONObject();
            C11950d.m21102a(this.f28799d, jSONObject.optJSONObject("jsBase"));
            C11950d.m21102a(this.f28802g, jSONObject.optJSONObject("jsInfo"));
        }
    }

    public AbstractC12025c(C12028b bVar, String str, String str2) {
        this.f28800e = bVar;
        this.f28796a = C12044i.f28863b.mo19305e(bVar.mo19267b().get());
        this.f28797b = str;
        this.f28798c = str2;
    }
}
