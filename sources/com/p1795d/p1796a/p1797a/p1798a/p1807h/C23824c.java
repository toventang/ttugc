package com.p1795d.p1796a.p1797a.p1798a.p1807h;

import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a.AbstractAsyncTaskC23815b;
import com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a.AsyncTaskC23819d;
import com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a.C23818c;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.h.c */
public final class C23824c implements AbstractAsyncTaskC23815b.AbstractC23817b {

    /* renamed from: a */
    final C23818c f56350a;

    /* renamed from: b */
    private JSONObject f56351b;

    static {
        Covode.recordClassIndex(27932);
    }

    public C23824c(C23818c cVar) {
        this.f56350a = cVar;
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a.AbstractAsyncTaskC23815b.AbstractC23817b
    /* renamed from: a */
    public final JSONObject mo39284a() {
        return this.f56351b;
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1807h.p1808a.AbstractAsyncTaskC23815b.AbstractC23817b
    /* renamed from: a */
    public final void mo39285a(JSONObject jSONObject) {
        this.f56351b = jSONObject;
    }

    /* renamed from: b */
    public final void mo39292b() {
        this.f56350a.mo39286a(new AsyncTaskC23819d(this));
    }
}
