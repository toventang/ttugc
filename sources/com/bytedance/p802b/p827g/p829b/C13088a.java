package com.bytedance.p802b.p827g.p829b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p831i.p832a.C13099c;
import com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p834j.p835a.AbstractC13101a;
import com.bytedance.p802b.p841k.C13129e;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.g.b.a */
public final class C13088a extends AbstractC13097a {

    /* renamed from: a */
    public long f31907a;

    /* renamed from: b */
    public long f31908b;

    /* renamed from: c */
    public long f31909c;

    /* renamed from: d */
    public long f31910d;

    /* renamed from: e */
    public boolean f31911e;

    /* renamed from: f */
    public long f31912f;

    /* renamed from: g */
    public long f31913g;

    /* renamed from: h */
    public long f31914h;

    /* renamed from: i */
    public long f31915i;

    /* renamed from: j */
    public long f31916j;

    /* renamed from: k */
    public long f31917k;

    /* renamed from: l */
    public double f31918l;

    /* renamed from: m */
    public boolean f31919m;

    /* renamed from: n */
    public Map<Object, Object> f31920n;

    /* renamed from: u */
    private boolean f31921u;

    static {
        Covode.recordClassIndex(14924);
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: b */
    public final boolean mo20771b() {
        return true;
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: d */
    public final String mo20846d() {
        return "memory";
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: f */
    public final JSONObject mo20848f() {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", C13099c.m23558a().mo20938b());
            jSONObject.put("process_name", C13037a.m23436d());
            if (!this.f31911e) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("is_front", z);
            jSONObject.put("is_main_process", C13037a.m23435c());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: g */
    public final JSONObject mo20849g() {
        JSONObject c = C13099c.m23558a().mo20939c();
        if (this.f31921u) {
            try {
                C13129e.m23601a(c, C13099c.m23558a().mo20940d());
            } catch (Exception unused) {
            }
        }
        AbstractC13101a aVar = (AbstractC13101a) C13104c.m23566a(AbstractC13101a.class);
        if (aVar != null) {
            try {
                C13129e.m23601a(c, aVar.mo20764a());
            } catch (Exception unused2) {
            }
        }
        return c;
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: e */
    public final JSONObject mo20847e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gc_count", this.f31907a);
            jSONObject.put("gc_time", this.f31908b);
            jSONObject.put("block_gc_count", this.f31909c);
            jSONObject.put("block_gc_time", this.f31910d);
            if (this.f31911e) {
                jSONObject.put("dalvik_pss_background", this.f31915i);
                jSONObject.put("native_pss_background", this.f31912f);
                jSONObject.put("total_pss_background", this.f31913g);
                jSONObject.put("java_heap_background", this.f31914h);
                jSONObject.put("java_heap_background_used_rate", this.f31918l);
                jSONObject.put("vm_size_background", this.f31917k);
                jSONObject.put("graphics_background", this.f31916j);
            } else {
                jSONObject.put("dalvik_pss_foreground", this.f31915i);
                jSONObject.put("native_pss_foreground", this.f31912f);
                jSONObject.put("total_pss_foreground", this.f31913g);
                jSONObject.put("java_heap_foreground", this.f31914h);
                jSONObject.put("java_heap_foreground_used_rate", this.f31918l);
                jSONObject.put("vm_size_foreground", this.f31917k);
                jSONObject.put("graphics_foreground", this.f31916j);
            }
            if (this.f31919m) {
                jSONObject.put("reach_top_java", 1);
            }
            m23527a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public final String toString() {
        return "MemoryPerfMonitorable{gcCount=" + this.f31907a + ", gcTime=" + this.f31908b + ", blockingGcCount=" + this.f31909c + ", blockingGcTime=" + this.f31910d + ", background=" + this.f31911e + ", nativePss=" + this.f31912f + ", totalPss=" + this.f31913g + ", javaUsedMemory=" + this.f31914h + ", dalvikUsedSize=" + this.f31915i + ", graphics=" + this.f31916j + ", vmSize=" + this.f31917k + ", javaUsedMemoryRate=" + this.f31918l + ", isMemoryReachTop=" + this.f31919m + '}';
    }

    /* renamed from: a */
    private void m23527a(JSONObject jSONObject) {
        try {
            Map<Object, Object> map = this.f31920n;
            if (map != null) {
                for (Map.Entry<Object, Object> entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), Long.parseLong((String) entry.getValue()));
                }
            }
        } catch (Exception unused) {
        }
    }

    public C13088a(long j, long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, long j9, long j10, double d, boolean z2, boolean z3) {
        this.f31907a = j;
        this.f31908b = j2;
        this.f31909c = j3;
        this.f31910d = j4;
        this.f31911e = z;
        this.f31912f = j5;
        this.f31913g = j6;
        this.f31914h = j7;
        this.f31915i = j8;
        this.f31916j = j9;
        this.f31917k = j10;
        this.f31918l = d;
        this.f31919m = z2;
        this.f31921u = z3;
    }
}
