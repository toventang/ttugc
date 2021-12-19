package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.AbstractC89231x;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4620k.AbstractC89278d;
import p4600h.p4620k.AbstractC89290k;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.jedi.arch.ext.list.k */
public final /* synthetic */ class C20459k extends AbstractC89231x {

    /* renamed from: a */
    public static final AbstractC89290k f48401a = new C20459k();

    static {
        Covode.recordClassIndex(23980);
    }

    C20459k() {
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
    public final String getName() {
        return "refresh";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final String getSignature() {
        return "getRefresh(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/Async;";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final AbstractC89278d getOwner() {
        return C89204ab.m154670a(C20450j.class, "ext_list_release");
    }

    @Override // p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return C20450j.m38660b((IListState) obj);
    }
}
