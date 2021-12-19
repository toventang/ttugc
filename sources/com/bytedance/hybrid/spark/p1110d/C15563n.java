package com.bytedance.hybrid.spark.p1110d;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.AbstractC15528b;
import com.bytedance.hybrid.spark.C15534d;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.immersionbar.C20057e;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;
import com.bytedance.lynx.p1507a.p1508a.p1513e.C21142a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.n */
public final class C15563n implements AbstractC15510f {

    /* renamed from: a */
    private final C21136a f37934a;

    /* renamed from: b */
    private final SparkActivity f37935b;

    /* renamed from: c */
    private final C20057e f37936c;

    static {
        Covode.recordClassIndex(17825);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        Integer num;
        C21142a statusBgColor;
        AbstractC15528b bVar = C15534d.f37882a;
        if (bVar != null) {
            num = Integer.valueOf(bVar.mo25315c().f37885a);
        } else {
            num = null;
        }
        C21136a aVar = this.f37934a;
        if (!(aVar == null || (statusBgColor = aVar.getStatusBgColor()) == null)) {
            num = Integer.valueOf(statusBgColor.getColor(this.f37935b));
        }
        this.f37935b.f37984d = num;
    }

    public C15563n(C21136a aVar, SparkActivity sparkActivity, C20057e eVar) {
        C89219l.m154719c(sparkActivity, "");
        this.f37934a = aVar;
        this.f37935b = sparkActivity;
        this.f37936c = eVar;
    }
}
