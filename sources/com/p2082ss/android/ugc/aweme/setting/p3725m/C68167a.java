package com.p2082ss.android.ugc.aweme.setting.p3725m;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.setting.api.AuthDeleteApi;
import java.util.LinkedHashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.m.a */
public final class C68167a extends AbstractC20191d<LinkedHashMap<String, String>, BaseResponse> {

    /* renamed from: a */
    private final AuthDeleteApi f152615a;

    static {
        Covode.recordClassIndex(80363);
    }

    public C68167a() {
        String str = Api.f79771d;
        C89219l.m154716b(str, "");
        this.f152615a = (AuthDeleteApi) C18097a.m33696a().mo28816a(str).mo28858a(AuthDeleteApi.class);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        LinkedHashMap<String, String> linkedHashMap = (LinkedHashMap) obj;
        C89219l.m154721d(linkedHashMap, "");
        AbstractC88979t<BaseResponse> b = this.f152615a.deleteAuthInfoApp(linkedHashMap).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }
}
