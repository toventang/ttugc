package com.p2082ss.android.ugc.aweme.net.p3499i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.C18182a;
import com.bytedance.ies.ugc.network.partner.p1276b.C18199f;
import com.bytedance.ies.ugc.network.partner.p1276b.C18202h;
import java.util.ArrayList;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.i.a */
public final class C61380a implements AbstractC18185b.AbstractC18190e {

    /* renamed from: a */
    public static final C61380a f139369a = new C61380a();

    /* renamed from: b */
    private static final ArrayList<String> f139370b = C89070n.m154525d("/api/ad/v1/setting/", "/api/ad/splash/", "/aweme/v1/ttregion/test/", "/aweme/v1/feed/", "/aweme/v2/feed/", "/aweme/v2/category/list/", "/aweme/v1/find/", "/aweme/v1/challenge/history/intervene/");

    private C61380a() {
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b
    /* renamed from: a */
    public final String mo29034a() {
        return AbstractC18185b.C18188c.m33836a(this);
    }

    static {
        Covode.recordClassIndex(72013);
    }

    @Override // com.bytedance.ies.ugc.network.partner.AbstractC18185b.AbstractC18190e
    /* renamed from: a */
    public final void mo29043a(C18199f fVar, C18182a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        C18202h hVar = fVar.f43342b;
        if (C89219l.m154714a((Object) hVar.f43369d, (Object) "api.tiktokv.com")) {
            hVar.mo29062b("api-h2.tiktokv.com");
        }
    }
}
