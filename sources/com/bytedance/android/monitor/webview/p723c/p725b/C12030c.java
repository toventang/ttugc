package com.bytedance.android.monitor.webview.p723c.p725b;

import android.text.TextUtils;
import com.bytedance.android.monitor.p704b.AbstractC11908b;
import com.bytedance.android.monitor.p704b.AbstractC11912f;
import com.bytedance.android.monitor.p706d.C11918b;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12023a;
import com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.webview.c.b.c */
public final class C12030c extends AbstractC12025c {

    /* renamed from: a */
    public long f28812a;

    /* renamed from: b */
    public long f28813b;

    /* renamed from: c */
    public long f28814c;

    /* renamed from: d */
    public long f28815d;

    /* renamed from: g */
    public long f28816g;

    /* renamed from: h */
    public long f28817h;

    /* renamed from: i */
    public long f28818i;

    /* renamed from: j */
    public long f28819j;

    /* renamed from: k */
    public boolean f28820k;

    /* renamed from: l */
    public JSONObject f28821l = new JSONObject();

    /* renamed from: m */
    public Set<String> f28822m = new HashSet();

    /* renamed from: n */
    public C11918b f28823n;

    /* renamed from: o */
    private AbstractC12023a f28824o = new AbstractC12023a("performance") {
        /* class com.bytedance.android.monitor.webview.p723c.p725b.C12030c.C120311 */

        static {
            Covode.recordClassIndex(13759);
        }

        @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12023a
        /* renamed from: b */
        public final void mo19261b() {
            this.f28795c = false;
        }

        @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
        /* renamed from: a */
        public final void mo19117a(JSONObject jSONObject) {
            C11950d.m21099a(jSONObject, "page_start", C12030c.this.f28812a);
            C11950d.m21099a(jSONObject, "page_finish", C12030c.this.f28813b);
            C11950d.m21099a(jSONObject, "page_progress_100", C12030c.this.f28814c);
            C11950d.m21099a(jSONObject, "show_start", C12030c.this.f28817h);
            C11950d.m21099a(jSONObject, "show_end", C12030c.this.f28818i);
            if (C12030c.this.f28820k) {
                C11950d.m21099a(jSONObject, "init_time", C12030c.this.f28819j);
            }
            C11950d.m21099a(jSONObject, "inject_js_time", C12030c.this.f28816g);
            C11950d.m21100a(jSONObject, "event_counts", C12030c.this.f28821l);
            C11950d.m21099a(jSONObject, "load_start", C12030c.this.f28800e.f28808n);
        }

        {
            this.f28795c = true;
        }
    };

    static {
        Covode.recordClassIndex(13758);
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11913g, com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ AbstractC11908b mo19122e() {
        return this.f28824o;
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11913g
    /* renamed from: f */
    public final AbstractC11912f mo19123f() {
        return this.f28823n;
    }

    @Override // com.bytedance.android.monitor.webview.p723c.p724a.AbstractC12025c
    /* renamed from: k */
    public final AbstractC12023a mo19266k() {
        return this.f28824o;
    }

    /* renamed from: n */
    public final void mo19271n() {
        this.f28818i = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo19270a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C11950d.m21098a(this.f28821l, str, C11950d.m21096a(this.f28821l, str) + 1);
            this.f28822m.add(str);
            C11937b.m21062a("WebPerfReportData", "addCount: ".concat(String.valueOf(str)));
        }
    }

    public C12030c(C12028b bVar, String str) {
        super(bVar, str, bVar.f28531c);
    }
}
