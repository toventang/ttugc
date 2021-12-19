package com.bytedance.android.monitorV2.webview.p749c.p751b;

import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p728a.AbstractC12071f;
import com.bytedance.android.monitorV2.p731d.C12082b;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12199a;
import com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12201c;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.webview.c.b.c */
public final class C12206c extends AbstractC12201c {

    /* renamed from: a */
    public long f29353a;

    /* renamed from: b */
    public long f29354b;

    /* renamed from: c */
    public long f29355c;

    /* renamed from: d */
    public long f29356d;

    /* renamed from: g */
    public long f29357g;

    /* renamed from: h */
    public long f29358h;

    /* renamed from: i */
    public long f29359i;

    /* renamed from: j */
    public long f29360j;

    /* renamed from: k */
    public boolean f29361k;

    /* renamed from: l */
    public boolean f29362l;

    /* renamed from: m */
    public JSONObject f29363m = new JSONObject();

    /* renamed from: n */
    public Set<String> f29364n = new HashSet();

    /* renamed from: o */
    public C12082b f29365o;

    /* renamed from: p */
    private AbstractC12199a f29366p = new AbstractC12199a("performance") {
        /* class com.bytedance.android.monitorV2.webview.p749c.p751b.C12206c.C122071 */

        static {
            Covode.recordClassIndex(13938);
        }

        @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12199a
        /* renamed from: b */
        public final void mo19590b() {
            this.f29336c = false;
        }

        @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
        /* renamed from: a */
        public final void mo19417a(JSONObject jSONObject) {
            C12130f.m21650a(jSONObject, "page_start", C12206c.this.f29353a);
            C12130f.m21650a(jSONObject, "page_finish", C12206c.this.f29354b);
            C12130f.m21650a(jSONObject, "page_progress_100", C12206c.this.f29355c);
            C12130f.m21650a(jSONObject, "show_start", C12206c.this.f29358h);
            C12130f.m21650a(jSONObject, "show_end", C12206c.this.f29359i);
            if (C12206c.this.f29361k) {
                C12130f.m21650a(jSONObject, "init_time", C12206c.this.f29360j);
            }
            C12130f.m21650a(jSONObject, "inject_js_time", C12206c.this.f29357g);
            C12130f.m21651a(jSONObject, "event_counts", C12206c.this.f29363m);
            C12130f.m21650a(jSONObject, "load_start", C12206c.this.f29341e.f29348m);
            C12130f.m21651a(jSONObject, "is_first_page_started", Boolean.valueOf(C12206c.this.f29362l));
        }

        {
            this.f29336c = true;
        }
    };

    static {
        Covode.recordClassIndex(13937);
    }

    @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12201c, com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ AbstractC12067b mo19424e() {
        return this.f29366p;
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12072g
    /* renamed from: f */
    public final AbstractC12071f mo19425f() {
        return this.f29365o;
    }

    @Override // com.bytedance.android.monitorV2.webview.p749c.p750a.AbstractC12201c
    /* renamed from: j */
    public final AbstractC12199a mo19594j() {
        return this.f29366p;
    }

    public C12206c(C12204b bVar, String str) {
        super(bVar, str, bVar.f29011c);
    }
}
