package com.p2082ss.android.ugc.gamora.editor.sticker.donation.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.api.OrganizationListApi;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82773d;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.api.a */
public final class C82740a {

    /* renamed from: a */
    public static final C82740a f184948a = new C82740a();

    private C82740a() {
    }

    static {
        Covode.recordClassIndex(96590);
    }

    /* renamed from: a */
    public static AbstractC88979t<C82773d> m142899a(C82741b bVar) {
        C89219l.m154721d(bVar, "");
        return ((OrganizationListApi) C63244g.m114602a().mo73257C().retrofitCreate(OrganizationListApi.C82738a.f184943a, OrganizationListApi.class)).getOrganizationList(bVar.f184949a, bVar.f184950b);
    }
}
