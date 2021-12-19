package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.AbstractC89231x;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4620k.AbstractC89278d;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.jedi.arch.ext.list.d */
final /* synthetic */ class C20444d extends AbstractC89231x {

    /* renamed from: a */
    public static final AbstractC89290k f48383a = new C20444d();

    static {
        Covode.recordClassIndex(23965);
    }

    C20444d() {
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
    public final String getName() {
        return "payload";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final String getSignature() {
        return "getPayload()Lcom/bytedance/jedi/arch/ext/list/Payload;";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final AbstractC89278d getOwner() {
        return C89204ab.m154669a(ListState.class);
    }

    @Override // p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((ListState) obj).getPayload();
    }
}
