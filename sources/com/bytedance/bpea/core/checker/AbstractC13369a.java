package com.bytedance.bpea.core.checker;

import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.C13345f;
import com.bytedance.bpea.basics.C13347h;
import com.bytedance.bpea.basics.C13351l;
import com.bytedance.bpea.core.p870c.C13361a;
import com.bytedance.bpea.core.p870c.C13362b;
import com.bytedance.bpea.core.p870c.EnumC13366d;
import com.bytedance.bpea.core.p870c.EnumC13368f;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.checker.a */
public abstract class AbstractC13369a extends AbstractC13379c {

    /* renamed from: a */
    private ThreadLocal<C13351l> f32667a = new ThreadLocal<>();

    /* renamed from: b */
    private ThreadLocal<EnumC13366d> f32668b = new ThreadLocal<>();

    /* renamed from: c */
    private final EnumC13368f f32669c;

    /* renamed from: d */
    private final EnumC13368f f32670d;

    static {
        Covode.recordClassIndex(15366);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21616a(EnumC13366d dVar) {
        C89219l.m154719c(dVar, "");
        this.f32668b.set(dVar);
    }

    public AbstractC13369a(EnumC13368f fVar, EnumC13368f fVar2) {
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(fVar2, "");
        this.f32669c = fVar;
        this.f32670d = fVar2;
    }

    @Override // com.bytedance.bpea.basics.AbstractC13344e
    /* renamed from: a */
    public C13347h mo21567a(AbstractC13343d dVar, C13345f fVar) {
        String str = "";
        C89219l.m154719c(fVar, str);
        try {
            C89219l.m154719c(fVar, str);
            C13351l lVar = new C13351l();
            this.f32667a.set(lVar);
            C13361a aVar = new C13361a(dVar, fVar, this.f32669c, 0, null);
            aVar.mo21606a(lVar);
            C13362b.m24045a(aVar);
            mo21616a(EnumC13366d.INFO);
            C13347h b = mo21621b(dVar, fVar);
            m24047a(dVar, fVar, b, null);
            return b;
        } catch (C13340a e) {
            m24047a(dVar, fVar, null, e);
            throw e;
        } catch (Throwable th) {
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = str;
            }
            C13347h hVar = new C13347h(-1, localizedMessage);
            mo21616a(EnumC13366d.WARN);
            String localizedMessage2 = th.getLocalizedMessage();
            if (localizedMessage2 != null) {
                str = localizedMessage2;
            }
            System.currentTimeMillis();
            C13362b.m24046a(str);
            m24047a(dVar, fVar, hVar, null);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24047a(com.bytedance.bpea.basics.AbstractC13343d r9, com.bytedance.bpea.basics.C13345f r10, com.bytedance.bpea.basics.C13347h r11, com.bytedance.bpea.basics.C13340a r12) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bpea.core.checker.AbstractC13369a.m24047a(com.bytedance.bpea.basics.d, com.bytedance.bpea.basics.f, com.bytedance.bpea.basics.h, com.bytedance.bpea.basics.a):void");
    }
}
