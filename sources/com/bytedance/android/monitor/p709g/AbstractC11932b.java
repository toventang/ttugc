package com.bytedance.android.monitor.p709g;

import com.bytedance.android.monitor.p703a.AbstractC11900b;
import com.bytedance.android.monitor.p720m.C11999a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.g.b */
public abstract class AbstractC11932b implements AbstractC11900b {

    /* renamed from: a */
    private boolean f28548a = true;

    /* renamed from: b */
    private AbstractC11900b.C11901a f28549b;

    static {
        Covode.recordClassIndex(13658);
    }

    /* renamed from: a */
    public final boolean mo19148a() {
        return this.f28548a;
    }

    @Override // com.bytedance.android.monitor.p703a.AbstractC11900b
    /* renamed from: a */
    public final void mo19109a(AbstractC11900b.C11901a aVar) {
        this.f28549b = aVar;
    }

    /* renamed from: b */
    public final void mo19149b(String str, JSONObject jSONObject) {
        AbstractC11900b.C11901a aVar;
        if (this.f28548a && (aVar = this.f28549b) != null && aVar.f28457a != null) {
            if (this.f28549b.f28458b != null) {
                str = this.f28549b.f28458b.mo19112b(str);
                C11999a.m21195a(jSONObject, "service", str);
            }
            this.f28549b.f28457a.mo19113a(str, jSONObject);
        }
    }
}
