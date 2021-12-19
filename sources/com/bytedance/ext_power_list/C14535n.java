package com.bytedance.ext_power_list;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.AbstractC89229v;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4620k.AbstractC89278d;

/* renamed from: com.bytedance.ext_power_list.n */
final /* synthetic */ class C14535n extends AbstractC89229v {
    static {
        Covode.recordClassIndex(16622);
    }

    C14535n(AssemListViewModel assemListViewModel) {
        super(assemListViewModel);
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
    public final String getName() {
        return "config";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final String getSignature() {
        return "getConfig()Lcom/bytedance/ies/powerlist/page/config/PowerPageConfig;";
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public final AbstractC89278d getOwner() {
        return C89204ab.m154669a(AssemListViewModel.class);
    }

    @Override // p4600h.p4620k.AbstractC89288j
    public final Object get() {
        return ((AssemListViewModel) this.receiver).mo23343h();
    }
}
