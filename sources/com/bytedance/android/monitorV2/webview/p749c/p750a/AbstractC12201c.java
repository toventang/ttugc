package com.bytedance.android.monitorV2.webview.p749c.p750a;

import com.bytedance.android.monitorV2.p728a.AbstractC12068c;
import com.bytedance.android.monitorV2.p728a.AbstractC12071f;
import com.bytedance.android.monitorV2.p731d.C12081a;
import com.bytedance.android.monitorV2.p731d.C12090i;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.webview.p749c.p751b.C12204b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.c.a.c */
public abstract class AbstractC12201c extends AbstractC12068c implements AbstractC12200b {

    /* renamed from: a */
    private String f29337a;

    /* renamed from: b */
    private String f29338b;

    /* renamed from: c */
    private JSONObject f29339c;

    /* renamed from: d */
    private JSONObject f29340d;

    /* renamed from: e */
    public C12204b f29341e;

    /* renamed from: f */
    public C12081a f29342f;

    static {
        Covode.recordClassIndex(13932);
    }

    /* renamed from: j */
    public abstract AbstractC12199a mo19424e();

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12068c
    /* renamed from: a */
    public final C12090i mo19419a() {
        return this.f29341e;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g, com.bytedance.android.monitorV2.p728a.AbstractC12068c
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC12071f mo19420b() {
        return this.f29341e;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: c */
    public final JSONObject mo19422c() {
        return this.f29340d;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: d */
    public final JSONObject mo19423d() {
        return this.f29339c;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ AbstractC12071f mo19426g() {
        return this.f29342f;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: h */
    public final String mo19427h() {
        return this.f29337a;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: i */
    public final String mo19428i() {
        return this.f29338b;
    }

    @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12200b
    /* renamed from: k */
    public boolean mo19591k() {
        if (mo19424e() != null) {
            return mo19424e().f29336c;
        }
        return true;
    }

    @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12200b
    /* renamed from: l */
    public void mo19592l() {
        if (mo19424e() != null) {
            mo19424e().mo19590b();
        }
    }

    /* renamed from: a */
    public final void mo19593a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f29339c = new JSONObject();
            this.f29340d = new JSONObject();
            C12130f.m21653a(this.f29339c, jSONObject.optJSONObject("jsBase"));
            C12130f.m21653a(this.f29340d, jSONObject.optJSONObject("jsInfo"));
        }
    }

    public AbstractC12201c(C12204b bVar, String str, String str2) {
        this.f29341e = bVar;
        this.f29337a = str;
        this.f29338b = str2;
    }
}
