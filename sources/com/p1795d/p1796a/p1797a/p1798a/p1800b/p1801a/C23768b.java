package com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a;

import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.AbstractC23771b;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23781l;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.EnumC23778i;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23791f;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23798b;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23801d;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.b.a.b */
public final class C23768b {

    /* renamed from: a */
    public final C23781l f56223a;

    static {
        Covode.recordClassIndex(27876);
    }

    private C23768b(C23781l lVar) {
        this.f56223a = lVar;
    }

    /* renamed from: a */
    public static C23768b m44917a(AbstractC23771b bVar) {
        C23781l lVar = (C23781l) bVar;
        C23801d.m44992a(bVar, "AdSession is null");
        if (EnumC23778i.NATIVE != lVar.f56258a.f56231b) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        } else if (!lVar.f56261d) {
            C23801d.m44991a(lVar);
            if (lVar.f56260c.f56306c == null) {
                C23768b bVar2 = new C23768b(lVar);
                lVar.f56260c.f56306c = bVar2;
                return bVar2;
            }
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        } else {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public final void mo39225a(float f, float f2) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        } else if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        } else {
            C23801d.m44994b(this.f56223a);
            JSONObject jSONObject = new JSONObject();
            C23798b.m44985a(jSONObject, "duration", Float.valueOf(f));
            C23798b.m44985a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
            C23798b.m44985a(jSONObject, "deviceVolume", Float.valueOf(C23791f.m44969a().f56290a));
            this.f56223a.f56260c.mo39270a("start", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo39224a() {
        C23801d.m44994b(this.f56223a);
        this.f56223a.f56260c.mo39269a("firstQuartile");
    }

    /* renamed from: b */
    public final void mo39227b() {
        C23801d.m44994b(this.f56223a);
        this.f56223a.f56260c.mo39269a("midpoint");
    }

    /* renamed from: c */
    public final void mo39228c() {
        C23801d.m44994b(this.f56223a);
        this.f56223a.f56260c.mo39269a("thirdQuartile");
    }

    /* renamed from: d */
    public final void mo39229d() {
        C23801d.m44994b(this.f56223a);
        this.f56223a.f56260c.mo39269a("complete");
    }

    /* renamed from: e */
    public final void mo39230e() {
        C23801d.m44994b(this.f56223a);
        this.f56223a.f56260c.mo39269a("pause");
    }

    /* renamed from: f */
    public final void mo39231f() {
        C23801d.m44994b(this.f56223a);
        this.f56223a.f56260c.mo39269a("resume");
    }

    /* renamed from: g */
    public final void mo39232g() {
        C23801d.m44994b(this.f56223a);
        this.f56223a.f56260c.mo39269a("skipped");
    }

    /* renamed from: a */
    public final void mo39226a(EnumC23767a aVar) {
        C23801d.m44992a(aVar, "InteractionType is null");
        C23801d.m44994b(this.f56223a);
        JSONObject jSONObject = new JSONObject();
        C23798b.m44985a(jSONObject, "interactionType", aVar);
        this.f56223a.f56260c.mo39270a("adUserInteraction", jSONObject);
    }
}
