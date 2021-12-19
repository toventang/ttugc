package com.bytedance.hybrid.spark.p1110d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.p1107a.AbstractC15513i;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;
import com.bytedance.lynx.p1507a.p1508a.p1513e.C21142a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.j */
public final class C15557j implements AbstractC15510f {

    /* renamed from: a */
    private final C21136a f37923a;

    /* renamed from: b */
    private final SparkActivity f37924b;

    /* renamed from: c */
    private final AbstractC15513i f37925c;

    static {
        Covode.recordClassIndex(17819);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        C21142a titleColor;
        Integer valueOf;
        C21136a aVar = this.f37923a;
        if (aVar != null && (titleColor = aVar.getTitleColor()) != null && (valueOf = Integer.valueOf(titleColor.getColor(this.f37924b))) != null) {
            int intValue = valueOf.intValue();
            AbstractC15513i iVar = this.f37925c;
            if (iVar != null) {
                iVar.mo25257a(intValue);
            }
        }
    }

    public C15557j(C21136a aVar, SparkActivity sparkActivity, AbstractC15513i iVar) {
        C89219l.m154719c(sparkActivity, "");
        this.f37923a = aVar;
        this.f37924b = sparkActivity;
        this.f37925c = iVar;
    }
}
