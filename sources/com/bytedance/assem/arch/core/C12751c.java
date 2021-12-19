package com.bytedance.assem.arch.core;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.core.c */
public final class C12751c implements AbstractC12761k {

    /* renamed from: a */
    public AbstractC89277c<? extends AbstractC12748a> f31009a;

    /* renamed from: b */
    public AbstractC12748a f31010b;

    /* renamed from: c */
    List<C12765o> f31011c = new ArrayList();

    /* renamed from: d */
    private EnumC12758h f31012d = EnumC12758h.IMMEDIATE;

    static {
        Covode.recordClassIndex(14575);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12761k
    /* renamed from: a */
    public final AbstractC12748a mo20601a() {
        boolean z;
        AbstractC12748a aVar = this.f31010b;
        if (aVar == null) {
            AbstractC89277c<? extends AbstractC12748a> cVar = this.f31009a;
            if (cVar == null) {
                C89219l.m154710a(StringSet.type);
            }
            aVar = (AbstractC12748a) C89170a.m154665a(cVar).newInstance();
        }
        if (this.f31012d == EnumC12758h.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        aVar.f30999c = z;
        return aVar;
    }

    /* renamed from: a */
    public final void mo20602a(AbstractC89277c<? extends AbstractC12748a> cVar) {
        C89219l.m154719c(cVar, "");
        this.f31009a = cVar;
    }
}
