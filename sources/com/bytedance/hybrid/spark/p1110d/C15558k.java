package com.bytedance.hybrid.spark.p1110d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.p1107a.AbstractC15513i;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;

/* renamed from: com.bytedance.hybrid.spark.d.k */
public final class C15558k implements AbstractC15510f {

    /* renamed from: a */
    private final C21136a f37926a;

    /* renamed from: b */
    private final AbstractC15513i f37927b;

    static {
        Covode.recordClassIndex(17820);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        String str;
        C21136a aVar = this.f37926a;
        if (aVar == null || (str = aVar.getTitle()) == null) {
            str = "";
        }
        AbstractC15513i iVar = this.f37927b;
        if (iVar != null) {
            iVar.mo25260a(str);
        }
    }

    public C15558k(C21136a aVar, AbstractC15513i iVar) {
        this.f37926a = aVar;
        this.f37927b = iVar;
    }
}
