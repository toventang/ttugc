package com.p2082ss.android.ugc.aweme.setting.p3725m;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import com.p2082ss.android.ugc.aweme.setting.api.AuthListApi;
import com.p2082ss.android.ugc.aweme.setting.model.C68172b;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.m.b */
public final class C68168b extends AbstractC20191d<C89391z, C68172b> {

    /* renamed from: a */
    private final AuthListApi f152616a = AuthListApi.C67988a.m120301a();

    static {
        Covode.recordClassIndex(80364);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        C89219l.m154721d(obj, "");
        AbstractC88979t<C68172b> b = this.f152616a.getAuthInfoList().mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }
}
