package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.AbstractC89231x;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4620k.AbstractC89278d;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.jedi.arch.ext.list.i */
final /* synthetic */ class C20449i extends AbstractC89231x {

    /* renamed from: a */
    public static final AbstractC89290k f48388a = new C20449i();

    static {
        Covode.recordClassIndex(23970);
    }

    C20449i() {
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
    public final String getName() {
        return "list";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final String getSignature() {
        return "getList()Ljava/util/List;";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final AbstractC89278d getOwner() {
        return C89204ab.m154669a(ListState.class);
    }

    @Override // p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((ListState) obj).getList();
    }
}
