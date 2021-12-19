package com.p2082ss.android.ugc.aweme.userservice.jedi.p4198a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.userservice.CommonFollowApi;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.c */
public final class C80112c extends AbstractC20179a<String, Integer, C80113d, BaseResponse> {
    static {
        Covode.recordClassIndex(93352);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C80113d dVar = (C80113d) obj;
        C89219l.m154721d(dVar, "");
        return dVar.f179510a;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<BaseResponse> mo33481a(C80113d dVar) {
        C80113d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        AbstractC88979t<BaseResponse> remove = CommonFollowApi.f179483a.remove(dVar2.f179510a, dVar2.f179511b);
        C89219l.m154716b(remove, "");
        return remove;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        BaseResponse baseResponse = (BaseResponse) obj2;
        C89219l.m154721d(obj, "");
        C89219l.m154721d(baseResponse, "");
        return Integer.valueOf(baseResponse.status_code);
    }
}
