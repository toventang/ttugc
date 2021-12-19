package com.bytedance.android.monitorV2.webview.p749c.p751b;

import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p728a.AbstractC12071f;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12199a;
import com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12201c;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.c.b.a */
public final class C12202a extends AbstractC12201c {

    /* renamed from: a */
    private C12203a f29343a = new C12203a("falconPerf");

    static {
        Covode.recordClassIndex(13933);
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: f */
    public final AbstractC12071f mo19425f() {
        return null;
    }

    @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12201c, com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ AbstractC12067b mo19424e() {
        return this.f29343a;
    }

    @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12201c
    /* renamed from: j */
    public final AbstractC12199a mo19594j() {
        return this.f29343a;
    }

    @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12201c, com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12200b
    /* renamed from: k */
    public final boolean mo19591k() {
        return this.f29343a.f29336c;
    }

    @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12201c, com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12200b
    /* renamed from: l */
    public final void mo19592l() {
        this.f29343a.f29336c = false;
    }

    /* renamed from: com.bytedance.android.monitorV2.webview.c.b.a$a */
    class C12203a extends AbstractC12199a {

        /* renamed from: d */
        private JSONArray f29345d = new JSONArray();

        static {
            Covode.recordClassIndex(13934);
        }

        @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12199a
        /* renamed from: b */
        public final void mo19590b() {
            this.f29336c = false;
        }

        @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
        /* renamed from: a */
        public final void mo19417a(JSONObject jSONObject) {
            C12130f.m21651a(jSONObject, "resource_list", this.f29345d);
        }

        public C12203a(String str) {
            super(str);
        }
    }

    public C12202a(C12204b bVar) {
        super(bVar, "falconPerf", bVar.f29011c);
    }
}
