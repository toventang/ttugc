package com.bytedance.jedi.ext.adapter.p1465a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.C20450j;
import com.bytedance.jedi.arch.ext.list.IListState;
import p4600h.p4611f.p4613b.AbstractC89231x;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4620k.AbstractC89278d;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.jedi.ext.adapter.a.l */
final /* synthetic */ class C20623l extends AbstractC89231x {

    /* renamed from: a */
    public static final AbstractC89290k f48787a = new C20623l();

    static {
        Covode.recordClassIndex(24155);
    }

    C20623l() {
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
    public final String getName() {
        return "loadMore";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final String getSignature() {
        return "getLoadMore(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/Async;";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final AbstractC89278d getOwner() {
        return C89204ab.m154670a(C20450j.class, "ext_adapter_release");
    }

    @Override // p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return C20450j.m38661c((IListState) obj);
    }
}
