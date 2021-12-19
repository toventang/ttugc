package com.p2082ss.android.ugc.aweme.net.p3499i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.C18182a;
import com.bytedance.ies.ugc.network.partner.p1276b.C18198e;
import com.bytedance.ies.ugc.network.partner.p1276b.C18199f;
import com.p2082ss.android.ugc.aweme.utils.C80517gw;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.net.i.k */
public final class C61394k implements AbstractC18185b.AbstractC18190e {
    static {
        Covode.recordClassIndex(72027);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b
    /* renamed from: a */
    public final String mo29034a() {
        return AbstractC18185b.C18188c.m33836a(this);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18190e
    /* renamed from: a */
    public final void mo29043a(C18199f fVar, C18182a aVar) {
        String str;
        String c;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        C80517gw a = C80517gw.m139563a();
        if (C80517gw.m139568b()) {
            str = fVar.f43342b.f43370e.mo29049a();
            try {
                C80517gw.m139566a(str, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            str = null;
        }
        C18198e eVar = fVar.f43342b.f43371f;
        String[] strArr = C80517gw.f180119b;
        for (String str2 : strArr) {
            C89219l.m154716b(str2, "");
            String a2 = eVar.mo29052a(str2);
            if (a2 != null && !C89361p.m154870a((CharSequence) a2) && !C80537hk.m139613a(eVar.mo29052a("sec_".concat(String.valueOf(str2)))) && (c = a.mo123775c(a2)) != null && !C89361p.m154870a((CharSequence) c)) {
                if (str == null) {
                    str = fVar.f43342b.f43370e.mo29049a();
                }
                if (C80517gw.m139563a().mo123774b(str)) {
                    eVar.mo29055b(str2);
                }
                eVar.mo29053a("sec_".concat(String.valueOf(str2)), c);
            }
        }
    }
}
