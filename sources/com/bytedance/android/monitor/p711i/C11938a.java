package com.bytedance.android.monitor.p711i;

import com.bytedance.android.monitor.lynx.C11969b;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11989f;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11991g;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.i.a */
public final class C11938a extends AbstractC28838o {

    /* renamed from: a */
    public final LynxView f28559a;

    static {
        Covode.recordClassIndex(13664);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14467a() {
        super.mo14467a();
        C11969b.f28620f.f28627e.mo19162b(this.f28559a);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14470b() {
        super.mo14470b();
        C11969b.f28620f.f28627e.mo19163c(this.f28559a);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: c */
    public final void mo16280c() {
        super.mo16280c();
        C11969b.f28620f.f28627e.mo19164d(this.f28559a);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: d */
    public final void mo19152d() {
        super.mo19152d();
        C11969b.f28620f.f28627e.mo19160a(this.f28559a);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: e */
    public final void mo19153e() {
        C11969b.f28620f.f28627e.mo19165e(this.f28559a);
        super.mo19153e();
    }

    public C11938a(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        this.f28559a = lynxView;
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14469a(String str) {
        super.mo14469a(str);
        C11969b.f28620f.f28627e.mo19161a(str, this.f28559a);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo19151a(C28816j jVar) {
        super.mo19151a(jVar);
        if (jVar != null) {
            C89219l.m154719c(jVar, "");
            C11989f fVar = new C11989f();
            C89219l.m154719c(jVar, "");
            C89219l.m154719c(fVar, "");
            fVar.f28724b = "lynx_error";
            fVar.f28725c = jVar.f68013a;
            fVar.f28726d = jVar.mo49932a();
            C11969b.f28620f.f28627e.mo19158a(fVar, this.f28559a);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14468a(LynxPerfMetric lynxPerfMetric) {
        super.mo14468a(lynxPerfMetric);
        if (lynxPerfMetric != null) {
            C89219l.m154719c(lynxPerfMetric, "");
            C11991g gVar = new C11991g();
            C89219l.m154719c(lynxPerfMetric, "");
            C89219l.m154719c(gVar, "");
            gVar.f28727b = lynxPerfMetric.getFirsPageLayout();
            gVar.f28728c = lynxPerfMetric.getFirsPageLayout();
            gVar.f28729d = lynxPerfMetric.getTti();
            gVar.f28730e = lynxPerfMetric.getLayout();
            gVar.f28731f = lynxPerfMetric.getDiffRootCreate();
            gVar.f28732g = lynxPerfMetric.getDiffSameRoot();
            gVar.f28733h = lynxPerfMetric.getTasmEndDecodeFinishLoadTemplate();
            gVar.f28734i = lynxPerfMetric.getTasmBinaryDecode();
            gVar.f28735j = lynxPerfMetric.getTasmFinishLoadTemplate();
            gVar.f28736k = lynxPerfMetric.getRenderPage();
            gVar.f28738m = lynxPerfMetric.toJSONObject();
            C11969b.f28620f.f28627e.mo19159a(gVar, this.f28559a);
        }
    }
}
