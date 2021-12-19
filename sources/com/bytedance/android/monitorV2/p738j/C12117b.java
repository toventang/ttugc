package com.bytedance.android.monitorV2.p738j;

import com.bytedance.android.monitorV2.lynx.AbstractC12136a;
import com.bytedance.android.monitorV2.lynx.C12148b;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12169e;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12171f;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.j.b */
public final class C12117b extends AbstractC28838o {

    /* renamed from: a */
    public final LynxView f29138a;

    /* renamed from: b */
    private final AbstractC12136a f29139b = new C12148b();

    static {
        Covode.recordClassIndex(13846);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14467a() {
        super.mo14467a();
        this.f29139b.mo19501b(this.f29138a);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14470b() {
        super.mo14470b();
        this.f29139b.mo19502c(this.f29138a);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: c */
    public final void mo16280c() {
        super.mo16280c();
        this.f29139b.mo19503d(this.f29138a);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: d */
    public final void mo19152d() {
        super.mo19152d();
        this.f29139b.mo19499a(this.f29138a);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: e */
    public final void mo19153e() {
        this.f29139b.mo19504e(this.f29138a);
        super.mo19153e();
    }

    public C12117b(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        this.f29138a = lynxView;
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14469a(String str) {
        super.mo14469a(str);
        this.f29139b.mo19500a(str, this.f29138a);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo19151a(C28816j jVar) {
        super.mo19151a(jVar);
        if (jVar != null) {
            C89219l.m154719c(jVar, "");
            C12169e eVar = new C12169e();
            C89219l.m154719c(jVar, "");
            C89219l.m154719c(eVar, "");
            eVar.f29289b = "lynx_error";
            eVar.f29290c = jVar.f68013a;
            eVar.f29291d = jVar.mo49932a();
            this.f29139b.mo19497a(eVar, this.f29138a);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14468a(LynxPerfMetric lynxPerfMetric) {
        super.mo14468a(lynxPerfMetric);
        if (lynxPerfMetric != null) {
            C89219l.m154719c(lynxPerfMetric, "");
            C12171f fVar = new C12171f();
            C89219l.m154719c(lynxPerfMetric, "");
            C89219l.m154719c(fVar, "");
            fVar.f29292b = lynxPerfMetric.getFirsPageLayout();
            fVar.f29293c = lynxPerfMetric.getFirsPageLayout();
            fVar.f29294d = lynxPerfMetric.getTti();
            fVar.f29295e = lynxPerfMetric.getLayout();
            fVar.f29296f = lynxPerfMetric.getDiffRootCreate();
            fVar.f29297g = lynxPerfMetric.getDiffSameRoot();
            fVar.f29298h = lynxPerfMetric.getTasmEndDecodeFinishLoadTemplate();
            fVar.f29299i = lynxPerfMetric.getTasmBinaryDecode();
            fVar.f29300j = lynxPerfMetric.getTasmFinishLoadTemplate();
            fVar.f29301k = lynxPerfMetric.getRenderPage();
            fVar.f29303m = lynxPerfMetric.toJSONObject();
            this.f29139b.mo19498a(fVar, this.f29138a);
        }
    }
}
