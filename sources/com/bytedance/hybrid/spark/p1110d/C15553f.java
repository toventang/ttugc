package com.bytedance.hybrid.spark.p1110d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.f */
public final class C15553f implements AbstractC15510f {

    /* renamed from: a */
    private final C21136a f37914a;

    /* renamed from: b */
    private final SparkActivity f37915b;

    static {
        Covode.recordClassIndex(17815);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        boolean z;
        C21136a aVar = this.f37914a;
        if (aVar != null) {
            z = aVar.getDisableBackPress();
        } else {
            z = false;
        }
        this.f37915b.f37982b = z;
    }

    public C15553f(C21136a aVar, SparkActivity sparkActivity) {
        C89219l.m154719c(sparkActivity, "");
        this.f37914a = aVar;
        this.f37915b = sparkActivity;
    }
}
