package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdkapi.host.AbstractC11795a;
import com.bytedance.android.livesdkapi.host.AbstractC11808h;
import com.bytedance.apm.p779k.C12534d;
import com.bytedance.apm.p779k.p780a.C12514a;
import com.bytedance.apm.p779k.p780a.C12515b;
import com.bytedance.apm.trace.p791b.C12616b;
import com.bytedance.common.graphics.GraphicsMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.p4398b.C86059c;
import com.p2082ss.p4398b.C86060d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.y */
public final class C58714y implements AbstractC11808h {

    /* renamed from: a */
    public double f133641a;

    /* renamed from: b */
    public JSONObject f133642b;

    /* renamed from: c */
    AbstractC11795a f133643c;

    /* renamed from: d */
    private C12616b f133644d = new C12616b("live_frs_tracer", true);

    /* renamed from: e */
    private C12616b.AbstractC12623d f133645e = new C12616b.AbstractC12623d() {
        /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58714y.C587151 */

        static {
            Covode.recordClassIndex(69017);
        }

        @Override // com.bytedance.apm.trace.p791b.C12616b.AbstractC12623d
        /* renamed from: a */
        public final void mo20436a(double d) {
            C58714y.this.f133641a = d;
        }
    };

    /* renamed from: f */
    private C12616b.AbstractC12622c f133646f = new C12616b.AbstractC12622c() {
        /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58714y.C587162 */

        static {
            Covode.recordClassIndex(69018);
        }

        @Override // com.bytedance.apm.trace.p791b.C12616b.AbstractC12622c
        /* renamed from: a */
        public final void mo20435a(JSONObject jSONObject) {
            C58714y.this.f133642b = jSONObject;
            C58714y yVar = C58714y.this;
            if (yVar.f133643c != null) {
                yVar.f133643c.mo16942a(yVar.f133641a, yVar.f133642b);
                yVar.f133641a = 0.0d;
                yVar.f133642b = null;
            }
        }
    };

    static {
        Covode.recordClassIndex(69016);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h
    /* renamed from: d */
    public final void mo18872d() {
        GraphicsMonitor.init();
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.y$a */
    static class C58717a implements AbstractC11808h.AbstractC11811c {

        /* renamed from: a */
        private final C12616b f133649a;

        static {
            Covode.recordClassIndex(69019);
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h.AbstractC11811c
        /* renamed from: a */
        public final void mo16948a() {
            this.f133649a.mo20427a();
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h.AbstractC11811c
        /* renamed from: b */
        public final void mo16951b() {
            this.f133649a.mo20430b();
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h.AbstractC11811c
        /* renamed from: a */
        public final void mo16949a(AbstractC11808h.AbstractC11809a aVar) {
            C12616b bVar = this.f133649a;
            aVar.getClass();
            bVar.mo20428a(new C58718z(aVar));
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h.AbstractC11811c
        /* renamed from: a */
        public final void mo16950a(AbstractC11808h.AbstractC11810b bVar) {
            C12616b bVar2 = this.f133649a;
            bVar.getClass();
            bVar2.mo20429a(new C58652aa(bVar));
        }

        private C58717a(String str, boolean z) {
            this.f133649a = new C12616b(str, !z);
        }

        /* synthetic */ C58717a(String str, boolean z, byte b) {
            this(str, z);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h
    /* renamed from: f */
    public final double mo18874f() {
        return GraphicsMonitor.getByteGpu();
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h
    /* renamed from: e */
    public final void mo18873e() {
        try {
            GraphicsMonitor.start();
        } catch (Throwable th) {
            C3854a.m9458a("ALogger", th);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h
    /* renamed from: a */
    public final Map<String, Double> mo18867a() {
        HashMap hashMap = new HashMap();
        C12514a a = C12534d.m22529a();
        hashMap.put("cpu_rate", Double.valueOf(a.f30393a));
        hashMap.put("cpu_speed", Double.valueOf(a.f30394b));
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h
    /* renamed from: c */
    public final void mo18871c() {
        try {
            this.f133644d.mo20427a();
        } catch (Throwable unused) {
        }
        this.f133644d.mo20429a(this.f133645e);
        this.f133644d.mo20428a(this.f133646f);
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h
    /* renamed from: g */
    public final void mo18875g() {
        try {
            if (GraphicsMonitor.isStart()) {
                GraphicsMonitor.stop();
            }
        } catch (Throwable th) {
            C3854a.m9458a("ALogger", th);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h
    /* renamed from: b */
    public final Map<String, Long> mo18870b() {
        HashMap hashMap = new HashMap();
        C12515b a = C12534d.m22530a(C17867d.m33078a());
        hashMap.put("mem_java_total", Long.valueOf(a.f30395a));
        hashMap.put("mem_java_free", Long.valueOf(a.f30396b));
        hashMap.put("mem_java_used", Long.valueOf(a.f30397c));
        hashMap.put("mem_pss_dalvik", Long.valueOf(a.f30398d));
        hashMap.put("mem_pss_native", Long.valueOf(a.f30399e));
        hashMap.put("mem_pss_total", Long.valueOf(a.f30400f));
        hashMap.put("mem_graphics", Long.valueOf(a.f30401g));
        hashMap.put("mem_vmsize", Long.valueOf(a.f30402h));
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h
    /* renamed from: a */
    public final void mo18869a(AbstractC11795a aVar) {
        this.f133643c = aVar;
        this.f133644d.mo20430b();
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h
    /* renamed from: a */
    public final Map<String, String> mo18868a(Context context) {
        HashMap hashMap = new HashMap(4);
        if (context == null) {
            return hashMap;
        }
        hashMap.put("thor_galvanic_now", String.valueOf(C86059c.m147822c(context)));
        float longProperty = (float) C86059c.m147818a(context).getLongProperty(3);
        if (C86060d.m147825b() || C86060d.m147826c()) {
            if (longProperty < -1.0E7f || longProperty > 1.0E7f) {
                longProperty = -1.0f;
            } else {
                if (longProperty < -10000.0f) {
                    longProperty /= 1000.0f;
                }
                longProperty = -longProperty;
            }
        } else if (!C86060d.m147824a() || longProperty > 10000.0f) {
            longProperty /= 1000.0f;
        }
        hashMap.put("thor_galvanic_avg", String.valueOf(longProperty));
        double c = (double) C86059c.m147822c(context);
        Double.isNaN(c);
        hashMap.put("thor_use_battery", String.valueOf((c * 0.5d) / 3600.0d));
        double longProperty2 = (double) C86059c.m147818a(context).getLongProperty(5);
        Double.isNaN(longProperty2);
        hashMap.put("thor_energy", String.valueOf((longProperty2 / 1.0E9d) / 1000.0d));
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h
    /* renamed from: a */
    public final AbstractC11808h.AbstractC11811c mo18866a(String str, boolean z) {
        return new C58717a(str, z, (byte) 0);
    }
}
