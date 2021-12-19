package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4358b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50690b;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84598f;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.b */
public final class C84569b implements AbstractC84598f {

    /* renamed from: a */
    private final String f189000a;

    static {
        Covode.recordClassIndex(98534);
    }

    public C84569b(String str) {
        C89219l.m154721d(str, "");
        this.f189000a = str;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84598f
    /* renamed from: b */
    public final boolean mo129515b(ProviderEffect providerEffect) {
        C89219l.m154721d(providerEffect, "");
        return C84902i.m145892a(mo129514a(providerEffect));
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84598f
    /* renamed from: a */
    public final String mo129514a(ProviderEffect providerEffect) {
        C89219l.m154721d(providerEffect, "");
        return C50690b.m94983a(this.f189000a) + providerEffect.getId() + ".gif";
    }
}
