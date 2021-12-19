package com.bytedance.android.monitor.webview.p723c.p725b;

import com.bytedance.android.monitor.p704b.AbstractC11908b;
import com.bytedance.android.monitor.p704b.AbstractC11912f;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12023a;
import com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.c.b.a */
public final class C12026a extends AbstractC12025c {

    /* renamed from: a */
    private C12027a f28803a = new C12027a("falconPerf");

    static {
        Covode.recordClassIndex(13754);
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11913g
    /* renamed from: f */
    public final AbstractC11912f mo19123f() {
        return null;
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11913g, com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ AbstractC11908b mo19122e() {
        return this.f28803a;
    }

    @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c
    /* renamed from: k */
    public final AbstractC12023a mo19266k() {
        return this.f28803a;
    }

    @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12024b, com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c
    /* renamed from: l */
    public final boolean mo19263l() {
        return this.f28803a.f28795c;
    }

    @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12024b, com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c
    /* renamed from: m */
    public final void mo19264m() {
        this.f28803a.f28795c = false;
    }

    /* renamed from: com.bytedance.android.monitor.webview.c.b.a$a */
    class C12027a extends AbstractC12023a {

        /* renamed from: b */
        JSONArray f28804b = new JSONArray();

        static {
            Covode.recordClassIndex(13755);
        }

        @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12023a
        /* renamed from: b */
        public final void mo19261b() {
            this.f28795c = false;
        }

        @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
        /* renamed from: a */
        public final void mo19117a(JSONObject jSONObject) {
            C11950d.m21100a(jSONObject, "resource_list", this.f28804b);
        }

        public C12027a(String str) {
            super(str);
        }
    }

    public C12026a(C12028b bVar) {
        super(bVar, "falconPerf", bVar.f28531c);
    }

    @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12024b, com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c
    /* renamed from: a */
    public final void mo19262a(JSONObject jSONObject) {
        C12027a aVar = this.f28803a;
        if (jSONObject != null) {
            aVar.f28804b.put(jSONObject);
            aVar.f28795c = true;
        }
    }
}
