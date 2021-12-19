package com.bytedance.jedi.ext.adapter.p1465a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.C20450j;
import com.bytedance.jedi.arch.ext.list.IListState;
import p4600h.p4611f.p4613b.AbstractC89231x;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4620k.AbstractC89278d;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.jedi.ext.adapter.a.h */
final /* synthetic */ class C20619h extends AbstractC89231x {

    /* renamed from: a */
    public static final AbstractC89290k f48783a = new C20619h();

    static {
        Covode.recordClassIndex(24151);
    }

    C20619h() {
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
    public final String getName() {
        return "hasMore";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final String getSignature() {
        return "getHasMore(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final AbstractC89278d getOwner() {
        return C89204ab.m154670a(C20450j.class, "ext_adapter_release");
    }

    @Override // p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return C20450j.m38662d((IListState) obj);
    }
}
