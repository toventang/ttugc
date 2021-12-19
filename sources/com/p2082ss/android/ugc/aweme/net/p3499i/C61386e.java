package com.p2082ss.android.ugc.aweme.net.p3499i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.C18182a;
import com.bytedance.ies.ugc.network.partner.p1276b.C18198e;
import com.bytedance.ies.ugc.network.partner.p1276b.C18199f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.net.i.e */
public final class C61386e implements AbstractC18185b.AbstractC18190e {

    /* renamed from: a */
    public static final C61386e f139375a = new C61386e();

    private C61386e() {
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b
    /* renamed from: a */
    public final String mo29034a() {
        return AbstractC18185b.C18188c.m33836a(this);
    }

    static {
        Covode.recordClassIndex(72019);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18190e
    /* renamed from: a */
    public final void mo29043a(C18199f fVar, C18182a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        C18198e eVar = fVar.f43342b.f43371f;
        String a = eVar.mo29052a("device_id");
        if (a == null || C89361p.m154870a((CharSequence) a)) {
            eVar.mo29055b("device_id");
        }
    }
}
