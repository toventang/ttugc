package com.p1795d.p1796a.p1797a.p1798a.p1800b;

import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a.C23770d;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23789e;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23801d;
import com.p1795d.p1796a.p1797a.p1798a.p1806g.AbstractC23805a;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.b.a */
public final class C23766a {

    /* renamed from: a */
    private final C23781l f56220a;

    static {
        Covode.recordClassIndex(27874);
    }

    private C23766a(C23781l lVar) {
        this.f56220a = lVar;
    }

    /* renamed from: a */
    public static C23766a m44914a(AbstractC23771b bVar) {
        C23781l lVar = (C23781l) bVar;
        C23801d.m44992a(bVar, "AdSession is null");
        if (lVar.f56260c.f56305b == null) {
            C23801d.m44991a(lVar);
            C23766a aVar = new C23766a(lVar);
            lVar.f56260c.f56305b = aVar;
            return aVar;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: a */
    public final void mo39221a() {
        C23801d.m44991a(this.f56220a);
        C23801d.m44995c(this.f56220a);
        if (!this.f56220a.mo39246d()) {
            try {
                this.f56220a.mo39235a();
            } catch (Exception unused) {
            }
        }
        if (this.f56220a.mo39246d()) {
            C23781l lVar = this.f56220a;
            if (!lVar.f56264g) {
                C23789e.f56285a.mo39257a(lVar.f56260c.mo39272c(), "publishImpressionEvent", new Object[0]);
                lVar.f56264g = true;
                return;
            }
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: a */
    public final void mo39222a(C23770d dVar) {
        C23801d.m44994b(this.f56220a);
        C23801d.m44995c(this.f56220a);
        C23781l lVar = this.f56220a;
        JSONObject a = dVar.mo39234a();
        if (!lVar.f56265h) {
            AbstractC23805a aVar = lVar.f56260c;
            C23789e.f56285a.mo39257a(aVar.mo39272c(), "publishLoadedEvent", a);
            lVar.f56265h = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }
}
