package com.bytedance.assem.arch.core;

import com.bytedance.assem.arch.p797d.AbstractC12770b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.core.r */
public final class C12768r implements AbstractC12761k {

    /* renamed from: a */
    public AbstractC89277c<? extends AbstractC12770b> f31055a;

    /* renamed from: b */
    public AbstractC12770b f31056b;

    /* renamed from: c */
    public List<C12765o> f31057c = new ArrayList();

    /* renamed from: d */
    public int f31058d;

    /* renamed from: e */
    public EnumC12762l f31059e = EnumC12762l.SYNC;

    /* renamed from: f */
    private EnumC12758h f31060f = EnumC12758h.IMMEDIATE;

    static {
        Covode.recordClassIndex(14592);
    }

    /* renamed from: b */
    public final AbstractC12770b mo20601a() {
        EnumC12762l lVar;
        boolean z;
        AbstractC12770b bVar = this.f31056b;
        if (bVar == null) {
            AbstractC89277c<? extends AbstractC12770b> cVar = this.f31055a;
            if (cVar == null) {
                C89219l.m154710a(StringSet.type);
            }
            bVar = (AbstractC12770b) C89170a.m154665a(cVar).newInstance();
        }
        bVar.f31065i = this.f31058d;
        EnumC12762l lVar2 = this.f31059e;
        C89219l.m154719c(lVar2, "");
        if (lVar2 == EnumC12762l.ASYNC && ((Boolean) AbstractC12770b.f31062l.getValue()).booleanValue()) {
            lVar = EnumC12762l.ASYNC;
        } else if (lVar2 != EnumC12762l.X2C || !((Boolean) AbstractC12770b.f31063m.getValue()).booleanValue()) {
            lVar = EnumC12762l.SYNC;
        } else {
            lVar = EnumC12762l.X2C;
        }
        bVar.f31066j = lVar;
        if (this.f31060f == EnumC12758h.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        bVar.f30999c = z;
        return bVar;
    }
}
