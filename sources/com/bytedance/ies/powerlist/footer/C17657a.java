package com.bytedance.ies.powerlist.footer;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.p1231b.AbstractC17642b;
import com.bytedance.ies.powerlist.page.AbstractC17689c;
import com.bytedance.ies.powerlist.page.AbstractC17714i;
import com.bytedance.ies.powerlist.page.C17681a;
import com.bytedance.ies.powerlist.page.C17712h;
import com.bytedance.ies.powerlist.page.config.AbstractC17691a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.footer.a */
public final class C17657a implements AbstractC17641a, AbstractC17689c {

    /* renamed from: a */
    public C17681a f42224a;

    /* renamed from: b */
    public AbstractC17691a<?> f42225b;

    /* renamed from: c */
    private C17681a f42226c;

    static {
        Covode.recordClassIndex(20212);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return AbstractC17642b.m32757b(this, aVar);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    private C17657a() {
        this.f42225b = null;
        this.f42224a = new C17681a();
    }

    public /* synthetic */ C17657a(byte b) {
        this();
    }

    @Override // com.bytedance.ies.powerlist.page.AbstractC17689c
    /* renamed from: a */
    public final void mo28146a(C17712h hVar) {
        C89219l.m154719c(hVar, "");
        C17681a aVar = hVar.f42363b;
        C89219l.m154719c(aVar, "");
        this.f42226c = this.f42224a;
        this.f42224a = aVar;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        AbstractC17714i iVar;
        C17681a aVar2;
        C89219l.m154719c(aVar, "");
        C17681a aVar3 = this.f42226c;
        AbstractC17714i iVar2 = null;
        if (aVar3 != null) {
            iVar = aVar3.f42308b;
        } else {
            iVar = null;
        }
        if (!(aVar instanceof C17657a)) {
            aVar = null;
        }
        C17657a aVar4 = (C17657a) aVar;
        if (!(aVar4 == null || (aVar2 = aVar4.f42224a) == null)) {
            iVar2 = aVar2.f42308b;
        }
        return C89219l.m154714a(iVar, iVar2);
    }
}
