package com.bytedance.hybrid.spark.p1110d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.p1107a.AbstractC15513i;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;

/* renamed from: com.bytedance.hybrid.spark.d.m */
public final class C15562m implements AbstractC15510f {

    /* renamed from: a */
    public final AbstractC15513i f37932a;

    /* renamed from: b */
    private final C21136a f37933b;

    static {
        Covode.recordClassIndex(17824);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        boolean z;
        C21136a aVar = this.f37933b;
        if (aVar != null) {
            z = aVar.getShowCloseAll();
        } else {
            z = false;
        }
        AbstractC15513i iVar = this.f37932a;
        if (iVar != null) {
            iVar.mo25261a(z);
        }
    }

    public C15562m(C21136a aVar, AbstractC15513i iVar) {
        this.f37933b = aVar;
        this.f37932a = iVar;
    }
}
