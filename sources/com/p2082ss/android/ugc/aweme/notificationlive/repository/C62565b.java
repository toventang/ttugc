package com.p2082ss.android.ugc.aweme.notificationlive.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51104c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.repository.b */
public final class C62565b extends AbstractC20179a<C62564a, List<? extends User>, C62564a, C51104c> {

    /* renamed from: a */
    private final SettingFollowingListApi f141895a;

    static {
        Covode.recordClassIndex(73362);
    }

    public C62565b() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(SettingFollowingListApi.class);
        C89219l.m154716b(create, "");
        this.f141895a = (SettingFollowingListApi) create;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<C51104c> mo33481a(C62564a aVar) {
        C62564a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        AbstractC88979t<C51104c> b = this.f141895a.queryFollowingList(aVar2.f141886a, aVar2.f141887b, aVar2.f141889d, aVar2.f141890e, aVar2.f141891f).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        C51104c cVar = (C51104c) obj2;
        C89219l.m154721d(obj, "");
        C89219l.m154721d(cVar, "");
        return cVar.f117918a;
    }
}
