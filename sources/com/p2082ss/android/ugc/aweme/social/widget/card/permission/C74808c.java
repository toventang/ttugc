package com.p2082ss.android.ugc.aweme.social.widget.card.permission;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.c */
public class C74808c implements AbstractC17641a {

    /* renamed from: a */
    public final EnumC74761f f168131a;

    /* renamed from: b */
    private final EnumC74754a f168132b;

    static {
        Covode.recordClassIndex(87662);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    /* renamed from: a */
    public EnumC74754a mo117859a() {
        return this.f168132b;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        EnumC74761f fVar = this.f168131a;
        EnumC74761f fVar2 = null;
        if (!(aVar instanceof C74808c)) {
            aVar = null;
        }
        C74808c cVar = (C74808c) aVar;
        if (cVar != null) {
            fVar2 = cVar.f168131a;
        }
        if (fVar == fVar2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        EnumC74761f fVar = this.f168131a;
        EnumC74761f fVar2 = null;
        if (!(aVar instanceof C74808c)) {
            aVar = null;
        }
        C74808c cVar = (C74808c) aVar;
        if (cVar != null) {
            fVar2 = cVar.f168131a;
        }
        if (fVar == fVar2) {
            return true;
        }
        return false;
    }

    public C74808c(EnumC74761f fVar, EnumC74754a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        this.f168131a = fVar;
        this.f168132b = aVar;
    }
}
