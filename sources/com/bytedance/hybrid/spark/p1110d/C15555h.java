package com.bytedance.hybrid.spark.p1110d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.h */
public final class C15555h implements AbstractC15510f {

    /* renamed from: a */
    private final C21136a f37918a;

    /* renamed from: b */
    private final SparkActivity f37919b;

    static {
        Covode.recordClassIndex(17817);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        boolean hideStatusBar;
        C21136a aVar = this.f37918a;
        if (aVar != null && (hideStatusBar = aVar.getHideStatusBar())) {
            this.f37919b.f37983c = hideStatusBar;
        }
    }

    public C15555h(C21136a aVar, SparkActivity sparkActivity) {
        C89219l.m154719c(sparkActivity, "");
        this.f37918a = aVar;
        this.f37919b = sparkActivity;
    }
}
