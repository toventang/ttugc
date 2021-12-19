package com.bytedance.bpea.core.checker;

import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.C13345f;
import com.bytedance.bpea.basics.C13347h;
import com.bytedance.bpea.core.p868a.C13355b;
import com.bytedance.bpea.core.p868a.EnumC13356c;
import com.bytedance.bpea.core.p868a.EnumC13357d;
import com.bytedance.bpea.core.p870c.EnumC13366d;
import com.bytedance.bpea.core.p870c.EnumC13368f;
import com.bytedance.bpea.core.p872d.C13382a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.checker.d */
public final class C13380d extends AbstractC13369a {
    static {
        Covode.recordClassIndex(15377);
    }

    public C13380d() {
        super(EnumC13368f.START_LEGAL_CHECK, EnumC13368f.END_LEGAL_CHECK);
    }

    @Override // com.bytedance.bpea.core.checker.AbstractC13379c
    /* renamed from: b */
    public final C13347h mo21621b(AbstractC13343d dVar, C13345f fVar) {
        C89219l.m154719c(fVar, "");
        if (dVar == null) {
            C89219l.m154719c("current cert is empty", "");
            EnumC13356c a = C13355b.m24035a(fVar, EnumC13357d.EMPTY_CERT);
            if (a == EnumC13356c.WARNING) {
                mo21616a(EnumC13366d.WARN);
                return C13382a.C13383a.m24067a(new C13347h(-1000, "empty cert"));
            } else if (a != EnumC13356c.ERROR) {
                return C13382a.C13383a.m24067a(C13382a.C13383a.m24066a());
            } else {
                mo21616a(EnumC13366d.ERROR);
                throw new C13340a(-1000, "current empty cert is not allowed");
            }
        } else {
            try {
                dVar.validate(fVar);
                return C13382a.C13383a.m24066a();
            } catch (C13340a e) {
                EnumC13356c a2 = C13355b.m24035a(fVar, EnumC13357d.CONTENT_ILLEGAL);
                if (a2 == EnumC13356c.WARNING) {
                    mo21616a(EnumC13366d.WARN);
                    return C13382a.C13383a.m24067a(C13382a.C13383a.m24069b());
                } else if (a2 != EnumC13356c.ERROR) {
                    return C13382a.C13383a.m24067a(C13382a.C13383a.m24066a());
                } else {
                    mo21616a(EnumC13366d.ERROR);
                    throw new C13340a(-1001, e.getErrorMsg());
                }
            }
        }
    }
}
