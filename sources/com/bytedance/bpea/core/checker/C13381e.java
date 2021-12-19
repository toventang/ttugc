package com.bytedance.bpea.core.checker;

import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.bpea.basics.AbstractC13344e;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.C13341b;
import com.bytedance.bpea.basics.C13345f;
import com.bytedance.bpea.basics.C13347h;
import com.bytedance.bpea.core.p870c.EnumC13368f;
import com.bytedance.bpea.core.p872d.C13382a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.checker.e */
public final class C13381e extends AbstractC13369a {

    /* renamed from: a */
    private final List<AbstractC13344e> f32680a;

    static {
        Covode.recordClassIndex(15378);
    }

    public C13381e() {
        super(EnumC13368f.START_CHECK, EnumC13368f.END_CHECK);
        ArrayList arrayList = new ArrayList();
        this.f32680a = arrayList;
        arrayList.add(new C13380d());
        arrayList.add(new C13378b());
    }

    @Override // com.bytedance.bpea.core.checker.AbstractC13369a, com.bytedance.bpea.basics.AbstractC13344e
    /* renamed from: a */
    public final C13347h mo21567a(AbstractC13343d dVar, C13345f fVar) {
        String str = "";
        C89219l.m154719c(fVar, str);
        try {
            return super.mo21567a(dVar, fVar);
        } catch (C13340a e) {
            C89219l.m154719c("cert verify fail!\ncert = " + dVar + " \n context =" + fVar, str);
            throw e;
        } catch (Throwable th) {
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage != null) {
                str = localizedMessage;
            }
            return new C13347h(-1, str);
        }
    }

    @Override // com.bytedance.bpea.core.checker.AbstractC13379c
    /* renamed from: b */
    public final C13347h mo21621b(AbstractC13343d dVar, C13345f fVar) {
        C89219l.m154719c(fVar, "");
        C13347h a = C13382a.C13383a.m24066a();
        Iterator<AbstractC13344e> it = this.f32680a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C13347h a2 = it.next().mo21567a(dVar, fVar);
            Map<String, Object> map = a2.f32618a;
            C89219l.m154719c(map, "");
            a.f32618a.putAll(map);
            C89219l.m154719c(a2, "");
            if (C89219l.m154714a(a2.f32618a.get("isInterrupt"), (Object) true)) {
                C89219l.m154719c("the check is intercepted", "");
                break;
            }
        }
        C13341b.m24022a("MainCertChecker", "checkResult=".concat(String.valueOf(a)));
        return a;
    }
}
