package com.bytedance.assem.arch.core;

import com.bytedance.assem.arch.p795b.AbstractC12711w;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.assem.arch.core.n */
public final class C12764n implements AbstractC12761k {

    /* renamed from: a */
    public AbstractC89277c<? extends AbstractC12711w<? extends AbstractC22876d>> f31039a;

    /* renamed from: b */
    public AbstractC12711w<? extends AbstractC22876d> f31040b;

    /* renamed from: c */
    EnumC12758h f31041c = EnumC12758h.IMMEDIATE;

    /* renamed from: d */
    public int f31042d;

    /* renamed from: e */
    public EnumC12762l f31043e = EnumC12762l.SYNC;

    /* renamed from: f */
    private List<C12765o> f31044f = new ArrayList();

    static {
        Covode.recordClassIndex(14588);
    }

    /* renamed from: b */
    public final AbstractC12711w<? extends AbstractC22876d> mo20601a() {
        boolean z;
        AbstractC12711w<? extends AbstractC22876d> wVar = this.f31040b;
        if (wVar == null) {
            AbstractC89277c<? extends AbstractC12711w<? extends AbstractC22876d>> cVar = this.f31039a;
            if (cVar == null) {
                C89219l.m154710a(StringSet.type);
            }
            wVar = (AbstractC12711w) C89170a.m154665a(cVar).newInstance();
        }
        wVar.f30928o = this.f31042d;
        wVar.mo20550a(this.f31043e);
        if (this.f31041c == EnumC12758h.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        wVar.f30999c = z;
        return wVar;
    }

    /* renamed from: a */
    public final void mo20622a(EnumC12758h hVar) {
        C89219l.m154719c(hVar, "");
        this.f31041c = hVar;
    }

    /* renamed from: a */
    public final void mo20623a(EnumC12762l lVar) {
        C89219l.m154719c(lVar, "");
        this.f31043e = lVar;
    }

    /* renamed from: a */
    public final void mo20624a(AbstractC89277c<? extends AbstractC12711w<? extends AbstractC22876d>> cVar) {
        C89219l.m154719c(cVar, "");
        this.f31039a = cVar;
    }
}
