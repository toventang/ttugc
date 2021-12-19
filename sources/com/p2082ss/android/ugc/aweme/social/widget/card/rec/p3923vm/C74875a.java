package com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74765i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.vm.a */
public final class C74875a implements C1175ad.AbstractC1177b {

    /* renamed from: a */
    public final C74765i f168327a;

    static {
        Covode.recordClassIndex(87735);
    }

    public C74875a(C74765i iVar) {
        C89219l.m154721d(iVar, "");
        this.f168327a = iVar;
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        return new SocialCardVM(this.f168327a);
    }
}
