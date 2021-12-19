package com.bytedance.hybrid.spark.p1110d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.p1107a.AbstractC15513i;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;
import com.bytedance.lynx.p1507a.p1508a.p1513e.C21142a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.i */
public final class C15556i implements AbstractC15510f {

    /* renamed from: a */
    private final C21136a f37920a;

    /* renamed from: b */
    private final SparkActivity f37921b;

    /* renamed from: c */
    private final AbstractC15513i f37922c;

    static {
        Covode.recordClassIndex(17818);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        C21142a navBarColor;
        Integer valueOf;
        C21136a aVar = this.f37920a;
        if (aVar != null && (navBarColor = aVar.getNavBarColor()) != null && (valueOf = Integer.valueOf(navBarColor.getColor(this.f37921b))) != null) {
            int intValue = valueOf.intValue();
            AbstractC15513i iVar = this.f37922c;
            if (iVar != null) {
                iVar.mo25262b(intValue);
            }
        }
    }

    public C15556i(C21136a aVar, SparkActivity sparkActivity, AbstractC15513i iVar) {
        C89219l.m154719c(sparkActivity, "");
        this.f37920a = aVar;
        this.f37921b = sparkActivity;
        this.f37922c = iVar;
    }
}
