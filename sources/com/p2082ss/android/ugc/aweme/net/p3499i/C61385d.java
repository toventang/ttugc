package com.p2082ss.android.ugc.aweme.net.p3499i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.C18182a;
import com.bytedance.ies.ugc.network.partner.p1276b.C18198e;
import com.bytedance.ies.ugc.network.partner.p1276b.C18199f;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.ugc.aweme.net.p3491d.C61332a;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.net.i.d */
public final class C61385d implements AbstractC18185b.AbstractC18190e {

    /* renamed from: a */
    public static final C61385d f139374a = new C61385d();

    private C61385d() {
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b
    /* renamed from: a */
    public final String mo29034a() {
        return AbstractC18185b.C18188c.m33836a(this);
    }

    static {
        Covode.recordClassIndex(72018);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18190e
    /* renamed from: a */
    public final void mo29043a(C18199f fVar, C18182a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        if (fVar.f43341a) {
            C18198e eVar = fVar.f43342b.f43371f;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C29803q.m60037b(linkedHashMap, true);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                eVar.mo29053a((String) entry.getKey(), (String) entry.getValue());
            }
            if (((Boolean) C61332a.f139291a.getValue()).booleanValue() && C89361p.m154874b(fVar.f43342b.f43370e.mo29049a(), "/aweme/", false)) {
                fVar.f43343c.mo29047a("force_tt_hpack_optimization", "true");
            }
        }
    }
}
